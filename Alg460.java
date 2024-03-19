import java.util.Scanner;

/**
 * Alg460
 */
public class Alg460 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte aux = 0;

        while (aux < 3) {
            System.out.print("Digite um número: ");
            double number = input.nextDouble();
            System.out.println("Dobro: " + (number * 2) + "\n");
            aux++;
        }
        
    }
}