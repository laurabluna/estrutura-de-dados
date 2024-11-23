public class Pilha2FTeste {
    public static void main(String[] args) {
        Pilha2F oi = new Pilha2F(1);
        System.out.println("Inserindo");
        for (int f = 0; f < 11; f++) {
            oi.push(f);
        }
        oi.listar();  

        System.out.println("Inserindo mais elementos");
        for (int f = 0; f < 3; f++) {
            oi.push(f);
        }
        oi.listar(); 

        System.out.println("Topo da pilha: " + oi.top());
        System.out.println("Tamanho da pilha: " + oi.size());

        System.out.println("Retirando");
        for (int f = 0; f < 3; f++) {
            System.out.println(oi.pop());
        }
    }
}
