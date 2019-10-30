package com.udea.pruebamillenium.ApiConexion.Millenium;

import com.udea.pruebamillenium.Controlador.dto.Millenium;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ConsumidorMillenium {

    @POST("loggin/")
    @FormUrlEncoded
    Call<Millenium> iniciarSesion(@Field("usuario") String usuario,@Field("clave") String clave, @Field("api") String api);


}
