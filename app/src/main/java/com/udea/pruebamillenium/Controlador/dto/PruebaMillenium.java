package com.udea.pruebamillenium.Controlador.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PruebaMillenium {

    @SerializedName("millenium")
    @Expose
    private List<Millenium> millenium = null;

    public List<Millenium> getMillenium() {
        return millenium;
    }

    public void setMillenium(List<Millenium> millenium) {
        this.millenium = millenium;
    }

}
