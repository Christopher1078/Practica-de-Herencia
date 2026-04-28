package practica.de.herencia;
public class Persona {
    protected String nombre;
    protected int edad;
    protected String identidad;
    protected String direccion;
    protected String telefono;

    public Persona(String nombre, int edad, String identidad, String direccion, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.identidad = identidad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Identidad: " + identidad);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
    }
}
