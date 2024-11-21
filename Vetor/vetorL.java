public class vetorL {
    private No head, tail;
    private int tamanho = 0; 

    public vetorL(){
        this.tamanho = 0; 
        this.head = new No(null);
        this.tail = new No(null);
    }

    public replaceAtRank(int k, Object o) {
        if(k > tamanho) {
            throw new VetorExcecao("");
        }

        No current = head.prox;
        for(int i = 0; i < k; i++) {
            current = current.next;
        }
        Object a = current.elemento;
        current.elemento = o;
        return a;
    }

    public Object elemAtRank(int k)  {
        No current = head.next;
        for(int i = 0; i < k; i++) {
            current = current.prox;
        }
        return current.elemento; 
    }

    public void insertAtRank(int k, object o) {
        No novoNo = new No(o);
        No velho = head.prox;
        if(k > tamanho) {
            throw new VetorExcecao(""); 
        }
        
        if(head.next == null) {
            head.next = novoNo;
            tail.prev = novoNo;
            novoNo.prev = head;
            novoNo.prox = tail;
        }

        else if(head.prox == null) {
            novoNo.prox = velho;
            novoNo.prev = head;
            velho.prev = novoNo;
            head.next = novoNo;

        }

        else {
            for(int i = o; i < k; i++) {
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
        No velho = head.prox;
        Object e;

        if(k > tamanho) {
            throw new VetorExcecao("");
        }

        if(isEmpty()) {
            throw new VetorExcecao(""); {
        }

        if(k == 0 ) {
            e = velho.e;
            velho.prox.prev = head;
            head.prox = velho.next; 
        }

        else {
            for(int i = 0; i < k; i++) {
                velho = velho.prox;
            }
        }
        tamanho--;
        return e; 

    }

    
}

}