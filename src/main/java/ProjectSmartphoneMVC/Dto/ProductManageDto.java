package ProjectSmartphoneMVC.Dto;

import java.util.Date;

public class ProductManageDto {
	private int id;
	private int product_type;
	private String name;
	private String title;
	private double price;
	private int discount;
	private int num;
	private String thumnail;
	private String description;
	private String description2;
	private Date created_at;
	
	
	public ProductManageDto() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getProduct_type() {
		return product_type;
	}


	public void setProduct_type(int product_type) {
		this.product_type = product_type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getDiscount() {
		return discount;
	}


	public void setDiscount(int discount) {
		this.discount = discount;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getThumnail() {
		return thumnail;
	}


	public void setThumnail(String thumnail) {
		this.thumnail = thumnail;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDescription2() {
		return description2;
	}


	public void setDescription2(String description2) {
		this.description2 = description2;
	}


	public Date getCreated_at() {
		return created_at;
	}


	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
	
}
