public class ListaATeste {
    public static void main(String[] args) {
        ListaA lista = new ListaA(10);
        for (int i = 0; i < 4; i++) {
            lista.insertFirst(i);
        }
        lista.print();
        lista.insertBefore(5, 31);
        lista.print();

        lista.insertBefore(5, 50);
        lista.print();

        lista.insertAfter(1, 73);
        lista.print();

        lista.insertLast(81);
        lista.print();

        lista.remover(5);
        lista.print();
    }
}
