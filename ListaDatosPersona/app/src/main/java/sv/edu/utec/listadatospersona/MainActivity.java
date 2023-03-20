package sv.edu.utec.listadatospersona;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DatosPersona> lstDatoPer;
    private ListView lvDatosPer;
    private ListAdapter listAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvDatosPer = findViewById(R.id.lsvDatosPersona);
        lstDatoPer = new ArrayList<DatosPersona>();
        lstDatoPer.add(new DatosPersona("Ana",26,"La libertad", R.drawable.mujer));
        lstDatoPer.add(new DatosPersona("Kevin",25,"San Salvador", R.drawable.hombre));
        lstDatoPer.add(new DatosPersona("Ale",26,"La libertad", R.drawable.mujer));
        lstDatoPer.add(new DatosPersona("Roxana",26,"San Salvador", R.drawable.mujer));
        lstDatoPer.add(new DatosPersona("Diego",26,"San Salvador", R.drawable.hombre));
        AdaptadorPersona adaptador = new AdaptadorPersona(this,lstDatoPer);
        lvDatosPer.setAdapter(adaptador);
    }
}