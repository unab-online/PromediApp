package co.edu.unab.gonzalez.carlos.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.EmptyStackException;

public class TallerActivity extends AppCompatActivity {
    private EditText asis1;
    private EditText trab1;
    private EditText tyt1;
    private EditText p1;
    private EditText asis2;
    private EditText trab2;
    private EditText pentre;
    private EditText sentre;
    private EditText sus;
    private EditText app;
    private Button btncalcular;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller);
        setTitle(R.string.app_name);

        asis1 = findViewById(R.id.asis1);
        trab1 = findViewById(R.id.trabclase1);
        tyt1 = findViewById(R.id.trabytall1);
        p1 = findViewById(R.id.parcial1);
        asis2 = findViewById(R.id.asis2);
        trab2 = findViewById(R.id.trabclase2);
        pentre = findViewById(R.id.entre1);
        sentre = findViewById(R.id.entre2);
        sus = findViewById(R.id.susten);
        app = findViewById(R.id.app);
        btncalcular = findViewById(R.id.btncalcular);
        resultado = findViewById(R.id.res);
        /*asis1.setText("");
        trab1.setText("");
        tyt1.setText("");
        p1.setText("");
        asis2.setText("");
        trab2.setText("");
        pentre.setText("");
        sentre.setText("");
        sus.setText("");
        app.setText("");*/
    }
    public void calcular(View elemento){
    double resultado1, resultado2, resultadof, num1c1, num2c1, num3c1, num4c1, num1c2, num2c2, num1p, num2p, num3p, num4p;
    String lectura;
    int cont = 0;
        //validacion con contador
        lectura = asis1.getText().toString();
        if (lectura.isEmpty()){
            cont++;
        }

        lectura = trab1.getText().toString();
        if (lectura.isEmpty()){
            cont++;
        }

        lectura = tyt1.getText().toString();
        if (lectura.isEmpty()){
            cont++;
        }

        lectura = p1.getText().toString();
        if (lectura.isEmpty()){
            cont++;
        }


        lectura = asis2.getText().toString();
        if (lectura.isEmpty()){
            cont++;
        }

        lectura = trab2.getText().toString();
        if (lectura.isEmpty()){
            cont++;
        }


        lectura = pentre.getText().toString();
        if (lectura.isEmpty()){
            cont++;
        }

        lectura = sentre.getText().toString();
        if (lectura.isEmpty()){
            cont++;
        }

        lectura = sus.getText().toString();
        if (lectura.isEmpty()){
            cont++;
        }

        lectura = app.getText().toString();
        if (lectura.isEmpty()){
            cont++;
        }

        //fin validacion
        //comprobacion y aplicacion
        if (cont == 0) {

            Definitiva miDefinitiva = new Definitiva();
            miDefinitiva.setAsistencia1(Double.valueOf(asis1.getText().toString()));
            miDefinitiva.setTalleres(Double.parseDouble(trab1.getText().toString()));
            miDefinitiva.setTrabajos1((Double.valueOf(trab1.getText().toString())));
            miDefinitiva.setParcial(Double.parseDouble(p1.getText().toString()));
            miDefinitiva.setAsistencia2((Double.valueOf(asis2.getText().toString())));
            miDefinitiva.setTrabajos2((Double.parseDouble(trab2.getText().toString())));
            miDefinitiva.setEntregable1(Double.parseDouble(pentre.getText().toString()));
            miDefinitiva.setEntregable2(Double.valueOf(sentre.getText().toString()));
            miDefinitiva.setSustentacion(Double.parseDouble(sus.getText().toString()));
            miDefinitiva.setAplicacion(Double.valueOf(app.getText().toString()));
            
            //Intent miIntencion = new Intent(this, ResultadoActivity.class);
            Intent miIntencion = new Intent(getApplication(), ResultadoActivity.class);
            miIntencion.putExtra("resultado", miDefinitiva.getDefinitiva());
            miIntencion.putExtra("titulo", "Resultado final");
            startActivity(miIntencion);
            }
            else {
                Toast.makeText(getBaseContext(),"Hay campos vacios",Toast.LENGTH_LONG).show();
            }
        }





}
