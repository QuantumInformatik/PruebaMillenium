package com.udea.pruebamillenium.Controlador.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConfiguracionesSistema {

    @SerializedName("simbolo_moneda")
    @Expose
    private String simboloMoneda;

    public String getSimboloMoneda() {
        return simboloMoneda;
    }

    public void setSimboloMoneda(String simboloMoneda) {
        this.simboloMoneda = simboloMoneda;
    }
}
