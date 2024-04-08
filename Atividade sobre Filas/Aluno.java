public class Aluno implements Pessoa{
    private int nroMatricula;
    private String nomeAluno;
    private String curso;

    public Aluno(int nroMatricula, String nomeAluno, String curso) {
        this.nroMatricula = nroMatricula;
        this.nomeAluno = nomeAluno;
        this.curso = curso;
    }

    @Override
    public TipoPessoa getTipo(){
        return TipoPessoa.ALUNO;
    }

    @Override
    public String toString(){
        return "Aluno{"+
                "matricula: " + nroMatricula +
                ", nome: '" + nomeAluno + '\'' +
                ", curso: '" + curso + '\'' +
                '}';
    }


    
}
