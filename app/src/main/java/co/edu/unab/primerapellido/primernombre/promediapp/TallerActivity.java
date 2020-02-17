package co.edu.unab.primerapellido.primernombre.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TallerActivity extends AppCompatActivity {

    private EditText editTextAsistencia1;
    private EditText editTextTrabajoClase1;
    private EditText editTextTrabajosTalleres;
    private EditText editTextParcial;

    private EditText editTextAsistencia2;
    private EditText editTextTrabajoClase2;

    private EditText editTextPrimerEntregable;
    private EditText editTextSegundoEntregable;
    private EditText editTextSustentacion;
    private EditText editTextAplicacion;

    private Button buttonCalcular;

    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAsistencia1 = findViewById(R.id.editTextAsistencia1);
        editTextTrabajoClase1 = findViewById(R.id.editTextTrabajoClase1);
        editTextTrabajosTalleres = findViewById(R.id.editTextTrabajosTalleres);
        editTextParcial = findViewById(R.id.editTextParcial);

        editTextAsistencia2 = findViewById(R.id.editTextAsistencia2);
        editTextTrabajoClase2 = findViewById(R.id.editTextTrabajoClase2);

        editTextPrimerEntregable = findViewById(R.id.editTextPrimerEntregable);
        editTextSegundoEntregable = findViewById(R.id.editTextSegundoEntregable);
        editTextSustentacion = findViewById(R.id.editTextSustentacion);
        editTextAplicacion = findViewById(R.id.editTextAplicacion);

        setTitle(R.string.titulo);

    }
}
