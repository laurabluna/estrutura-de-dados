package ArvoreGenerica; 
import java.util.ArrayList;
import java.util.Iterator;

public class No {
    private No painho; 
    private Object o;
    private No raiz;
    private ArrayList<No> filhos  = new ArrayList<>();

    public No(No painho, Object o){
        this.painho = painho;
        this.o = o;
    }
// métodos de acesso
    public No parent(){
        return painho; 
    }

    public No root() {
        return raiz;
    }

    public Iterator children() {
        return filhos.iterator();
    }

    public int childNumber() {
        return filhos.tamanho(); 
    }

    public void addChild(No o) {
        filhos.add(o);
    }

    public void removeChild(No o) {
        filhos.remove(o); 
    }

    
}