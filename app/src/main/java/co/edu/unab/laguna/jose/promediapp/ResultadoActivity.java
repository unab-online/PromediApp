package co.edu.unab.laguna.jose.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

        private TextView Resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Resultado = findViewById(R.id.txtResultado);
    }
}
