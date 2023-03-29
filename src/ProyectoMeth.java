import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class ProyectoMeth{

    static int maxCP = 100;
    static int numProy = 0;
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

    public static void agregarProyecto(String name,  int num) {
        if (numProy < maxCP) {
            Proyectos[numProy] = new ProyOBJ(name, num);
            numProy++;
        } else {
            System.out.println("ERROR: No se puede agregar contacto. Lista llena.");
        }
    }

    public static void eliminarProyecto(int pos) {
        if (pos >= 0 && pos < numProy) {
            eliminarPosDeVector(Proyectos, pos);
            numProy--;
        } else {
            System.out.println("ERROR: No se puede eliminar contacto. Posición fuera de rango.");
        }
    }

    public static void eliminarPosDeVector(ProyOBJ[] vector, int pos) {
        for (int i = pos; i <= (numProy - 1); i++) {
            vector[i] = vector[i + 1];
        }
    }

    public static void Modificar(ProyOBJ[] vector, int pos){
        Scanner in = new Scanner(System.in);
        System.out.println("¿Que quieres modificar?");
        int opcion = in.nextInt();
        in.nextLine();

        switch(opcion){
            case 1:
                vector[pos].setname(in.nextLine());
                break;
            case 2:
                opcion = in.nextInt();
                vector[pos].setver(opcion);
                break;
            case 3:
                
                
                do{
                    opcion = in.nextInt();
                    if(opcion == 1){
                        vector[pos].stat = ProyOBJ.Stat.Unfinished;
                        break;
                    }else if(opcion == 2){
                        vector[pos].stat = ProyOBJ.Stat.Finished;
                        break;
                    }else if(opcion == 3){
                        vector[pos].stat = ProyOBJ.Stat.OnHold;
                        break;
                    }else{
                        System.out.println("Introduce un valor adequado");
                        opcion = 0;
                    }
                }while(opcion == opcion);
                break;
        }

        public static int[] buscarContactosNombre(ProyOBJ[] Proyectos, String buscar) {

            // Vector donde guardaremos las posiciones encontradas
            int[] vpos = new int[maxCP];
            // Nº de posiciones encontradas
            int npos = 0;
    
            // Recorremos 'vector' buscando el texto 'buscar' en sus posiciones
            // Guardaremos en 'vpos' las posiciones que contengan 'buscar'
            for (int i = 0; i < numProy; i++) {
                if (vector[i].getname().toUpperCase().contains(buscar.toUpperCase())) {
                    vpos[npos] = i;
                    npos++;
                }
            }
    
            // Reducimod el tamaño de 'vpos' al mínimo y lo devolvemos
            vpos = Arrays.copyOf(vpos, npos);
    
            return vpos;
        }

        public static int[] buscarContactosEmail(Contactos[] vector, String buscar) {

            // Vector donde guardaremos las posiciones encontradas
            int[] vpos = new int[maxC];
            // Nº de posiciones encontradas
            int npos = 0;
    
            // Recorremos 'vector' buscando el texto 'buscar' en sus posiciones
            // Guardaremos en 'vpos' las posiciones que contengan 'buscar'
            for (int i = 0; i < numC; i++) {
                if (vector[i].getEmail().toUpperCase().contains(buscar.toUpperCase())) {
                    vpos[npos] = i;
                    npos++;
                }
            }
    
            // Reducimod el tamaño de 'vpos' al mínimo y lo devolvemos
            vpos = Arrays.copyOf(vpos, npos);
    
            return vpos;
        }
    
        public static int[] buscarContactosTelefono(Contactos[] vector, String buscar) {
    
            // Vector donde guardaremos las posiciones encontradas
            int[] vpos = new int[maxC];
            // Nº de posiciones encontradas
            int npos = 0;
    
            // Recorremos 'vector' buscando el texto 'buscar' en sus posiciones
            // Guardaremos en 'vpos' las posiciones que contengan 'buscar'
            for (int i = 0; i < numC; i++) {
                if (vector[i].getNumeroTel().toUpperCase().contains(buscar.toUpperCase())) {
                    vpos[npos] = i;
                    npos++;
                }
            }
    
            // Reducimod el tamaño de 'vpos' al mínimo y lo devolvemos
            vpos = Arrays.copyOf(vpos, npos);
    
            return vpos;
        }
            
        



    }

}