public class PilhaListaEncadeada {
    private No inicio;
    private int tam; 

    private class No {
        Object elemento;
        No prox;

        public No(Object elemento) {
            this.elemento = elemento;
            this.prox = null;
        }
    }

    public PilhaListaEncadeada() {
        this.inicio = null;
        this.tam = 0; 
    }

    public void push(Object elemento) {
        No novo = new No(elemento);
        if(inicio == null) {
            inicio = novo;
        }

        else{
            novo.prox = inicio;
            inicio = novo; 
        }
        tam++;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new PilhaVaziaExcecao("essa pilha ta vazia hein!");
        }
        No temporario = inicio;
        inicio = inicio.prox;  
        tam--;
        return temporario.elemento;  
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

    public void imprimirLista() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.elemento + " ");
            atual = atual.prox;
        }
        System.out.println();
    }
}