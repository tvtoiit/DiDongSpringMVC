package ProjectSmartphoneMVC.Service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProjectSmartphoneMVC.Dto.ProductManageDto;
import ProjectSmartphoneMVC.Dto.ProductsOrdersManageDto;
import ProjectSmartphoneMVC.Dto.StatisticalDto;
import ProjectSmartphoneMVC.Dto.UsersManageDto;
import ProjectSmartphoneMVC.Entity.Users;
import ProjectSmartphoneMVC.Entity.product_type;
import ProjectSmartphoneMVC.Entity.products;
import ProjectSmartphoneMVC.Entity.productsSale;
@Service
public interface iHomeServiceAdmin {
	@Autowired
	public List<ProductManageDto> getDataManageDtos();
	@Autowired
	public List<ProductManageDto> getDataManageDtos(String idProduct);
	@Autowired
	public List<product_type> getDataProduct_type();
	@Autowired
	public int addProduct(products product);
	@Autowired
	public int Update(products product);
	@Autowired
	public int addProductType(product_type product_type);
	@Autowired
	public List<ProductsOrdersManageDto> getDataOrdersManageDtos();
	@Autowired
	public List<ProductsOrdersManageDto> getDataOrdersManageDtos(String status);
	@Autowired
	public int UpdateOrder(String status,String id);
	@Autowired
	public List<UsersManageDto> getDataUsers();
	@Autowired
	public List<UsersManageDto> getDataUsers(String id);
	@Autowired
	public int UpdateUser(Users users);
	@Autowired
	public List<productsSale> getDataProductSale();
	@Autowired
	public int insertProductSale(productsSale productSale);
	@Autowired
	public List<StatisticalDto> getDataStatisticalByNow();
}
