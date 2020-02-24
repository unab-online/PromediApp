package co.edu.unab.primerapellido.primernombre.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView textViewTitulo;
    private TextView textViewResultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle misDatos = getIntent().getExtras();
        Double resultado = misDatos.getDouble("resultado",0.0);
        String titulo = misDatos.getString("titulo","");

        setContentView(R.layout.activity_resultado);

        textViewTitulo = findViewById(R.id.textViewTitulo);
        textViewResultado2 = findViewById(R.id.textViewResultado2);

        textViewTitulo.setText(titulo);
        textViewResultado2.setText(""+resultado);


    }
}
