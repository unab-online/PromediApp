package co.edu.unab.parra.cristian.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle misDatos= getIntent().getExtras();
        Double resultado=  misDatos.getDouble("res", 0.0);
        String titulo= misDatos.getString("titulo", "");
        setContentView(R.layout.activity_resultado);
         tv1= findViewById(R.id.txv_resultado);
         tv1.setText(titulo+String.valueOf(resultado));
    }
}
