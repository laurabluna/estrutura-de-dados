public class vetorTeste {
    public static void main(String[] args) {
        vetorL vetor = new vetorL();
        vetor.insertAtRank(0, 18);
        vetor.insertAtRank(1, 31);
        vetor.insertAtRank(3, 20);
        vetor.insertAtRank(2, 4);
        vetor.print();
        System.out.println();
        vetor.removeAtRank(0);
        vetor.removeAtRank(2);

        vetor.print();

        System.out.println(vetor.replaceAtRank(3, 2004));
        vetor.print();


    }
}
