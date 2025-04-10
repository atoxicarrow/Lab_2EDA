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

    //setters
    public void setVotosRecibidos(Queue<Voto> cola){
        this.votosRecibidos = cola;
    }

    //getters
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


    // Metodos_____
    public void agregarVoto(Voto Voto) {
        votosRecibidos.add(Voto);
    }



    }
