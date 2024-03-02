import java.util.Scanner;

public class Alg360 {
    public static String determinarSigno(int dia, int mes) {
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Áries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Gêmeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Câncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leão";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpião";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitário";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricórnio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Aquário";
        } else {
            return "Peixes";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diaMes;

        do {
            System.out.print("Digite a data de nascimento (ddmm), ou 9999 para sair: ");
            diaMes = scanner.nextInt();

            if (diaMes != 9999) {
                int dia = diaMes / 100;
                int mes = diaMes % 100;

                String signo = determinarSigno(dia, mes);
                System.out.println("Seu signo é: " + signo);
            }
        } while (diaMes != 9999);

        System.out.println("Encerrando o programa...");
    }

    
}
