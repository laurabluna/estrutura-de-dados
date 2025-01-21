public class heapArray{
    private int[] heap;
    private int tamanho;

    public heapArray(int capacidade) {
        heap = new int[capacidade];
        tamanho = 0;

    }

    public int tamanho() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void inserir(int valor) {
        if (size == heap.length) {
            System.out.println("Heap cheia.");
            return;
        }

        heap[tamanho] = valor;
        upHeap(tamanho);
        tamanho++;

    }

    public int removeMin() {
        if (isEmpty()) {
            System.out.println("heap ta vazia hein!");
            return -1
        }

        int min = heap[0];
        heap[0] = heap[tamanho -1];
        tamanho--;
        downHeap(); 
        return min; 
    }

    public int min() {
        if (isEmpty()) {
            System.out.println("heap ta vazia hein!");
            return -1
        }

        return heap[0]; 
    }

}