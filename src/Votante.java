public class Votante {
    private int ID;
    private String Nombre;
    private boolean votoEst= false;

    public Votante(int ID, String Nombre) {
        this.ID = ID;
        this.Nombre = Nombre;
    }
    public void marcarComoVotado(){
        votoEst = true;
    }
    public boolean getVoto(){
        return votoEst;
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


}
