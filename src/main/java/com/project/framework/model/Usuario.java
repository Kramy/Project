package com.project.framework.model;
// Generated 29-ene-2017 15:21:22 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int id;
     private Rango rango;
     private String nombre;
     private String apellido;
     private Set cuentas = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(int id, Rango rango, String nombre) {
        this.id = id;
        this.rango = rango;
        this.nombre = nombre;
    }
    public Usuario(int id, Rango rango, String nombre, String apellido, Set cuentas) {
       this.id = id;
       this.rango = rango;
       this.nombre = nombre;
       this.apellido = apellido;
       this.cuentas = cuentas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Rango getRango() {
        return this.rango;
    }
    
    public void setRango(Rango rango) {
        this.rango = rango;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Set getCuentas() {
        return this.cuentas;
    }
    
    public void setCuentas(Set cuentas) {
        this.cuentas = cuentas;
    }




}


