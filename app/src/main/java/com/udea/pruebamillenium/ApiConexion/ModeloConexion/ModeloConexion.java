package com.udea.pruebamillenium.ApiConexion.ModeloConexion;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ModeloConexion {
    private static Retrofit retrofit = null;
    public static Retrofit getModelo(String urlBase) {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(urlBase)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
