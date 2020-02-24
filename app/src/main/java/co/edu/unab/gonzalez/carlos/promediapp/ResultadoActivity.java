package co.edu.unab.gonzalez.carlos.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {
    private Button btnvolver;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btnvolver = findViewById(R.id.btnvolver);

        Bundle misDatos = getIntent().getExtras();
        double resul = misDatos.getDouble("resultado",0.0);
        String titulo = misDatos.getString("titulo", "");
        setContentView(R.layout.activity_resultado);
        resultado = findViewById(R.id.txvres);
        resultado.setText(""+resul+"");


    }
    public void back(View elemento){
        Intent volver = new Intent(this, TallerActivity.class);
        startActivity(volver);
    }
}
