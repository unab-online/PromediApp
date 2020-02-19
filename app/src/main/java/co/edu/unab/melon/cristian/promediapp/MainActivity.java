package co.edu.unab.melon.cristian.promediapp;

import androidx.appcompat.app.AppCompatActivity;

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
        double resultado, asisPC, TraClaPC, TraYTalPC, ParciPC, asisSC, TraClaSC, priPRC, segPRC, sustPRC, appPRC, cont;
        String lectura;

        cont =0;
// primer corte//
        lectura = edtPC_asis.getText().toString();
        if (lectura.isEmpty()){ cont++; }
        asisPC = Double.valueOf(lectura);

        lectura = edtPC_TrabaClase.getText().toString();
        if (lectura.isEmpty()){ cont++; }
        TraClaPC = Double.valueOf(lectura);

        lectura = edtPC_TraYtall.getText().toString();
        if (lectura.isEmpty()){ cont++; }
        TraYTalPC = Double.valueOf(lectura);

        lectura = edtPC_Parci.getText().toString();
        if (lectura.isEmpty()){ cont++; }
        ParciPC = Double.valueOf(lectura);




// segundo corte//
        lectura = edtSC_asis.getText().toString();
        if (lectura.isEmpty()){ cont++; }
        asisSC = Double.valueOf(lectura);

        lectura = edtSC_TrabaClas.getText().toString();
        if (lectura.isEmpty()){ cont++; }
        TraClaSC = Double.valueOf(lectura);

        // proyecto//

        lectura = edtPRC_pe.getText().toString();
        if (lectura.isEmpty()){ cont++; }
        priPRC = Double.valueOf(lectura);

        lectura = edtPRC_se.getText().toString();
        if (lectura.isEmpty()){ cont++; }
        segPRC = Double.valueOf(lectura);

        lectura = edtPRC_sust.getText().toString();
        if (lectura.isEmpty()){ cont++; }
        sustPRC = Double.valueOf(lectura);

        lectura = edtPRC_app.getText().toString();
        if (lectura.isEmpty()){ cont++; }
        appPRC = Double.valueOf(lectura);


        if (cont >= 1  ) {

            Toast.makeText(getBaseContext(), "Llene todos los espacios bobo", Toast.LENGTH_LONG).show();
        } else {


            resultado = (((asisPC * 0.1) + (TraClaPC * 0.3) + (TraYTalPC * 0.3) + (ParciPC * 0.3)) + ((asisSC * 0.1) + (TraClaSC * 0.3) + (priPRC * 0.15) + (segPRC * 0.15) + (sustPRC * 0.15) + (appPRC * 0.15))) / 2;
            Toast.makeText(this, "calculando...", Toast.LENGTH_SHORT).show();
            Resultadomostrar.setText("RESULTADO : " + resultado + "");
        }

    }
}
