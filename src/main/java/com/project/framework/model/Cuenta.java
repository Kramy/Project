package com.project.framework.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta", schema = "public")
public class Cuenta implements java.io.Serializable {

    public Cuenta() {
    }

    public Cuenta(int id, PreguntaSeguridad preguntaSeguridad, Usuario usuario, String email, String contrasena, String respuestaSeguridad, String seudonimo) {
        this.id = id;
        this.preguntaSeguridad = preguntaSeguridad;
        this.usuario = usuario;
        this.email = email;
        this.contrasena = contrasena;
        this.respuestaSeguridad = respuestaSeguridad;
        this.seudonimo = seudonimo;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pregunta_seguridad", nullable = false)
    private PreguntaSeguridad preguntaSeguridad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario", nullable = false)
    private Usuario usuario;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "contrasena", nullable = false)
    private String contrasena;

    @Column(name = "respuesta_seguridad", nullable = false)
    private String respuestaSeguridad;

    @Column(name = "seudonimo", nullable = false)
    private String seudonimo;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PreguntaSeguridad getPreguntaSeguridad() {
        return this.preguntaSeguridad;
    }

    public void setPreguntaSeguridad(PreguntaSeguridad preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return this.contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRespuestaSeguridad() {
        return this.respuestaSeguridad;
    }

    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }

    public String getSeudonimo() {
        return this.seudonimo;
    }

    public void setSeudonimo(String seudonimo) {
        this.seudonimo = seudonimo;
    }

}
