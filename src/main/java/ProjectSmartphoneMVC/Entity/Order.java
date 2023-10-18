package ProjectSmartphoneMVC.Entity;

public class Order {
	private int id;
	private String maHD; 
	private int user_id;
	private String user_name;
	private String gender;
	private String phone_number;
	private String tinh_tp;
	private String quan_huyen;
	private String xa_phuong; 
	private String product;
	private int num; 
	private double money; 
	private String note;
	private String created_at;
	private String status;
	
	
	public Order() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMaHD() {
		return maHD;
	}


	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}


	public String getTinh_tp() {
		return tinh_tp;
	}


	public void setTinh_tp(String tinh_tp) {
		this.tinh_tp = tinh_tp;
	}


	public String getQuan_huyen() {
		return quan_huyen;
	}


	public void setQuan_huyen(String quan_huyen) {
		this.quan_huyen = quan_huyen;
	}


	public String getXa_phuong() {
		return xa_phuong;
	}


	public void setXa_phuong(String xa_phuong) {
		this.xa_phuong = xa_phuong;
	}


	public String getProduct() {
		return product;
	}


	public void setProduct(String product) {
		this.product = product;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = money;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public String getCreated_at() {
		return created_at;
	}


	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
}
