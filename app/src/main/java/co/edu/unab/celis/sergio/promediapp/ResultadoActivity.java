package co.edu.unab.celis.sergio.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView tvResultado;
    private TextView tvTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle intencion = getIntent().getExtras();
        double resultado = intencion.getDouble("res",0.0);
        String titulo = intencion.getString("titulo","");

        setContentView(R.layout.activity_resultado);

        tvResultado = findViewById(R.id.tvResultado);
        tvTitulo = findViewById(R.id.tvTitulo);

        tvResultado.setText(""+resultado);
        tvTitulo.setText(titulo);
    }
}
