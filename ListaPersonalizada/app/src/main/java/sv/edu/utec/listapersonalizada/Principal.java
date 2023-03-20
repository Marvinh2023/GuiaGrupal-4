package sv.edu.utec.listapersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    TextView nombreDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Bundle bundle = getIntent().getExtras();
        nombreDetalle = findViewById(R.id.tvNombrePaisDetalle);
        String info = "El pais seleccionado es: "+bundle.getString("nombre");
        nombreDetalle.setText(info);
    }
}