package co.edu.unab.vasquez.nodier.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView txResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle misDatos = getIntent().getExtras();
        //double resultado = misDatos.getDouble("resul",0.0);

        Definitiva miDefinitiva = (Definitiva) misDatos.getSerializable("objeto");
        setContentView(R.layout.activity_resultado);

        txResultado = findViewById(R.id.tx_result);
        //txResultado.setText("El resultado es: "+resultado);
        txResultado.setText(""+miDefinitiva.getDefinitiva());

    }
}
