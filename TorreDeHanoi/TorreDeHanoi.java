public class TorreDeHanoi {
    private static long movimento = 0;
    
    public static void resolverHanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            movimento++;
            return;
        }
        resolverHanoi(n - 1, origem, auxiliar, destino);
        movimento++;
        resolverHanoi(n - 1, auxiliar, destino, origem);
    }

    public static void main(String[] args) {
        System.out.println("Movendo os discos...");
        int n = 41;

        long inicio = System.currentTimeMillis();
        
        resolverHanoi(n, 'O', 'D', 'A');
        
        long fim = System.currentTimeMillis();
        
        long duracao = fim - inicio;
        
        long horas = (duracao / 3600000) % 24;
        long minutos = (duracao / 60000) % 60;
        long segundos = (duracao / 1000) % 60;
        long milisegundos = duracao; 
        
        
        System.out.println("Quantidade de movimentos: " + movimento);
        System.out.println("Tempo de execucao -> " + horas + ":" + minutos + ":" + segundos + ":" + milisegundos);
    }
    
    
}
