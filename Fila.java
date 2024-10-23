public class Fila implements interfaceFila {
    private int capacidade; 
    private int incremento; 
    private int inicio = 0;
    private int fim = 0; 
    private Object[] array;

    public Fila(int capacidade, int incremento) {
        this.capacidade = capacidade;
        this.incremento = incremento; 
        this.array = new = Object[capacidade];

    }

    @Override
    public void enqueue(Object array) {
        if(size() == capacidade - 1) {

        }
    }

    @Override
    public void dequeue() {
        if(isEmpty()) {
            throw new FilaVaziaExcecao ("essa fila tá vazia hein!");
        }
        return array[inicio];
    }

    @Override
    public int size() {
        return (capacidade - inicio + fim) % capacidade;
    }

    @Override
    public boolean isEmpty() {
        return inicio == fim; 
    }
}