public class Main {
    public static void main(String[] args) {
        Fila<Pessoa> fila = new Fila<>();

        Aluno aluno = new Aluno(364820362, "Pedro", "Ciência da Computação");
        Professor professor = new Professor(128472384, "Fernando", "Doutor");
        Terceirizado terceirizado = new Terceirizado(87623472, "Carlos");

        fila.add(aluno);
        fila.add(professor);
        fila.add(terceirizado);

        // printando e removendo em seguida
        while (!fila.estaVazia()) {
            Pessoa pessoa = fila.remover();
            System.out.println("Pessoa(s) na fila: " + pessoa);
        }
    }
}
