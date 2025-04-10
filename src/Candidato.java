import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Candidato {
    int idCandidato;
    String nombre;
    String partido;
    Queue<Voto> votosRecibidos;
    Scanner sc = new Scanner(System.in);

    // Constructor__
    public Candidato(){
        System.out.print("Ingrese el id: ");
        this.idCandidato = sc.nextInt();
        System.out.print("Ingrese el nombre del candidato: ");
        this.nombre = sc.nextLine();
        System.out.print("Ingrese el partido del candidato: ");
        this.partido = sc.nextLine();
    }

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


}
