public class FilaListaL {
    private int tamanho; 
    private No inicio; 
    private No fim;

    private class No {
        Object elemento;
        No prox;

        public No(Object elemento) {
            this.elemento = elemento;
            this.prox = null;
        }
    }

    public FilaListaL() {
        this.tamanho = 0; 
        this.inicio = null; 
        this.fim = null;
    }

    public void enqueue(Object elemento) {
        No novo = new No(elemento); 
        if(inicio == null) {
            inicio = novo; 
        } 
        
        else {
            fim.prox = novo;
            fim = novo; 
        }
        tamanho++; 
    }

    public Object dequeue() {
        if(isEmpty()) {
            throw new FilaVaziaExcecao("essa fila ta vazia hein");
        }
        No prov = inicio;
        inicio = inicio.prox;
        tamanho--; 
        return prov.elemento;
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public Object first() {
        if(isEmpty()) {
            throw new FilaVaziaExcecao("essa fila ta vazia hein"); 
        }
        return inicio.elemento; 
    }

    public void listar() {
        No atual = inicio; 
        while(atual != null) {
            System.out.println(atual.elemento + " "); 
            atual = atual.prox;
        }
        System.out.println(); 
    }
}