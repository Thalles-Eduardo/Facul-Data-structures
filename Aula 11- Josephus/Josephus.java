import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

// Tive que fazer tudo em apenas uma classe, porque o vscode está com problema de compilação
public class Josephus {
    public static void main(String[] args) {
        class Pessoa {
            private String nome;
            private String telefone;
            private String endereco;
            private String cpf;
            private int numero;

            public Pessoa(String nome, String telefone, String endereco, String cpf, int numero) {
                this.nome = nome;
                this.telefone = telefone;
                this.endereco = endereco;
                this.cpf = cpf;
                this.numero = numero;
            }

            @Override
            public String toString() {
                return "Pessoa{" +
                        "nome='" + nome + '\'' +
                        ", telefone='" + telefone + '\'' +
                        ", endereco='" + endereco + '\'' +
                        ", cpf='" + cpf + '\'' +
                        ", numero=" + numero +
                        '}';
            }
        }

        LinkedList<Pessoa> pessoas = new LinkedList<>();

        
        for (int i = 1; i <= 20; i++) {
            pessoas.add(new Pessoa("Nome" + i, "Telefone" + i, "Endereco" + i, "CPF" + i, i));
        }

       
        Random random = new Random();
        int m = random.nextInt(20) + 1; 
        System.out.println("Valor de m: " + m);

        
        ListIterator<Pessoa> iterator = pessoas.listIterator();
        while (pessoas.size() > 1) {
            for (int i = 0; i < m; i++) {
                if (!iterator.hasNext()) {
                    iterator = pessoas.listIterator(); 
                }
                iterator.next();
            }
            iterator.remove(); 
        }

        System.out.println("Pessoa sobrevivente: " + pessoas.get(0));
    }
}
