import java.io.PrintWriter;
import java.util.Scanner;

public class ItensCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] produtos = new String[10];
        double[] valorProdutos = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextLine();

            System.out.print("Digite o valor do produto " + produtos[i] + ": ");
            valorProdutos[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        try {
            PrintWriter gravador = new PrintWriter("D://vs code//itens_supermercado.txt");
            for (int i = 0; i < 10; i++) {
                gravador.println("Produto: " + produtos[i] + ", Valor do produto: " + valorProdutos[i]);
            }
            gravador.close();

            System.out.println("As informações dos produtos foram salvas no arquivo 'itens_supermercado.txt'.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao salvar o arquivo.");
            e.printStackTrace();
        }
    }
}
