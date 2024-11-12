public class Pilha2F implements interfacePilha2F {
    private int capacidade;
    private int inicio = 0;
    private int fim = 0; 
    private Object[] stackEntrada;
    private Object[] stackSaida;

    public Pilha2F(int capacidade) {
        this.capacidade = capacidade;
        this.inicio = inicio;
        this.fim = fim; 
    }

    @Override
    public void push() {
        if(size() == (capacidade -1)) {
            aumentarCapacidade();
        }
        stackEntrada[fim] = elemento; 
        fim = (fim + 1) % capacidade; 
    }

    @Override
    public Object pop() {
        if(isEmpty()) {
            throw new PilhaVaziaExcecao("essa pilha vazia ta vazia hein!");
        }
        trocarFilaF(); 
        Object temp = stackSaida[fim + 1]; 
        fim = (fim + 1) % capacidade; 
        trocarFilaI();
        return temp; 
    }

    @Override
    public void trocarFilaF() {
        while(fim >= 0) {
            stackSaida[fim] = stackEntrada[inicio];
            inicio++;
            fim--;
        }
        inicio--;
        fim++;
    }

    public void trocarFilaI() {
        while(inicio >= 0) {
            stackEntrada[inicio] = stackSaida[fim]; 
            inicio--;
            fim++; 
        }
        inicio++;
        fim--; 
    }

    @Override
    public int size() {
        return(capacidade - inicio + fim) % capacidade;
    }

    @Override
    public boolean isEmpty() {
        return inicio == fim; 
    }

    public void aumentarCapacidade() {
        int novaCap;
        novaCap = capacidade * 2;

    }




}