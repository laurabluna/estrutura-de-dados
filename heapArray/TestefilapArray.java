public class TestefilapArray {
    public static void main(String[] args) {
        filapArray fila = new filapArray(10);
        System.out.println("começando os trabalhos");
        System.out.println("botando");
        fila.insert(31);
        fila.insert(8);
        fila.insert(2);
        fila.insert(2);
        fila.insert(4);
        System.out.println("\no menor elemento eh" + fila.min());
        System.out.println("\nremovi o menor");
        int removido = fila.removeMin();
        System.out.println("removido: " + removido);
        removido = fila.removeMin();
        System.out.println("removido: " + removido);
        System.out.println("\na fila tá vazia? " + fila.isEmpty());
        System.out.println("o tam da fila é " + fila.tamanho());
        System.out.println("\n colocando de novo:");
        fila.insert(5);
        fila.insert(8);
        fila.insert(1);
        fila.insert(3);
        fila.insert(7);
        System.out.println("\ncolocando numa bixa cheia:");
        fila.insert(23);
        System.out.println("\n to tirando tudoooo");
        while (!fila.isEmpty()) {
            System.out.println("removido: " + fila.removeMin());
        }
        System.out.println("\n vendo se dá pra remover de uma fila q ta vazia");
        fila.removeMin();
    }
}
