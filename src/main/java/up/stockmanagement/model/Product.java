package up.stockmanagement.model;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name = Product.GET_ALL_PRODUCTS_QUERY_NAME, query = "SELECT p FROM Product p")
public class Product extends EntityModel {
	private static final long serialVersionUID = 1L;

	public static final String GET_ALL_PRODUCTS_QUERY_NAME = "getAllProducts";
	
	private int discountValue;
	private int iva;
	private double pvp;

	public int getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(int discountValue) {
		this.discountValue = discountValue;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

}
