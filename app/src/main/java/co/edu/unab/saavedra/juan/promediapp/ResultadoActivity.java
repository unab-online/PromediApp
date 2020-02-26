package co.edu.unab.saavedra.juan.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultadoActivity extends AppCompatActivity {

    private TextView txtResultado;
    private TextView txtTitulo;
    private TextView txtPrimerCorte;
    private TextView txtSegundoCorte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle misDatos = getIntent().getExtras();
        Definitiva miDefinitiva = (Definitiva) misDatos.getSerializable("resultado");
        String titulo = misDatos.getString("titulo", "");

        setContentView(R.layout.activity_resultado);

        txtResultado = findViewById(R.id.txt_resultado);
        txtTitulo = findViewById(R.id.txt_titulo);
        txtPrimerCorte = findViewById(R.id.txt_primercorte);
        txtSegundoCorte = findViewById(R.id.txt_segundocorte);

        txtTitulo.setText(titulo);
        txtResultado.setText(""+miDefinitiva.getDefinitiva());
        txtPrimerCorte.setText(""+miDefinitiva.getPrimerCorte());
        txtSegundoCorte.setText(""+miDefinitiva.getSegundoCorte());
    }
}
