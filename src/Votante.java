public class Votante {
    private int ID;
    private String Nombre;
    private boolean votoStat= false;

    public Votante(int ID, String Nombre) {
        this.ID = ID;
        this.Nombre = Nombre;
    }


    // Setters y Getters
    public boolean getVoto(){
        return votoStat;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    // Metodos...
    public void marcarComoVotado(){
        votoStat = true;
    }
}
