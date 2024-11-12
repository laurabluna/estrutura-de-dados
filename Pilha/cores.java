public class PilhasColoridas {
    private int[] array;
    private int topoV, topoP;
    private int tam;

    public PilhasColoridas(int tam) {
        this.tam = tam;
        array = new int[tam];
        topoV = -1;
        topoP = tam;
    }

    public void pushV(int valor) {
        if (topoV + 1 == topoP) {
            throw new PilhaCheiaExcecao("essa pilha tá cheia hein!");
        }
        topoV++;
        array[topoV] = valor;
    }

    public void pushP(int valor) {
        if (topoV + 1 == topoP) {
            throw new PilhaCheiaExcecao("essa pilha tá cheia hein!");
        }
        topoP--;
        array[topoP] = valor;
    }

    public int popV() {
        if (topoV == -1) {
            throw new PilhaVaziaExcecao("essa pilha tá vazia hein!");
        }
        int valor = array[topoV];
        topoV--;
        return valor;
    }

    public int popP() {
        if (topoP == tam) {
            throw new PilhaVaziaExcecao("essa pilha tá vazia hein!");
        }
        int valor = array[topoP];
        topoP++;
        return valor;
    }
}