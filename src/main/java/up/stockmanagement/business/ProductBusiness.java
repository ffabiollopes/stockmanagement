package up.stockmanagement.business;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import up.stockmanagement.DTO.ProductDTO;
import up.stockmanagement.model.Product;
import up.stockmanagement.repositories.ProductRepository;

public class ProductBusiness {
	@Inject
	ProductRepository productRepository;

	@Transactional
	public void delete(long id) {
		productRepository.delete(id);
	}

	@Transactional
	public ProductDTO update(Product product) {
		productRepository.update(product);
		return new ProductDTO(product);
	}

	@Transactional
	public ProductDTO create(Product product) {
		productRepository.create(product);
		return new ProductDTO(product);
	}

	public List<ProductDTO> getAll() {
		List<ProductDTO> listDTO = new ArrayList<ProductDTO>();
		List<Product> ListProduct = productRepository.getAll();
		for(Product i : ListProduct) {
			listDTO.add(new ProductDTO(i));
		}
		return listDTO;
	}

	public ProductDTO findById(long id) {
		Product product = productRepository.findById(id);
		return new ProductDTO(product);
	}

}
