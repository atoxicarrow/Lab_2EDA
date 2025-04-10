import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UrnaElectoral {
    private LinkedList<Candidato> listaCandidatos;
    private Stack<Voto> HistorialVotos;
    private Queue<Voto> VotosReportados;
    int idCounter;



    public UrnaElectoral(LinkedList){
        this.listaCandidatos = new LinkedList<>();
        this.HistorialVotos = new LinkedList<>();
        this.VotosReportados = new LinkedList<>();
        this.idCounter = 0;

    }
}
