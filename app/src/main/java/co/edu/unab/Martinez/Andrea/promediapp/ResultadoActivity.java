package co.edu.unab.Martinez.Andrea.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView txvTitulo;
    private TextView txvPrimerCorte;
    private TextView txvSegundoCorte;
    private TextView txvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle misDatos = getIntent().getExtras();
        Definitiva miDefinitiva = (Definitiva) misDatos.getSerializable("objeto");
        String titulo = misDatos.getString("titulo", "");

        setContentView(R.layout.activity_resultado);

        txvTitulo = findViewById(R.id.txv_titulo);
        txvPrimerCorte = findViewById(R.id.txv_primer_corte);
        txvSegundoCorte = findViewById(R.id.txv_segundo_corte);
        txvResultado = findViewById(R.id.txv_resultado);

        txvTitulo.setText(titulo);
        txvPrimerCorte.setText("Primer Corte: "+miDefinitiva.getPrimerCorte());
        txvSegundoCorte.setText("Segundo Corte: "+miDefinitiva.getSegundoCorte());

        txvResultado.setText(""+miDefinitiva.getDefinitiva());



    }
}
