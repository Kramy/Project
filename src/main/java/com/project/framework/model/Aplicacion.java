package com.project.framework.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "aplicacion", schema = "public")
public class Aplicacion implements java.io.Serializable {

    public Aplicacion() {
    }

    public Aplicacion(int id, String texto) {
        this.id = id;
        this.texto = texto;
    }

    public Aplicacion(int id, String texto, String descripcion, Set<Control> controls) {
        this.id = id;
        this.texto = texto;
        this.descripcion = descripcion;
        this.controls = controls;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "texto", nullable = false)
    private String texto;

    @Column(name = "descripcion")
    private String descripcion;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "aplicacion")
    private Set<Control> controls = new HashSet<>(0);

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

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Control> getControls() {
        return this.controls;
    }

    public void setControls(Set<Control> controls) {
        this.controls = controls;
    }

}
