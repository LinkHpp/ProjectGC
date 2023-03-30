public class ProyOBJ{

    //Attr

    String name;
    String ver;
    static FuncOBJ[] funciones = new FuncOBJ[FuncionMeth.maxFunc];

    public enum Stat {
        Unfinished, //0
        Finished, //1
        OnHold //2
;

    public boolean contains(String buscar) {
        return false;
    }

    }

    public FuncOBJ[] getFunciones() {
        return funciones;
    }

    public void setFunciones(FuncOBJ[] funciones) {
        ProyOBJ.funciones = funciones;
    }

    public Stat stat;

    public enum Type {
        Decomp, //Default, 0
        Disasm, //1
    }

    public Type type;

    //set/get
    public String getname(){

        return name;
    }

    public String getver(){
        
        return ver;
    }

    public void setname(String name){
        this.name = name;
    }

    public void setver(String ver){
        this.ver = ver;
    }

    public Stat getStat() {
        return stat;
    }

    public void setStat(Stat stat) {
        this.stat = stat;
    }

    //ctor


    public ProyOBJ(String Name, String Ver){
        name = Name;
        ver = Ver;
        stat = Stat.Unfinished;
        type = Type.Decomp;
    }


    //Methods
    public static void Listinfo(int num){
        
        if(ProyectoMeth.numProy == 0){
            System.out.println("No hay ningun Proyecto");
        }
        else{
            System.out.println("ID: " + num);
            System.out.println(ProyectoMeth.Proyectos[num].getname());
            System.out.println(ProyectoMeth.Proyectos[num].getver());
            System.out.println(ProyectoMeth.Proyectos[num].getFunciones());
            System.out.println(ProyectoMeth.Proyectos[num].getStat());
        }
        
    }


}