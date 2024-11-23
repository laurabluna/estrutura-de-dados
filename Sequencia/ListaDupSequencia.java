package Sequencia;

public class ListaDupSequencia {
    private int tamanho;
    private No head, tail;

    private static class No {
        Object elemento;
        No prox, prev;

        public No(Object elemento) {
            this.elemento = elemento;
            this.prox = null;
            this.prev = null;
        }
    }
    
    public ListaDupSequencia() {
        this.tamanho = 0;
        this.head = new No(null);
        this.tail = new No(null);
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean isEmpty() {
        return head.prox == null;
    }

    public Object elemAtRank(int l) {
        No atual = head.prox;
        for(int i = 0; i < l; i++) {
            atual = atual.prox;
        }
        return atual.elemento;
    }

    public Object replaceAtRank(int l, Object o) {
        if(l > tamanho) {
            throw new sequenciaExcecao("");
        }
        No atual = head.prox;
        for(int i = 0; i < l; i++) {
            atual = atual.prox;
        }

        Object aux = atual.elemento;
        atual.elemento = o;
        return aux;
    }

    public Object removeAtRank(int l) {
        No velho = head.prox;
        Object elemento;
        if(l > tamanho) {
            throw new sequenciaExcecao("");
        }
        if(isEmpty()) {
            throw new sequenciaExcecao("");
        }
        if(l == 0) {
            elemento = velho.elemento;
            velho.prox.prev = head;
            head.prox = velho.prox;
        }
        else{
            for(int i = 0; i < l; i++) {
                velho = velho.prox;
            }
            velho.prev.prox = velho.prox;
            velho.prox.prev = velho.prev;
            elemento = velho.elemento;
        }
        tamanho--;
        return elemento;
    }

    public void insertAtRank(int l, Object o) {
        No novo = new No(o);
        No velho = head.prox;
        if(l > tamanho) {
            throw new sequenciaExcecao("");
        }
        if(head.prox == null) {
            head.prox = novo;
            tail.prev = novo;
            novo.prev = head;
            novo.prox = tail; 
        }
        else if(l==0){
            novo.prox = velho;
            novo.prev = head;
            velho.prev = novo;
            head.prox = novo;
        }
        else{
            for(int i = 0; i < l; i++) {
                velho = velho.prox;
            }
            novo.prev = velho.prev;
            novo.prox = velho;
            velho.prev.prox = novo;
            velho.prox.prev = novo;
        }
        tamanho++;
    }

    public No head() {
        return head.prox;
    }

    public No tail() {
        return tail.prev;
    }

    public boolean isHead(No l) {
        return l == head.prox;
    }

    public boolean isTail(No l) {
        return l == tail.prev;
    }

    public No after(No l){
        return l.prox;
    }

    public No before(No l) {
        return l.prev;
    }

    public void swapElements(No k, No l) {
        Object aux = l.elemento;
        l.elemento = k.elemento;
        k.elemento = aux;
    }

    public Object replaceElement(No l, Object o) {
        Object aux = l.elemento;
        l.elemento = o;
        return aux;
    }

    public void insertAfter(No l, Object o) {
        No novo = new No(o);
        l.prox.prev = novo;
        novo.prox = l.prox;
        l.prox = novo;
        novo.prev = l;
        tamanho++; 
   }

   public void insertBefore(No l, Object o) {
        No novo = new No(o);
        l.prev.prox = novo;
        novo.prev = l.prev;
        l.prev = novo;
        novo.prox = l;
        tamanho++;
   }

   public void insertFirst( Object o) {
        No novo = new No(o);
        if(head.prox == null) {
            head.prox = novo;
            tail.prev = novo;
            novo.prev = head;
            novo.prox = tail;
        }

        else{
            novo.prox = head.prox;
            novo.prev = head;
            head.prox.prev = novo;
            head.prox = novo;
        }
        tamanho++; 
   }

   public void insertLast(Object o) {
        No novo = new No(o);
        if(tail.prev == null) {
            tail.prev = novo;
            head.prox = novo;
            novo.prev = head;
            novo.prox = tail;
        }

        else{
            novo.prox = tail;
            novo.prev = tail.prev;
            tail.prev.prox = novo;
            tail.prev = novo;
        }
        tamanho++;
   }

    public void remove(No l) {
        l.prox.prev = l.prev;
        l.prev.prox = l.prox;
        l = null;
        tamanho--;
    }

    public ListaDupSequencia.No atRank(int l) {
        if (l < 0 || l >= tamanho) { 
            throw new IndexOutOfBoundsException("");
        }
       No atual;
       if (l <= tamanho / 2) { 
            atual = head.prox; 
            for (int i = 0; i < l; i++) {
                atual = atual.prox;
            }

        } 
    
        else { 
            atual = tail; 
            for (int i = tamanho - 1; i > l; i--) {
                atual = atual.prev;
            }
        }
    
        return atual; 
    }
    
    public int rankOf(No l) {
        No atual = head.prox;
        int cont = 0;
        while(atual != null) {
            if(atual == l) {
                return cont;
            }
            atual = atual.prox;
            cont++;
        }
        return -1;
    }

    public void print() {
        No atual = head;
        while (atual != null){
            System.out.print(atual.elemento);
            System.out.print(" ");
            atual = atual.prox;
        }
        System.out.println();
    }
}
