package com.udea.pruebamillenium.Controlador.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("IdApp")
    @Expose
    private String idApp;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("configuraciones_sistema")
    @Expose
    private List<ConfiguracionesSistema> configuracionesSistema = null;
    @SerializedName("datos_del_afiliado")
    @Expose
    private List<DatosDelAfiliado> datosDelAfiliado = null;
    @SerializedName("enlace_qr")
    @Expose
    private String enlaceQr;
    @SerializedName("enlace_qr_info")
    @Expose
    private String enlaceQrInfo;
    @SerializedName("imagen_perfil")
    @Expose
    private String imagenPerfil;

    public String getIdApp() {
        return idApp;
    }

    public void setIdApp(String idApp) {
        this.idApp = idApp;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<ConfiguracionesSistema> getConfiguracionesSistema() {
        return configuracionesSistema;
    }

    public void setConfiguracionesSistema(List<ConfiguracionesSistema> configuracionesSistema) {
        this.configuracionesSistema = configuracionesSistema;
    }

    public List<DatosDelAfiliado> getDatosDelAfiliado() {
        return datosDelAfiliado;
    }

    public void setDatosDelAfiliado(List<DatosDelAfiliado> datosDelAfiliado) {
        this.datosDelAfiliado = datosDelAfiliado;
    }

    public String getEnlaceQr() {
        return enlaceQr;
    }

    public void setEnlaceQr(String enlaceQr) {
        this.enlaceQr = enlaceQr;
    }

    public String getEnlaceQrInfo() {
        return enlaceQrInfo;
    }

    public void setEnlaceQrInfo(String enlaceQrInfo) {
        this.enlaceQrInfo = enlaceQrInfo;
    }

    public String getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(String imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

}
