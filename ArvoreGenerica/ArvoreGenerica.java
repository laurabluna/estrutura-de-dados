package ArvoreGenerica;
import java.util.ArrayList;

public class ArvoreGenerica {
    private int tamanho;
    private No raiz;

    public ArvoreGenerica() {
        tamanho = 1;
        raiz = new No(null, o);
    }

    public boolean isRoot(No b) {
        return b==raiz;
    }

    public boolean isExternal(No b) {
        return(b.childNumber() == 0);
    }

    public boolean isInternal(No b) {
        return(b.childNumber() > 0);
    }

    private int profundidade(No b) {
        if(b==raiz) {
            return 0;
        }

        else{
            return 1 + profunidade(b.parent());
        }
    }

    public int height(No b) {
        if(isExternal) {
            return 0;
        }

        else {
            int altura = 0;
            Iterator filhos = children(b);

        }
    }

    public void swapElements(No b, No c) {
        Object trocar = b.element();
        b.setElement(c.element());
        c.setElement = trocar; 
    }

    public addChild(No b, Object o) {
        No novoNo = new No(b,o);
        b.addChild(novoNo);
        tamanho++; 
        return novo; 
    }

    public Object remove(No b) {
        No painho = b.parent();

        if(painho != null) {
            painho.removeChild(b);
        }

        return o;
    }

    public Object replace(No b, Object o) {
        b.setElement(o);
        return o;
    }

    public int size() {
        return tamanho;
    }



}