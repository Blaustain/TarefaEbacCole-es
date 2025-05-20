import java.util.ArrayList;
import java.util.Scanner;

public class GrupoSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> grupoMasculino = new ArrayList<>();
        ArrayList<String> grupoFeminino = new ArrayList<>();

        System.out.println("Digite os dados no formato Nome-Sexo (ex: Ana-F, Pedro-M). Digite 'fim' para encerrar:");

        while (true) {
            String entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }

            String[] partes = entrada.split("-");

            if (partes.length != 2) {
                System.out.println("Formato inválido. Use Nome-Sexo.");
                continue;
            }

            String nome = partes[0].trim();
            String sexo = partes[1].trim().toUpperCase();

            if (sexo.equals("M")) {
                grupoMasculino.add(nome);
            } else if (sexo.equals("F")) {
                grupoFeminino.add(nome);
            } else {
                System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
            }
        }

        scanner.close();

        System.out.println("\nGrupo Masculino:");
        for (String nome : grupoMasculino) {
            System.out.println("- " + nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : grupoFeminino) {
            System.out.println("- " + nome);
        }
    }
}
