import java.util.Scanner;

public class MenuProy {

    static int opcion;

    public static void menu() {

        do {
            Scanner in = new Scanner(System.in);
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion) {
                case 1:
                    ProyectoMeth.Listar();
                    break;
                case 2:
                    // Añadir contacto
                    
                    break;
                case 3:
                    // Eliminar contacto

                    break;
                case 4:
                    // Buscar por nombre

                    break;
                case 5:
                    // Buscar por teléfono

                    break;
                case 6:
                    // Buscar por correo

                    break;
                case 7:
                    // Búsqueda global

                    break;
                case 8:
                    // Salir
                    System.out.println("¡Gracias! ¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        } while (opcion != 8);

    }


    
}
