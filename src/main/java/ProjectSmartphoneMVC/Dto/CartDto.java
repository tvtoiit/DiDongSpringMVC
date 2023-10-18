package ProjectSmartphoneMVC.Dto;

import ProjectSmartphoneMVC.Entity.products;

public class CartDto {
	private int quanty;
	private double totalPice;
	private products product;
	
	public CartDto() {
	}
	public CartDto(int quanty, double totalPice, products product) {
		this.quanty = quanty;
		this.totalPice = totalPice;
		this.product = product;
	}
	public int getQuanty() {
		return quanty;
	}
	public void setQuanty(int quanty) {
		this.quanty = quanty;
	}
	public double getTotalPice() {
		return totalPice;
	}
	public void setTotalPice(double totalPice) {
		this.totalPice = totalPice;
	}
	public products getProduct() {
		return product;
	}
	public void setProduct(products product) {
		this.product = product;
	}
	
}
