package com.example.tavom.comocepillarse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CepillaDientes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cepilla_dientes);

        //Recivimos los parametros del intent y almacenamos en bundle

        Bundle bundle=getIntent().getExtras();

        /*
        * Instanciamos imageView para la imagen de la vista de cepilla dientes
        * seteamos la imagen segun el parametro traido segun el MainActivity
        * */
        ImageView imageView = (ImageView) findViewById(R.id.image_random);
        imageView.setImageResource(bundle.getInt("image"));
        /*
        * Instanciamos textView para el texto del Titulo cepilla dientes
        * seteamos el texto del titulo segun el parametro traido, segun el MainActivity
        * */
        TextView textView = (TextView) findViewById(R.id.titulo_random);
        textView.setText(bundle.getString("titulo"));
        /*
        * Instanciamos textView para el texto del Texto cepilla dientes
        * seteamos el texto segun el parametro traido, segun el MainActivity
        * */
        TextView textView1 = (TextView) findViewById(R.id.texto_random);
        textView1.setText(bundle.getString("texto"));
    }

    /*
    * Metodo para el regreso al mainActivity
    * */
    public void inicioApp(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    
}
