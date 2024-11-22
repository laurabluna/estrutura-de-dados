public class vetorA {
    private int tamanho;
    private int capacidade;
    private Object[] array;

    public vetorA (int capacidade) {
       this.capacidade = capacidade;
       this.array = new Object[this.capacidade]; 
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    public Object replaceAtRank(int k, Object o) {
        if(k > tamanho) {
            throw new VetorExcecao ("não vai dar pra inserir esse elemento ");
        }

        Object a = array[k];
        array[k] = o;
        return a; 
    } 

    public Object elemAtRank(int k) {
        return array[k];
    }

    public void insertAtRank(int k, Object o) {
        if(k > tamanho) {
            throw new VetorExcecao ("não vai dar pra inserir esse elemento ");
        }

        if(capacidade == tamanho) {
            capacidade *=2;
            Object[] arrayNovo = new Object[capacidade];
            for(int i = 0; i < tamanho; i++) {
                arrayNovo[i] = array[i];
            }
            array[k] = o;
            tamanho++;
        }
    }

    public Object removeAtRanl(int k) {
        if(isEmpty()) {
            throw new VetorExcecao("esse vetor ta vazio hein");
        }

        if(k > tamanho) {
            throw new VetorExcecao("nao vai dar pra remover esse elemento");
        }

        Object a = array[k];
        for(int i = 0; i <= tamanho; i++) {
            array[i] = array[i + 1];
            System.out.println("r" + 1);
        }
        tamanho--;
        return a; 
    }

    public void print() {
        for(int i = 0; i < tamanho; i++) {
            System.out.println(this.array[i]);
            System.out.println("");
        }
    }
}