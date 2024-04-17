import java.util.Stack;


public class Pilha {

    public static String inverteString(String frase) {
        Stack<Character> pilha = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char character : frase.toCharArray()) {
            if (character != ' ') {
                pilha.push(character);
            } else {
                while (!pilha.isEmpty()) {
                    sb.append(pilha.pop());
                }
                sb.append(' ');
            }
        }

        // Basicamente serve para a ultima palavra ser add
        while (!pilha.isEmpty()) {
            sb.append(pilha.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String frase = "ESTE EXERCICIO E MUITO FACIL";
        String fraseInvertida = inverteString(frase);
        System.out.println("Frase invertida: " + fraseInvertida);
    }
}
