import java.time.LocalTime;
import java.util.LinkedList;
import java.util.Map;
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
            System.out.println("Votante ya votó.");
        }else {
            String timestamp = LocalTime.now().toString();
            Voto nVoto = new Voto(idCounter++, votanteID.getID(), candidatoID, timestamp);

            boolean logrado = false;

            for(Candidato candidato : listaCandidatos){
                 if(candidatoID == candidato.getIdCandidato()){
                     candidato.agregarVoto(nVoto);
                     logrado=true;
                     System.out.println("Voto realizado a "+candidato.getNombre()+". ID del voto: " + (nVoto.getID() + 1) );
                     break;
                 }
            }
            if(!logrado){
                System.out.print("Candidato no encontrado.");
            }else {
                HistorialVotos.push(nVoto);
                votanteID.marcarComoVotado();
            }
        }
    }

    public void reportarVoto(Candidato candidatoID, int idVoto) {
        boolean logrado = false;
        for(Voto voto : VotosReportados){
            if(voto.getID() == idVoto){
                System.out.print(" Voto ya fue reportado.");
                return;
            }
        }

        Queue<Voto> pilaAux = new LinkedList<>();


        while(!candidatoID.getVotosRecibidos().isEmpty()) {
            Voto aux = candidatoID.getVotosRecibidos().poll(); // saca y borra

            if(aux.getID() == idVoto) {
                VotosReportados.add(aux);
                System.out.print("Reporte realizado con éxito.");
                logrado = true;
            } else {
                pilaAux.add(aux);
            }
        }

        if(!logrado){
            System.out.print("Voto " + idVoto + " no encontrado. ");
        }

        candidatoID.setVotosRecibidos(pilaAux);
    }

    public void obtenerResultados(){
        System.out.println("Resultados: ");
        for(Candidato candidato : listaCandidatos){
            String nombre= candidato.getNombre();
            int cantidadVotos = candidato.getVotosRecibidos().size();

            System.out.println( "| "+nombre +": " + cantidadVotos + " Votos " );
        }

    }


}
