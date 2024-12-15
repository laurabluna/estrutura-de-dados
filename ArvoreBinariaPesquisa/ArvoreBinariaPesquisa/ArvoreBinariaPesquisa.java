package ArvoreBinariaPesquisa;

public class ArvoreBinariaPesquisa{
    public No raiz;
    private int tamanho;

    public ArvoreBinariaPesquisa() {
        this.raiz = null;
        this.tamanho = 0;
    }

    public int qtdfilhos(No no) {
        int filhos = 0;
        if (no.getLeftchild() != null) {
            filhos++;
        }
        if (no.getRightchild() != null) {
            filhos++;
        }
        return filhos;
    }

    public No inserir(Object key) {
        No painhoNo = busca(raiz, key);
        No novo = new No(painhoNo, key);
        if((int) painhoNo.getKey() > (int) key)  {
            painhoNo.setLeftchild(novo);
            novo.setParent(painhoNo);
        } else { 
            painhoNo.setRightchild(novo);
            novo.setParent(painhoNo);
        }
        this.tamanho++;
        return novo;

    }

    public No remover(Object key) {
        No no = busca(raiz, key);

        if(no == null) {
            return null;
        }

        else {
            System.out.println("removendo esse: " + no.getKey());
            int qtdfilhos = qtdfilhos(no);
        }

        if(qtdfilhos(no) == 0) {
            removerFolha(no); 
        }

        if(qtdfilhos(no) == 1) {
            removerUm(no);
        }

        if(qtdfilhos(no) == 2) {
            removerDois(no);
        }

        tamanho--;
        return no; 
    }

    public void removerFolha(No no) {
        No painho = no.getParent();
        if(painho == null) {
            raiz = null;
        }

        else if(painho.getLeftchild() == no) {
            painho.setLeftchild(null); 
        }

        else {
            painho.setRightchild(null);
        }
    }

    public void removerUm(No no) {
        
    }


    public No busca(No no, Object key) {
        if(no.isExternal()) {
            return no;
        }

        int chave = (int) key;
        int Nochave = (int) no.getKey();

        if (chave < Nochave) { 
            if (no.getLeftchild() == null) {
                return no; 
            }
            return busca(no.getLeftchild(), key);
        } 
        
        else { 
            if (no.getRightchild() == null) {
                return no; 
            }
            return busca(no.getRightchild(), key);
        }

    } 

    

}