package up.stockmanagement.repositories;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.persistence.TypedQuery;

import up.stockmanagement.model.Shelf;

@RequestScoped
public class ShelfRepository  extends EntityRepository<Shelf>{
	@Override
	protected Class<Shelf> getEntityClass() {
		return Shelf.class;
	}

	@Override
	protected String getAllEntityQueryName() {
		return Shelf.GET_ALL_SHELVES_QUERY_NAME;
	}
	
	public List<Shelf> findByProductId(long id) {
		TypedQuery<Shelf> query = entityManager.createNamedQuery(Shelf.GET_SHELVES_BY_PRODUCT_ID_QUERY_NAME, Shelf.class);
		query.setParameter("productId", id);
		return query.getResultList();
	}
}
