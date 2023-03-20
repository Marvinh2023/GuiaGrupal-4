package sv.edu.utec.listafrutas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorFrutas extends ArrayAdapter<Frutas> {

    Context contexto;
    List<Frutas>aListFruta;

    public AdaptadorFrutas(Context contexto, ArrayList<Frutas>listFrutas) {
        super(contexto, R.layout.frutas, listFrutas);
        this.contexto = contexto;
        this.aListFruta = listFrutas;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater =LayoutInflater.from(contexto);
        View item =inflater.inflate(R.layout.frutas,null);

        Frutas fru = aListFruta.get(position);
        ImageView imagen =item.findViewById(R.id.imvFoto);
        imagen.setImageResource(fru.getImagen());

        TextView nombre = item.findViewById(R.id.tvNombre);
        nombre.setText(fru.getNombre());

        TextView descripcion = item.findViewById(R.id.tvDescripcion);
        descripcion.setText(fru.getDescripcion());
        return(item);
    }
}
