package co.edu.unab.castillo.naun.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText edtasistenciaP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller);
        edtasistenciaP=findViewById(R.id.textasistenciaP);


    }

    @Override
    public void onClick(View v) {
    String lectura;
    double asistenciaP, trabajoclaseP, trabajotalleresclaseP, parcialP, asistenciaS, trabajoclaseS, primerentregable, segundoentregable, sustentacion, aplicacion;

    lectura= edtasistenciaP.getText().toString();


    }

    /*public static double verificar(double num){
        String lectura="";
        if(num>=0 || num <= 5){
            return num;
        } else{
            return -1;
        }
    }*/


}
