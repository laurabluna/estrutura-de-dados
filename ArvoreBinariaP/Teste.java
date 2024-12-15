package ArvoreBinariaP;

public class Teste {
    public static void main(String[] args) {
        ArvoreBinariaP arvore = new ArvoreBinariaP();

        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(2);
        arvore.inserir(8);
        arvore.inserir(15);
        arvore.inserir(22);
        
        arvore.desenharArvore();

        System.out.println("colocando o 25:");
        arvore.inserir(25);
        arvore.desenharArvore();

        System.out.println("dando tchau pro 5:");
        arvore.remover(5);
        arvore.desenharArvore();
    }
}

