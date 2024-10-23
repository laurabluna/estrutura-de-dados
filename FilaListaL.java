public class FilaListaL {
    private int tamanho; 
    private No inicio; 
    private No fim;

    public FilaListaL() {
        this.tamanho = 0; 
        this.inicio = null; 
    }

    public void enqueue(Object elemento) {
        No NoNovo = new no(elemento); 
        if(inicio == null) {
            inicio = Nonovo; 
        } else {
            fim.prox = NoNovo;
            fim = Nonovo; 
        }
        tamanho++; 
    }
}