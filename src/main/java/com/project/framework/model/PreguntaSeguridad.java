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
@Table(name = "pregunta_seguridad", schema = "public")
public class PreguntaSeguridad implements java.io.Serializable {

    public PreguntaSeguridad() {
    }

    public PreguntaSeguridad(int id, String texto) {
        this.id = id;
        this.texto = texto;
    }

    public PreguntaSeguridad(int id, String texto, Set<Cuenta> cuentas) {
        this.id = id;
        this.texto = texto;
        this.cuentas = cuentas;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "texto", nullable = false)
    private String texto;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "preguntaSeguridad")
    private Set<Cuenta> cuentas = new HashSet<>(0);

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

    public Set<Cuenta> getCuentas() {
        return this.cuentas;
    }

    public void setCuentas(Set<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

}
