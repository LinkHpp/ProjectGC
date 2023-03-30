import java.util.Arrays;
import java.util.Scanner;

public class FuncionMeth {
   public static int maxFunc = 100;

   static int numFunc = 0;
   static FuncOBJ[] Funciones = new FuncOBJ[maxFunc];

   // Setters y Getters

   public static int getMaxFunc() {
      return maxFunc;
   }

   public static void setMaxFunc(int maxFunc) {
      FuncionMeth.maxFunc = maxFunc;
   }

   public static int getNumFunc() {
      return numFunc;
   }

   public static void setNumFunc(int numFunc) {
      FuncionMeth.numFunc = numFunc;
   }

   public static FuncOBJ[] getFunciones() {
      return Funciones;
   }

   public static void setFunciones(FuncOBJ[] funciones) {
      Funciones = funciones;
   }

   // Metodos

   public static void agregarProyecto(String name, String num, String lang) {
      if (numFunc < maxFunc) {
         Funciones[numFunc] = new FuncOBJ(name, num, lang);
         numFunc++;
      } else {
         System.out.println("ERROR: No se puede agregar contacto. Lista llena.");
      }
   }



   public static void eliminarProyecto(int pos) {
      if (pos >= 0 && pos < numFunc) {
         eliminarPosDeVector(Funciones, pos);
         numFunc--;
      } else {
         System.out.println("ERROR: No se puede eliminar contacto. Posición fuera de rango.");
      }
   }

   public static void eliminarPosDeVector(FuncOBJ[] vector, int pos) {
      for (int i = pos; i <= (numFunc - 1); i++) {
         vector[i] = vector[i + 1];
      }
   }

   public static void Modificar(FuncOBJ[] vector, int pos) {
      Scanner in = new Scanner(System.in);
      System.out.println("¿Que quieres modificar?");
      int opcion = in.nextInt();
      in.nextLine();

      switch (opcion) {
         case 1:
            vector[pos].setNameFunc(in.nextLine());
            break;
         case 2:
            opcion = in.nextInt();
            vector[pos].setLanguage(in.nextLine());
            break;
         case 3:

            do {
               opcion = in.nextInt();
               if (opcion == 1) {
                  vector[pos].status = FuncOBJ.Status.NOT_FINISHED;
                  break;
               } else if (opcion == 2) {
                  vector[pos].status = FuncOBJ.Status.PAUSED;
                  break;
               } else if (opcion == 3) {
                  vector[pos].status = FuncOBJ.Status.INCOMPLETE;
                  break;
               }else if (opcion == 4){
                  vector[pos].status = FuncOBJ.Status.COMPLETE;
                  break;
               }else {
                  System.out.println("Introduce un valor adequado");
                  opcion = 0;
               }
            } while (opcion == opcion);
            break;
      }

   }

   public static int buscarNombre(FuncOBJ proyectos[], String buscar) {

      int npos = 0;

      for (int i = 0; i < numFunc; i++) {
         if (proyectos[i].getNameFunc().toUpperCase().contains(buscar.toUpperCase())) {
            npos = i;
         }
      }
      
      return npos;
   }

   public static int buscarVersion(FuncOBJ[] vector, String buscar) {

      int npos = 0;

      for (int i = 0; i < numFunc; i++) {
         if (vector[i].getLanguage().toUpperCase().contains(buscar.toUpperCase())) {
            npos = i;
         }
      }
      return npos;
   }

   public static int buscarEstado(ProyOBJ[] vector, String buscar) {

      int npos = 0;

      for (int i = 0; i < numFunc; i++) {
         if (vector[i].getStat().contains(buscar)) {
            npos = i;
         }
      }

      return npos;
   }

}