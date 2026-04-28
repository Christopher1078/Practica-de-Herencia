package practica.de.herencia;

public class Desarrollador extends Empleado {
    protected String lenguajePrincipal;
    protected String nivelTecnico;
    protected String herramientas;
    protected int proyectos;

    public Desarrollador(String nombre, int edad, String identidad, String direccion, String telefono,double salario, String idEmpleado, String fechaContratacion, String tipoContrato, String sede, String lenguajePrincipal, String nivelTecnico, String herramientas, int proyectos) {

        super(nombre, edad, identidad, direccion, telefono,
              salario, idEmpleado, fechaContratacion, tipoContrato, sede);

        this.lenguajePrincipal = lenguajePrincipal;
        this.nivelTecnico = nivelTecnico;
        this.herramientas = herramientas;
        this.proyectos = proyectos;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " esta desarrollando software en " + lenguajePrincipal);
    }
    
    
}
