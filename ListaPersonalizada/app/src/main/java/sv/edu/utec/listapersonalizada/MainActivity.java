package sv.edu.utec.listapersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] paises = {"El Salvador","Guatemala","Honduras","Nicaragua"};
    ListView lvstPais;
    EditText nombrePais;

    Integer[]ImgPais={
            R.drawable.banderaesa,
            R.drawable.banderaguatemala,
            R.drawable.banderahon,
            R.drawable.banderanic
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdaptadorPais adaptador = new AdaptadorPais(this,paises,ImgPais);
        lvstPais= findViewById(R.id.lstPaises);
        lvstPais.setAdapter(adaptador);

        //OBTENEMOS EL NOMBRE DEL OBJETO
        lvstPais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, "Has pulsado: "+ paises[i], Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(),Principal.class);
                intent.putExtra("nombre",paises[i]);
                startActivity(intent);
            }
        });
    }
}