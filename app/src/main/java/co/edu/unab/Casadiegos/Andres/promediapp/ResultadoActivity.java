package co.edu.unab.Casadiegos.Andres.promediapp;

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

        Definitiva miDefinitiva = (Definitiva) data.getSerializable("objeto");
        String titulo = data.getString("titulo");

        txtresultado = findViewById(R.id.txt_resultado);
        txttitulo = findViewById(R.id.txt_titulo);

        txtresultado.setText(String.valueOf(titulo));
        txttitulo.setText("" + miDefinitiva.getDefinitiva());

    }
}
