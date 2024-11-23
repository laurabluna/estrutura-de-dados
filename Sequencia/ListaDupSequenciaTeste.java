package Sequencia;

public class ListaDupSequenciaTeste {
    public static void main(String[] args) {
        ListaDupSequencia sequencia = new ListaDupSequencia();
        System.out.println("vamo começar os jogos");
        sequencia.print();
        System.out.println("tam da sequencia");
        System.out.println(sequencia.tamanho());

        System.out.println("to retornando o elemento");
        System.out.println(sequencia.elemAtRank(3));

        System.out.println("vou inserir hein");
        sequencia.insertAtRank(0, 15);
        sequencia.insertAtRank(1, 12);
        sequencia.insertAtRank(2, 11);
        sequencia.print();

        System.out.println("to inserindo no inicio");
        sequencia.insertFirst(69);
        sequencia.print();

        System.out.println("to substituindo um elemento");
        System.out.println(sequencia.replaceAtRank(2, 80));
        sequencia.print();

        System.out.println("to temovendo elemento");
        System.out.println(sequencia.removeAtRank(4));
        sequencia.print();

        System.out.println("olha o tamanho da sequencia ai");
        System.out.println(sequencia.tamanho());

        System.out.println();
        System.out.println("to testando a lista agora");

        System.out.println("to inserindo um nó antes");
        sequencia.insertBefore(sequencia.atRank(1), 435);
        sequencia.print();

        System.out.println("to inserindo um no depois");
        sequencia.insertAfter(sequencia.atRank(3), 62);
        sequencia.print();

        System.out.println("rankOf guys");
        System.out.println(sequencia.rankOf(sequencia.tail()));

        System.out.println("to insrindo no fim visse");
        sequencia.insertLast(54);
        sequencia.print();

        System.out.println("to substituindo");
        sequencia.replaceElement(sequencia.atRank(2), 76);
        sequencia.print();

        System.out.println("to trocando os elementos");
        sequencia.swapElements(sequencia.atRank(3), sequencia.tail());
        sequencia.print();

        System.out.println("to removendo o nó");
        sequencia.remove(sequencia.atRank(2));
        sequencia.print();



    }
} 
