package up.stockmanagement.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;




@Entity
@NamedQueries({ @NamedQuery(name = Shelf.GET_ALL_SHELVES_QUERY_NAME, query = "SELECT s FROM Shelf s"),
	@NamedQuery(name = Shelf.GET_SHELVES_BY_PRODUCT_ID_QUERY_NAME, query = "SELECT s FROM Shelf s WHERE s.product.id = :productId") })
public class Shelf extends EntityModel{

	private static final long serialVersionUID = 1L;
	public static final String GET_ALL_SHELVES_QUERY_NAME = "getAllShelves";
	public static final String GET_SHELVES_BY_PRODUCT_ID_QUERY_NAME = "getShelvesByProductId";
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Product product;
	private int capacity;
	private double rentPrice;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}


}
