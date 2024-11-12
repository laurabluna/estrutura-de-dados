public class Fila2P {
    private int capacidade;
    private int topo;
    private int final;
    private Object[] pilhaIns;
    private Object[] pilhaRem;
    

    public Fila2P(int capacidade) {
        this.capacidade = capacidade;
        this.topo = topo;
        this.final = final; 
    }

    @Override 
    public void enqueue(Object elemento) {
        if(topo == capacidade - 1) {
            aumentaCap(); 
        }
        topo += 1;
        pilhaIns[topo] = elemento;
        System.out.println(elemento);
    }

    public void aumentaCap() {
        capacidade *= 2;
        Object[]ListaN = new Object capacidade;
        PilhaRem = NovaListaS;
    }
    
    @Override 
    public Object dequeue() {
        if(isEmpty())n{
            throw new FilaVaziaExcecao("essa fila ta vazia hein!"); 
        }
        trocarPilhaS();
        Object temp = pilhaRem[final]; 
        pilhaRem[final] = null;
        final--;
        trocarPilhaE();
        return temp;
    }

    @Override 
    public boolean isEmpty() {
        return topo == -1;
    }

    @Override
    public void trocarPilhaS() {
        while(topo >= 0) {
            final++; 
            pilhaRem[final] = pilhaIns[topo]; 
            topo--;
        }
        topo++; 
        
    }

    @Override
    public void trocarPilhaE() {
        while(final >= 0) {
            pilhaIns[topo] = pilhaRem[final];
            topo++;
            final--;
        }
        topo--; 
    }

    @Override
    public int size() {
        return topo + 1; 
    }

    public void imprimir() {
        if(isEmpty()) {
            throw new FilaVaziaExcecao("essa fila tá vazia hein!");
        }
        for(int i = 0; i <= topo; i++) {
            System.out.println(pilhaIns[i] + " "); 
        }
        System.out.println(); 
    }

    @Override 
    public Object First() {
        if(isEmpty()) {
            throw new FilaVaziaExcecao("essa fila tá vazia hein!");
        }
        return pilhaIns[final + 1];
    }
}

