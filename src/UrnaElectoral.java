import java.time.LocalTime;
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
            System.out.println("Votante ya votó.");
        }else {
            String timestamp = LocalTime.now().toString();
            Voto nVoto = new Voto(idCounter++, votanteID.getID(), candidatoID, timestamp);

            boolean logrado = false;

            for(Candidato candidato : listaCandidatos){
             if(candidatoID == candidato.getIdCandidato()){
                 candidato.agregarVoto(nVoto);
                 logrado=true;
                 System.out.print("Voto realizado.");
                 break;
             }
            }
            if(!logrado){
                System.out.print("Candidato no encontrado.");
                return;
            }
            HistorialVotos.push(nVoto);
            votanteID.marcarComoVotado();
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


        while(!candidatoID.getVotosRecibidos().isEmpty()){
            Voto aux = candidatoID.getVotosRecibidos().poll();//POLL GUARDA Y BORRA AL PRIMER OBJETO EN LA COLA

            if(aux.getID() == idVoto) {
                VotosReportados.add(aux);
                System.out.print("Reporte realizado con exito.");
                logrado = true;
            }else{
                pilaAux.add(aux);
            }
        }

        if(!logrado){
            System.out.print("Voto" + idVoto + " no encontrado. ");
        }
        while(!pilaAux.isEmpty()){
            candidatoID.setVotosRecibidos(pilaAux);
        }

    }

    public void obtenerResultados(){
    }


}
