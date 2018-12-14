package up.stockmanagement.services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import up.stockmanagement.DTO.ProductDTO;
import up.stockmanagement.business.ProductBusiness;
import up.stockmanagement.model.Product;


@Path("/products")
public class ProductServices{
	
//	
//	protected EntityRepository<ProductDTO> productServiceDTO;
	@Inject
	ProductBusiness productService;
	
	@Context
	protected UriInfo context;


	@GET
	@Path("healthCheck")
	@Produces(MediaType.TEXT_PLAIN)
	public String healthCheck() {
		return "URI " + context.getRequestUri().toString() + " is OK!";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProductDTO> getAll() {
		return productService.getAll();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ProductDTO create(Product product) {
		return productService.create(product);
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ProductDTO findById(@PathParam("id") long id) {
		return productService.findById(id);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ProductDTO update(Product Product) {
		return productService.update(Product);
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam("id") long id) {
		productService.delete(id);
		return Response.ok().build();
	}
}


