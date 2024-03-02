import java.util.Scanner;

public class Alg351 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomes[] = new String[5];

        for(int i = 0; i < nomes.length; i++){
            System.out.print("Digite um nome: ");
            String nome = scanner.nextLine();
            nomes[i] = nome;
        }

        System.out.print("Digite um numero de 1 a 5: ");
        int chamada = scanner.nextInt();

        System.out.println("Nome da posição" + chamada + ": " + nomes[chamada - 1]);
    }
}
