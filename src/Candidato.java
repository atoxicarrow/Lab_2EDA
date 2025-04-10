import java.util.LinkedList;
import java.util.Queue;

public class Candidato {
    int idCandidato;
    String nombre;
    String partido;
    Queue<Voto> votosRecibidos;

    public Candidato(int idCandidato, String nombre, String partido){
        this.idCandidato = idCandidato;
        this.nombre = nombre;
        this.partido = partido;
        this.votosRecibidos = new LinkedList<>();
    }

    // Metodos_____
    public void agragarVoto(Voto Voto) {
        votosRecibidos.add(Voto);
    }

    public int getIdCandidato(){
        return idCandidato;
    }
    public String getNombre(){
        return nombre;
    }
    public String getPartido(){
        return partido;
    }
    public Queue<Voto> getVotosRecibidos(){
        return votosRecibidos;
    }
}
