public class Voto{
    private int ID;
    private int votanteID;
    private int candidatoID;
    private String timestap;
    //constructorsito
    public Voto(int ID, int VotanteID, int candidatoID, String timestap){
        this.ID= ID;
        this.votanteID = VotanteID;
        this.candidatoID = candidatoID;
        this.timestap = timestap;
    }

    //setters y getterssssd
    public int getCandidatoID() {
        return candidatoID;
    }
    public void setCandidatoID(int candidatoID) {
        this.candidatoID = candidatoID;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getVotanteID() {
        return votanteID;
    }
    public void setVotanteID(int votanteID) {
        this.votanteID = votanteID;
    }
    public String getTimestap() {
        return timestap;
    }
    public void setTimestap(String timestap) {
        this.timestap = timestap;
    }



}
