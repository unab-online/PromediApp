package co.edu.unab.leal.jakson.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView textViewResultadoS;
    private TextView textViewResulPc;
    private TextView textViewResulSc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle misDatos = getIntent().getExtras();
        CalcularDefinitiva objDef = (CalcularDefinitiva) misDatos.getSerializable("objeto");
        String tirulo = misDatos.getString("titulo","");

        setContentView(R.layout.activity_resultado);

        textViewResultadoS = findViewById(R.id.textView_resultadoS);
        textViewResulPc = findViewById(R.id.textView_resul_pc);
        textViewResulSc = findViewById(R.id.textView_resul_sc);

        textViewResultadoS.setText("" + (objDef.primerCorte()+objDef.segundoCorte()));
        textViewResulPc.setText("primer"+objDef.primerCorte());
        textViewResulSc.setText("segundo"+objDef.segundoCorte());

    }
}
