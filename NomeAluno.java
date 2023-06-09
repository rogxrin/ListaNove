import java.io.PrintWriter;
import java.util.Scanner;

public class NomeAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] notasFinais = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a nota final do aluno " + nomes[i] + ": ");
            notasFinais[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        try (PrintWriter gravador = new PrintWriter("D://vs code//alunos_universidade.txt")) {
            for (int i = 0; i < 5; i++) {
                gravador.println("Nome: " + nomes[i] + ", Nota Final: " + notasFinais[i]);
            }

            System.out.println("As informações dos alunos foram salvas ");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao salvar o arquivo.");
            e.printStackTrace();
        }
    }
}
