public class FilaDePrioridadeHeap {
    private int[] heap;        
    private int tamanho;        
    private int capacidade;    

    public FilaDePrioridadeHeap(int capacidade) {
        this.capacidade = capacidade;     
        this.tamanho = 0;                
        this.heap = new int[capacidade]; 
    }

    public void inserir(int elemento) {
        if (tamanho == capacidade) {
            System.out.println("essa fila ta cheia hein");
            return; 
        }
        tamanho++;          
        int indice = tamanho - 1; //insere no fim da fila
        heap[indice] = elemento;   

        //agora to tentando dar prioridade aos itens na fila
        while (indice > 0 && heap[pai(indice)] > heap[indice]) {
            trocar(indice, pai(indice));  
            indice = pai(indice);         
        } 
    }

    public int removeMin() {
        if (tamanho <= 0) {
            System.out.println("essa fila tá vazia hein");
            return Integer.MIN_VALUE;  
        }
        if (tamanho == 1) {
            tamanho--;
            return heap[0];
        }

        int raiz = heap[0];                  
        heap[0] = heap[tamanho - 1];        
        tamanho--;                         
        return raiz;
    }

    private int upHeap() {

    }

}