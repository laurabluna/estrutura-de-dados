public class listaDup {
    private int tamanho = 0;
    private No tail, head;  

    public listaDup{
        this.tamanho = 0;
        this.tail = new No(null);
        this.head = new No(null);
    }

    public Object elemAtRank(int k) {
        No atual = head.prox; 
        for(int i = 0; i < n; i++) {
            atual = atual.prox;
        }
        return atual.elemento;
    }

    public Object insertAtRank(int k, Object o) {
        No NovoNo = new No(o);
        No velho = head.prox;
        
        if(k > tamanho) {
            throw new VExcecao("não vai dar pra inserir nenhum elemento que eh maior que a quantidade de elementos da lista");
        }

        if(head.next = NovoNo) {
            
        }
   }

   
}