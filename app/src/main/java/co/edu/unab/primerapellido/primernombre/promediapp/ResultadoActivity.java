package co.edu.unab.primerapellido.primernombre.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView textViewTitulo;
    private TextView textViewResultado2;
    private TextView textViewPrimerCorte;
    private TextView textViewSegundoCorte;
    private TextView textViewPrimerResulatdo;
    private TextView textViewSegundoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle misDatos = getIntent().getExtras();
        Definitiva miDefinitiva = (Definitiva)misDatos.getSerializable("objeto");//linea para mandar todoo el objeto
        String titulo = misDatos.getString("titulo","");

        setContentView(R.layout.activity_resultado);

        textViewTitulo = findViewById(R.id.textViewTitulo);
        textViewResultado2 = findViewById(R.id.textViewResultado2);
        textViewPrimerResulatdo = findViewById(R.id.textViewPrimerResultado);
        textViewSegundoResultado = findViewById(R.id.textViewSegundoResultado);

        textViewTitulo.setText(titulo);
        textViewResultado2.setText(""+miDefinitiva.getDefinitiva());
        textViewPrimerResulatdo.setText(""+miDefinitiva.getPrimerCorte());
        textViewSegundoResultado.setText(""+miDefinitiva.getSegundoCorte());


    }
}
