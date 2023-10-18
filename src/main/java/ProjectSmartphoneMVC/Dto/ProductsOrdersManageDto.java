package ProjectSmartphoneMVC.Dto;

import java.util.Date;

public class ProductsOrdersManageDto {
	private int id; 
	private String maHD;
	private String title;
	private String user_name; 
	private String gender;
	private String thumnail;
	private String phone_number;
	private String note; 
	private String nameTP; 
	private String nameQH; 
	private String nameXa; 
	private int num; 
	private double money; 
	private Date created_at; 
	private String name_status;
	public ProductsOrdersManageDto() {
		super();
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getNameTP() {
		return nameTP;
	}
	public void setNameTP(String nameTP) {
		this.nameTP = nameTP;
	}
	public String getNameQH() {
		return nameQH;
	}
	public void setNameQH(String nameQH) {
		this.nameQH = nameQH;
	}
	public String getNameXa() {
		return nameXa;
	}
	public void setNameXa(String nameXa) {
		this.nameXa = nameXa;
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
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public String getName_status() {
		return name_status;
	}
	public void setName_status(String name_status) {
		this.name_status = name_status;
	}
	public String getThumnail() {
		return thumnail;
	}
	public void setThumnail(String thumnail) {
		this.thumnail = thumnail;
	}
	
	
}
