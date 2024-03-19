import java.util.Scanner;

public class Alg480 {
    
    public static boolean isCapicua(int numero) {
        int numeroInvertido = 0;
        int aux = numero;
      
        while (aux > 0) {
          numeroInvertido = numeroInvertido * 10 + aux % 10;
          aux /= 10;
        }
        return numero == numeroInvertido;
      }
      

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = input.nextInt();

        System.out.println(isCapicua(number));
    }
}
