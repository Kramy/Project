package com.project.framework.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "control", schema = "public")
public class Control implements java.io.Serializable {

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

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aplicacion", nullable = false)
    private Aplicacion aplicacion;

    @Column(name = "texto", nullable = false)
    private String texto;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "valor", nullable = false)
    private String valor;

    @Column(name = "orden", nullable = false)
    private int orden;

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
