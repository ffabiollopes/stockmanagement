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

import up.stockmanagement.DTO.ShelfDTO;
import up.stockmanagement.business.ShelfBusiness;
import up.stockmanagement.model.Shelf;




@Path("shelves")
public class ShelfServices{
	@Inject
	ShelfBusiness shelfService;
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
	public  List<ShelfDTO> getAll() {
		return shelfService.getAll();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ShelfDTO create(Shelf shelf) {
		return shelfService.create(shelf);
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ShelfDTO findById(@PathParam("id") long id) {
		return shelfService.findById(id);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ShelfDTO update(Shelf shelf) {
		return shelfService.update(shelf);
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam("id") long id) {
		shelfService.delete(id);
		return Response.ok().build();
	}
}



