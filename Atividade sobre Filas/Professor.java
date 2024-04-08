public class Professor implements Pessoa{
    private int nroSiape;
    private String nomeProfessor;
    private String titulo;

    
    public Professor(int nroSiape, String nomeProfessor, String titulo) {
        this.nroSiape = nroSiape;
        this.nomeProfessor = nomeProfessor;
        this.titulo = titulo;
    }

    @Override
    public TipoPessoa getTipo(){
        return TipoPessoa.PROFESSOR;
    }

    @Override
    public String toString(){
        return "Professor{"+
                "Número Siape: " + nroSiape +
                ", nome: '" + nomeProfessor + '\'' +
                ", titulo: '" + titulo + '\'' +
                '}';
    }
    
}
