package co.edu.unab.gonzalez.christian.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TallerActivity extends AppCompatActivity{

    private EditText edtNum1;
    private EditText edtNum2;
    private EditText edtNum3;
    private EditText edtNum4;
    private EditText edtNum5;
    private EditText edtNum6;
    private EditText edtNum7;
    private EditText edtNum8;
    private EditText edtNum9;
    private EditText edtNum10;
    private Button btnCalcular;
    private TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller);

        edtNum1 = findViewById(R.id.editText5);
        edtNum2 = findViewById(R.id.editText6);
        edtNum3 = findViewById(R.id.editText7);
        edtNum4 = findViewById(R.id.editText8);
        edtNum5 = findViewById(R.id.editText9);
        edtNum6 = findViewById(R.id.editText12);
        edtNum7 = findViewById(R.id.editText14);
        edtNum8 = findViewById(R.id.editText15);
        edtNum9 = findViewById(R.id.editText18);
        edtNum10 = findViewById(R.id.editText19);

        btnCalcular = findViewById(R.id.btnCalcular);
        txtResultado = findViewById(R.id.textView12);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
                double primercorte;
                double segundocorte;
                double promedio;
                double resultado;
                String lectura;

                if (edtNum1.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "El campo Asistencia de Primer Corte esta vacio", Toast.LENGTH_LONG).show();
                    edtNum1.setError("Debes llenar todos los campos");
                }
                if (edtNum2.getText().toString().isEmpty()){
                    Toast.makeText(getBaseContext(),"El campo Trabajos y Talleres de Primer Corte esta vacio",Toast.LENGTH_LONG).show();
                    edtNum2.setError("Debes llenar todos los campos");
                }
                if (edtNum3.getText().toString().isEmpty()){
                    Toast.makeText(getBaseContext(),"El campo Trabajo en clase de Primer Corte esta vacio",Toast.LENGTH_LONG).show();
                    edtNum3.setError("Debes llenar todos los campos");
                }
                if (edtNum4.getText().toString().isEmpty()){
                    Toast.makeText(getBaseContext(),"El campo Parcial de Primer Corte esta vacio",Toast.LENGTH_LONG).show();
                    edtNum4.setError("Debes llenar todos los campos");
                }
                if (edtNum5.getText().toString().isEmpty()){
                    Toast.makeText(getBaseContext(),"El campo Asistencia de Segundo Corte esta vacio",Toast.LENGTH_LONG).show();
                    edtNum5.setError("Debes llenar todos los campos");
                }
                if (edtNum6.getText().toString().isEmpty()){
                    Toast.makeText(getBaseContext(),"El campo Trabajo en clase de Segundo Corte esta vacio",Toast.LENGTH_LONG).show();
                    edtNum6.setError("Debes llenar todos los campos");
                }
                if (edtNum7.getText().toString().isEmpty()){
                    Toast.makeText(getBaseContext(),"El campo Primer Entregable de Segundo Corte esta vacio",Toast.LENGTH_LONG).show();
                    edtNum7.setError("Debes llenar todos los campos");
                }
                if (edtNum8.getText().toString().isEmpty()){
                    Toast.makeText(getBaseContext(),"El campo Sustentación de Segundo Corte esta vacio",Toast.LENGTH_LONG).show();
                    edtNum8.setError("Debes llenar todos los campos");
                }
                if (edtNum9.getText().toString().isEmpty()){
                    Toast.makeText(getBaseContext(),"El campo Segundo Entregable de Segundo Corte esta vacio",Toast.LENGTH_LONG).show();
                    edtNum9.setError("Debes llenar todos los campos");
                }
                if (edtNum10.getText().toString().isEmpty()){
                    Toast.makeText(getBaseContext(),"El campo Aplicación de Segundo Corte esta vacio",Toast.LENGTH_LONG).show();
                    edtNum10.setError("Debes llenar todos los campos");
                }

                if (edtNum1.length() !=0 && edtNum2.length() !=0 && edtNum3.length() !=0 && edtNum4.length() !=0 && edtNum5.length() !=0 && edtNum6.length() !=0 && edtNum7.length() !=0 && edtNum8.length() !=0 && edtNum9.length() !=0 && edtNum10.length() !=0 ){

                    lectura = edtNum1.getText().toString();
                    num1 = Double.valueOf(lectura);

                    lectura = edtNum2.getText().toString();
                    num2 = Double.valueOf(lectura);

                    lectura = edtNum3.getText().toString();
                    num3 = Double.valueOf(lectura);

                    lectura = edtNum4.getText().toString();
                    num4 = Double.valueOf(lectura);

                    lectura = edtNum5.getText().toString();
                    num5 = Double.valueOf(lectura);

                    lectura = edtNum6.getText().toString();
                    num6 = Double.valueOf(lectura);

                    lectura = edtNum7.getText().toString();
                    num7 = Double.valueOf(lectura);

                    lectura = edtNum8.getText().toString();
                    num8 = Double.valueOf(lectura);

                    lectura = edtNum9.getText().toString();
                    num9 = Double.valueOf(lectura);

                    lectura = edtNum10.getText().toString();
                    num10 = Double.valueOf(lectura);


                    primercorte = (num1 * 0.1) + (num2 * 0.3) + (num3 * 0.3) + (num4 * 0.3);
                    segundocorte = (num5 * 0.1) + (num6 * 0.3) + (num7 * 0.15) + (num8 * 0.15) + (num9 * 0.15) + (num10 * 0.15);
                    promedio = (primercorte + segundocorte) / 2;
                    resultado = promedio;

                    txtResultado.setText("Su nota es: " + resultado);
                }
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}

