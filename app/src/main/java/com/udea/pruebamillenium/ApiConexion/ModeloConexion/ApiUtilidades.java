package com.udea.pruebamillenium.ApiConexion.ModeloConexion;

import com.udea.pruebamillenium.ApiConexion.Millenium.ConsumidorMillenium;

public class ApiUtilidades {
    private static final String URL_BASE = "http://192.168.0.101:8000/";
    private static final String API = "2O63Is-qSrKgVukPsFgDhmEr1_-rj0ht_HkxWlL_BfV11nyd1n0RTrJBbvvOLNTSZ2hXRmPN6HEiSTBUE3LdCw=";
    //192.168.1.5

    public ApiUtilidades() {
    }

    public static ConsumidorMillenium getConexionApi(){
        return ModeloConexion.getModelo(URL_BASE).create(ConsumidorMillenium.class);

    }
    public static String getApi(){
        return API;
    }

}
