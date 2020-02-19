package co.edu.unab.primerapellido.primernombre.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TallerActivity extends AppCompatActivity  {

    private EditText editTextAsistencia1;
    private EditText editTextTrabajoClase1;
    private EditText editTextTrabajosTalleres;
    private EditText editTextParcial;

    private EditText editTextAsistencia2;
    private EditText editTextTrabajoClase2;

    private EditText editTextPrimerEntregable;
    private EditText editTextSegundoEntregable;
    private EditText editTextSustentacion;
    private EditText editTextAplicacion;

    private Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextAsistencia1 = findViewById(R.id.editTextAsistencia1);
        editTextTrabajoClase1 = findViewById(R.id.editTextTrabajoClase1);
        editTextTrabajosTalleres = findViewById(R.id.editTextTrabajosTalleres);
        editTextParcial = findViewById(R.id.editTextParcial);

        editTextAsistencia2 = findViewById(R.id.editTextAsistencia2);
        editTextTrabajoClase2 = findViewById(R.id.editTextTrabajoClase2);

        editTextPrimerEntregable = findViewById(R.id.editTextPrimerEntregable);
        editTextSegundoEntregable = findViewById(R.id.editTextSegundoEntregable);
        editTextSustentacion = findViewById(R.id.editTextSustentacion);
        editTextAplicacion = findViewById(R.id.editTextAplicacion);

        buttonCalcular = findViewById(R.id.buttonCalcular);



        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado, asis, traClas, traTa, par, asis2, traCla2, priEnt, segEnt, sus, app;

                if ( editTextAsistencia1.getText().toString().isEmpty()||
                        editTextTrabajoClase1.getText().toString().isEmpty()||
                        editTextTrabajosTalleres.getText().toString().isEmpty() ||
                        editTextParcial.getText().toString().isEmpty()||
                        editTextAsistencia2.getText().toString().isEmpty()||
                        editTextTrabajoClase2.getText().toString().isEmpty()||
                        editTextPrimerEntregable.getText().toString().isEmpty()||
                        editTextSegundoEntregable.getText().toString().isEmpty()||
                        editTextSustentacion.getText().toString().isEmpty()||
                        editTextAplicacion.getText().toString().isEmpty()
                ){

                    Toast.makeText(getApplicationContext(),"complete todos los campos", Toast.LENGTH_LONG).show();

                }else{
                    asis = Double.valueOf(editTextAsistencia1.getText().toString());
                    traClas = Double.valueOf(editTextTrabajoClase1.getText().toString());
                    traTa = Double.valueOf(editTextTrabajosTalleres.getText().toString());
                    par = Double.valueOf(editTextParcial.getText().toString());
                    asis2 = Double.valueOf(editTextAsistencia2.getText().toString());
                    traCla2 = Double.valueOf(editTextTrabajoClase2.getText().toString());
                    priEnt = Double.valueOf(editTextPrimerEntregable.getText().toString());
                    segEnt = Double.valueOf(editTextSegundoEntregable.getText().toString());
                    sus = Double.valueOf(editTextSustentacion.getText().toString());
                    app = Double.valueOf(editTextAplicacion.getText().toString());

                    resultado = ((asis*0.1)+(traClas*0.3)+(traTa*0.3)+(par*0.3))*0.5+((asis2*0.1)+(traCla2*0.3)+(priEnt*0.15)+(segEnt*0.15)+(sus*0.15)+(app*0.15))*0.5;
                    //textViewResultado.setText("RESULTADO: "+resultado);

                    Intent miIntension = new Intent(getApplication(),ResultadoActivity.class); //esta la intension de ir a la otra actividad
                    startActivity(miIntension); //haga la intension

                }
            }
        });
    }
}
