import java.util.Scanner;

public class MenuFunc {

    static int opcion;

    public static void menu(int numProy) {

        do {
            Scanner in = new Scanner(System.in);
            menuText();
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion) {
                case 1:
                    FuncionMeth.Listar();
                    break;
                case 2:
                    // Añadir Proyecto
                    System.out.println("Introduce el nombre de la funcion");
                    String name = in.nextLine();
                    System.out.println("Introduce el Lenguage de la funcion");
                    String lang = in.nextLine();
                    FuncionMeth.agregarFuncion(name, ProyectoMeth.Proyectos[numProy].getname(), lang);
                    break;
                case 3:
                    // Eliminar Proyecto
                    System.out.println("Introduce el ID de la funcion");
                    int id = in.nextInt();
                    FuncionMeth.eliminarFuncion(id);
                    break;
                case 4:
                    // Buscar por nombre
                    System.out.println("Introduce el nombre de la funcion");
                    String name2 = in.nextLine();
                    FuncionMeth.buscarNombre(FuncionMeth.Funciones, name2);
                    break;
                case 5:
                    // Buscar por Lenguaje
                    System.out.println("Introduce el Lenguaje de la funcion");
                    String lang2 = in.nextLine();
                    FuncionMeth.buscarLang(FuncionMeth.Funciones, lang2);
                    break;
                case 6:
                    // Modificar
                    System.out.println("Que Proyecto quieres modificar");
                    int pos = in.nextInt();
                    FuncionMeth.Modificar(FuncionMeth.Funciones, pos);
                case 7:
                    // Salir
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        } while (opcion != 7);
        MenuProy.menu();

    }

    public static void menuText() {
        System.out.println("MENU FUNCIONES");
        System.out.println("--------------");
        System.out.println();
        System.out.println("1. Ver Funcion");
        System.out.println("2. Agregar Funcion.");
        System.out.println("3. Eliminar Funcion.");
        System.out.println("4. Buscar por nombre.");
        System.out.println("5. Buscar por Version");
        System.out.println("6. Modificar");
        System.out.println("7. Salir");
        System.out.print("¿Opción? ");
        System.out.print("");
    }

}