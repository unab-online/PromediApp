package co.edu.unab.Martinez.Andrea.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TallerActivity extends AppCompatActivity {

    private EditText inputasist1;
    private EditText inputtrabClas1;
    private EditText inputtrabytaller;
    private EditText inputparcial;
    private EditText inputasist2;
    private EditText inputtrabClas2;
    private EditText inputprentregable;
    private EditText inputsegentregable;
    private EditText inputsust;
    private EditText inputapp;
    private Button btncalcular;
    private TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller);


        inputasist1=findViewById(R.id.input_asistencia1);
        inputtrabClas1=findViewById(R.id.input_trabajoclase1);
        inputtrabytaller=findViewById(R.id.input_trabytallr);
        inputparcial=findViewById(R.id.input_parcial);
        inputasist2=findViewById(R.id.input_asistencia2);
        inputtrabClas2=findViewById(R.id.input_trabajoclase2);
        inputprentregable=findViewById(R.id.input_prentrega);
        inputsegentregable=findViewById(R.id.input_segentrega);
        inputsust=findViewById(R.id.input_sustent);
        inputapp=findViewById(R.id.input_app);

        btncalcular=findViewById(R.id.btn_calcular);

        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado, resultado1, resultado21, resultado22;

                if (inputasist1.getText().toString().isEmpty() || inputasist2.getText().toString().isEmpty()  || inputsust.getText().toString().isEmpty() || inputsegentregable.getText().toString().isEmpty() ||inputprentregable.getText().toString().isEmpty() ||inputparcial.getText().toString().isEmpty() || inputtrabClas1.getText().toString().isEmpty() ||inputapp.getText().toString().isEmpty() ||inputtrabClas2.getText().toString().isEmpty() ||inputtrabytaller.getText().toString().isEmpty()){

                    String aviso ="";

                    if(inputasist1.getText().toString().isEmpty()){
                        aviso = aviso+"Asistencia 1 ";
                    }
                    if(inputasist2.getText().toString().isEmpty()){
                        aviso = aviso+"Asistencia 2 ";
                    }
                    if(inputsust.getText().toString().isEmpty()){
                        aviso=aviso+"Sustentación ";
                    }
                    if(inputsegentregable.getText().toString().isEmpty()){
                        aviso = aviso+"Segundo Entregable ";
                    }
                    if(inputprentregable.getText().toString().isEmpty()){
                        aviso = aviso+"Primer Entregable ";
                    }
                    if(inputparcial.getText().toString().isEmpty()){
                        aviso = aviso +"Parcial ";
                    }
                    if(inputtrabytaller.getText().toString().isEmpty()){
                        aviso = aviso + "Trabajos y Talleres ";
                    }
                    if(inputtrabClas2.getText().toString().isEmpty()){
                        aviso = aviso+"Trabajo en Clase 2 ";
                    }
                    if(inputapp.getText().toString().isEmpty()){
                        aviso = aviso + "Aplicación ";
                    }
                    if(inputtrabClas1.getText().toString().isEmpty()){
                        aviso = aviso+"Trabajo en Clase 1 ";
                    }

                    Toast.makeText(getApplication(),"Actividades vacías "+aviso ,Toast.LENGTH_LONG).show();
                }
                else{

                    Definitiva miDefinitiva = new Definitiva();

                    miDefinitiva.setAsistencia1(Double.valueOf(inputasist1.getText().toString()));
                    miDefinitiva.setTalleres(Double.valueOf(inputtrabytaller.getText().toString()));
                    miDefinitiva.setTrabajos1(Double.valueOf(inputtrabClas1.getText().toString()));
                    miDefinitiva.setParcial(Double.valueOf(inputparcial.getText().toString()));

                    miDefinitiva.setAsistencia2(Double.valueOf(inputasist2.getText().toString()));
                    miDefinitiva.setTrabajos2(Double.valueOf(inputtrabClas2.getText().toString()));
                    miDefinitiva.setEntregable1(Double.valueOf(inputprentregable.getText().toString()));
                    miDefinitiva.setEntregable2(Double.valueOf(inputsegentregable.getText().toString()));
                    miDefinitiva.setSustentacion(Double.valueOf(inputsust.getText().toString()));
                    miDefinitiva.setAplicacion(Double.valueOf(inputapp.getText().toString()));

                    /**resultado1 = Double.valueOf(inputasist1.getText().toString()) * 0.1 + Double.valueOf(inputtrabClas1.getText().toString()) * 0.3 + Double.valueOf(inputparcial.getText().toString()) * 0.3 + Double.valueOf(inputtrabytaller.getText().toString()) * 0.3;
                    resultado21 = Double.valueOf(inputasist2.getText().toString()) * 0.1 + Double.valueOf(inputtrabClas2.getText().toString()) * 0.3;
                    resultado22 = Double.valueOf(inputprentregable.getText().toString()) * 0.15 + Double.valueOf(inputsegentregable.getText().toString()) * 0.15 +  Double.valueOf(inputapp.getText().toString()) * 0.15 +  Double.valueOf(inputsust.getText().toString()) * 0.15;
                    resultado = resultado1*0.5+((resultado21+resultado22)*0.5);**/

                    Intent miIntencion = new Intent(getApplication(), ResultadoActivity.class);

                    miIntencion.putExtra("resultado",miDefinitiva);
                    miIntencion.putExtra("titulo","Resultado final: ");
                    miIntencion.putExtra("tituloSC","Segundo Corte: ");
                    miIntencion.putExtra("tituloPC","Primer Corte: ");
                    startActivity(miIntencion);
                }

            }
        });
    }
}
