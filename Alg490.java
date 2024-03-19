import java.util.Arrays;
import java.util.Scanner;

public class Alg490 {

    public static void removerCaractereEspecifico(String[] palavras, char caractere) {
        for (int i = 0; i < palavras.length; i++) {
            StringBuilder novaPalavra = new StringBuilder();
            for (int j = 0; j < palavras[i].length(); j++) {
                if (palavras[i].charAt(j) == caractere) {
                    novaPalavra.append("*");
                } else {
                    novaPalavra.append(palavras[i].charAt(j));
                }
            }
            palavras[i] = novaPalavra.toString();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] palavras = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite palavra em letras minúsculas " + (i + 1) + ": ");
            palavras[i] = input.nextLine();
        }

        System.out.print("Digite a letra que deseja substituir: ");
        char caractere = input.next().charAt(0);

        removerCaractereEspecifico(palavras, caractere);

        System.out.println(Arrays.toString(palavras));
    }
}
