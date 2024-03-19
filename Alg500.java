import java.util.Arrays;
import java.util.Scanner;

public class Alg500 {
    Scanner input = new Scanner(System.in);
    private static int[] vetorA;
    private static int[] vetorB;

    public int[] dataVetorA(){
            vetorA = new int[5];
            System.out.println("\nEntrada do VETOR A\n");

            for(int i = 0; i < 5; i++){
                System.out.print("Digite um número: ");
                vetorA[i] = input.nextInt();
                input.nextLine();
            }
            
            return vetorA;
    }

    public int[] dataVetorB(){
        vetorB = new int[5];
        System.out.println("\nEntrada do VETOR B\n");

        for(int i = 0; i < 5; i++){
            System.out.print("Digite um número: ");
            vetorB[i] = input.nextInt();
            input.nextLine();
        }
        
        return vetorB;
    }

    public void printVetors(int[] vetorA, int[] vetorB){
        System.out.println("\nVETOR A: " + Arrays.toString(vetorA));
        System.out.println("VETOR B: " + Arrays.toString(vetorB) + "\n");
    }


    public int[] sumVetors(int[] vetorA, int[] vetorB){
        int[] sum = new int[5];

        for(int i = 0; i < 5; i++){
            sum[i] += vetorA[i] + vetorB[i];
        }
        return sum;
    }


    public int[] lessVetors(int[] vetorA, int[] vetorB){
        int[] less = new int[5];

        for(int i = 0; i < 5; i++){
            less[i] += vetorA[i] - vetorB[i];
        }

        return less;
    }

    public static void main(String[] args) {
        Alg500 alg500 = new Alg500();
        Scanner input = new Scanner(System.in);
        boolean aux = true;

        while (aux) {
            System.out.println("\n1. Dados do VETOR A");
            System.out.println("2. Dados do VETOR B");
            System.out.println("3. Imprimir VETORES");
            System.out.println("4. Somar VETORES");
            System.out.println("5. Subtrai VETORES");
            System.out.println("6. Sair do programa.");
            System.out.print("OPÇÂO: ");
            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    alg500.dataVetorA();
                    break;
            
                case 2:
                    alg500.dataVetorB();
                    break;
                
                case 3:
                    if(vetorA == null && vetorB == null){
                        System.out.println("\nEscolha primeiro as opção 1 e 2\n");
                    } else{
                        alg500.printVetors(vetorA, vetorB); 
                    }
                    break;

                case 4:
                    System.out.println("\nSoma dos VETORES A e B: "  + Arrays.toString(alg500.sumVetors(vetorA, vetorB)) + "\n");
                    break;
                
                case 5:
                    System.out.println("\nSubtração dos VETORES A e B: "  + Arrays.toString(alg500.lessVetors(vetorA, vetorB)) + "zn");
                    break;

                case 6:
                    System.out.println("\nEncerrando programa...");
                    aux = false;    
                    break;
            }

        }
    }
}
