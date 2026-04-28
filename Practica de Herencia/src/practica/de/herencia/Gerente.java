package practica.de.herencia;


public class Gerente extends Empleado implements Evaluador, Capacitador{
    private String departamento;
    private int personasCargo;
    private double presupuesto;
    private String frecuenciaReuniones;

    public Gerente(String nombre, int edad, String identidad, String direccion, String telefono, double salario, String idEmpleado, String fechaContratacion, String tipoContrato, String sede, String departamento, int personasCargo, double presupuesto, String frecuenciaReuniones) {

        super(nombre, edad, identidad, direccion, telefono,
              salario, idEmpleado, fechaContratacion, tipoContrato, sede);

        this.departamento = departamento;
        this.personasCargo = personasCargo;
        this.presupuesto = presupuesto;
        this.frecuenciaReuniones = frecuenciaReuniones;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " esta coordinando el departamento de " + departamento);
    }

    @Override
    public void evaluarDesempeno() {
        System.out.println(nombre + " esta evaluando empleados.");
    }

    @Override
    public void impartirCapacitaciones() {
        System.out.println(nombre + " esta impartiendo capacitación.");
    }
}
