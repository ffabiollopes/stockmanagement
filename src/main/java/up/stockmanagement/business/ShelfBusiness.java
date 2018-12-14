package up.stockmanagement.business;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import up.stockmanagement.model.Shelf;
import up.stockmanagement.repositories.ShelfRepository;

public class ShelfBusiness {
	@Inject
	ShelfRepository shelfRepository;
	

	@Transactional
	public void delete(long id) {
		shelfRepository.delete(id);
	}

	@Transactional
	public Shelf update(Shelf shelf) {
		return shelfRepository.update(shelf);
	}
	
	@Transactional
	public Shelf create(Shelf shelf) {
		return shelfRepository.create(shelf);
	}
	
	public List<Shelf> getAll() {
		return shelfRepository.getAll();
	}
	
	public Shelf findById(long id) {
		return  shelfRepository.findById(id);
	}
}
