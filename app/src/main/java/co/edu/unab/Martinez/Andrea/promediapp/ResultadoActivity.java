package co.edu.unab.Martinez.Andrea.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView txtresultado;
    private TextView txttitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Bundle data = getIntent().getExtras();

        double resultado = data.getDouble("resultado");
        String titulo = data.getString("titulo");

        txtresultado = findViewById(R.id.txt_resultado);
        txttitulo = findViewById(R.id.txt_titulo);

        txtresultado.setText(String.valueOf(resultado));
        txttitulo.setText(titulo);

    }
}
