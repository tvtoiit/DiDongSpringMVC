package ProjectSmartphoneMVC.Dto;

import ProjectSmartphoneMVC.Entity.products;

public class ProductHomeDto {
	private int id_type;
	private String name;
	private products product;
	
	
	public ProductHomeDto() {
	}
	

	public ProductHomeDto(int id_type, String name, products product) {
		this.id_type = id_type;
		this.name = name;
		this.product = product;
	}
	
	public int getId_type() {
		return id_type;
	}
	public void setId_type(int id_type) {
		this.id_type = id_type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public products getProduct() {
		return product;
	}
	public void setProduct(products product) {
		this.product = product;
	}
	
	
}
