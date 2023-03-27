
public class FuncOBJ {

    // Atributos

    public enum Status {
        Not_Finished, Paused, Incomplete, Complete
    }

    String NameFunc;
    String Proyect = ProyOBJ.getname();
    String Language;

    // Getters y Setters

    public String getNameFunc() {
        return NameFunc;
    }

    public void setNameFunc(String NameFunc) {
        this.NameFunc = NameFunc;
    }

    public String getProyect() {
        return Proyect;
    }

    public void setProyect(String proyect) {
        this.Proyect = proyect;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    // Constructor

    public FuncOBJ(String nameFunc, String proyect, String language) {
        NameFunc = nameFunc;
        Proyect = proyect;
        Language = language;
    }

}