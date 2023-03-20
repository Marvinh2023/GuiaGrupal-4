package sv.edu.utec.listapersonas;

public class Personas {
    private String nombre;
    private char genero;
    private int imagen;



    public Personas() {
    }

    public Personas(String nombre, char genero, int imagen) {
        this.nombre = nombre;
        this.genero = genero;
        this.imagen = imagen;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
