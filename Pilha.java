import PilhaVaziaExcecao; 

public interface Pilha{
    public int size();
    public Object top() throws PilhaVaziaExcecao;
    public Object pop() throws PilhaVaziaExcecao;
    public void push(Object o);
    public boolean isEmpty(); 
}