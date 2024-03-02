import java.util.Scanner;

public class Alg346 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String phraseString = scanner.nextLine();

        // muda todos os "espaço(s)" por uma string vazia
        int length = phraseString.replaceAll("\\s+", "").length(); 
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n1. Tamanho da frase;");
            System.out.println("2. Mostrar os dois primeiros e as duas ultimas palavras;");
            System.out.println("3. Mostrar a frase espelhada;");
            System.out.println("4. Encerrar o programa.");
        
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nTamanho da frase desconsiderando os espaço(s): " + length);
                    break;
    
                case 2:
                    if(length >= 4){
                        String doisPrimeiros = phraseString.substring(0, 2);
                        String doisUltimos = phraseString.substring(phraseString.length() - 2);

                        System.out.println("\nDuas primeiras letras: " + doisPrimeiros);
                        System.out.println("Duas ultimas letras: " + doisUltimos);
                    }else{
                        System.out.println("\nA frase deve conter no minimo 4 palavras!");
                    }
                    break;
    
                case 3:
                    StringBuilder sBuilder = new StringBuilder();
                    sBuilder.append(phraseString);
                    System.out.println("\nFrase invertida: " + sBuilder.reverse());
                    break;
    
                case 4:
                    System.out.println("\nEncerrando programa...");
                    opcao = 4;
                    break;
            }    
        }
        
    }
}
