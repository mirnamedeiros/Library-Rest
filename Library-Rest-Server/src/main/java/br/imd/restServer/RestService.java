package br.imd.restServer;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.imd.libraries.LibraryA;
import br.imd.libraries.LibraryB;
import br.imd.libraries.LibraryC;
import br.imd.libraries.LibraryInterface;



@Path("library")
public class RestService {
	
	private ArrayList<LibraryInterface> libraries = new ArrayList<LibraryInterface>();
	
	public RestService() {
		LibraryA lA = new LibraryA();
		LibraryB lB = new LibraryB();
		LibraryC lC = new LibraryC();
		libraries.add(lA);
		libraries.add(lB);
		libraries.add(lC);
	}
	
	
	@GET
	@Path("search/{tittle}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response search(@PathParam("tittle") String tittle){
		
		String s = "";
		for(LibraryInterface l : libraries) {
			s += l.searchForTitle(tittle);
			s +="\n";
		}		
		return Response.ok(s).build();
	}
	
}