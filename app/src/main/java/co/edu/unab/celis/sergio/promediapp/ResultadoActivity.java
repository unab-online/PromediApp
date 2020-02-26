package co.edu.unab.celis.sergio.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView tvResultado;
    private TextView tvTitulo;
    private TextView tvPrimerCorte;
    private  TextView tvSegundoCorte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle intencion = getIntent().getExtras();
        Definitiva resultado = (Definitiva) intencion.getSerializable("res");
        String titulo = intencion.getString("titulo","");

        setContentView(R.layout.activity_resultado);

        tvResultado = findViewById(R.id.tvResultado);
        tvTitulo = findViewById(R.id.tvTitulo);
        tvPrimerCorte = findViewById(R.id.tvPrimerCorte);
        tvSegundoCorte = findViewById(R.id.tvSegundoCorte);

        tvResultado.setText(""+resultado.getDefinitiva());
        tvPrimerCorte.setText("Primer Corte: " + resultado.getPrimerCorte());
        tvSegundoCorte.setText("Segundo Corte: " + resultado.getSegundoCorte());
        tvTitulo.setText(titulo);
    }
}
