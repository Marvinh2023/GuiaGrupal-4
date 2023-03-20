package sv.edu.utec.listapersonas;

import android.app.Person;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorPersonas extends ArrayAdapter<Personas> {
    Context contexto;
    List<Personas> mList;

    public AdaptadorPersonas(Context contexto,List<Personas>objects) {
        super(contexto, R.layout.persona,objects);
        this.contexto = contexto;
        this.mList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(contexto);
        View item = inflater.inflate(R.layout.persona,null);

        Personas persona = mList.get(position);

        ImageView imagen = item.findViewById(R.id.imvFoto);
        imagen.setImageResource(persona.getImagen());

        TextView nombre = item.findViewById(R.id.tvNombre);
        nombre.setText(persona.getNombre());

        TextView genero = item.findViewById(R.id.tvGenero);
        genero.setText(String.valueOf(persona.getGenero()));

        return(item);
    }
}
