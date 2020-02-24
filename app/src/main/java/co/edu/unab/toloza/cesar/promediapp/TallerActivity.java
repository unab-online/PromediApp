package co.edu.unab.toloza.cesar.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TallerActivity extends AppCompatActivity {

    private EditText corte1Asistencia, corte1TrabajoClase, corte1TrabajoTalleres, corte1Parcial,
            corte2Asistencia, corte2TrabajoClase, corte2Entregable1, corte2Entregable2, corte2Sustentacion, corte2Aplicacion;
    private Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller);

        corte1Asistencia = findViewById(R.id.corte1_asistecia10);
        corte1TrabajoClase = findViewById(R.id.corte1_trabajo_clase30);
        corte1TrabajoTalleres = findViewById(R.id.corte1_trabajo_talleres30);
        corte1Parcial = findViewById(R.id.corte1_parcial30);
        corte2Asistencia = findViewById(R.id.corte2_asistencia10);
        corte2TrabajoClase = findViewById(R.id.corte2_trabajo_clase30);
        corte2Entregable1 = findViewById(R.id.corte2_entregable1_15);
        corte2Entregable2 = findViewById(R.id.corte2_entregable2_15);
        corte2Sustentacion = findViewById(R.id.corte2_sustentacion15);
        corte2Aplicacion = findViewById(R.id.corte2_aplicacion15);
        buttonCalcular = findViewById(R.id.button_calcular);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!isEmpy(corte1Asistencia) && !isEmpy(corte1TrabajoClase) && !isEmpy(corte1TrabajoTalleres) && !isEmpy(corte1Parcial)
                        && !isEmpy(corte2Asistencia) && !isEmpy(corte2TrabajoClase) && !isEmpy(corte2Entregable1) && !isEmpy(corte2Entregable2)
                        && !isEmpy(corte2Sustentacion) && !isEmpy(corte2Aplicacion))
                {
                    Toast.makeText(getBaseContext(), "Calculando", Toast.LENGTH_SHORT).show();
                    /*double corte1 = (getNumber(corte1Asistencia)*0.1)+(getNumber(corte1TrabajoClase)*0.3)+(getNumber(corte1TrabajoTalleres)*0.3)+
                            (getNumber(corte1Parcial)*0.3);
                    Log.d("TEST","Corte 1 " + corte1);

                    double corte2 = (getNumber(corte2Asistencia)*0.1)+(getNumber(corte2TrabajoClase)*0.3)+(getNumber(corte2Entregable1)*0.15)+
                            (getNumber(corte2Entregable2)*0.15)+(getNumber(corte2Sustentacion)*0.15)+(getNumber(corte2Aplicacion)*0.15);
                    Log.d("TEST","Corte 2 " + corte2);
                    double resultado = (corte1*0.5)+(corte2*0.5);*/

                    Definitiva definitiva = new Definitiva();

                    definitiva.setAsistencia1(getNumber(corte1Asistencia));
                    definitiva.setTalleres(getNumber(corte1TrabajoTalleres));
                    definitiva.setTrabajos1(getNumber(corte1TrabajoClase));
                    definitiva.setParcial(getNumber(corte1Parcial));
                    definitiva.setAsistencia2(getNumber(corte2Asistencia));
                    definitiva.setTrabajos2(getNumber(corte2TrabajoClase));
                    definitiva.setEntragable1(getNumber(corte2Entregable1));
                    definitiva.setEntragable2(getNumber(corte2Entregable2));
                    definitiva.setAplicacion(getNumber(corte2Aplicacion));
                    definitiva.setSustentacion(getNumber(corte2Sustentacion));

                    Intent intentResultado = new Intent(getApplication(), ResultadoActivity.class);
                    intentResultado.putExtra("res", definitiva.getDefinitiva());
                    intentResultado.putExtra("titulo", "Resultado Final");
                    startActivity(intentResultado);
                }else {
                    Toast.makeText(getBaseContext(), "Error: Falta llenar los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private double getNumber(EditText aux){
        return Double.valueOf(aux.getText().toString());
    }

    private boolean isEmpy(EditText aux){
        return aux.getText().toString().isEmpty();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ESTADO","Iniciando actividad..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ESTADO","Ocultando actividad..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ESTADO","Deteniendo actividad..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ESTADO","Terminando actividad..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ESTADO","Mostrando actividad..");
    }
}
