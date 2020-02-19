package co.edu.unab.gonzalez.carlos.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

    }
    public void calcular(View elemento){
    double resultado1, resultado2, resultado3, resultadof, num1c1, num2c1, num3c1, num4c1, num1c2, num2c2, num1p, num2p, num3p, num4p;
    String lectura;

        lectura = asis1.getText().toString();
        num1c1 = Double.parseDouble(lectura);

        lectura = trab1.getText().toString();
        num2c1 = Double.parseDouble(lectura);

        lectura = tyt1.getText().toString();
        num3c1 = Double.parseDouble(lectura);

        lectura = p1.getText().toString();
        num4c1 = Double.parseDouble(lectura);



        lectura = asis2.getText().toString();
        num1c2 = Double.parseDouble(lectura);

        lectura = trab2.getText().toString();
        num2c2 = Double.parseDouble(lectura);



        lectura = pentre.getText().toString();
        num1p = Double.parseDouble(lectura);

        lectura = sentre.getText().toString();
        num2p= Double.parseDouble(lectura);

        lectura = sus.getText().toString();
        num3p = Double.parseDouble(lectura);

        lectura = app.getText().toString();
        num4p = Double.parseDouble(lectura);

        if (num1c1 && num2c1 && num3c1 && num4c1 && num1c2 &&  num2c2 && num1p && num2p && num3p && num4p != 0)
        resultado1 = num1c1 + num2c1 + num3c1 + num4c1;

        resultado2 = num1c2 + num2c2;

        resultado3 = num1p + num2p + num3p + num4p;

        resultadof = resultado1 + resultado2 + resultado3;

        resultado.setText(""+resultadof+"");
    }
}
