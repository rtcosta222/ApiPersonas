/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import models.Persona;

/**
 *
 * @author lscar
 */
public class RepositoryPersonas {
    private List<Persona> personas;
    
    public RepositoryPersonas(){
        this.personas = new ArrayList<>();
        Persona p = new Persona(1, "Sofia1", 11, "em11");
        this.personas.add(p);
        p = new Persona(2, "Sofia2", 22, "em22");
        this.personas.add(p);
        p = new Persona(3, "Sofia3", 33, "em33");
        this.personas.add(p);
        p = new Persona(4, "Sofia4", 44, "em44");
        this.personas.add(p);
    }
    
    public List<Persona> getPersonas(){
        return this.personas;
    }
    
    public Persona BuscarPersona(int id){
        for (Persona p: this.personas){
            if(p.getIdPersona() == id){
                return p;
            }
        }
        return null;
    }
}
