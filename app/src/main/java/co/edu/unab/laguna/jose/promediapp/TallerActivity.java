package co.edu.unab.laguna.jose.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class TallerActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCalcular;
    private EditText txtAsistencia1;
    private EditText txtAsistencia2;
    private EditText txtTrabajos1;
    private EditText txtTrabajos2;
    private EditText txtTalleres;
    private EditText txtParcial;
    private EditText txtEntrega1;
    private EditText txtEntrega2;
    private EditText txtSustentar;
    private EditText txtAplicar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller);

        btnCalcular = findViewById(R.id.btnCalcular);
        txtAplicar = findViewById(R.id.txtAplicar);
        txtAsistencia1 = findViewById(R.id.txtAsistencia1);
        txtAsistencia2 = findViewById(R.id.txtAsistencia2);
        txtEntrega1 = findViewById(R.id.txtEntrega1);
        txtEntrega2 = findViewById(R.id.txtEntrega2);
        txtParcial = findViewById(R.id.txtParcial);
        txtSustentar = findViewById(R.id.txtSustentar);
        txtTalleres = findViewById(R.id.txtTalleres);
        txtTrabajos1 = findViewById(R.id.txtTrabajos1);
        txtTrabajos2 = findViewById(R.id.txtTrabajos2);

        btnCalcular.setOnClickListener(this);
    }



    public void onClick(View v){
        String lectura;
        double Primer_corte;
        double Segundo_corte;
        double promedio;
        double resultado;
        double aplicar, asistencia1, asistencia2, entrega1, entrega2, parcial, sustentar, talleres, trabajo1, trabajo2;

        if (txtAsistencia1.getText().toString().isEmpty()) {
            Toast.makeText(getBaseContext(), "Campo Vacio", Toast.LENGTH_LONG).show();
            txtAsistencia1.setError("Debes llenar todos los campos");
        }
        if (txtAsistencia2.getText().toString().isEmpty()){
            Toast.makeText(getBaseContext(),"Campo Vacio",Toast.LENGTH_LONG).show();
            txtAsistencia2.setError("Debes llenar todos los campos");
        }
        if (txtEntrega1.getText().toString().isEmpty()){
            Toast.makeText(getBaseContext(),"Campo Vacio",Toast.LENGTH_LONG).show();
            txtEntrega1.setError("Debes llenar todos los campos");
        }
        if (txtEntrega2.getText().toString().isEmpty()){
            Toast.makeText(getBaseContext(),"Campo Vacio",Toast.LENGTH_LONG).show();
            txtEntrega2.setError("Debes llenar todos los campos");
        }
        if (txtTrabajos1.getText().toString().isEmpty()){
            Toast.makeText(getBaseContext(),"Campo Vacio",Toast.LENGTH_LONG).show();
            txtTrabajos1.setError("Debes llenar todos los campos");
        }
        if (txtTrabajos2.getText().toString().isEmpty()){
            Toast.makeText(getBaseContext(),"Campo Vacio",Toast.LENGTH_LONG).show();
            txtTrabajos2.setError("Debes llenar todos los campos");
        }
        if (txtAplicar.getText().toString().isEmpty()){
            Toast.makeText(getBaseContext(),"Campo Vacio",Toast.LENGTH_LONG).show();
            txtAplicar.setError("Debes llenar todos los campos");
        }
        if (txtTalleres.getText().toString().isEmpty()){
            Toast.makeText(getBaseContext(),"Campo Vacio",Toast.LENGTH_LONG).show();
            txtTalleres.setError("Debes llenar todos los campos");
        }
        if (txtSustentar.getText().toString().isEmpty()){
            Toast.makeText(getBaseContext(),"Campo Vacio",Toast.LENGTH_LONG).show();
            txtSustentar.setError("Debes llenar todos los campos");
        }
        if (txtParcial.getText().toString().isEmpty()){
            Toast.makeText(getBaseContext(),"Campo Vacio",Toast.LENGTH_LONG).show();
            txtParcial.setError("Debes llenar todos los campos");
        }

        if (txtParcial.length() !=0 && txtSustentar.length() !=0 && txtTalleres.length() !=0 && txtAplicar.length() !=0 && txtTrabajos2.length() !=0 && txtTrabajos1.length() !=0 && txtEntrega2.length() !=0 && txtEntrega1.length() !=0 && txtAsistencia2.length() !=0 && txtAsistencia1.length() !=0 ) {


            lectura = txtAplicar.getText().toString();
            aplicar = Double.valueOf(lectura);

            lectura = txtAsistencia1.getText().toString();
            asistencia1 = Double.valueOf(lectura);

            lectura = txtAsistencia2.getText().toString();
            asistencia2 = Double.valueOf(lectura);

            lectura = txtEntrega1.getText().toString();
            entrega1 = Double.valueOf(lectura);

            lectura = txtEntrega2.getText().toString();
            entrega2 = Double.valueOf(lectura);

            lectura = txtParcial.getText().toString();
            parcial = Double.valueOf(lectura);

            lectura = txtSustentar.getText().toString();
            sustentar = Double.valueOf(lectura);

            lectura = txtTalleres.getText().toString();
            talleres = Double.valueOf(lectura);

            lectura = txtTrabajos1.getText().toString();
            trabajo1 = Double.valueOf(lectura);

            lectura = txtTrabajos2.getText().toString();
            trabajo2 = Double.valueOf(lectura);


            ///imprimir resultado
            Primer_corte = (asistencia1 * 0.1) + (trabajo1 * 0.3) + (talleres * 0.3) + (parcial * 0.3);
            Segundo_corte = (asistencia2 * 0.1) + (trabajo2 * 0.3) + (entrega1 * 0.15) + (entrega2 * 0.15) + (sustentar * 0.15) + (aplicar * 0.15);
            promedio = (Primer_corte + Segundo_corte) / 2;
            resultado = promedio;

            Intent PasarPantalla = new Intent(getApplication(), ResultadoActivity.class);
            startActivity(PasarPantalla);

        }

    }
}

