package ProjectSmartphoneMVC.Dto;

import java.util.Date;

public class chitietsp {
	private int id;
	private int product_type;
	private String title;
	private double price;
	private int discount;
	private int num;
	private String thumnail;
	private String description;
	private String description2;
	private Date created_at;
	
	public int getProduct_type() {
		return product_type;
	}


	public void setProduct_type(int product_type) {
		this.product_type = product_type;
	}


	public Date getCreated_at() {
		return created_at;
	}


	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}


	//tiện ích
	private String baomatcao;
	private String ghiam;
	// thông tin sản phẩm
	private String thuonghieu;
	private String thoidiemramat;
	// discount
	private String discount_text;
	//configuration
	
	private String screen;
	private String operating_system;
	private String front_camera;
	private String rear_camera;
	private String chip;
	private String ram;
	private String sim;
	private String pin;
	
	public chitietsp() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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

	public String getBaomatcao() {
		return baomatcao;
	}


	public void setBaomatcao(String baomatcao) {
		this.baomatcao = baomatcao;
	}


	public String getGhiam() {
		return ghiam;
	}


	public void setGhiam(String ghiam) {
		this.ghiam = ghiam;
	}


	public String getThuonghieu() {
		return thuonghieu;
	}


	public void setThuonghieu(String thuonghieu) {
		this.thuonghieu = thuonghieu;
	}


	public String getThoidiemramat() {
		return thoidiemramat;
	}


	public void setThoidiemramat(String thoidiemramat) {
		this.thoidiemramat = thoidiemramat;
	}


	public String getDiscount_text() {
		return discount_text;
	}


	public void setDiscount_text(String discount_text) {
		this.discount_text = discount_text;
	}


	public String getScreen() {
		return screen;
	}


	public void setScreen(String screen) {
		this.screen = screen;
	}


	public String getOperating_system() {
		return operating_system;
	}


	public void setOperating_system(String operating_system) {
		this.operating_system = operating_system;
	}


	public String getFront_camera() {
		return front_camera;
	}


	public void setFront_camera(String front_camera) {
		this.front_camera = front_camera;
	}


	public String getRear_camera() {
		return rear_camera;
	}


	public void setRear_camera(String rear_camera) {
		this.rear_camera = rear_camera;
	}


	public String getChip() {
		return chip;
	}


	public void setChip(String chip) {
		this.chip = chip;
	}


	public String getRam() {
		return ram;
	}


	public void setRam(String ram) {
		this.ram = ram;
	}


	public String getSim() {
		return sim;
	}


	public void setSim(String sim) {
		this.sim = sim;
	}


	public String getPin() {
		return pin;
	}


	public void setPin(String pin) {
		this.pin = pin;
	}
	
	 
	
	
}
