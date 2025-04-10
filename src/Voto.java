public class Voto{
    private int ID;
    private int votanteID;
    private int candidatoID;
    private String timestamp;

    //constructorsito
    public Voto(int ID, int VotanteID, int candidatoID, String timestamp){
        this.ID= ID;
        this.votanteID = VotanteID;
        this.candidatoID = candidatoID;
        this.timestamp = timestamp;
    }

    //setters y getterssssd
    public int getCandidatoID() { return candidatoID; }
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
        return timestamp;
    }
    public void setTimestap(String timestap) {
        this.timestamp = timestap;
    }


}
