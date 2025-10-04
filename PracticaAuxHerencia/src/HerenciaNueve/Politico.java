package HerenciaNueve;

public class Politico {
    protected String profesion;
    protected int añosExp;

    public Politico() {
        this.profesion = "Desconocida";
        this.añosExp = 0;
    }

    public Politico(String profesion, int añosExp) {
        this.profesion = profesion;
        this.añosExp = añosExp;
    }

    public void mostrar() {
        System.out.println("Profesión: " + profesion);
        System.out.println("Años de experiencia: " + añosExp);
    }
}

