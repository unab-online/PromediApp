package co.edu.unab.diaz.brayan.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TallerActivity extends AppCompatActivity {

    private EditText edt1,edt2,edt3,edt4,edt5,edt6,edt7,edt8,edt9,edt10;
    private Button btncal;
    private TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller);

        edt1 =findViewById(R.id.edt_1);
        edt2 = findViewById(R.id.edt_2);
        edt3 = findViewById(R.id.edt_3);
        edt4 = findViewById(R.id.edt_4);
        edt5 = findViewById(R.id.edt_5);
        edt6 = findViewById(R.id.edt_6);
        edt7 = findViewById(R.id.edt_7);
        edt8 = findViewById(R.id.edt_8);
        edt9 = findViewById(R.id.edt_9);
        edt10 = findViewById(R.id.edt_10);
        btncal = findViewById(R.id.btn_cal);
        txtresult = findViewById(R.id.txt_result);
    }

    public void calcular(View v){
        double resultado,num1,num2,num3,num4,num5,num6,num7,num8,num9,num10;
        String lectura;
        boolean c = true;


        lectura = edt1.getText().toString();
        num1 = Double.valueOf(lectura);
        lectura = edt2.getText().toString();
        num2 = Double.valueOf(lectura);
        lectura = edt3.getText().toString();
        num3 = Double.valueOf(lectura);
        lectura = edt4.getText().toString();
        num4 = Double.valueOf(lectura);
        lectura = edt5.getText().toString();
        num5 = Double.valueOf(lectura);
        lectura = edt6.getText().toString();
        num6 = Double.valueOf(lectura);
        lectura = edt7.getText().toString();
        num7 = Double.valueOf(lectura);
        lectura = edt8.getText().toString();
        num8 = Double.valueOf(lectura);
        lectura = edt9.getText().toString();
        num9 = Double.valueOf(lectura);
        lectura = edt10.getText().toString();
        num10 = Double.valueOf(lectura);

        List<Double> num = new ArrayList<>();
        num.add(num1);
        num.add(num2);
        num.add(num3);
        num.add(num4);
        num.add(num5);
        num.add(num6);
        num.add(num7);
        num.add(num8);
        num.add(num9);
        num.add(num10);

        verificar(num,c);
        if(c==true){
            Toast.makeText(getApplicationContext(),"Espacios rellenados.",Toast.LENGTH_LONG).show();
            resultado = ((num1*0.1+num2*0.3+num3*0.3+num4*0.3)*0.5)+(num5*0.1+num6*0.3+((num7*0.15+num8*0.15+num9*0.15+num10*0.15)*0.6));
            txtresult.setText("Promedio = "+resultado);
        }else{
            Toast.makeText(getApplicationContext(),"Rellene todos los espacios.",Toast.LENGTH_LONG).show();
            txtresult.setText("Null");
        }

    }


    public void verificar(List<Double> num, boolean c){
        for(int i=0; i<num.size(); i++){
            if(num.get(i).equals(null)){
                c=false;
            }
        }
    }



}
