package practica.de.herencia;


public class DesarrolladorSenior extends Desarrollador implements Evaluador, Capacitador{
    private int aniosExperiencia;
    private int proyectosLiderados;
    private String especializacion;
    private boolean mentoria;

    public DesarrolladorSenior(String nombre, int edad, String identidad, String direccion, String telefono, double salario, String idEmpleado, String fechaContratacion, String tipoContrato, String sede, String lenguajePrincipal, String nivelTecnico, String herramientas, int proyectos, int aniosExperiencia, int proyectosLiderados, String especializacion, boolean mentoria) {

        super(nombre, edad, identidad, direccion, telefono,
              salario, idEmpleado, fechaContratacion, tipoContrato, sede,
              lenguajePrincipal, nivelTecnico, herramientas, proyectos);

        this.aniosExperiencia = aniosExperiencia;
        this.proyectosLiderados = proyectosLiderados;
        this.especializacion = especializacion;
        this.mentoria = mentoria;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " desarrolla software, lidera proyectos y guia al equipo.");
    }

    @Override
    public void evaluarDesempeno() {
        System.out.println(nombre + " esta evaluando codigo y rendimiento.");
    }

    @Override
    public void impartirCapacitaciones() {
        System.out.println(nombre + " esta enseñando buenas prácticas.");
    }
}
