public class vetorTesteA {
    public static void main(String[] args) {
        vetorA array = new vetorA(8);
        array.insertAtRank(0, 10);
        array.insertAtRank(1, 3);
        array.insertAtRank(2, 5);
        array.insertAtRank(3, 7);
        array.print();
        System.out.println();
        System.out.println("Remove");
        System.out.println(array.removeAtRanK(0));
        array.print();
        System.out.println();
        System.out.println(array.removeAtRanK(1));
        array.print();
        System.out.println();
        System.out.println(array.replaceAtRank(1, 9));
        array.print();
        System.out.println("Remove");
        System.out.println(array.removeAtRanK(2));
        array.print();
        System.out.println();
} }
