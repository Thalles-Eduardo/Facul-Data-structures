import java.util.Scanner;

public class Alg358 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menorDezPorcento = 0;
        int entre10E20 = 0;
        int maiorDezPorcento = 0;

        for(int i = 1; i <= 3; i++){
            System.out.print("Digite o preço de compra do produto" + i + ": ");
            float precoCompra = scanner.nextFloat();

            System.out.print("Digite o preço de venda" + i + ": ");
            float precoVenda =  scanner.nextFloat();

            float lucro = (precoVenda * 100) / precoCompra;
            
            if(lucro < 110){
                menorDezPorcento++;
            }else if(110 <= lucro && 120 >= lucro){
                entre10E20++;
            }else{
                maiorDezPorcento++;
            }
        }
        System.out.println("Menor que 10%: " + menorDezPorcento);
        System.out.println("Entre 10 e 20%: " + entre10E20);
        System.out.println("Maior que 10%: " + maiorDezPorcento);
    }
}
