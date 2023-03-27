public class ProyOBJ{

    //Attr

    String name;
    int ver;

    public enum Stat {
        Unfinished, //0
        Finished, //1
        OnHold, //2
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

    //ctor

    public ProyOBJ(String Name, int Ver){
        name = Name;
        ver = Ver;
        stat = Stat.Unfinished;
        type = Type.Decomp;
    }

}