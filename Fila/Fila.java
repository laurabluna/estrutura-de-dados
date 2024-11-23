public class Fila implements interfaceFila {
    private int capacidade; 
    private int incremento; 
    private int inicio = 0;
    private int fim = 0; 
    private Object[] array;

    public Fila(int capacidade, int incremento) {
        this.capacidade = capacidade;
        this.incremento = incremento; 
        this.array = new Object[capacidade];

    }

    @Override
    public void enqueue(Object elemento) {
        if(size() == (capacidade - 1)) {
            int nova_capacidade;
            if(incremento == 0) {
                nova_capacidade = capacidade * 2;
            } 
            
            else {
                nova_capacidade = capacidade + incremento;
            }

            Object[] arrayNovo = new Object[nova_capacidade];
            int verdadeiroInicio = inicio; 
            for(int i = 0; i < size(); i++) {
                arrayNovo[i] = array[verdadeiroInicio]; 
                verdadeiroInicio = (verdadeiroInicio + 1) % capacidade; 
            }

            fim = size();
            inicio = 0;
            capacidade = nova_capacidade; 
            array = arrayNovo; 
        }

        array[fim] = elemento;
        fim = (fim + 1) % capacidade; 
    }

    @Override
    public void dequeue() {
        if(isEmpty()) {
            throw new FilaVaziaExcecao ("essa fila tá vazia hein!");
        }
        Object removido = array[inicio]; 
        inicio = (inicio + 1) % capacidade;
    }

    @Override
    public int size() {
        return (capacidade - inicio + fim) % capacidade;
    }

    @Override
    public boolean isEmpty() {
        return inicio == fim; 
    }

    public Object first() {
        if(isEmpty()) {
            throw new FilaVaziaExcecao("essa fila ta vazia hein");
        }
        return array[inicio]; 
    }

    public void print() {
        if (isEmpty()) {
            throw new FilaVaziaExcecao("essa fila ta vazia hein");
        }
        for (int i = inicio; i != fim; i = (i + 1) % capacidade) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}