package co.edu.unab.leal.jakson.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView textViewResultadoS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle misDatos = getIntent().getExtras();
        double resultado = misDatos.getDouble("data", 0.0);
        String tirulo = misDatos.getString("titulo","");

        setContentView(R.layout.activity_resultado);

        textViewResultadoS = findViewById(R.id.textView_resultadoS);
        textViewResultadoS.setText("" + resultado);

    }
}
