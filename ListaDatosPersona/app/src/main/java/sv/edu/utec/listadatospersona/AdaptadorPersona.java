package sv.edu.utec.listadatospersona;

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

public class AdaptadorPersona extends ArrayAdapter<DatosPersona> {

    private Context contexto;
    private List<DatosPersona>lstDatosPersona;


    public AdaptadorPersona(Context contexto, ArrayList<DatosPersona>lstDPerson) {
        super(contexto, R.layout.datospersona,lstDPerson);
        this.contexto = contexto;
        this.lstDatosPersona = lstDPerson;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater =LayoutInflater.from(contexto);
        View item =inflater.inflate(R.layout.datospersona,null);

        DatosPersona dp =lstDatosPersona.get(position);
        ImageView imagen =item.findViewById(R.id.imvFoto);
        imagen.setImageResource(dp.getImagen());

        TextView nombre = item.findViewById(R.id.tvNombre);
        nombre.setText(dp.getNombre());

        TextView edad = item.findViewById(R.id.tvEdad);
        edad.setText(String.valueOf(dp.getEdad()));

        TextView direccion = item.findViewById(R.id.tvDireccion);
        direccion.setText(dp.getDireccion());
        return(item);
    }
}
