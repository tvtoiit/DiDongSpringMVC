package ProjectSmartphoneMVC.Entity;

public class productsSale {
	private int id; 
	private int id_product_sale; 
	private int discount_product_sale; 
	private int number_sale; 
	private int num_buy; 
	private int status_sale; 
	private String time_sale; 
	private String time_salestop;
	public productsSale() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_product_sale() {
		return id_product_sale;
	}
	public void setId_product_sale(int id_product_sale) {
		this.id_product_sale = id_product_sale;
	}
	public int getDiscount_product_sale() {
		return discount_product_sale;
	}
	public void setDiscount_product_sale(int discount_product_sale) {
		this.discount_product_sale = discount_product_sale;
	}
	public int getNumber_sale() {
		return number_sale;
	}
	public void setNumber_sale(int number_sale) {
		this.number_sale = number_sale;
	}
	public int getNum_buy() {
		return num_buy;
	}
	public void setNum_buy(int num_buy) {
		this.num_buy = num_buy;
	}
	public int getStatus_sale() {
		return status_sale;
	}
	public void setStatus_sale(int status_sale) {
		this.status_sale = status_sale;
	}
	public String getTime_sale() {
		return time_sale;
	}
	public void setTime_sale(String time_sale) {
		this.time_sale = time_sale;
	}
	public String getTime_salestop() {
		return time_salestop;
	}
	public void setTime_salestop(String time_salestop) {
		this.time_salestop = time_salestop;
	}
	
}
