import java.util.Scanner;

public class Alg470 {
    public static boolean isCousin(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = input.nextInt();

        System.out.println(isCousin(number));
    }
}
