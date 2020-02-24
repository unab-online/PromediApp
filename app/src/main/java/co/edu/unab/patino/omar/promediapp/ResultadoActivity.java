package co.edu.unab.patino.omar.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class ResultadoActivity extends AppCompatActivity {


    private TextView txtTitulo;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle misDatos = getIntent().getExtras();
        double resultado = misDatos.getDouble("res", 0.0);
        String titulo = misDatos.getString("titulo", "");

        setContentView(R.layout.activity_resultado);

        txtTitulo = findViewById(R.id.txt_titulo);
        txtResultado = findViewById(R.id.txt_resultado);

        txtTitulo.setText(titulo);
        txtResultado.setText(""+resultado);

        Log.d("ESTADO", "Creando actividad...");
        Toast.makeText(getBaseContext(), "Método OnCreate", Toast.LENGTH_LONG).show();
    }


}
