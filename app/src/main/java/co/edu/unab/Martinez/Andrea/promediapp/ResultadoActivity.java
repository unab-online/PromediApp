package co.edu.unab.Martinez.Andrea.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView txvTitulo;
    private TextView txvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle misDatos = getIntent().getExtras();
        double resultado = misDatos.getDouble("res", 0.0);
        String titulo = misDatos.getString("titulo", "");

        setContentView(R.layout.activity_resultado);

        txvTitulo = findViewById(R.id.txv_titulo);
        txvResultado = findViewById(R.id.txv_resultado);

        txvTitulo.setText(titulo);
        txvResultado.setText(""+resultado);



    }
}
