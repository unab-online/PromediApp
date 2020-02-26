package co.edu.unab.Martinez.Andrea.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView txtresultado;
    private TextView txttitulo;
    private TextView txttituloPC;
    private TextView txttituloSC;
    private TextView txtPC;
    private TextView txtSC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Bundle data = getIntent().getExtras();

        Definitiva resultado = (Definitiva) data.getSerializable("resultado");
        String titulo = data.getString("titulo");
        String tituloPC = data.getString("tituloPC");
        String tituloSC = data.getString("tituloSC");

        txtresultado = findViewById(R.id.txt_resultado);
        txttitulo = findViewById(R.id.txt_titulo);
        txttituloPC = findViewById(R.id.txt_tituloPC);
        txttituloSC = findViewById(R.id.txt_tituloSC);
        txtPC = findViewById(R.id.txt_resultPC);
        txtSC = findViewById(R.id.txt_resultSC);


        txtresultado.setText(String.valueOf(resultado.getDefinitiva()));
        txttitulo.setText(titulo);
        txttituloPC.setText(tituloPC);
        txttituloSC.setText(tituloSC);
        txtPC.setText(String.valueOf(resultado.getPrimerCorte()));
        txtSC.setText(String.valueOf(resultado.getSegundoCorte()));

    }
}
