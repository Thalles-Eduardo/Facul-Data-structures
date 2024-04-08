public class Terceirizado implements Pessoa{
    private int nroSiape;
    private String nomeTerceirizado;

    public Terceirizado(int nroSiape, String nomeTerceirizado) {
        this.nroSiape = nroSiape;
        this.nomeTerceirizado = nomeTerceirizado;
    }


    @Override
    public TipoPessoa getTipo(){
        return TipoPessoa.TERCEIRIZADO;
    }

    @Override
    public String toString(){
        return "Terceirizado{"+
                "Número Siape: " + nroSiape +
                ", nome: '" + nomeTerceirizado + '\'' +
                '}';
    }

    
}
