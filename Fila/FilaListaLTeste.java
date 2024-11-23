public class FilaListaLTeste {
    public static void main(String[] args) {
        FilaListaL fila = new FilaListaL();
        System.out.println("to inserindo");
        for (int i = 0; i < 10; i++) {
            fila.enqueue(i);
        }

        fila.listar();

        System.out.println("to removendo");
        for (int i = 0; i < 6; i++) {
            System.out.println(fila.dequeue());
        }

        fila.listar();
        System.out.println("O primeiro elemento da fila é:" + fila.first());
        System.out.println("O tamanho da fila é: " + fila.size());
    }
}


