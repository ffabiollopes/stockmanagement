package up.stockmanagement.repositories;

import javax.enterprise.context.RequestScoped;

import up.stockmanagement.model.Product;

@RequestScoped
public class ProductRepository extends EntityRepository<Product> {
	
	@Override
	protected Class<Product> getEntityClass() {
		return Product.class;
	}
	
	@Override
	protected String getAllEntityQueryName() {
		return Product.GET_ALL_PRODUCTS_QUERY_NAME;
	}
}
