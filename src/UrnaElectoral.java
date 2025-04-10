import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UrnaElectoral {
    //atributos!!!!!
    private LinkedList<Candidato> listaCandidatos;
    private Stack<Voto> HistorialVotos;
    private Queue<Voto> VotosReportados;
    int idCounter;

    //CONSTRUCTOR ↓
    public UrnaElectoral(LinkedList<Candidato> listaCandidatos){
        this.listaCandidatos = listaCandidatos;
        this.HistorialVotos = new Stack<>();
        this.VotosReportados = new LinkedList<>();
        this.idCounter = 0;
    }

    //Metodos...
    public boolean verificarVotante(Votante votanteID){
        return votanteID.getVoto();
    }

    public void registrarVoto(Votante votanteID, int candidatoID) {
        if (verificarVotante(votanteID)) {
            System.out.println("Votante ya votó");
        }else {
            String timestamp = java.time.LocalTime.now().toString();;
            Voto nVoto = new Voto(idCounter++, votanteID.getID(), candidatoID, timestamp);


            for(Candidato candidato : listaCandidatos){

            }

            for(int i=0 ; i<listaCandidatos.size(); i++){
                Candidato candidato = new Candidato();
                if(candidatoID == candidato.getID){
                    candidatos
                }
            }

            votanteID.marcarComoVotado();
        }
    }

    public void reportarVoto(Candidato candidatoID, int idVoto){
    }

    public void obtenerResultados(){
    }


}
