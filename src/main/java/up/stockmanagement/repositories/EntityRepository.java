package up.stockmanagement.repositories;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import up.stockmanagement.model.EntityModel;

public abstract class EntityRepository <T extends EntityModel> {
	@PersistenceContext
	protected EntityManager entityManager;


	
	public void delete(long id) {
		T entity = findById(id);
		if(entity != null) {
			entityManager.remove(entity);
		}
	}

	public T update(T entity) {
		return entityManager.merge(entity);
	}
	
	public T create(T entity) {
		return entityManager.merge(entity);
	}
	
	public List<T> getAll() {
		return entityManager.createNamedQuery(getAllEntityQueryName(), getEntityClass()).getResultList();
	}
	
	public T findById(long id) {
		return entityManager.find(getEntityClass(), id);
	}

	
	
	protected abstract  Class<T> getEntityClass();
	protected abstract  String getAllEntityQueryName();


}
