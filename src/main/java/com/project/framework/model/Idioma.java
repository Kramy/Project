package com.project.framework.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "idioma", schema = "public")
public class Idioma implements java.io.Serializable {

    public Idioma() {
    }

    public Idioma(int id, Continente continente, String texto, String iso639) {
        this.id = id;
        this.continente = continente;
        this.texto = texto;
        this.iso639 = iso639;
    }

    public Idioma(int id, Continente continente, String texto, String iso639, Boolean estado) {
        this.id = id;
        this.continente = continente;
        this.texto = texto;
        this.iso639 = iso639;
        this.estado = estado;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "continente", nullable = false)
    private Continente continente;

    @Column(name = "texto", nullable = false)
    private String texto;

    @Column(name = "iso_639", nullable = false)
    private String iso639;

    @Column(name = "estado")
    private Boolean estado;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Continente getContinente() {
        return this.continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getIso639() {
        return this.iso639;
    }

    public void setIso639(String iso639) {
        this.iso639 = iso639;
    }

    public Boolean getEstado() {
        return this.estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}
