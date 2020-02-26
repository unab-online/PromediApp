package co.edu.unab.toloza.cesar.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView textResultado, textTitulo, textPrimerCorte, textSegundoCorte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        textResultado = findViewById(R.id.text_resultado_final);
        textTitulo = findViewById(R.id.text_titulo_final);
        textPrimerCorte = findViewById(R.id.textPrimerCorte);
        textSegundoCorte = findViewById(R.id.textSegundoCorte);

        Bundle misDatos = getIntent().getExtras();

        Definitiva resultado = (Definitiva) misDatos.getSerializable("objeto");
        String titulo = misDatos.getString("titulo");

        textTitulo.setText(titulo);
        textPrimerCorte.setText("Primer Corte: " + resultado.getPrimerCorte());
        textSegundoCorte.setText("Segundo Corte: " + resultado.getSegundoCorte());
        textResultado.setText("RESULTADO: " + resultado.getDefinitiva());
    }
}
