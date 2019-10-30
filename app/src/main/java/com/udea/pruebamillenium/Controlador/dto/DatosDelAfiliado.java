package com.udea.pruebamillenium.Controlador.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DatosDelAfiliado {

    @SerializedName("name_user")
    @Expose
    private String nameUser;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("apellido")
    @Expose
    private String apellido;
    @SerializedName("activacion")
    @Expose
    private String activacion;
    @SerializedName("correo")
    @Expose
    private String correo;
    @SerializedName("estatus")
    @Expose
    private String estatus;

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getActivacion() {
        return activacion;
    }

    public void setActivacion(String activacion) {
        this.activacion = activacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

}