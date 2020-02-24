package co.edu.unab.diaz.javier.promediapp;

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

    private EditText asistencia1, trabajoclase1, trabajostalleres, parcial, asistencia2, trabajoclase2, primerentregable, segundoentregable, sustentacion, aplicacion;
    private Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller);

        asistencia1 = findViewById(R.id.asistencia1);
        trabajoclase1 = findViewById(R.id.trabajoclase1);
        trabajostalleres = findViewById(R.id.trabajostalleres);
        parcial = findViewById(R.id.parcial);
        asistencia2 = findViewById(R.id.asistencia2);
        trabajoclase2 = findViewById(R.id.trabajoclase2);
        primerentregable = findViewById(R.id.primerentregable);
        segundoentregable = findViewById(R.id.segundoentregable);
        sustentacion = findViewById(R.id.sustentacion);
        aplicacion = findViewById(R.id.aplicacion);
        calcular = findViewById(R.id.calcular);

        calcular.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if (!isEmpy(asistencia1) && !isEmpy(trabajoclase1) && !isEmpy(trabajostalleres) && !isEmpy(parcial)
                        && !isEmpy(asistencia2) && !isEmpy(trabajoclase2) && !isEmpy(primerentregable) && !isEmpy(segundoentregable)
                        && !isEmpy(sustentacion) && !isEmpy(aplicacion))
                {
                    Toast.makeText(getBaseContext(), "Calculando", Toast.LENGTH_SHORT).show();
                    double corte1 = (getNumber(asistencia1)*0.1)+(getNumber(asistencia2)*0.3)+(getNumber(trabajostalleres)*0.3)+
                            (getNumber(parcial)*0.3);
                    Log.d("TEST","Corte 1 " + corte1);

                    double corte2 = (getNumber(asistencia2)*0.1)+(getNumber(trabajoclase2)*0.3)+(getNumber(primerentregable)*0.15)+
                            (getNumber(segundoentregable)*0.15)+(getNumber(sustentacion)*0.15)+(getNumber(aplicacion)*0.15);
                    Log.d("TEST","Corte 2 " + corte2);
                    double resultado = (corte1*0.5)+(corte2*0.5);

                    Intent intentResultado = new Intent(getApplication(), ResultadoActivity.class);
                    startActivity(intentResultado);
                }else {
                    Toast.makeText(getBaseContext(), "Error: Debe llenar todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        private double getNumber(EditText aux){
            return Double.valueOf(aux.getText().toString());
        }

        private boolean isEmpy(EditText aux){
            return aux.getText().toString().trim().length() == 0;
    }
}
