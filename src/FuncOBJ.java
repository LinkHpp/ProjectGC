/*
 *@author Hermes Pérez Parrondo
 */

public class FuncOBJ {

    // Atributos

    public enum Status {
        NOT_FINISHED, PAUSED, INCOMPLETE, COMPLETE
    }

    public Status status;

    String NameFunc;
    String Proyect;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // Constructor

    public FuncOBJ(String nameFunc, String proyect, String language, Status status) {
        NameFunc = nameFunc;
        Proyect = proyect;
        Language = language;
        status = Status.NOT_FINISHED;
    }

}