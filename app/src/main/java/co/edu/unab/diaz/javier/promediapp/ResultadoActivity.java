package co.edu.unab.diaz.javier.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView textResultado, textTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        textResultado = findViewById(R.id.resutado);

        Bundle datos = getIntent().getExtras();

        double resultado = datos.getDouble("res");

        textResultado.setText("RESULTADO: " + resultado);
    }
}
