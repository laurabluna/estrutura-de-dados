public class ListaDup {
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

    public ListaDup() {
        this.tamanho = 0;
        this.head = new No (null);
        this.tail = new No (null); 
        head.prox = tail;
        tail.prev = head;
    }

    public boolean isEmpty() {
        return head.prox == null;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean isFirst(No l) {
        return l == head.prox; 
    }

    public boolean isLast(No l) {
        return l == tail.prev; 
    }

    public No before(No l) {
        return l.prev;
    }

    public No after(No l) {
        return l.prox;
    }

    public void remover(No l) {
        l.prox.prev = l.prev;
        l.prev.prox = l.prox;
        l = null;
        tamanho--;
    }

    public No head() {
        return head.prox;
    }

    public No tail() {
        return tail.prev;
    }

    public void SwapElements(No l, No k) {
        Object aux = l.elemento;
        l.elemento = k.elemento;
        k.elemento = aux;
    }

    public void insertLast(Object o) {
        No novoNo = new No(o);
        if(tail.prev == null){
            tail.prev = novoNo;
            head.prox = novoNo;
            novoNo.prev = head;
            novoNo.prox = head;
        } else {
            novoNo.prox = tail;
            novoNo.prev = tail.prev;
            tail.prev.prox = novoNo;
            tail.prev = novoNo;
        }
        tamanho++;
    }

    public void insertFirst(Object o) {
        No novoNo = new No(o);
        if(head.prox == null){
            head.prox = novoNo;
            tail.prev = novoNo;
            novoNo.prev = head;
            novoNo.prox = tail;
        } else {
            novoNo.prox = head.prox;
            novoNo.prev = head;
            head.prox.prev = novoNo;
            head.prox = novoNo;
        }
        tamanho++;
    }

    public void insertAfter(No l, Object o) {
        No novoNo = new No(o);
        l.prox.prev = novoNo;
        novoNo.prox= l.prox;
        l.prox = novoNo;
        novoNo.prev = l;
        tamanho++;
    }

    public void insertBefore(No l, Object o) {
        No novoNo = new No(o);
        l.prev.prox = novoNo;
        novoNo.prev = l.prev;
        l.prev = novoNo;
        novoNo.prox = l;
        tamanho++;
    }

    public Object replaceELements(No l, Object o) {
        Object aux = l.elemento;
        l.elemento = o;
        return aux; 
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
