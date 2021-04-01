/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lscar
 */

@XmlRootElement
public class Animal {

    private int id;
    private String clase;
    private String orden;
    private String familia;
    private String genero;
    private String especie;

    public Animal(){}

    public Animal(int id, String clase, String orden, String familia, String genero, String especie) {
        this.id = id;
        this.clase = clase;
        this.orden = orden;
        this.familia = familia;
        this.genero = genero;
        this.especie = especie;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
