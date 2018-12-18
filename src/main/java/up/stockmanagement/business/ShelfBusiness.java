package up.stockmanagement.business;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;


import up.stockmanagement.DTO.ShelfDTO;

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
	public ShelfDTO update(Shelf shelf) {
		shelfRepository.update(shelf);
		return new ShelfDTO(shelf);
	}
	
	@Transactional
	public ShelfDTO create(Shelf shelf) {
		shelfRepository.create(shelf);
		return new ShelfDTO(shelf);
	}
	
	public List<ShelfDTO> getAll() {
		List<ShelfDTO> listDTO = new ArrayList<ShelfDTO>();
		List<Shelf> ListShelves = shelfRepository.getAll();
		for(Shelf i : ListShelves) {
			listDTO.add(new ShelfDTO(i));
		}
		return listDTO;
	}
	
	public ShelfDTO findById(long id) {
		Shelf shelf = shelfRepository.findById(id);
		return  new ShelfDTO(shelf);
	}
}
