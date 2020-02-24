package co.edu.unab.parra.cristian.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText asistencia1;
    private EditText trabajoClase1;
    private EditText trabajoTaller1;
    private EditText parcial1;

    private EditText asistencia2;
    private EditText trabajoClase2;
    private EditText entregable1;
    private EditText entregable2 ;
    private EditText sustentacion;
    private EditText aplicacion ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Primer Taller – Cristian");
        asistencia1= (EditText)findViewById(R.id.et_asist1);
        trabajoClase1= (EditText)findViewById(R.id.et_tc1);
        trabajoTaller1= (EditText)findViewById(R.id.et_tyt1);
        parcial1= (EditText)findViewById(R.id.et_p1);

        asistencia2= (EditText)findViewById(R.id.et_asist2);
        trabajoClase2= (EditText)findViewById(R.id.et_tc2);
        entregable1= (EditText)findViewById(R.id.et_e1);
        entregable2= (EditText)findViewById(R.id.et_e2);
        sustentacion= (EditText)findViewById(R.id.et_sust);
        aplicacion= (EditText)findViewById(R.id.et_app);
    }

    public void calcular(View view){

        if(asistencia1.getText().toString().isEmpty() || asistencia1.getText().toString().equals(".")){

            Toast.makeText(getApplicationContext(), "Debes llenar el campo de asistencia de primer corte", Toast.LENGTH_LONG).show();
        }


        if(trabajoClase1.getText().toString().isEmpty() || trabajoClase1.getText().toString().equals(".")){
            Toast.makeText(getApplicationContext(), "Debes llenar el campo de trabajo en clase", Toast.LENGTH_LONG).show();
        }


        if(trabajoTaller1.getText().toString().isEmpty() || trabajoTaller1.getText().toString().equals(".")){
            Toast.makeText(getApplicationContext(), "Debes llenar el campo de Trabajos y talleres", Toast.LENGTH_LONG).show();
        }


        if(parcial1.getText().toString().isEmpty() || parcial1.getText().toString().equals(".")){
            Toast.makeText(getApplicationContext(), "Debes llenar el campo de Parcial 1", Toast.LENGTH_LONG).show();

        }


        if(asistencia2.getText().toString().isEmpty() || asistencia2.getText().toString().equals(".")){
            Toast.makeText(getApplicationContext(), "Debes llenar el campo de  asistencia", Toast.LENGTH_LONG).show();

        }

        if(trabajoClase2.getText().toString().isEmpty() || trabajoClase2.getText().toString().equals(".")){
            Toast.makeText(getApplicationContext(), "Debes llenar el campo de  trabajo en clase", Toast.LENGTH_LONG).show();

        }

        if(entregable1.getText().toString().isEmpty() || entregable1.getText().toString().equals(".")){
            Toast.makeText(getApplicationContext(), "Debes llenar el campo de entregable 1", Toast.LENGTH_LONG).show();

        }

        if(entregable2.getText().toString().isEmpty() || entregable2.getText().toString().equals(".")){
            Toast.makeText(getApplicationContext(), "Debes llenar el campo de entregable 2", Toast.LENGTH_LONG).show();

        }

        if(sustentacion.getText().toString().isEmpty() || sustentacion.getText().toString().equals(".")){
            Toast.makeText(getApplicationContext(), "Debes llenar el campo de sustentacion", Toast.LENGTH_LONG).show();

        }

        if(aplicacion.getText().toString().isEmpty() || aplicacion.getText().toString().equals(".")){
            Toast.makeText(getApplicationContext(), "Debes llenar el campo de aplicacion", Toast.LENGTH_LONG).show();


        }

        if(isNumber(asistencia1)&& isNumber(trabajoClase1)&& isNumber(trabajoTaller1) && isNumber(parcial1)
                && isNumber(asistencia2) && isNumber(trabajoClase2) && isNumber(entregable1) && isNumber(entregable2)&& isNumber(sustentacion) && isNumber(aplicacion)
        ){
            double asist1= Double.parseDouble(asistencia1.getText().toString());
            double tc1= Double.parseDouble(trabajoClase1.getText().toString());
            double tt1= Double.parseDouble(trabajoTaller1.getText().toString());
            double p1= Double.parseDouble(parcial1.getText().toString());


            double asist2= Double.parseDouble(asistencia2.getText().toString());
            double tc2= Double.parseDouble(trabajoClase2.getText().toString());
            double e1= Double.parseDouble(entregable1.getText().toString());
            double e2= Double.parseDouble(entregable2.getText().toString());
            double sust= Double.parseDouble(sustentacion.getText().toString());
            double app= Double.parseDouble(aplicacion.getText().toString());

            Definitiva miDefinitiva= new Definitiva(asist1, tt1, tc1,p1,asist2,tc2,sust,app,e1,e2);
            miDefinitiva.getPrimerCorte();
            miDefinitiva.getSegundoCorte();
            //double corte1= asist1*0.10+tc1*0.30+tt1*0.30+p1*0.30;
           // double corte2= asist2*0.10+tc2*0.30+e1*0.15+e2*0.15+sust*0.15+app*0.15;

            double resultadoSem= miDefinitiva.getDefinitiva();

            String resultadoMostrar= String.valueOf(miDefinitiva);
            Intent caballoDeTroya = new Intent(MainActivity.this, ResultadoActivity.class);
            caballoDeTroya.putExtra("res", resultadoSem);
            caballoDeTroya.putExtra("titulo", "Resultado final");
            startActivity(caballoDeTroya);

        }






    }


    public boolean isNumber(EditText editText){
        boolean isDigit= true;
        try {
            Double aux= Double.parseDouble(editText.getText().toString());
            isDigit=true;
        }catch (Exception e){
            isDigit=false;
        }

        return isDigit;
    }

}
