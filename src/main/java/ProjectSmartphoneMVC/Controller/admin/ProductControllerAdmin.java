package ProjectSmartphoneMVC.Controller.admin;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import ProjectSmartphoneMVC.Entity.products;
import ProjectSmartphoneMVC.Entity.productsSale;


@Controller
public class ProductControllerAdmin extends BaseControllerAdmin{
	
	@RequestMapping(value = {"/admin/product"} , method = RequestMethod.GET)
	public ModelAndView product() {
		_mvShase.setViewName("admin/manageProduct");
		_mvShase.addObject("status", null);
		_mvShase.addObject("productManage", _homeService.getDataManageDtos());
		_mvShase.addObject("productManageUpdate", null);
		_mvShase.addObject("product_type", _homeService.getDataProduct_type());
		return _mvShase;
	}
	
	@RequestMapping(value = {"/admin/product/editor"}, method = RequestMethod.GET)
	public ModelAndView addProduct() {
		_mvShase.setViewName("admin/editorProduct");
		_mvShase.addObject("product", new products());
		_mvShase.addObject("productManageUpdate", null);
		return _mvShase;
	}
	
	@RequestMapping(value = {"/admin/product/editor"}, method = RequestMethod.POST)
	public ModelAndView CreateProduct(@ModelAttribute("product") products product) {
		if(product.getProduct_type() != 0 && product.getThumnail() != null) {
			int count = _homeService.addProduct(product);
			if(count >0) {
				_mvShase.addObject("status", "Thêm Sản Phẩm Thành Công!!");
				_mvShase.addObject("productManageUpdate", null);
				_mvShase.addObject("product_type", _homeService.getDataProduct_type());
				_mvShase.setViewName("admin/editorProduct");
			}else {
				_mvShase.addObject("status", "Thêm Sản Phẩm Thất Bại!!");
				_mvShase.setViewName("admin/editorProduct");
				_mvShase.addObject("productManageUpdate", null);
				_mvShase.addObject("product_type", _homeService.getDataProduct_type());
			}
		}else {
			_mvShase.addObject("status", "Thêm Sản Phẩm Thất Bại!!");
			_mvShase.setViewName("admin/editorProduct");
			_mvShase.addObject("productManageUpdate", null);
			_mvShase.addObject("product_type", _homeService.getDataProduct_type());
		}
		return _mvShase;
	}
	
	@RequestMapping(value = {"/admin/product/update"}, method = RequestMethod.GET)
	public ModelAndView updateProduct(@RequestParam String id) {
		_mvShase.addObject("product", new products());
		_mvShase.setViewName("admin/editorProduct");
		_mvShase.addObject("productManageUpdate", _homeService.getDataManageDtos(id));
		_mvShase.addObject("product_type", _homeService.getDataProduct_type());
		return _mvShase;
	}
	
	@RequestMapping(value = {"/admin/product/update"}, method = RequestMethod.POST)
	public ModelAndView UpdateProduct(@ModelAttribute("product") products product, 
			@RequestParam("avatar1") String avatar1, @RequestParam("description") String description) {
		if(product.getProduct_type() != 0) {
			if(product.getThumnail() == "") {
				product.setThumnail(avatar1);
			}
			product.setDescription(description);
			int count = _homeService.Update(product);
			if(count >0) {
				_mvShase.addObject("status", "Sửa Sản Phẩm Thành Công!!");
			}else {
				_mvShase.addObject("status", "Sửa Sản Phẩm Thất Bại!!");
				_mvShase.addObject("product_type", _homeService.getDataProduct_type());
				
			}
		}else {
			_mvShase.addObject("status", "Sửa Sản Phẩm Thất Bại!!");
			_mvShase.addObject("product_type", _homeService.getDataProduct_type());
		}
		_mvShase.setViewName("admin/editorProduct");
		return _mvShase;
	}
	
	/*
	 * Hàm tạo folder để lưu ảnh
	 * */
	public void saveFile(products product, MultipartFile file) {
		if(null != file && !file.isEmpty()) {
			/*
			 * lưu ảnh vào file
			 * tạo folder để lưu file.
			 * File.separator = "/"
			 * dirFile.mkdir(); sẻ tạo ra folder image
			 * tạo file hình.
			 * */
			try {
				byte[] bytes = file.getBytes();
				String rootPath = System.getProperty("catalina.home");
				File dirFile = new File(rootPath+File.separator+"image");
				if(!dirFile.exists()) {
					dirFile.mkdir();
				}
				String nameString = product.getThumnail();
				File saveFile = new File(dirFile.getAbsoluteFile()+File.separator+nameString);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(saveFile));
				stream.write(bytes);
				stream.close();
			} catch (Exception e) {
			}
		}
	}
	
	/*
	 * Quản lí sale sản phẩm 
	 * */
	@RequestMapping(value = {"/admin/product/sale"}, method = RequestMethod.GET)
	public ModelAndView sale() {
		_mvShase.setViewName("admin/managePromotion");
		_mvShase.addObject("status", null);
		_mvShase.addObject("productsSale", new productsSale());
		_mvShase.addObject("productSaleManage", _homeService.getDataManageDtos());
		return _mvShase;
	}
	@RequestMapping(value = {"/admin/product/sale"}, method = RequestMethod.POST)
	public ModelAndView productSale(@ModelAttribute("productsSale") productsSale productSale, 
			@RequestParam("check_sale[]") String[] check_sale, ServletRequest req) {
		int length = check_sale.length;
		int fail = 0;
		String statusFailed = "Sản Phẩm có id: ";
		for(int i=0;i<length;i++) {
			int dem = 0;
			int id_product_sale = Integer.parseInt(check_sale[i]);
			List<productsSale> list = _homeService.getDataProductSale();
			for(int j=0;j<list.size();j++) {
				int id_product =list.get(j).getId_product_sale();
				if(id_product == id_product_sale) {
					fail ++;
					//nếu sản phẩm đã sale thì ko sale nữa
					dem ++;
					statusFailed += id_product+", ";
				}
			}
			if(dem == 0 ) {
				String discount = req.getParameter("discount"+check_sale[i]);
				String num_sale = req.getParameter("num_sale"+check_sale[i]);
				if(discount == "") {
					discount= "10";
				}
				if(num_sale == "") {
					num_sale ="1";
				}
				productSale.setId_product_sale(id_product_sale);
				productSale.setDiscount_product_sale(Integer.parseInt(discount));
				productSale.setNumber_sale(Integer.parseInt(num_sale));
				productSale.setNum_buy(0);
				productSale.setStatus_sale(1);
				_homeService.insertProductSale(productSale);
			}
		}
		statusFailed +=" đã tồn tại trong danh sách";
		String statusSuccess = "Sale Sản Phẩm Thành Công!!";
		if(fail>0) {
			_mvShase.addObject("status", statusFailed);
		}
		else {
			_mvShase.addObject("status", statusSuccess);
		}
		_mvShase.addObject("productSaleManage", _homeService.getDataManageDtos());
		_mvShase.setViewName("admin/managePromotion");
		return _mvShase;
	}
}
