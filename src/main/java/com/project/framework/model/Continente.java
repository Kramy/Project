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
@Table(name = "continente", schema = "public")
public class Continente implements java.io.Serializable {

    public Continente() {
    }

    public Continente(int id) {
        this.id = id;
    }

    public Continente(int id, String texto, Set<Idioma> idiomas) {
        this.id = id;
        this.texto = texto;
        this.idiomas = idiomas;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "texto")
    private String texto;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "continente")
    private Set<Idioma> idiomas = new HashSet<>(0);

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

    public Set<Idioma> getIdiomas() {
        return this.idiomas;
    }

    public void setIdiomas(Set<Idioma> idiomas) {
        this.idiomas = idiomas;
    }

}
