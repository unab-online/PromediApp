package co.edu.unab.saavedra.juan.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView txtResultado;
    private TextView txtTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle misDatos = getIntent().getExtras();
        double resultado = misDatos.getDouble("resultado", 0.0);
        String titulo = misDatos.getString("titulo", "");

        setContentView(R.layout.activity_resultado);

        txtResultado = findViewById(R.id.txt_resultado);
        txtTitulo = findViewById(R.id.txt_titulo);

        txtTitulo.setText(titulo);
        txtResultado.setText(Double.toString(resultado));
    }
}
