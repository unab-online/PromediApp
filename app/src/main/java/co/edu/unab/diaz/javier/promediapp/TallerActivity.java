package co.edu.unab.diaz.javier.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class TallerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller);

        edtNum1 = findViewById(R.id.editText);
        edtNum1.setText("0");

        Log.d(tag, "ESTADO", msg, "Creando Actividad...");
        toast.maketext(getBaseContext(),text, "Metodo Create", Toast.LENGTH_LONG).show();
    }
}
