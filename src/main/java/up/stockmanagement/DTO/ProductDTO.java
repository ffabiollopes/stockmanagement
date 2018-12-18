package up.stockmanagement.DTO;

import javax.enterprise.context.RequestScoped;

import up.stockmanagement.model.Product;



@RequestScoped
public class ProductDTO {
	
	
	private int iva;
	private double pvp;
	private int discountValue;
	
	public ProductDTO() {}
	public ProductDTO(Product product) {
		
		this.iva = product.getIva();
		this.pvp = product.getPvp();
		this.discountValue = product.getDiscountValue();
	}

	public int getDiscountValue() {
		return discountValue;
	}

	public int getIva() {
		return iva;
	}

	public double getPvp() {
		return pvp;
	}

}
