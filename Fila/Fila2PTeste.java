public class Fila2PTeste {
    public static void main(String[] args) {
        Fila2P oi = new Fila2P(1);
        System.out.println("to inserindo");
        for (int f = 0; f < 10; f++) {
            oi.enqueue(f);
        }
        oi.imprimir();

        System.out.println("retirando");
        for (int f = 0; f < 3; f++) {
            System.out.println(oi.dequeue());
        }
        System.out.println("retirando");
        for (int f = 0; f < 3; f++) {
            System.out.println(oi.dequeue());
        }
        oi.imprimir();

        System.out.println("Inserindo");
        for (int f = 0; f < 3; f++) {
            oi.enqueue(f);
        }
        oi.imprimir();

        System.out.println(oi.size());
        System.out.println(oi.First());
    }
}
