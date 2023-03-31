import java.util.Scanner;

public class ProyectoMeth {

    static int maxCP = 100;
    static int numProy = 0;
    static ProyOBJ[] Proyectos = new ProyOBJ[maxCP];

    public static void agregarProyecto(String name, String num) {
        if (numProy < maxCP) {
            Proyectos[numProy] = new ProyOBJ(name, num);
            numProy++;
        } else {
            System.out.println("ERROR: No se puede agregar proyecto. Lista llena.");
        }
    }

    public static void eliminarProyecto(int pos) {
        if (pos >= 0 && pos < numProy) {
            eliminarPosDeVector(Proyectos, pos);
            numProy--;
        } else {
            System.out.println("ERROR: No se puede eliminar proyecto. Posición fuera de rango.");
        }
    }

    public static void eliminarPosDeVector(ProyOBJ[] vector, int pos) {
        for (int i = pos; i <= (numProy - 1); i++) {
            vector[i] = vector[i + 1];
        }
    }

    public static void Modificar(ProyOBJ[] vector, int pos) {
        Scanner in = new Scanner(System.in);
        System.out.println("¿Que quieres modificar?");
        int opcion = in.nextInt();
        in.nextLine();

        switch (opcion) {
            case 1:
                vector[pos].setname(in.nextLine());
                break;
            case 2:
                opcion = in.nextInt();
                vector[pos].setver(in.nextLine());
                break;
            case 3:

                do {
                    opcion = in.nextInt();
                    if (opcion == 1) {
                        vector[pos].stat = ProyOBJ.Stat.Unfinished;
                        break;
                    } else if (opcion == 2) {
                        vector[pos].stat = ProyOBJ.Stat.Finished;
                        break;
                    } else if (opcion == 3) {
                        vector[pos].stat = ProyOBJ.Stat.OnHold;
                        break;
                    } else {
                        System.out.println("Introduce un valor adequado");
                        opcion = 0;
                    }
                } while (opcion == opcion);
                break;
        }

    }

    public static int buscarNombre(ProyOBJ proyectos[], String buscar) {

        int npos = 0;

        for (int i = 0; i < numProy; i++) {
            if (proyectos[i].getname().toUpperCase().contains(buscar.toUpperCase())) {
                npos = i;
            }
        }

        return npos;
    }

    public static int buscarVersion(ProyOBJ proyectos[], String buscar) {

        int npos = 0;

        for (int i = 0; i < numProy; i++) {
            if (proyectos[i].getver().toUpperCase().contains(buscar.toUpperCase())) {
                npos = i;
            }
        }

        return npos;
    }

    public static void SeleccionarMenu() {

        Scanner in = new Scanner(System.in);

        System.out.println("Eliga que proyecto desea seleccionar:");
        int proyecto = in.nextInt();
        MenuFunc.menu(proyecto);

    }

    public static void Listar() {
        System.out.println();
        for (int i = 0; i < ProyectoMeth.numProy; i++) {
            ProyOBJ.Listinfo(i);
            System.out.println("");
        }
    }

}
