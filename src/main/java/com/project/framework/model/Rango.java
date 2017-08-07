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
@Table(name = "rango", schema = "public")
public class Rango implements java.io.Serializable {

    public Rango() {
    }

    public Rango(int id, String texto) {
        this.id = id;
        this.texto = texto;
    }

    public Rango(int id, String texto, Set<Usuario> usuarios) {
        this.id = id;
        this.texto = texto;
        this.usuarios = usuarios;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "texto", nullable = false)
    private String texto;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "rango")
    private Set<Usuario> usuarios = new HashSet<>(0);

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

    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}
