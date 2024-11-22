public class vetorL {
    private No head, tail;
    private int tamanho; 

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    private static class No {
        Object elemento;
        No prox, prev;

        public No(Object elemento) {
            this.elemento = elemento;
            this.prox = null;
            this.prev = null;
        }
    }

    public vetorL(){
        this.tamanho = 0; 
        this.head = new No(null);
        this.tail = new No(null);
        head.prox = tail;
        tail.prev = head;
    }

    public Object replaceAtRank(int k, Object o) {
        if(k < 0 || k > tamanho) {
            throw new VetorExcecao("");
        }

        No current = head.prox;
        for(int i = 0; i < k; i++) {
            current = current.prox;
        }

        Object antigo = current.elemento;
        current.elemento = o;
        return antigo;
    }

    public Object elemAtRank(int k)  {
        No current = head.prox;
        for(int i = 0; i < k; i++) {
            current = current.prox;
        }
        return current.elemento; 
    }

    public void insertAtRank(int k, Object o) {
        No novoNo = new No(o);
        No velho = head.prox;
        if(k > tamanho) {
            throw new VetorExcecao(""); 
        }
        
        if(head.prox == null) {
            head.prox = novoNo;
            tail.prev = novoNo;
            novoNo.prev = head;
            novoNo.prox = tail;
        }

        else if(head.prox == null) {
            novoNo.prox = velho;
            novoNo.prev = head;
            velho.prev = novoNo;
            head.prox = novoNo;

        }

        else {
            for(int i = 0; i < k; i++) {
                velho = velho.prox;
            }
            novoNo.prev = velho.prev;
            novoNo.prox = velho;
            velho.prev.prox = novoNo;
            velho.prev = novoNo;
        }
        tamanho++;

       }

       public Object removeAtRank(int k) {
        No atual = head.prox;
        for (int i = 0; i < k; i++) {
            atual = atual.prox;
        }

        Object retirado = atual.elemento;
        atual.prev.prox = atual.prox;
        atual.prox.prev = atual.prev;
        tamanho--;
        return retirado;


        

    
}

}