public class ProyectoMeth{

    static int maxCP = 100;
    static int numProy;
    static ProyOBJ[] Proyectos = new ProyOBJ[maxCP];


    //Setters y Getters

    public int getMaxCP() {
        return maxCP;
    }
    public static void setMaxCP(int MaxCP) {
        maxCP = MaxCP;
    }
    public int getNumProy() {
        return numProy;
    }
    public void setNumProy(int NumProy) {
        numProy = NumProy;
    }
    public ProyOBJ[] getProyectos() {
        return Proyectos;
    }
    public void setProyectos(ProyOBJ[] proyectos) {
        Proyectos = proyectos;
    }
    
    public static void verProyectosPos(int pos) {
        System.out.println(pos + ". " + Proyectos[pos].getname() + " - " + Proyectos[pos].getver() + " - "
                + Proyectos[pos].getFunciones());
    }

    public static void agregarProyecto(String name,  int num) {
        if (numProy < maxCP) {
            Proyectos[numProy] = new ProyOBJ(name, num);
            numProy++;
        } else {
            System.out.println("ERROR: No se puede agregar contacto. Lista llena.");
        }
    }

    public static void eliminarContacto(int pos) {
        if (pos >= 0 && pos < numProy) {
            eliminarPosDeVector(Proyectos, pos);
            numProy--;
        } else {
            System.out.println("ERROR: No se puede eliminar contacto. Posición fuera de rango.");
        }
    }

    public static void eliminarPosDeVector(ProyOBJ[] vector, int pos) {
        for (int i = pos; i < (numProy - 1); i++) {
            vector[i] = vector[i + 1];
        }
    }

}