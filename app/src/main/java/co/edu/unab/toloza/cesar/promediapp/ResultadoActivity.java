package co.edu.unab.toloza.cesar.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView textResultado, textTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        textResultado = findViewById(R.id.text_resultado_final);
        textTitulo = findViewById(R.id.text_titulo_final);

        Bundle misDatos = getIntent().getExtras();

        double resultado = misDatos.getDouble("res");
        String titulo = misDatos.getString("titulo");


        textTitulo.setText(titulo);
        textResultado.setText("RESULTADO: " + resultado);
    }
}
