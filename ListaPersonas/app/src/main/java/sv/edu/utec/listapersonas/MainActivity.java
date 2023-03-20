package sv.edu.utec.listapersonas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Personas>listapersonas;
    ListView lv1;
    ListAdapter lstAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //pasamos los datos a la vista
        lv1 = findViewById(R.id.lsvPersonas);

        listapersonas = new ArrayList<Personas>();
        listapersonas.add(new Personas("Ana",'F',R.drawable.nina));
        listapersonas.add(new Personas("Carlos ",'M',R.drawable.nino));
        listapersonas.add(new Personas("Fernanda",'F',R.drawable.nina));
        listapersonas.add(new Personas("Gustavo",'M',R.drawable.nino));
        listapersonas.add(new Personas("Jose",'M',R.drawable.nino));
        listapersonas.add(new Personas("Juan",'M',R.drawable.nino));
        listapersonas.add(new Personas("Karla",'F',R.drawable.nina));
        listapersonas.add(new Personas("Luis",'M',R.drawable.nino));
        listapersonas.add(new Personas("Maria",'F',R.drawable.nina));
        listapersonas.add(new Personas("Marta",'F',R.drawable.nina));
        listapersonas.add(new Personas("Pedro",'M',R.drawable.nino));
        listapersonas.add(new Personas("Silvia",'F',R.drawable.nina));

        AdaptadorPersonas miadaptador = new AdaptadorPersonas(this,listapersonas);
        lv1.setAdapter(miadaptador);
    }
}