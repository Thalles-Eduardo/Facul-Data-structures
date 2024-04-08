import java.util.LinkedList;
import java.util.Queue;

public class Fila<T extends Pessoa>{
    private Queue<T> fila;

    public Fila(){
        this.fila = new LinkedList<>();
    }

    public void add(T pessoa){
        fila.add(pessoa);
    }

    public T remover(){
        if(fila.isEmpty()){
            return null;
        }

        return fila.poll();
    }

    public T primeiroDaFila(){
        if(fila.isEmpty()){
            return null;
        }
        return fila.element();
    }

    public boolean estaVazia(){
        return fila.isEmpty();
    }

    public int tamanho(){
        return fila.size();
    }
}
