package sv.edu.utec.listadatospersona;

public class DatosPersona {
    private String nombre;
    private int edad;
    private String direccion;
    private int imagen;

    public DatosPersona() {

    }

    public DatosPersona(String nombre, int edad, String direccion, int imagen) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
