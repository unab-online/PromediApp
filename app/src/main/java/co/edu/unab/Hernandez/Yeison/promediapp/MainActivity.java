package co.edu.unab.Hernandez.Yeison.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText asistenciaCorteUno,asistenciaCorteDos,trabajoClaseCorteUNo,trabajoClaseCorteDos,trabajosYTalleres,parcial,primerentregable,segundoEntregable,sustentacion,aplicacion;
    private Button calcular;
    private Definitiva definitiva;
    public static final String EXTRAMESSAGE="RESULTADO_MAINACTIVITY" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle(R.string.ActivityTitle);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asistenciaCorteUno=(EditText) findViewById(R.id.asistenciaCorteUno);
        asistenciaCorteDos= (EditText) findViewById(R.id.asistenciaCorteDos);
        trabajoClaseCorteUNo= (EditText) findViewById(R.id.trabajoEnClaseCorteUno);
        trabajoClaseCorteDos=(EditText)findViewById(R.id.trabajoenClaseCorteDos);
        trabajosYTalleres=(EditText)findViewById(R.id.trabajosYTalleres);
        parcial=(EditText)findViewById(R.id.parcial);
        primerentregable=(EditText)findViewById(R.id.primerEntregable);
        segundoEntregable=(EditText)findViewById(R.id.segundoEntregable);
        sustentacion=(EditText)findViewById(R.id.sustentacion);
        aplicacion=(EditText)findViewById(R.id.aplicacion);
        calcular=(Button)findViewById(R.id.btnCalcular);
        definitiva= new Definitiva();

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validacion()){

                    Intent intent= new Intent(MainActivity.this,ResultadoActivity.class);
                    intent.putExtra(EXTRAMESSAGE, definitiva);
                    startActivity(intent);

                }
            }
        });

    }

    public boolean validacion(){
        boolean validacionAux=true;
        if (!isNumeric(asistenciaCorteUno)){
            validacionAux=false;
            Toast.makeText(this, "por favor digita calificación de la asistencia del primer corte", Toast.LENGTH_LONG).show();
        }
        if (!isNumeric(asistenciaCorteDos)){
            validacionAux=false;
            Toast.makeText(this, "por favor digita calificación de la asistencia del segundo corte", Toast.LENGTH_LONG).show();
        }
        if (!isNumeric(trabajoClaseCorteUNo)){
            validacionAux=false;
            Toast.makeText(this, "por favor digita la calificación del trabajo de clase del primer corte", Toast.LENGTH_LONG).show();
        }
        if (!isNumeric(trabajoClaseCorteDos)){
            validacionAux=false;
            Toast.makeText(this, "por favor digita la calificación del trabajo de clase del segundo corte", Toast.LENGTH_LONG).show();
        }
        if (!isNumeric(trabajosYTalleres)){
            validacionAux=false;
            Toast.makeText(this, "por favor digita la calificación del trabajo y talleres", Toast.LENGTH_LONG).show();
        }
        if (!isNumeric(parcial)){
            validacionAux=false;
            Toast.makeText(this, "por favor digita la calificación del parcial", Toast.LENGTH_LONG).show();
        }
        if (!isNumeric(primerentregable)){
            validacionAux=false;
            Toast.makeText(this, "por favor digita la calificación del primer entregable",Toast.LENGTH_LONG).show();}
        if (!isNumeric(segundoEntregable)){
            validacionAux=false;
            Toast.makeText(this, "por favor digita la calificación del segundo entregable",Toast.LENGTH_LONG).show();}
        if (!isNumeric(sustentacion)){
            validacionAux=false;
            Toast.makeText(this, "por favor digita la calificación de la sustentación",Toast.LENGTH_LONG).show();}
        if (!isNumeric(aplicacion)){
            validacionAux=false;
            Toast.makeText(this, "por favor digita la calificación de la aplicación",Toast.LENGTH_LONG).show();}
        return validacionAux;
    }

    public double primerCorte(){
        definitiva.setAsistenciaUno(Double.valueOf(asistenciaCorteUno.getText().toString()));
        definitiva.setTrabajosUno(Double.valueOf(trabajoClaseCorteUNo.getText().toString()));
        definitiva.setTalleres(Double.valueOf(trabajosYTalleres.getText().toString()));
        definitiva.setPacial(Double.valueOf(parcial.getText().toString()));
        //double resultado=Double.valueOf(asistenciaCorteUno.getText().toString())*0.1 +Double.valueOf(trabajoClaseCorteUNo.getText().toString())*0.3+Double.valueOf(trabajosYTalleres.getText().toString())*0.3+Double.valueOf(parcial.getText().toString())*0.3;


        return definitiva.getPrimerCorte();}
    public double segundoCorte(){
        definitiva.setAsistenciaDos(Double.valueOf(asistenciaCorteDos.getText().toString()));
        definitiva.setTrabajosDos(Double.valueOf(trabajoClaseCorteDos.getText().toString()));
        definitiva.setEntregableUno(Double.valueOf(primerentregable.getText().toString()));
        definitiva.setEntregableDos(Double.valueOf(segundoEntregable.getText().toString()));
        definitiva.setSustentacon(Double.valueOf(sustentacion.getText().toString()));
        definitiva.setAplicacion(Double.valueOf(aplicacion.getText().toString()));



        return definitiva.getSegundoCorte();
    }
    public boolean isNumeric(EditText editText){
         boolean isNumber= true;
        try {
            Double aux= Double.parseDouble(editText.getText().toString());
            isNumber=true;
        }catch (Exception e){
            isNumber=false;
        }

        return isNumber;
    }
}
