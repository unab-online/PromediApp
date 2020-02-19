package co.edu.unab.vasquez.nodier.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TallerActivity extends AppCompatActivity {

private EditText txtAsistencia1, txtAsistencia2, txtParcial;
private EditText txtTrabajoClase1, txtTrabajoClase2, txtTalleres;
private EditText txtEntregable1, txtEntregable2, txtSustentacion;
private EditText txtAplicacion;
private Button btnCalcular;
private TextView txtresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller);

        // Primer Corte
        txtAsistencia1 = findViewById(R.id.edt_asistencia);
        txtTrabajoClase1 = findViewById(R.id.edt_trabajo);
        txtTalleres = findViewById(R.id.edt_talleres);
        txtParcial = findViewById(R.id.edt_parcial);
        //Segundo corte
        txtAsistencia2 = findViewById(R.id.edt_asistencia2);
        txtTrabajoClase2 = findViewById(R.id.edt_trabajo2);
        //Proyecto de clase
        txtEntregable1 = findViewById(R.id.edt_entregable1);
        txtEntregable2 = findViewById(R.id.edt_entregable2);
        txtSustentacion = findViewById(R.id.edt_sustentacion);
        txtAplicacion = findViewById(R.id.edt_app);

        btnCalcular = findViewById(R.id.btn_calc);

        txtresultado = findViewById(R.id.txt_resultado); //faltaba llamar este...

    }

    public void calcular (View vista) {
        Toast.makeText(getApplication(),R.string.calculando,Toast.LENGTH_SHORT).show();
        double asistencia1, trabClase1, talleres, parcial;
        double asistencia2, trabClase2;
        double entregable1, entregable2, sustentacion, aplicacion;
        double corte1, corte2, resultado;
        String leer;

        //Corte 1
        leer = txtAsistencia1.getText().toString();
        asistencia1 = Double.valueOf(leer);
        leer = txtTrabajoClase1.getText().toString();
        trabClase1 = Double.valueOf(leer);
        leer = txtTalleres.getText().toString();
        talleres = Double.valueOf(leer);
        leer = txtParcial.getText().toString();
        parcial = Double.valueOf(leer);

        //Corte 2
        leer = txtAsistencia2.getText().toString();
        asistencia2 = Double.valueOf(leer);
        leer = txtTrabajoClase2.getText().toString();
        trabClase2 = Double.valueOf(leer);

        //Proyecto
        leer = txtEntregable1.getText().toString();
        entregable1 = Double.valueOf(leer);
        leer = txtEntregable2.getText().toString();
        entregable2 = Double.valueOf(leer);
        leer = txtSustentacion.getText().toString();
        sustentacion = Double.valueOf(leer);
        leer = txtAplicacion.getText().toString();
        aplicacion = Double.valueOf(leer);

        if (asistencia1 >= 0 && trabClase1 >= 0 && talleres >= 0 && parcial >= 0 && asistencia2 >= 0 && trabClase2 >= 0 && entregable1 >=0 && entregable2 >= 0 && sustentacion >= 0 && aplicacion >= 0){
            corte1 = (((asistencia1*0.1)+(trabClase1*0.3)+(talleres*0.3)+(parcial*0.3))*0.5);
            corte2 = (((asistencia2*0.1)+(trabClase2*0.3)+(entregable1*0.15)+(entregable2*0.15)+(sustentacion*0.15)+(aplicacion*0.15))*0.5);
            resultado = corte1+corte2;
            //txtresultado.setText("El resultado es: "+ resultado);

            Intent miIntencion = new Intent(getApplication(), ResultadoActivity.class );
            startActivity(miIntencion);



        }else{
            Toast.makeText(getApplication(),"No se puede operar",Toast.LENGTH_SHORT).show();
        }


    }
}
