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
public class Persona {
    private int idPersona;
    private String nombre;
    private int edad;
    private String email;
    
    public Persona(){}
    
    public Persona(int id, String nom, int edad, String em){
        this.idPersona = id;
        this.nombre = nom;
        this.edad = edad;
        this.email = em;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
