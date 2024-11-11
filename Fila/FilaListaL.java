public class FilaListaL {
    private int tamanho; 
    private No inicio; 
    private No fim;

    public FilaListaL() {
        this.tamanho = 0; 
        this.inicio = null; 
    }

    public void enqueue(Object elemento) {
        No NoNovo = new no(elemento); 
        if(inicio == null) {
            inicio = Nonovo; 
        } else {
            fim.prox = NoNovo;
            fim = Nonovo; 
        }
        tamanho++; 
    }

    public void dequeue() {
        if(isEmpty()) {
            throw new FilaVaziaExcecao("essa fila ta vazia hein");
        }
        No Prov = inicio;
        inicio = inicio.prox;
        tamanho--; 
        return No Prov;
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
            atual = atual + prox;
        }
        System.out.println(); 
    }
}