package com.project.framework.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuario", schema = "public")
public class Usuario implements java.io.Serializable {

    public Usuario() {
    }

    public Usuario(int id, Rango rango, String nombre) {
        this.id = id;
        this.rango = rango;
        this.nombre = nombre;
    }

    public Usuario(int id, Rango rango, String nombre, String apellido, Set<Cuenta> cuentas) {
        this.id = id;
        this.rango = rango;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentas = cuentas;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rango", nullable = false)
    private Rango rango;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    private Set<Cuenta> cuentas = new HashSet<>(0);

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

    public Set<Cuenta> getCuentas() {
        return this.cuentas;
    }

    public void setCuentas(Set<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

}
