package rest;

import com.google.gson.Gson;
import utils.EMF_Creator;
import utils.HttpUtils;

import javax.annotation.security.RolesAllowed;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import java.io.IOException;

@Path("card")
public class CardResource {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();
    Gson GSON = new Gson();
    @Context
    private UriInfo context;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getNewDeckShuffle(){
        return GSON.toJson(HttpUtils.fetchNewDeck());
    }

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("{id}")
//    public String getNewDeckShuffle(@PathParam("id") String id){
//        return GSON.toJson(HttpUtils.fetchNewDeck());
//    }

}
