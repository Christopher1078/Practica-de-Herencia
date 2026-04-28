package practica.de.herencia;
import java.util.Scanner;
import java.util.ArrayList;
public class PracticaDeHerencia {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        int op;

        do {
            System.out.println("\n===== MENU TECHCORP =====");
            System.out.println("1. Agregar Desarrollador");
            System.out.println("2. Agregar Gerente");
            System.out.println("3. Agregar Desarrollador Senior");
            System.out.println("4. Mostrar empleados");
            System.out.println("5. Todos trabajar");
            System.out.println("6. Mostrar salarios");
            System.out.println("7. Salir");
            System.out.print("Opcion: ");
            op = lea.nextInt();
            lea.nextLine();

            switch (op) {

                case 1: {
                    System.out.print("Nombre: ");
                    String nombre = lea.nextLine();

                    System.out.print("Edad: ");
                    int edad = lea.nextInt();
                    lea.nextLine();

                    System.out.print("Identidad: ");
                    String id = lea.nextLine();

                    System.out.print("Direccion: ");
                    String dir = lea.nextLine();

                    System.out.print("Telefono: ");
                    String tel = lea.nextLine();

                    System.out.print("Salario: ");
                    double salario = lea.nextDouble();
                    lea.nextLine();

                    System.out.print("Codigo empleado: ");
                    String codigo = lea.nextLine();

                    System.out.print("Fecha contratacion: ");
                    String fecha = lea.nextLine();

                    System.out.print("Tipo contrato: ");
                    String contrato = lea.nextLine();

                    System.out.print("Sede: ");
                    String sede = lea.nextLine();

                    System.out.print("Lenguaje principal: ");
                    String lenguaje = lea.nextLine();

                    System.out.print("Nivel tecnico: ");
                    String nivel = lea.nextLine();

                    System.out.print("Herramientas: ");
                    String herramientas = lea.nextLine();

                    System.out.print("Cantidad proyectos: ");
                    int proyectos = lea.nextInt();

                    empleados.add(new Desarrollador(
                            nombre, edad, id, dir, tel,
                            salario, codigo, fecha, contrato, sede,
                            lenguaje, nivel, herramientas, proyectos));

                    System.out.println("Desarrollador agregado.");
                }
                break;

                case 2: {
                    System.out.print("Nombre: ");
                    String nombre = lea.nextLine();

                    System.out.print("Edad: ");
                    int edad = lea.nextInt();
                    lea.nextLine();

                    System.out.print("Identidad: ");
                    String id = lea.nextLine();

                    System.out.print("Direccion: ");
                    String dir = lea.nextLine();

                    System.out.print("Telefono: ");
                    String tel = lea.nextLine();

                    System.out.print("Salario: ");
                    double salario = lea.nextDouble();
                    lea.nextLine();

                    System.out.print("Codigo empleado: ");
                    String codigo = lea.nextLine();

                    System.out.print("Fecha contratacion: ");
                    String fecha = lea.nextLine();

                    System.out.print("Tipo contrato: ");
                    String contrato = lea.nextLine();

                    System.out.print("Sede: ");
                    String sede = lea.nextLine();

                    System.out.print("Departamento: ");
                    String dep = lea.nextLine();

                    System.out.print("Personas a cargo: ");
                    int personas = lea.nextInt();

                    System.out.print("Presupuesto: ");
                    double presupuesto = lea.nextDouble();
                    lea.nextLine();

                    System.out.print("Frecuencia reuniones: ");
                    String reuniones = lea.nextLine();

                    empleados.add(new Gerente(
                            nombre, edad, id, dir, tel,
                            salario, codigo, fecha, contrato, sede,
                            dep, personas, presupuesto, reuniones));

                    System.out.println("Gerente agregado.");
                }
                break;

                case 3: {
                    System.out.print("Nombre: ");
                    String nombre = lea.nextLine();

                    System.out.print("Edad: ");
                    int edad = lea.nextInt();
                    lea.nextLine();

                    System.out.print("Identidad: ");
                    String id = lea.nextLine();

                    System.out.print("Direccion: ");
                    String dir = lea.nextLine();

                    System.out.print("Telefono: ");
                    String tel = lea.nextLine();

                    System.out.print("Salario: ");
                    double salario = lea.nextDouble();
                    lea.nextLine();

                    System.out.print("Codigo empleado: ");
                    String codigo = lea.nextLine();

                    System.out.print("Fecha contratacion: ");
                    String fecha = lea.nextLine();

                    System.out.print("Tipo contrato: ");
                    String contrato = lea.nextLine();

                    System.out.print("Sede: ");
                    String sede = lea.nextLine();

                    System.out.print("Lenguaje principal: ");
                    String lenguaje = lea.nextLine();

                    System.out.print("Nivel tecnico: ");
                    String nivel = lea.nextLine();

                    System.out.print("Herramientas: ");
                    String herramientas = lea.nextLine();

                    System.out.print("Cantidad proyectos: ");
                    int proyectos = lea.nextInt();

                    System.out.print("Anios experiencia: ");
                    int anios = lea.nextInt();

                    System.out.print("Proyectos liderados: ");
                    int liderados = lea.nextInt();
                    lea.nextLine();

                    System.out.print("Especializacion: ");
                    String esp = lea.nextLine();

                    empleados.add(new DesarrolladorSenior(
                            nombre, edad, id, dir, tel,
                            salario, codigo, fecha, contrato, sede,
                            lenguaje, nivel, herramientas, proyectos,
                            anios, liderados, esp, true));

                    System.out.println("Desarrollador Senior agregado.");
                }
                break;

                case 4:
                    for (Empleado e : empleados) {
                        System.out.println(e.nombre);
                    }
                    break;

                case 5:
                    for (Empleado e : empleados) {
                        e.trabajar(); 
                    }
                    break;

                case 6:
                    for (Empleado e : empleados) {
                        System.out.println(e.nombre + " Lps. " + e.getSalario());
                    }
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (op != 7);
    }
    
}
