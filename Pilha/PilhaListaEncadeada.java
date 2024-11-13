public class PilhaListaEncadeada {
    private No inicio;
    private int tam; 

    public PilhaListaEncadeada() {
        this.inicio = null;
        this.tam = 0; 
    }

    public void push(Object elemento) {
        No NoNovo = new No(elemento);
        if(inicio == null) {
            inicio = NovoNo;
        }
        else{
            No temporario = inicio; 
            inicio = NovoNo;
            inicio.prox = temporario;
        }
        tam++;
    }

    public Object pop() {
        if(isEmpty()) {
            throw new PilhaVaziaExcecao("essa pilha ta vazia hein!"); 
        }
        else{
            No temporario = inicio; 
            inicio = inicio.prox;
            tam--; 
            return temporario; 
        }
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public int size() {
        return tam; 
    }

    public Object top() {
        if(isEmpty()) {
            throw new PilhaVaziaExcecao("essa pilha tá vazia hein!");
        }
        else{
            return inicio.elemento; 
        }
    }
}