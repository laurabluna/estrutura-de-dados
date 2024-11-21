public class ListaA {
    private int tamanho = 0;
    private int capacidade;
    private Object[] lista;

    public ListaA(int capacidade) {
        this.capacidade = capacidade;
        lista = new Object[capacidade]; 
    }

    public void SwapElements(int k, int l) {
        Object aux = lista[k];
        lista[k] = lista[l];
        lista[l] = aux;
    }

    public void aumentarCap() {
        capacidade *= 2;
        Object[] listaNova = new Object[capacidade];
        for(int i = 0; i < tamanho; i++) {
            listaNova[i] = lista[i]; 
        }

        lista = listaNova;
    }

    public void insertBefore(int l, Object o) {
        if(capacidade == tamanho) {
            aumentarCap(); 
        }

        if(l == 0 || l > tamanho + 1) {
            throw new ListaExcecao(""); 
        }

        else if (isEmpty()) {
            System.out.println("essa lista tá vazia hein");
            lista[0] = o;
        }

        else{
            for(int i = tamanho; i > l - 1; i-- ) {
                lista[i] = lista[i - 1]; 
            }
            
            lista [l - 1] = o;
        }

        tamanho++; 

    }

    public void insertAfter(int l, Object o) {
        if(capacidade == tamanho) {
            aumentarCap(); 
        }

        if(l > tamanho) {
            throw new ListaExcecao("bla");
        }

        else{ 
            for(int i = tamanho; i > l + 1; i--) {
                lista[i] = lista[i - 1]; 
            }

            lista[l + 1] = o;
            tamanho++; 
        }
    }

    public void remover(int l) {
        for(int i = 0; i < tamanho; i++) {
            lista[i] = lista[i + 1]; 
        } 
        tamanho--; 
    }

    public void insertFirst(Object o) {
        if(capacidade == tamanho) {
            aumentarCap(); 
        }

        if(tamanho > 0) {
            for(int i = tamanho; i > 0; i--) {
                lista[i] = lista[i - 1]; 
            }

            lista[0] = o;
            tamanho++;
        }

        else {
            lista[0] = o;
            tamanho++; 
        }
    }

    public void insertLast(Object o) {
        if(capacidade == tamanho) {
            aumentarCap(); 
        }

        lista[tamanho] = o;
        tamanho++;
    }

    public Object replaceElements(int l, Object o) {
        Object aux = lista[l];
        lista[l] = o;
        return aux;
    }

    public Object First() {
        return lista[0];
    }

    public Object last() {
        return lista[tamanho - 1];
    }

    public Object before(int l) {
        return lista[l - 1];
    }

    public Object after(int l) {
        return lista[l + 1]; 
    }

    public boolean isEmpty() {
        return tamanho == 0; 
    }

    public boolean isFirst(Object o) {
        return lista[0] == o;
    }

    public boolean isLast(Object o) {
        return lista[tamanho - 1] == o;
    }
}