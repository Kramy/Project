package com.project.framework.model;
// Generated 29-ene-2017 15:21:22 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Rango generated by hbm2java
 */
public class Rango  implements java.io.Serializable {


     private int id;
     private String texto;
     private Set usuarios = new HashSet(0);

    public Rango() {
    }

	
    public Rango(int id, String texto) {
        this.id = id;
        this.texto = texto;
    }
    public Rango(int id, String texto, Set usuarios) {
       this.id = id;
       this.texto = texto;
       this.usuarios = usuarios;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getTexto() {
        return this.texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


