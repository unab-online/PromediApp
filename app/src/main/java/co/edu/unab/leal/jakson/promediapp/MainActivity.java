package co.edu.unab.leal.jakson.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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

                // Toast.makeText(getApplicationContext(), "vamos a calcular", Toast.LENGTH_LONG).show();

                double resultado = 0.0, primerCorte, segundoCorte, proyecto;

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

                    String lectura;

                    definitivaObj.setAsistenciaPC(Double.valueOf(editTextAsistPC.getText().toString()));
                    definitivaObj.setTrabajoClasePC(Double.valueOf(editTextTrabClasePC.getText().toString()));
                    definitivaObj.setTrabajosTalleres(Double.valueOf(editTextTrabTall.getText().toString()));
                    definitivaObj.setTrabajosTalleres(Double.valueOf(editTextParcial.getText().toString()));

                    
/*
                    //primer corte ↓↓↓↓↓↓↓
                    double asistenciaPc, trabajoPc, tallerPc, parcial;
                    lectura = editTextAsistPC.getText().toString();
                    asistenciaPc = Double.valueOf(lectura) * 0.1;
                    lectura = editTextTrabClasePC.getText().toString();
                    trabajoPc = Double.valueOf(lectura) * 0.3;
                    lectura = editTextTrabTall.getText().toString();
                    tallerPc = Double.valueOf(lectura) * 0.3;
                    lectura = editTextParcial.getText().toString();
                    parcial = Double.valueOf(lectura) * 0.3;

                    primerCorte = (asistenciaPc + trabajoPc + tallerPc + parcial) * 0.5;

                    //Log.d("msj", "primer corte:"+ primerCorte);

                    //segundo corte ↓↓↓↓↓↓↓
                    double asistenciaSc, trabajoSc;
                    lectura = editTextAsistSC.getText().toString();
                    asistenciaSc = Double.valueOf(lectura) * 0.1;
                    lectura = editTextTrabClaseSC.getText().toString();
                    trabajoSc = Double.valueOf(lectura) * 0.3;

                    segundoCorte = (asistenciaSc + trabajoSc);

                    //Log.d("msj", "segundo corte:"+ segundoCorte);

                    //proyecto de curso ↓↓↓↓↓↓↓
                    double pEntrega, sEntrega, sust, apli;
                    lectura = editTextPrimEntreg.getText().toString();
                    pEntrega = Double.valueOf(lectura) * 0.15;
                    lectura = editTextSegEntreg.getText().toString();
                    sEntrega = Double.valueOf(lectura) * 0.15;
                    lectura = editTextSustentacion.getText().toString();
                    sust = Double.valueOf(lectura) * 0.15;
                    lectura = editTextAplicacion.getText().toString();
                    apli = Double.valueOf(lectura) * 0.15;

                    proyecto = (pEntrega + sEntrega + sust + apli);

                    //Log.d("msj", "proyecto corte:"+ proyecto);

                    resultado = primerCorte + (segundoCorte + proyecto) * 0.5;

                    //textViewResultado.setText("" + resultado);
*/
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
