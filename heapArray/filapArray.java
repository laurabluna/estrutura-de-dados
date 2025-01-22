public class filapArray {
    private int[] heap;
    private int tamanho;

    public filapArray(int capacidade) {
        heap = new int[capacidade];
        tamanho = 0;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void insert(int valor) {
        if (tamanho == heap.length) {
            System.out.println("essa heap ta cheia hein");
            return;
        }
        heap[tamanho] = valor;
        upHeap(tamanho);
        tamanho++;
    }

    public int removeMin() {
        if (isEmpty()) {
            System.out.println("essa heap ta vazia hein");
            return -1;
        }

        int min = heap[0];

        heap[0] = heap[tamanho - 1]; 
        tamanho--;
        downHeap(0);
        return min;
    }

    public int min() {
        if (isEmpty()) {
            System.out.println("essa heap tá vazia hein");
            return -1;
        }
        return heap[0]; 
    }

    private void upHeap(int index) {
        int pai = (index - 1) / 2; 
        while (index > 0 && heap[index] < heap[pai]) {
            swapKeys(index, pai); 
            index = pai;
            pai = (index - 1) / 2; 
        }
    }

    private void downHeap(int index) {
        int leftChild = 2 * index;
        int rightChild = 2 * index + 1;
        int smallElem = index; 
        if (leftChild < tamanho && heap[leftChild] < heap[smallElem]) {
            smallElem = leftChild;
        }
        if (rightChild < tamanho && heap[rightChild] < heap[smallElem]) {
            smallElem = rightChild;
        }
        if (smallElem != index) {
            swapKeys(index, smallElem); 
            downHeap(smallElem);
        }
    }

    private void swapKeys(int i, int j) {
        int aux = heap[i];
        heap[i] = heap[j];
        heap[j] = aux;
    }

    public void mostrarArray() {
        System.out.print("Heap Array: [");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(heap[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}