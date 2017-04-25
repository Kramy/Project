package com.project.framework.model;
// Generated 29-ene-2017 15:21:22 by Hibernate Tools 4.3.1



/**
 * Control generated by hbm2java
 */
public class Control  implements java.io.Serializable {


     private int id;
     private Aplicacion aplicacion;
     private String texto;
     private String descripcion;
     private String valor;
     private int orden;

    public Control() {
    }

	
    public Control(int id, Aplicacion aplicacion, String texto, String valor, int orden) {
        this.id = id;
        this.aplicacion = aplicacion;
        this.texto = texto;
        this.valor = valor;
        this.orden = orden;
    }
    public Control(int id, Aplicacion aplicacion, String texto, String descripcion, String valor, int orden) {
       this.id = id;
       this.aplicacion = aplicacion;
       this.texto = texto;
       this.descripcion = descripcion;
       this.valor = valor;
       this.orden = orden;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Aplicacion getAplicacion() {
        return this.aplicacion;
    }
    
    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
    }
    public String getTexto() {
        return this.texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getValor() {
        return this.valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }
    public int getOrden() {
        return this.orden;
    }
    
    public void setOrden(int orden) {
        this.orden = orden;
    }




}


