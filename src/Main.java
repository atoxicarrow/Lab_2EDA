import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int comando;
        String nombre;

        System.out.print("1. Registrar Candidato:");
        comando = scanner.nextInt();
        switch(comando){
            case 1:
                System.out.println("Ingrese nombre: ");
                nombre = sc.nextLine();
                System.out.println("Ingrese partido: ");
                String partido = sc.nextLine();
                System.out.println("Ingrese id del Candidato: ");
                int idCandidato = sc.nextInt();
                Candidato candidato = new Candidato(idCandidato, nombre, partido);

                break;
            case 2:
                System.out.println("Comando 2: ");
                break;
            case 3:
                System.out.println("Comando 3: ");
                break;
            case 4:
                System.out.println("Comando 4: ");
                break;

        }

    }
}