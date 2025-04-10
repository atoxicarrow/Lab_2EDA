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
    int getCandidatoID() { return candidatoID; }
    void setCandidatoID(int candidatoID) {
        this.candidatoID = candidatoID;
    }
    int getID() {
        return ID;
    }
    void setID(int ID) {
        this.ID = ID;
    }

    int getVotanteID() {
        return votanteID;
    }
    void setVotanteID(int votanteID) {
        this.votanteID = votanteID;
    }

    String getTimestap() {
        return timestamp;
    }
    void setTimestap(String timestap) {
        this.timestamp = timestap;
    }


}
