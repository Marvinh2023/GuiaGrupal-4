package sv.edu.utec.listafrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Frutas>listaFruta;
    private ListView lvFrutas;
    private ListAdapter lstAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFrutas = findViewById(R.id.lsvFrutas);
        llenadoDeFrutas();
        AdaptadorFrutas adaptadorFru = new AdaptadorFrutas(this,listaFruta);
        lvFrutas.setAdapter(adaptadorFru);
    }

    public ArrayList<Frutas>llenadoDeFrutas(){
        listaFruta = new ArrayList<Frutas>();
        listaFruta.add(new Frutas("Manzana","Fruta Roja",R.drawable.manzana));
        listaFruta.add(new Frutas("Coco","Fruta Cafe",R.drawable.coco));
        listaFruta.add(new Frutas("Pera","Fruta Verde",R.drawable.pera));
        listaFruta.add(new Frutas("Pina","Fruta Amarrilla",R.drawable.pina));
        listaFruta.add(new Frutas("Uva","Fruta Morada",R.drawable.uva));
        /*listaFruta.add(new Frutas("Manzana","Fruta Roja",R.drawable.manzana));
        listaFruta.add(new Frutas("Manzana","Fruta Roja",R.drawable.manzana));*/

        return listaFruta;
    }


}