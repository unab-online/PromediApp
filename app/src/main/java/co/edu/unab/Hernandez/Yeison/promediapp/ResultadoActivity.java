package co.edu.unab.Hernandez.Yeison.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRAMESSAGE);
        textView= (TextView) findViewById(R.id.textResultado);
        textView.setText("Resultado es: "+message);

    }
}
