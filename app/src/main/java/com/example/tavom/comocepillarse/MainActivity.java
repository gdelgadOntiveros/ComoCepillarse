package com.example.tavom.comocepillarse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * linearLayout contiene array de layouts
        */
        LinearLayout[] linearLayouts = new LinearLayout[5];

        //Recorremos el arreglo de linearLayouts
        for(int i = 0; i < linearLayouts.length; i++) {

                String linearLayoutID = "linearLayout" + (i+1);

                int resID = getResources().getIdentifier(linearLayoutID, "id", getPackageName());
                linearLayouts[i] = ((LinearLayout) findViewById(resID));
                linearLayouts[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cepillaDientes(v);
                    }
                });
        }
    }

    /*
    * Creamos intent para enviar parametros a otra activity "CepillaDientes"
    * */
    private void cepillaDientes(View view){
        Intent intent = new Intent(this, CepillaDientes.class);

        int resID1 = getResources().getIdentifier("linearLayout1", "id", getPackageName());
        int resID2 = getResources().getIdentifier("linearLayout2", "id", getPackageName());
        int resID3 = getResources().getIdentifier("linearLayout3", "id", getPackageName());
        int resID4 = getResources().getIdentifier("linearLayout4", "id", getPackageName());
        int resID5 = getResources().getIdentifier("linearLayout5", "id", getPackageName());

        /*
        * Condicionales if para comparar ID dependiendo del caso
        * segun sea el caso el metodo putExtra enviara parametros
        *
        * */

        if (resID1 == view.getId()) {
            intent.putExtra("image", R.drawable.cepilla_tus_dientes);
            intent.putExtra("titulo",getString(R.string.titulo_cepilla_tus_dientes));
            intent.putExtra("texto",getString(R.string.texto_cepilla_tus_dientes));
        }else if (resID2 == view.getId()){
            intent.putExtra("image", R.drawable.cepillo);
            intent.putExtra("titulo",getString(R.string.titulo_cepillo_suave));
            intent.putExtra("texto",getString(R.string.texto_cepillo_suave));
        }else if (resID3 == view.getId()){
            intent.putExtra("image", R.drawable.angulo_45);
            intent.putExtra("titulo",getString(R.string.titulo_cepillo_45_grados));
            intent.putExtra("texto",getString(R.string.texto_cepillo_45_grados));
        }else if (resID4 == view.getId()){
            intent.putExtra("image", R.drawable.cepilla_lengua);
            intent.putExtra("titulo",getString(R.string.titulo_cepilla_lengua));
            intent.putExtra("texto",getString(R.string.texto_cepilla_lengua));
        }else if (resID5 == view.getId()){
            intent.putExtra("image", R.drawable.hilo_dental);
            intent.putExtra("titulo",getString(R.string.titulo_utiliza_hilo));
            intent.putExtra("texto",getString(R.string.texto_utiliza_hilo));
        }

        startActivity(intent);
    }

}
