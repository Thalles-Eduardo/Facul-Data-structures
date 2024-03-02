import java.util.Scanner;

/**
 * Alg348
 */
public class Alg348 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunos = new String[5];
        int[][] notas = new int[5][2];

        for(int i = 0; i < 5; i++){
            System.out.print("Digite o nome de um aluno: ");
            alunos[i] = scanner.nextLine();

            System.out.print("Digite a primeira nota para o aluno " + alunos[i] + ": ");
            notas[i][0] = scanner.nextInt();
            
            System.out.print("Digite a segunda nota para o aluno " + alunos[i] + ": ");
            notas[i][1] = scanner.nextInt();

            scanner.nextLine();

            // Não tem por que guarda a médias em um vector, já que não irei fazer nada com elas, apenas printar
            float media = (float) (notas[i][0] + notas[i][1]) / 2;
            System.out.println("Media do " + alunos[i] + ": " + media);
            System.out.println();
        }
        scanner.close();    
    }
}