package co.edu.unab.saavedra.juan.promediapp;

import androidx.appcompat.app.AppCompatActivity;

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
    private TextView txtResultado;

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
        txtResultado = findViewById(R.id.txt_resultado);
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
            txtResultado.setText("");
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
                txtResultado.setText("");

            } else {
                double corte1 = 0;
                double corte2 = 0;
                corte1 += notaAsistencia1 * 0.1;
                corte1 += notaTrabajosClase1 * 0.3;
                corte1 += notaTrabajosTalleres * 0.3;
                corte1 += notaParcial * 0.3;

                corte2 += notaAsistencia2 * 0.1;
                corte2 += notaTrabajosClase2 * 0.3;
                corte2 += notaEntregable1 * 0.15;
                corte2 += notaEntregable2 * 0.15;
                corte2 += notaSustentacion * 0.15;
                corte2 += notaAplicacion * 0.15;

                txtResultado.setText(Double.toString((corte1 + corte2) / 2.0));
            }
        }

    }

}

