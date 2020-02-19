package co.edu.unab.saavedra.juan.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtResultado = findViewById(R.id.txt_resultado);
    }
}
