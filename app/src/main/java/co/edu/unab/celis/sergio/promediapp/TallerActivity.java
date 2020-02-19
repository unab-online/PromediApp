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
        double primerCorte,segundoCorte;
        double resultado, asistencia1, clase1,talleres,parcial,asistencia2,clase2,entregable1,entregable2,sustentacion,aplicacion;
        String lectura;

        try {

            lectura = edtAsistencia1.getText().toString();
            asistencia1 = Double.valueOf(lectura);
            lectura = edtClase1.getText().toString();
            clase1 = Double.valueOf(lectura);
            lectura = edtTalleres.getText().toString();
            talleres = Double.valueOf(lectura);
            lectura = edtParcial.getText().toString();
            parcial = Double.valueOf(lectura);
            lectura = edtAsistencia2.getText().toString();
            asistencia2 = Double.valueOf(lectura);
            lectura = edtClase2.getText().toString();
            clase2 = Double.valueOf(lectura);
            lectura = edtEntrgable1.getText().toString();
            entregable1 = Double.valueOf(lectura);
            lectura = edtEntregable2.getText().toString();
            entregable2 = Double.valueOf(lectura);
            lectura = edtSustentación.getText().toString();
            sustentacion = Double.valueOf(lectura);
            lectura = edtAplicacion.getText().toString();
            aplicacion = Double.valueOf(lectura);

            primerCorte = ((asistencia1*0.1)+(clase1*0.3)+(talleres*0.3)+(parcial*0.3))*0.5;
            segundoCorte = ((asistencia2*0.1)+(clase2*0.3)+(entregable1*0.15)+(entregable2*0.15)+(sustentacion*0.15)+(aplicacion*0.15))*0.5;

            resultado = primerCorte + segundoCorte;

            Intent mostrarResultado = new Intent(getApplication(), ResultadoActivity.class);
            startActivity(mostrarResultado);

            Toast.makeText(this, "Calculando Promedio",Toast.LENGTH_LONG).show();
        }

        catch (Exception error){
            Toast.makeText(this, "Debe llenar todos los campos",Toast.LENGTH_LONG).show();
        }
    }
}
