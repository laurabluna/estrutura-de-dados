public class PilhaListaEncadeadaTeste {
    public static void main(String[] args) {
        PilhaListaEncadeada pilha = new PilhaListaEncadeada();
        System.out.println("Inserindo elementos na pilha: ");
        for (int i = 0; i < 10; i++) {
            pilha.push(i);
        }

        pilha.imprimirLista();

        System.out.println("Removendo elementos na pilha: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(pilha.pop());
        }

        pilha.imprimirLista();

        System.out.println(pilha.top());
        System.out.println(pilha.size());
    }
}
