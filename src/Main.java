import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Candidato> listaCandidatos = new LinkedList<>();
        ArrayList<Votante> listaVotantes = new ArrayList<>();
        UrnaElectoral urna = new UrnaElectoral(listaCandidatos);

        int op;
        boolean menu = true;

        do {
            System.out.println(" MENU ");
            System.out.println(" 1. Registrar candidato.");
            System.out.println("2. Registrar votante.");
            System.out.println("3. Votar.");
            System.out.println("4. Reportar votante. ");
            System.out.println("5. Ver resultados. ");
            System.out.println("6. Salir.");
            System.out.print("Elige una opción: ");
            op = sc.nextInt();

            sc.nextLine();

            switch (op) {
                case 1:{
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese partido: ");
                    String partido = sc.nextLine();

                    System.out.print("Ingrese id del Candidato: ");
                    int idCandidato = sc.nextInt();

                    Candidato candidato = new Candidato(idCandidato, nombre, partido);

                    listaCandidatos.add(candidato);
                    break;
                }
                case 2:{
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese id: ");
                    int id = sc.nextInt();
                    Votante votante = new Votante(id, nombre);


                    listaVotantes.add(votante);
                    break;
                }
                case 3:{
                    System.out.print("ID del votante: ");
                    int votanteID = sc.nextInt();
                    System.out.print("ID del candidato: ");
                    int candidatoID = sc.nextInt();
                    sc.nextLine();

                    Votante votante_ = null;

                    for(Votante votante : listaVotantes){
                        if(votante.getID() == votanteID){
                            votante_ = votante;
                        }
                    }

                    if (votante_ == null) {
                        System.out.println("Votante no encontrado.");
                        break;
                    }

                    urna.registrarVoto(votante_, candidatoID);
                    break;
                }
                case 4:{
                    System.out.print("Ingrese id del candidato: ");
                    int id = sc.nextInt();
                    System.out.print("Ingrese id del voto: ");
                    int idVoto = sc.nextInt() - 1 ;

                        Candidato candidato_ = null;
                    for(Candidato candidato : listaCandidatos){
                        if(candidato.getIdCandidato() == id){
                            candidato_ = candidato;
                        }
                    }

                    if(candidato_ == null){
                        System.out.println("El candidato no existe");
                        break;
                    }
                    urna.reportarVoto(candidato_, idVoto);

                    break;
                }
                case 5:{
                    urna.obtenerResultados();
                    break;
                }
                case 6: {
                    menu = false;
                    break;
                }
            }

        } while (menu);
    }
}
