package com.udea.pruebamillenium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.udea.pruebamillenium.ApiConexion.Millenium.ConsumidorMillenium;
import com.udea.pruebamillenium.ApiConexion.ModeloConexion.ApiUtilidades;
import com.udea.pruebamillenium.Controlador.dto.Millenium;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private EditText usuario;
    private EditText clave;
    private ConsumidorMillenium apiConexion;
    private String api = ApiUtilidades.getApi();
    private TextView btnRegistro;
    private String usuarioLogin;
    private String claveLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.obtenerDatosForm();
        apiConexion = ApiUtilidades.getConexionApi();
    }
    public void iniciarSesion(String usuarioLogin, String claveLogin){

        Call<Millenium> clienteAutenticado = apiConexion.iniciarSesion(usuarioLogin, claveLogin, this.api);

        clienteAutenticado.enqueue(new Callback<Millenium>() {
            @Override
            public void onResponse(Call<Millenium> call, Response<Millenium> response) {
                validarOnResponse(call, response);
            }

            @Override
            public void onFailure(Call<Millenium> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    public  void validarOnResponse(Call<Millenium> call, Response<Millenium> response){
        Toast.makeText(MainActivity.this,response+"",Toast.LENGTH_LONG).show();

      /*  if (String.valueOf(response.code()).equals("200")){
            ClienteDto clienteLogeado = response.body();
            Intent intent = new Intent(MainActivity.this, Usuario.class);
            intent.putExtra("id",clienteLogeado.getIdentificacion());
            intent.putExtra("usuario",clienteLogeado.getUsuario());
            intent.putExtra("contrasena",clienteLogeado.getContrasena());
            intent.putExtra("nombres",clienteLogeado.getNombres());
            intent.putExtra("apellidos",clienteLogeado.getApellidos());

            MainActivity.this.startActivity(intent);

        }else if(String.valueOf(response.code()).equals("404")){
            Toast.makeText(MainActivity.this,"Cliente no existe",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(MainActivity.this,"Usuario o contraseña incorrecto",Toast.LENGTH_LONG).show();
        }*/
    }

    public void obtenerDatosForm(){
        this.usuario = (EditText) findViewById(R.id.et_usuario);
        this.clave = (EditText) findViewById(R.id.et_clave);
        //this.btnRegistro = findViewById(R.id.btn_registrame);

    }
    public void iniciarSesionOnClick(View view){

        this.usuarioLogin = usuario.getText().toString().trim();
        this.claveLogin = clave.getText().toString().trim();
        if(camposVacios( this.usuarioLogin, this.claveLogin )) {
            iniciarSesion(this.usuarioLogin, this.claveLogin);
        }
    }

    public boolean camposVacios(String usuario, String contrasena){
        if (usuario.isEmpty()){
            Toast.makeText(this, "Usuario es requerido",Toast.LENGTH_LONG).show();
            return false;
        }
        if (contrasena.isEmpty()){
            Toast.makeText(this, "Contraseña es requerida",Toast.LENGTH_LONG).show();
            return false;
        }
        return true;

    }
}
