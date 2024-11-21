public class vetorA {
    private int tamamnho;
    private int capacidade;
    private Object[] array;

    public vetorA (int capacidade) {
       this.capacidade = capacidade;
       this.array = new Object[this.capacidade]; 
    }

    public Object replaceAtRank(int k, object o) {
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

        if(capacidade == tamamho) {
            capacidade *=2;
            Object[] arrayNovo = new Object[capacidade];
            for(int i = 0; i < size; i++) {
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
}