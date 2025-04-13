import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Candidato> listaCandidatos = new LinkedList<>();
        ArrayList<Votante> listaVotantes = new ArrayList<>();
        UrnaElectoral urna = new UrnaElectoral(listaCandidatos);

        while (true) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Registrar candidato");
            System.out.println("2. Registrar votante");
            System.out.println("3. Emitir voto");
            System.out.println("4. Ver resultados");
            System.out.println("5. Reportar voto");
            System.out.println("0. Salir");
            System.out.print("Ingrese opción: ");

            int comando = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (comando) {
                case 1:
                    System.out.print("Nombre del candidato: ");
                    String nombreCandidato = scanner.nextLine();
                    System.out.print("Partido: ");
                    String partido = scanner.nextLine();
                    System.out.print("ID del candidato: ");
                    int idCandidato = scanner.nextInt();
                    scanner.nextLine(); // limpiar buffer

                    Candidato candidato = new Candidato(idCandidato, nombreCandidato, partido);
                    listaCandidatos.add(candidato);
                    System.out.println("Candidato registrado con éxito.");
                    break;

                case 2:
                    System.out.print("Nombre del votante: ");
                    String nombreVotante = scanner.nextLine();
                    System.out.print("ID del votante: ");
                    int idVotante = scanner.nextInt();
                    scanner.nextLine();

                    Votante votante = new Votante(idVotante, nombreVotante);
                    listaVotantes.add(votante);
                    System.out.println("Votante registrado con éxito.");
                    break;

                case 3:
                    System.out.print("ID del votante: ");
                    int vID = scanner.nextInt();
                    scanner.nextLine();
                    Votante persona = buscarVotante(listaVotantes, vID);
                    if (persona == null) {
                        System.out.println("Votante no encontrado.");
                        break;
                    }

                    System.out.print("ID del candidato a votar: ");
                    int cID = scanner.nextInt();
                    scanner.nextLine();
                    urna.registrarVoto(persona, cID);
                    break;

                case 4:
                    urna.obtenerResultados();
                    break;

                case 5:
                    System.out.print("ID del candidato: ");
                    int cid = scanner.nextInt();
                    scanner.nextLine();
                    Candidato cand = buscarCandidato(listaCandidatos, cid);
                    if (cand == null) {
                        System.out.println("Candidato no encontrado.");
                        break;
                    }
                    System.out.print("ID del voto a reportar: ");
                    int votoID = scanner.nextInt();
                    scanner.nextLine();
                    urna.reportarVoto(cand, votoID);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    return;

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    // Métodos de búsqueda auxiliares
    public static Votante buscarVotante(ArrayList<Votante> lista, int id) {
        for (Votante v : lista) {
            if (v.getID() == id) return v;
        }
        return null;
    }

    public static Candidato buscarCandidato(LinkedList<Candidato> lista, int id) {
        for (Candidato c : lista) {
            if (c.getIdCandidato() == id) return c;
        }
        return null;
    }
}
