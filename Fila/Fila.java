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
    public void enqueue(Object array) {
        if(size() == (capacidade - 1)) {
            int nova_capacidade;
            if(incremento == 0) {
                capacidade_nova = capacidade * 2;
            } else {
                capacidade_nova = capacidade + incremento;
            }
            Object[] arrayNovo = new Object[capacidade_nova];
            int verdadeiroInicio = inicio; 
            for(int i = 0; i < size(); i++) {
                arrayNovo[i] = array[verdadeiroInicio]; 
                verdadeiroInicio = (verdadeiroInicio + 1) % capacidade; 
            }
            fim = size();
            inicio = 0;
            capacidade = verdadeiroInicio; 
            array = arrayNovo; 
        }
        array[fim] = array; 
        fim = (fim + 1) % capacidade; 
    }

    @Override
    public void dequeue() {
        if(isEmpty()) {
            throw new FilaVaziaExcecao ("essa fila tá vazia hein!");
        }
        Object removido = array[inicio]; 
        inicio = (inicio + 1) % capacidade;
        return array; 
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
}