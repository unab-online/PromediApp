package co.edu.unab.patino.omar.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TallerActivity extends AppCompatActivity {

    private EditText t1edit_1;
    private EditText t1edit_2;
    private EditText t1edit_3;
    private EditText t1edit_4;

    private EditText t2edit_1;
    private EditText t2edit_2;

    private EditText t3edit_1;
    private EditText t3edit_2;
    private EditText t3edit_3;
    private EditText t3edit_4;

    private Button btncalcular;
    private TextView Resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller);

        t1edit_1 = findViewById(R.id.t1_edit_1);
        t1edit_2 = findViewById(R.id.t1_edit_2);
        t1edit_3 = findViewById(R.id.t1_edit_3);
        t1edit_4 = findViewById(R.id.t1_edit_4);

        t2edit_1 = findViewById(R.id.t2_edit_1);
        t2edit_2 = findViewById(R.id.t2_edit_2);

        t3edit_1 = findViewById(R.id.t3_edit_1);
        t3edit_2 = findViewById(R.id.t3_edit_2);
        t3edit_3 = findViewById(R.id.t3_edit_3);
        t3edit_4 = findViewById(R.id.t3_edit_4);

        btncalcular = findViewById(R.id.btn_calcular);
        //Resultado = findViewById(R.id.txt_Resultado);

        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//PRIMER CORTE
                double t1edit1, t1edit2, t1edit3, t1edit4, t2edit1, t2edit2, t3edit1, t3edit2, t3edit3, t3edit4, resultado, resultadot;
                String lectura;

                lectura = t1edit_1.getText().toString();
                t1edit1 = Double.valueOf(lectura);
                lectura = t1edit_2.getText().toString();
                t1edit2 = Double.valueOf(lectura);
                lectura = t1edit_3.getText().toString();
                t1edit3 = Double.valueOf(lectura);
                lectura = t1edit_4.getText().toString();
                t1edit4 = Double.valueOf(lectura);
                lectura = t2edit_1.getText().toString();
                t2edit1 = Double.valueOf(lectura);
                lectura = t2edit_2.getText().toString();
                t2edit2 = Double.valueOf(lectura);
                lectura = t3edit_1.getText().toString();
                t3edit1 = Double.valueOf(lectura);
                lectura = t3edit_2.getText().toString();
                t3edit2 = Double.valueOf(lectura);
                lectura = t3edit_3.getText().toString();
                t3edit3 = Double.valueOf(lectura);
                lectura = t3edit_4.getText().toString();
                t3edit4 = Double.valueOf(lectura);

           //     resultado = ( ( ( (t1edit1 * 0.1) + (t1edit2 * 0.3) + (t1edit3 * 0.3) + (t1edit4 * 0.3) ) * 0.5 ) + ( ( ( (  (t2edit1 * 0.1) + (t2edit2 * 0.3) ) + ( ( (t3edit1 * 0.15) + (t3edit2 * 0.15) + (t3edit3 * 0.15) + (t3edit4 * 0.15) )  * 0.6) ) ) * 0.5 )  ) ;

                resultado = ( ( (t1edit1 * 0.1) + (t1edit2 * 0.3) + (t1edit3 * 0.3) + (t1edit4 * 0.3) ) * 0.5 );
                resultadot = resultado + ( ( ( (t2edit1 * 0.1) + (t2edit2 * 0.3) ) + ( (t3edit1 * 0.15) + (t3edit2 * 0.15) + (t3edit3 * 0.15) + (t3edit4 * 0.15) ) ) * 0.5 );

                Resultado.setText("Resultado: " + resultadot);
                Toast.makeText(getBaseContext(), "Cargando...", Toast.LENGTH_LONG).show();

                Intent miIntencion = new Intent(getApplication(), ResultadoActivity.class);
                miIntencion.putExtra("res", resultadot);
                miIntencion.putExtra("titulo", "resultado final");

                startActivity(miIntencion);
                //

                //
                Definitiva miDefinitiva = new Definitiva();
                miDefinitiva.setAsistencia1(Double.valueOf(t1edit_1.getText().toString()));
                miDefinitiva.setTrabajosytalleres1(Double.valueOf(t1edit_3.getText().toString()));
                miDefinitiva.setTrabajos1(Double.valueOf(t1edit_2.getText().toString()));
                miDefinitiva.setParcial(Double.valueOf(t1edit_4.getText().toString()));

                miDefinitiva.setAsistencia2(Double.valueOf(t2edit_1.getText().toString()));
                miDefinitiva.setTrabajos2(Double.valueOf(t1edit_2.getText().toString()));

                miDefinitiva.setEntregable1(Double.valueOf(t3edit_1.getText().toString()));
                miDefinitiva.setSustentacion(Double.valueOf(t3edit_2.getText().toString()));
                miDefinitiva.setEntregable2(Double.valueOf(t3edit_3.getText().toString()));
                miDefinitiva.setAplicacion(Double.valueOf(t3edit_4.getText().toString()));


            }
        });

    }

}