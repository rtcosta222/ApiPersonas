/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import models.Persona;
import repository.RepositoryPersonas;

/**
 *
 * @author lscar
 */
@Path("/personas")
public class ServicePersonas {
    RepositoryPersonas repo;
   
    public ServicePersonas(){
        this.repo = new RepositoryPersonas();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Persona> getPersonas(){
        return this.repo.getPersonas();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Persona getPersona(@PathParam("id") String id){
        int idpersona = Integer.parseInt(id);
        return this.repo.BuscarPersona(idpersona);
    }
}
