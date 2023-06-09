import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o seu CPF: ");
        String cpf = scanner.next();

        System.out.println("\nDestinos:");
        System.out.println("1. São Paulo");
        System.out.println("2. Nova York");
        System.out.println("3. Berlim");

        System.out.print("Escolha o número do destino: ");
        int destinoEscolhido = scanner.nextInt();

        String destino;
        double valorPassagem;

        switch (destinoEscolhido) {
            case 1:
                destino = "São Paulo";
                valorPassagem = 250;
                break;
            case 2:
                destino = "Nova York";
                valorPassagem = 2400;
                break;
            case 3:
                destino = "Berlim";
                valorPassagem = 3800;
                break;
            default:
                System.out.println("Destino inválido. Saindo do programa.");
                return;
        }

        int numeroPoltrona = gerarNumeroPoltrona();

        System.out.println("\nRecibo de Viagem:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Destino: " + destino);
        System.out.println("Valor da passagem: $" + valorPassagem);
        System.out.println("Número da poltrona: " + numeroPoltrona);

        try {
            gerarArquivoRecibo(nome, idade, cpf, destino, valorPassagem, numeroPoltrona);
            System.out.println("\nArquivo de texto gerado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao gerar o arquivo de texto");
            e.printStackTrace();
        }
    }

    private static int gerarNumeroPoltrona() {
        Random random = new Random();
        return random.nextInt(20) + 1;
    }

    private static void gerarArquivoRecibo(String nome, int idade, String cpf, String destino,
            double valorPassagem, int numeroPoltrona) throws Exception {
        PrintWriter writer = new PrintWriter(new FileWriter("D://vs code//recibo_viagem.txt"));
        writer.println("Recibo de Viagem");
        writer.println("Nome: " + nome);
        writer.println("Idade: " + idade);
        writer.println("CPF: " + cpf);
        writer.println("Destino: " + destino);
        writer.println("Valor da passagem: $" + valorPassagem);
        writer.println("Número da poltrona: " + numeroPoltrona);
        writer.close();
    }
}
