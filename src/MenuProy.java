import java.util.Scanner;

public class MenuProy {

    static int opcion;

    public static void menu() {

        do {
            Scanner in = new Scanner(System.in);
            menuText();
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion) {
                case 1:
                    ProyectoMeth.Listar();
                    break;
                case 2:
                    // Añadir contacto
                    ProyectoMeth.agregarProyecto(in.nextLine(), in.nextLine());
                    break;
                case 3:
                    // Eliminar contacto
                    ProyectoMeth.eliminarProyecto(in.nextInt());
                    break;
                case 4:
                    // Buscar por nombre
                    ProyectoMeth.buscarNombre(ProyectoMeth.Proyectos, in.nextLine());
                    break;
                case 5:
                    // Buscar por Version
                    ProyectoMeth.buscarVersion(ProyectoMeth.Proyectos, in.nextLine());
                    break;
                case 6:
                    // Seleccionar
                    ProyectoMeth.SeleccionarMenu();
                    break;
                case 7:
                    // Salir
                    System.out.println("¡Gracias! ¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        } while (opcion != 7);

    }

    public static void menuText(){
        System.out.println("MENU PROYECTOS");
        System.out.println("--------------");
        System.out.println();
        System.out.println("1. Ver Proyectos");
        System.out.println("2. Agregar Proyectos.");
        System.out.println("3. Eliminar Proyectos.");
        System.out.println("4. Buscar por nombre.");
        System.out.println("5. Buscar por Version");
        System.out.println("6. Seleccionar");
        System.out.println("7. Salir");
        System.out.print("¿Opción? ");
        System.out.print("");
    }


    
}
