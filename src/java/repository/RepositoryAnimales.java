/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import models.Animal;

/**
 *
 * @author lscar
 */
public class RepositoryAnimales {
    public List<Animal> animales;
    
    public RepositoryAnimales(){
        this.animales = new ArrayList<>();
        Animal animal = new Animal(11, "Mammalia11", "Carnivora11", "Felidae11", "Felis", "F.Silvestris11");
        this.animales.add(animal);
        animal = new Animal(22, "Mammalia22", "Carnivora22", "Felidae22", "Felis22", "F.Silvestris22");
        this.animales.add(animal);
        animal = new Animal(33, "Mammalia33", "Carnivora33", "Felidae33", "Felis33", "F.Silvestris33");
        this.animales.add(animal);        
    }
    
    public List<Animal> getAnimales(){
        return this.animales;
    }
    
    public Animal getAnimal(int id){
        for(Animal a: this.animales){
            if(a.getId() == id){
                return a;
            }
        }
        return null;
    }
}
