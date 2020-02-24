package co.edu.unab.melon.cristian.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView resultados, titulos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle misdatos = getIntent().getExtras();
        double resultado = misdatos.getDouble("res", 0.0);
        String titulo = misdatos.getString("titulo","");

        setContentView(R.layout.activity_resultado);

        resultados = findViewById(R.id.txtResultado);
        titulos = findViewById(R.id.titTXV);

        titulos.setText(""+titulo+"");
        resultados.setText(""+resultado+"");
    }

}
