public class ProyOBJ{

    //Attr

    String name;
    int ver;
    FuncOBJ[] funciones = new FuncOBJ[FuncionMeth.maxFunc];

    public enum Stat {
        Unfinished, //0
        Finished, //1
        OnHold, //2
    }

    public FuncOBJ[] getFunciones() {
        return funciones;
    }

    public void setFunciones(FuncOBJ[] funciones) {
        this.funciones = funciones;
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

    public int getver(){
        
        return ver;
    }

    public void setname(String name){
        this.name = name;
    }

    public void setver(int ver){
        this.ver = ver;
    }

    public Stat getStat() {
        return stat;
    }

    public void setStat(Stat stat) {
        this.stat = stat;
    }

    //ctor


    public ProyOBJ(String Name, int Ver){
        name = Name;
        ver = Ver;
        stat = Stat.Unfinished;
        type = Type.Decomp;
    }


    //Methods
    /*public void Listinfo(FuncOBJ Funciones, int num){
        System.out.println(Funciones[num].getname());
        System.out.println(getver());
        System.out.println(getFunciones());
        System.out.println(getStat());
    }*/

}