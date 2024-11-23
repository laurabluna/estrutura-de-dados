public class FilaTeste {
    public static void main(String[] args) {
        Fila oi = new Fila(8, 0);
        System.out.println("to inserindo");
        for(int k = 0; k < 8; k++){
            oi.enqueue(k);
        }

        oi.print();

        System.out.println(" to retirando");
        for(int k = 0; k < 3; k++){
            System.out.println(oi.dequeue());
        }

        oi.print();
        System.out.println("to inserindo");
        for(int f = 0; f < 3; f++){
            oi.enqueue(f);
        }

        oi.print();

        System.out.println(oi.first());
        System.out.println(oi.size());
    }
}
