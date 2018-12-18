package up.stockmanagement.DTO;

import up.stockmanagement.model.EntityModel;
import up.stockmanagement.model.Product;
import up.stockmanagement.model.Shelf;


public class ShelfDTO extends EntityModel{

	private static final long serialVersionUID = 1L;
	
	private Product product;
	private int capacity;
	private double rentPrice;
	
	public ShelfDTO() {}
	public ShelfDTO(Shelf shelf) {
		
		this.product = shelf.getProduct();
		this.capacity = shelf.getCapacity();
		this.rentPrice = shelf.getRentPrice();
	}

	public Product getProduct() {
		return product;
	}
	public int getCapacity() {
		return capacity;
	}
	public double getRentPrice() {
		return rentPrice;
	}
	
	

}
