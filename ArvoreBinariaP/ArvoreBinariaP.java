package ArvoreBinariaP;

import java.util.ArrayList;
import java.util.List;

public class ArvoreBinariaP{
    public No raiz;
    private int tamanho;

    public ArvoreBinariaP() {
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
        No filho = (no.hasLeftChild()) ? no.getLeftchild() : no.getRightchild();
        No painho = no.getParent();
        if (painho == null) {
            raiz = filho; 
        } else if (painho.getLeftchild() == no) { 

            painho.setLeftchild(filho);
        } else {
            painho.setRightchild(filho);
        }
        filho.setParent(painho);
    }

    private void removerDois(No no) {
        No suc = min(no.getRightchild());
        no.setKey(suc.getKey());
        if(qtdfilhos(suc) == 0) {
            removerFolha(suc);
        }

        else {
            removerUm(suc);
        }

    }

    public No min(No no) {
        while (no.getLeftchild() != null) {
            no = no.getLeftchild();
        }
        return no;
    }

    public int height(No no) {
        if (no == null) return -1;
        return 1 + Math.max(height(no.getLeftchild()), height(no.getRightchild()));
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

    public void preOrdem(No no) {
        if (no == null) return;
        System.out.print(no.getKey() + " ");
        preOrdem(no.getLeftchild());
        preOrdem(no.getRightchild());
    }

    private void emOrdem(No no, List<No> nodes) {
        if (no == null) return;
        emOrdem(no.getLeftchild(), nodes);
        nodes.add(no);
        emOrdem(no.getRightchild(), nodes);
    }

    public List<No> emOrdem() {
        List<No> nodes = new ArrayList<>();
        emOrdem(raiz, nodes);
        return nodes;
    }

    public int depth(No no) {
        int profundidade = 0;
        while (no != null && no != raiz) {
            no = no.getParent();
            profundidade++;
        }
        return profundidade;
    }

    public int size() {
        return tamanho;
    }


    public void desenharArvore() {
        int altura = height(raiz);
        Integer[][] matriz = new Integer[altura + 1][size()];
        List<No> nodes = emOrdem();
        int k = 0;

        for (No node : nodes) {
            matriz[depth(node)][k] = (Integer) node.getKey();
            k++;
        }

        for (int i = 0; i <= altura; i++) {
            for (int j = 0; j < size(); j++) {
                if (matriz[i][j] == null)
                    System.out.print(" ");
                else
                    System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    

}