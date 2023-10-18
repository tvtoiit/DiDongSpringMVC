package ProjectSmartphoneMVC.Service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProjectSmartphoneMVC.Dao.Product_typeDao;
import ProjectSmartphoneMVC.Dao.ProductsManageDao;
import ProjectSmartphoneMVC.Dao.ProductsOrdersManageDao;
import ProjectSmartphoneMVC.Dao.ProductsSaleManageDao;
import ProjectSmartphoneMVC.Dao.StaticalManageDao;
import ProjectSmartphoneMVC.Dao.UsersManageDao;
import ProjectSmartphoneMVC.Dto.ProductManageDto;
import ProjectSmartphoneMVC.Dto.ProductsOrdersManageDto;
import ProjectSmartphoneMVC.Dto.StatisticalDto;
import ProjectSmartphoneMVC.Dto.UsersManageDto;
import ProjectSmartphoneMVC.Entity.Users;
import ProjectSmartphoneMVC.Entity.product_type;
import ProjectSmartphoneMVC.Entity.products;
import ProjectSmartphoneMVC.Entity.productsSale;

@Service
public class HomeServiceImplAdmin implements iHomeServiceAdmin{
	@Autowired
	private ProductsManageDao productsManageDao;
	@Autowired
	private Product_typeDao product_typeDao;
	@Autowired
	private ProductsOrdersManageDao ordersManageDao;
	@Autowired
	private UsersManageDao usersManageDao;
	@Autowired
	private ProductsSaleManageDao productSaleDao;
	@Autowired
	private StaticalManageDao staticalManageDao;
	

	@Override
	public List<ProductManageDto> getDataManageDtos() {
		return productsManageDao.getDataManageDtos();
	}

	@Override
	public List<ProductManageDto> getDataManageDtos(String idProduct) {
		return productsManageDao.getDataManageDtos(idProduct);
	}

	@Override
	public List<product_type> getDataProduct_type() {
		return product_typeDao.getDataProduct_type();
	}

	@Override
	public int addProduct(products product) {
		return productsManageDao.addProduct(product);
	}

	@Override
	public int Update(products product) {
		return productsManageDao.Update(product);
	}

	@Override
	public int addProductType(product_type product_type) {
		return productsManageDao.addProductType(product_type);
	}

	@Override
	public List<ProductsOrdersManageDto> getDataOrdersManageDtos() {
		return ordersManageDao.getDataOrdersManageDtos();
	}

	@Override
	public List<ProductsOrdersManageDto> getDataOrdersManageDtos(String status) {
		return ordersManageDao.getDataOrdersManageDtos(status);
	}

	@Override
	public int UpdateOrder(String status, String id) {
		return ordersManageDao.UpdateOrder(status, id);
	}

	@Override
	public List<UsersManageDto> getDataUsers() {
		return usersManageDao.getDataUsers();
	}
	@Override
	public List<UsersManageDto> getDataUsers(String id) {
		return usersManageDao.getDataUsers(id);
	}

	@Override
	public int UpdateUser(Users users) {
		return usersManageDao.Update(users);
	}

	@Override
	public List<productsSale> getDataProductSale() {
		return productSaleDao.getDataProductSale();
	}

	@Override
	public int insertProductSale(productsSale productSale) {
		return productSaleDao.insertProductSale(productSale);
	}

	@Override
	public List<StatisticalDto> getDataStatisticalByNow() {
		return staticalManageDao.getDataStatisticalByNow();
	}

}
