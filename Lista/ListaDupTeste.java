public class ListaDupTeste {
    public static void main(String[] args) {
        ListaDup lista = new ListaDup();
        for (int i = 0; i <= 5; i++) {
            lista.insertFirst(i);
        }
        lista.print();

        lista.insertFirst(80);
        lista.insertLast(40);
        lista.print();

        lista.remover(lista.head());
        lista.remover(lista.tail());
        lista.print();

        lista.SwapElements(lista.head(), lista.tail());
        lista.print();

        System.out.println(lista.isFirst(lista.tail()));
        System.out.println(lista.isLast(lista.head()));
    }
}
