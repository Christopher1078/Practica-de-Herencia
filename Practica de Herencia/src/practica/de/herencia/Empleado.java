package practica.de.herencia;
public class Empleado extends Persona {
    protected double salario;
    protected String idEmpleado;
    protected String fechaContratacion;
    protected String tipoContrato;
    protected String sede;

    public Empleado(String nombre, int edad, String identidad, String direccion, String telefono,
                    double salario, String idEmpleado, String fechaContratacion,
                    String tipoContrato, String sede) {

        super(nombre, edad, identidad, direccion, telefono);

        this.salario = salario;
        this.idEmpleado = idEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.tipoContrato = tipoContrato;
        this.sede = sede;
    }

    public void trabajar() {
        System.out.println(nombre + " esta trabajando.");
    }

    public double getSalario() {
        return salario;
    }
}
