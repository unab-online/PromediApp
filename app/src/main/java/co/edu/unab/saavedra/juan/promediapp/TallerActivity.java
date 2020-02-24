package co.edu.unab.saavedra.juan.promediapp;

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

    private EditText edtAsis1;
    private EditText edtAsis2;
    private EditText edtTrac1;
    private EditText edtTrac2;
    private EditText edtTrayt1;
    private EditText edtPar1;
    private EditText edtPrie;
    private EditText edtSege;
    private EditText edtSus;
    private EditText edtApp;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller);

        edtAsis1 = findViewById(R.id.edt_asis1);
        edtAsis2 = findViewById(R.id.edt_asis2);
        edtTrac1 = findViewById(R.id.edt_trac1);
        edtTrac2 = findViewById(R.id.edt_trac2);
        edtTrayt1 = findViewById(R.id.edt_trayt1);
        edtPar1 = findViewById(R.id.edt_par1);
        edtPrie = findViewById(R.id.edt_prie);
        edtSege = findViewById(R.id.edt_sege);
        edtSus = findViewById(R.id.edt_sus);
        edtApp = findViewById(R.id.edt_app);
        btnCalcular = findViewById(R.id.btn_calcular);
        setTitle("Primer Taller - Juan Saavedra");

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void calcular(View vista) {
        if (edtAsis1.getText().toString().isEmpty() || edtTrac1.getText().toString().isEmpty() || edtTrayt1.getText().toString().isEmpty() || edtPar1.getText().toString().isEmpty() || edtAsis2.getText().toString().isEmpty() ||
                edtTrac2.getText().toString().isEmpty() || edtPrie.getText().toString().isEmpty() || edtSege.getText().toString().isEmpty() || edtSus.getText().toString().isEmpty() || edtApp.getText().toString().isEmpty()) {
            Toast.makeText(this, "Valores incorrectos, asegurese de llenar todos los campos", Toast.LENGTH_LONG).show();
        } else {
            double notaAsistencia1 = Double.parseDouble(edtAsis1.getText().toString());
            double notaTrabajosClase1 = Double.parseDouble(edtTrac1.getText().toString());
            double notaTrabajosTalleres = Double.parseDouble(edtTrayt1.getText().toString());
            double notaParcial = Double.parseDouble(edtPar1.getText().toString());
            double notaAsistencia2 = Double.parseDouble(edtAsis2.getText().toString());
            double notaTrabajosClase2 = Double.parseDouble(edtTrac2.getText().toString());
            double notaEntregable1 = Double.parseDouble(edtPrie.getText().toString());
            double notaEntregable2 = Double.parseDouble(edtSege.getText().toString());
            double notaSustentacion = Double.parseDouble(edtSus.getText().toString());
            double notaAplicacion = Double.parseDouble(edtApp.getText().toString());

            if (notaAsistencia1 > 5.0 || notaAsistencia1 < 0.0 ||
                    notaTrabajosClase1 > 5.0 || notaTrabajosClase1 < 0.0 ||
                    notaTrabajosTalleres > 5.0 || notaTrabajosTalleres < 0.0 ||
                    notaParcial > 5.0 || notaParcial < 0.0 ||
                    notaAsistencia2 > 5.0 || notaAsistencia2 < 0.0 ||
                    notaTrabajosClase2 > 5.0 || notaTrabajosClase2 < 0.0 ||
                    notaEntregable1 > 5.0 || notaEntregable2 < 0.0 ||
                    notaEntregable2 > 5.0 || notaEntregable2 < 0.0 ||
                    notaSustentacion > 5.0 || notaSustentacion < 0.0 ||
                    notaAplicacion > 5.0 || notaAplicacion < 0.0) {

                Toast.makeText(this, "Valores incorrectos, los valores deben estar entre 0.0 y 5.0", Toast.LENGTH_LONG).show();

            } else {
                Definitiva miDefinitiva = new Definitiva();

                miDefinitiva.setAsistencia1(notaAsistencia1);
                miDefinitiva.setTrabajos1(notaTrabajosClase1);
                miDefinitiva.setTalleres(notaTrabajosTalleres);
                miDefinitiva.setParcial(notaParcial);

                miDefinitiva.setAsistencia2(notaAsistencia2);
                miDefinitiva.setTrabajos2(notaTrabajosClase2);
                miDefinitiva.setEntregable1(notaEntregable1);
                miDefinitiva.setEntregable2(notaEntregable2);
                miDefinitiva.setSustentacion(notaSustentacion);
                miDefinitiva.setAplicacion(notaAplicacion);


                Intent miIntencion = new Intent(getApplication(), ResultadoActivity.class);

                miIntencion.putExtra("resultado", miDefinitiva.getDefinitiva());
                miIntencion.putExtra("titulo", "Nota final");

                startActivity(miIntencion);


            }
        }

    }

}

