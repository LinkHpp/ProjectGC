import java.util.Scanner;

public class FuncionMeth {
   public static int maxFunc = 100;

   static int numFunc = 0;
   static FuncOBJ[] Funciones = new FuncOBJ[maxFunc];

   // Metodos

   public static void agregarFuncion(String name, String num, String lang) {
      if (numFunc < maxFunc) {
         Funciones[numFunc] = new FuncOBJ(name, num, lang);
         numFunc++;
      } else {
         System.out.println("ERROR: No se puede agregar función. Lista llena.");
      }
   }

   public static void eliminarFuncion(int pos) {
      if (pos >= 0 && pos < numFunc) {
         eliminarPosDeVector(Funciones, pos);
         numFunc--;
      } else {
         System.out.println("ERROR: No se puede eliminar función. Posición fuera de rango.");
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
      System.out.println("1. Nombre " +
                           "2. Lenguaje " + "3. Estado");
      int opcion = in.nextInt();
      in.nextLine();

      switch (opcion) {
         case 1:
            System.out.println("Introduce el nuevo nombre de la funcion");
            vector[pos].setNameFunc(in.nextLine());
            break;
         case 2:
            System.out.println("Introduce el nuevo Lenguaje de la funcion");
            vector[pos].setLanguage(in.nextLine());
            break;
         case 3:

            do {
               System.out.println("1 -> Not Finished");
               System.out.println("2 -> Paused");
               System.out.println("3 -> Incomplete");
               System.out.println("4 -> Complete");
               System.out.println("Introduce un numero: ");
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

   public static int buscarLang(FuncOBJ[] vector, String buscar) {

      int npos = 0;

      for (int i = 0; i < numFunc; i++) {
         if (vector[i].getLanguage().toUpperCase().contains(buscar.toUpperCase())) {
            npos = i;
         }
      }
      return npos;
   }


   public static void Listar(){
      System.out.println();
      if(numFunc == 0){
         System.out.println("No hay funciones en este proyecto");
      }else{
         for (int i = 0; i < FuncionMeth.numFunc; i++) {
            FuncOBJ.Listinfo(i);
            System.out.println("");
        }
      }
      
  }

}