package co.edu.unab.melon.cristian.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtPC_asis;
    private EditText edtPC_TrabaClase;
    private EditText edtPC_TraYtall;
    private EditText edtPC_Parci;
    private EditText edtSC_asis;
    private EditText edtSC_TrabaClas;
    private EditText edtPRC_pe;
    private EditText edtPRC_se;
    private EditText edtPRC_sust;
    private EditText edtPRC_app;

    private Button btnCalcular;

    private TextView Resultadomostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtPC_asis = findViewById(R.id.edtPC_asis);
        edtPC_TrabaClase = findViewById(R.id.edtPC_TrabaClase);
        edtPC_TraYtall = findViewById(R.id.edtPC_TraYtall);
        edtPC_Parci = findViewById(R.id.edtPC_Parci);
        edtSC_asis = findViewById(R.id.edtSC_asis);
        edtSC_TrabaClas = findViewById(R.id.edtSC_TrabaClas);
        edtPRC_pe = findViewById(R.id.edtPRC_pe);
        edtPRC_se = findViewById(R.id.edtPRC_se);
        edtPRC_sust = findViewById(R.id.edtPRC_sust);
        edtPRC_app = findViewById(R.id.edtPRC_app);

        btnCalcular = findViewById(R.id.btnCalcular);

        Resultadomostrar = findViewById(R.id.resultadoTxtVw);


        btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        double resultado, asisPC, TraClaPC, TraYTalPC, ParciPC, asisSC, TraClaSC, priPRC, segPRC, sustPRC, appPRC;
        String lectura;

        if (edtPC_asis.getText().toString().isEmpty() || edtPC_TrabaClase.getText().toString().isEmpty() || edtPC_TraYtall.getText().toString().isEmpty() || edtPC_Parci.getText().toString().isEmpty() || edtSC_asis.getText().toString().isEmpty() || edtSC_TrabaClas.getText().toString().isEmpty() || edtPRC_pe.getText().toString().isEmpty() || edtPRC_se.getText().toString().isEmpty() || edtPRC_sust.getText().toString().isEmpty() || edtPRC_app.getText().toString().isEmpty()) {

            Toast.makeText(getBaseContext(), "Llene todos los espacios bobo", Toast.LENGTH_LONG).show();

        } else {


// primer corte//
            lectura = edtPC_asis.getText().toString();
            asisPC = Double.valueOf(lectura);

            lectura = edtPC_TrabaClase.getText().toString();
            TraClaPC = Double.valueOf(lectura);

            lectura = edtPC_TraYtall.getText().toString();
            TraYTalPC = Double.valueOf(lectura);

            lectura = edtPC_Parci.getText().toString();
            ParciPC = Double.valueOf(lectura);


// segundo corte//
            lectura = edtSC_asis.getText().toString();
            asisSC = Double.valueOf(lectura);

            lectura = edtSC_TrabaClas.getText().toString();
            TraClaSC = Double.valueOf(lectura);

            // proyecto//

            lectura = edtPRC_pe.getText().toString();
            priPRC = Double.valueOf(lectura);

            lectura = edtPRC_se.getText().toString();
            segPRC = Double.valueOf(lectura);

            lectura = edtPRC_sust.getText().toString();
            sustPRC = Double.valueOf(lectura);

            lectura = edtPRC_app.getText().toString();
            appPRC = Double.valueOf(lectura);

            Definitiva midefinitiva = new Definitiva();
            midefinitiva.setAsitencia1(asisPC);
            midefinitiva.setTalleres1(TraYTalPC);
            midefinitiva.setTrabajos1(TraClaPC);
            midefinitiva.setParcial1(ParciPC);

            midefinitiva.setAsistencia2(asisSC);
            midefinitiva.setTrabajos2(TraClaSC);
            midefinitiva.setEntregable1(priPRC);
            midefinitiva.setEntregable1(segPRC);
            midefinitiva.setEntregable1(sustPRC);
            midefinitiva.setEntregable1(appPRC);




            Toast.makeText(this, "calculando...", Toast.LENGTH_SHORT).show();



            // pasar a otra actividad //
            Intent intent = new Intent(getApplication() , ResultadoActivity.class);

            intent.putExtra("res", midefinitiva.getDefinitiva());
            intent.putExtra("titulo", "Resultado final");


            startActivity(intent);
        }
    }

    }

