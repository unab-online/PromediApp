package co.edu.unab.leal.jakson.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //primer corte ↓↓↓↓↓↓↓
    private EditText editTextAsistPC;
    private EditText editTextTrabClasePC;
    private EditText editTextTrabTall;
    private EditText editTextParcial;

    //segundo corte ↓↓↓↓↓↓↓
    private EditText editTextAsistSC;
    private EditText editTextTrabClaseSC;

    //proyecto de curso ↓↓↓↓↓↓↓
    private EditText editTextPrimEntreg;
    private EditText editTextSegEntreg;
    private EditText editTextSustentacion;
    private EditText editTextAplicacion;

    private Button btnCalcular;
    private TextView textViewResultado;

    CalcularDefinitiva definitivaObj = new CalcularDefinitiva();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getBaseContext(), "hola, ¿Como estas?", Toast.LENGTH_LONG).show();

        //primer corte ↓↓↓↓↓↓↓
        editTextAsistPC = findViewById(R.id.editText_asistencia_pc);
        editTextTrabClasePC = findViewById(R.id.editText_trabajo_pc);
        editTextTrabTall = findViewById(R.id.editText_talleres);
        editTextParcial = findViewById(R.id.editText_parcial);

        //segundo corte ↓↓↓↓↓↓↓
        editTextAsistSC = findViewById(R.id.editText_asistencia_sc);
        editTextTrabClaseSC = findViewById(R.id.editText_trabajo_sc);

        //proyecto de curso ↓↓↓↓↓↓↓
        editTextPrimEntreg = findViewById(R.id.editText_primer_entrega);
        editTextSegEntreg = findViewById(R.id.editText_segunda_entrega);
        editTextSustentacion = findViewById(R.id.editText_sustentacion);
        editTextAplicacion = findViewById(R.id.editText_aplicacion);

        btnCalcular = findViewById(R.id.btn_calcular);
        textViewResultado = findViewById(R.id.textView_resultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "vamos a calcular", Toast.LENGTH_LONG).show();

                double resultado;

                if (!editTextSegEntreg.getText().toString().equals("") &&
                        !editTextSustentacion.getText().toString().equals("") &&
                        !editTextAplicacion.getText().toString().equals("") &&
                        !editTextPrimEntreg.getText().toString().equals("") &&
                        !editTextTrabClaseSC.getText().toString().equals("") &&
                        !editTextAsistSC.getText().toString().equals("") &&
                        !editTextParcial.getText().toString().equals("") &&
                        !editTextAsistPC.getText().toString().equals("") &&
                        !editTextTrabClasePC.getText().toString().equals("") &&
                        !editTextTrabTall.getText().toString().equals("")

                ) {
                    //primer corte ↓↓↓↓↓↓↓
                    definitivaObj.setAsistenciaPC(Double.valueOf(editTextAsistPC.getText().toString()));
                    definitivaObj.setTrabajoClasePC(Double.valueOf(editTextTrabClasePC.getText().toString()));
                    definitivaObj.setTrabajosTalleres(Double.valueOf(editTextTrabTall.getText().toString()));
                    definitivaObj.setParcial(Double.valueOf(editTextParcial.getText().toString()));

                    //segundo corte ↓↓↓↓↓↓↓
                    definitivaObj.setAsistenciaSC(Double.valueOf(editTextAsistSC.getText().toString()));
                    definitivaObj.setTrabajoClaseSC(Double.valueOf(editTextTrabClaseSC.getText().toString()));
                    //proyecto de curso ↓↓↓↓↓↓↓
                    definitivaObj.setPrimerEntrega(Double.valueOf(editTextPrimEntreg.getText().toString()));
                    definitivaObj.setSegundaEntrega(Double.valueOf(editTextSegEntreg.getText().toString()));
                    definitivaObj.setSustentacion((Double.valueOf(editTextSustentacion.getText().toString())));
                    definitivaObj.setApp(Double.valueOf(editTextAplicacion.getText().toString()));

                    resultado = definitivaObj.primerCorte() + definitivaObj.segundoCorte();

                    Intent miIntencion = new Intent(getApplication(), ResultadoActivity.class);
                    miIntencion.putExtra("data", resultado);
                    miIntencion.putExtra("titulo", "resultado final");
                    startActivity(miIntencion);

                } else {

                    Toast.makeText(getBaseContext(), "Upss, llena todos los campos!", Toast.LENGTH_LONG).show();

                }

            }
        });

    }

    @Override
    public void onClick(View v) {

    }

}
