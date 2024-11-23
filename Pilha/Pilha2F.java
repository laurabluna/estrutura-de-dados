public class Pilha2F implements interfacePilha2F {
    private int capacidade;
    private int inicio = 0;
    private int fim = 0; 
    private Object[] stackEntrada;
    private Object[] stackSaida;

    public Pilha2F(int capacidade) {
        this.capacidade = capacidade;
        this.stackEntrada = new Object[capacidade];
        this.stackSaida = new Object[capacidade];

    }

    @Override
    public void push (Object elemento) {
        if(size() == capacidade -1) {
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
        Object temp = stackSaida[--fim]; 
        stackSaida[fim] = null;
        trocarFilaI();
        return temp;
    }

    public Object top() {
        if (isEmpty()) {
            throw new PilhaVaziaExcecao("A pilha está vazia");
        }
        return stackEntrada[fim - 1];
    }

    @Override
    public void trocarFilaF() {
        for (int i = 0; i < fim; i++) {
            stackSaida[i] = stackEntrada[i];
            stackEntrada[i] = null;
        }
        fim = 0; 
    }

    public void trocarFilaI() {
        for (int i = 0; i < capacidade; i++) {
            if (stackSaida[i] != null) {
                stackEntrada[fim++] = stackSaida[i];
                stackSaida[i] = null;
            }
        }
    }

    @Override
    public int size() {
        return fim;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    public void aumentarCapacidade() {
        int novaCap = capacidade * 2;
        Object[] novaStackEntrada = new Object[novaCap];
        Object[] novaStackSaida = new Object[novaCap];

        System.arraycopy(stackEntrada, 0, novaStackEntrada, 0, capacidade);
        System.arraycopy(stackSaida, 0, novaStackSaida, 0, capacidade);

        stackEntrada = novaStackEntrada;
        stackSaida = novaStackSaida;
        capacidade = novaCap;

    }
    public void listar() {
        if (isEmpty()) {
            throw new PilhaVaziaExcecao("A pilha está vazia");
        }
        for (int i = inicio; i != fim; i = (i + 1) % capacidade) {
            System.out.print(stackEntrada[i] + " ");
        }
        System.out.println();
    }


}