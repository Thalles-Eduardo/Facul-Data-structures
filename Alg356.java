import java.util.Scanner;

public class Alg356 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes =  new String[15];
        double[] notasPr1 = new double[15]; 
        double[] notasPr2 = new double[15];
        double[] medias = new double[15];
        String[] situacoes = new String[15];
        
        for(int i = 0; i < 3; i++){
            System.out.print("Digite o nome do aluno " + (i + 1) + ":");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a nota da PR1 do aluno " + nomes[i] + ":");
            notasPr1[i] = scanner.nextDouble();
            
            System.out.print("Digite a nota da PR2 do aluno " + nomes[i] + ":");
            notasPr2[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        for(int i = 0; i < 15; i++){
            medias[i] = (notasPr1[i] = notasPr1[i]) / 2;
            situacoes[i] = medias[i] >= 6.0 ? "AP" : "RP";
        }

        System.out.println("Nome\t\tPR1\tPR2\tMédia\tSituação");
        for(int i = 0; i < 15; i++){
            System.out.printf("%s\t%.1f\t%.1f\t%.1f\t%s\n", nomes[i], notasPr1[i], notasPr2[i], medias[i], situacoes[i]);
        }
    }
}
