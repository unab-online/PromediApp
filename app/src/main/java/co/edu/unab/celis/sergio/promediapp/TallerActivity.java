package co.edu.unab.celis.sergio.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TallerActivity extends AppCompatActivity {

    private EditText edtAsistencia1;
    private EditText edtClase1;
    private EditText edtTalleres;
    private EditText edtParcial;
    private EditText edtAsistencia2;
    private EditText edtClase2;
    private EditText edtEntrgable1;
    private EditText edtEntregable2;
    private EditText edtSustentación;
    private EditText edtAplicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller);

        edtAsistencia1 = findViewById(R.id.edt_asistencia1);
        edtClase1 = findViewById(R.id.edtClase1);
        edtTalleres = findViewById(R.id.edtTalleres);
        edtParcial = findViewById(R.id.edtParcial);
        edtAsistencia2 = findViewById(R.id.edtAsistencia2);
        edtClase2 = findViewById(R.id.edtClase2);
        edtEntrgable1 = findViewById(R.id.edtEntregable1);
        edtEntregable2 = findViewById(R.id.edtEntregable2);
        edtAplicacion = findViewById(R.id.edtAplicacion);
        edtSustentación = findViewById(R.id.edtSustentacion);

    }

    public void calcular(View elemento){

        try {

            Definitiva notaDefinitiva = new Definitiva();

            notaDefinitiva.setAsistencia1(Double.valueOf(edtAsistencia1.getText().toString()));
            notaDefinitiva.setTalleres(Double.valueOf(edtTalleres.getText().toString()));
            notaDefinitiva.setClase1(Double.valueOf(edtClase1.getText().toString()));
            notaDefinitiva.setParcial(Double.valueOf(edtParcial.getText().toString()));
            notaDefinitiva.setAsistencia2(Double.valueOf(edtAsistencia2.getText().toString()));
            notaDefinitiva.setClase2(Double.valueOf(edtClase2.getText().toString()));
            notaDefinitiva.setEntregable1(Double.valueOf(edtEntrgable1.getText().toString()));
            notaDefinitiva.setEntregable2(Double.valueOf(edtEntregable2.getText().toString()));
            notaDefinitiva.setSustentacion(Double.valueOf(edtSustentación.getText().toString()));
            notaDefinitiva.setAplicacion(Double.valueOf(edtAplicacion.getText().toString()));

            Intent mostrarResultado = new Intent(getApplication(), ResultadoActivity.class);
            mostrarResultado.putExtra("res", notaDefinitiva.getDefinitiva());
            mostrarResultado.putExtra("titulo", "Resultado Final");
            startActivity(mostrarResultado);

            Toast.makeText(this, "Calculando Promedio",Toast.LENGTH_LONG).show();

        }

        catch (Exception error){
            Toast.makeText(this, "Debe llenar todos los campos",Toast.LENGTH_LONG).show();
        }
    }
}
