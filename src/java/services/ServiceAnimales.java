/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import models.Animal;
import repository.RepositoryAnimales;

/**
 * REST Web Service
 *
 * @author lscar
 */
@Path("/animales")
public class ServiceAnimales {
    
    RepositoryAnimales repo;
    
    public ServiceAnimales(){
        this.repo = new RepositoryAnimales();
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Animal> getAnimalXml() {
        return this.repo.getAnimales();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Animal getAnimal(@PathParam("id") String id){
        int idp = Integer.parseInt(id);
        return this.repo.getAnimal(idp);
    }
}
