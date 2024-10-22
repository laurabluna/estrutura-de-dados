import java.util.Vector;

Public class VectorPilha implements Pilha {
    private Vector <Object> vector; 

    public VectorPilha() {
        vector = new Vector<>(); 
    }

    @Override
    public int size() {
        return vector.size();
    }

    @Override
    public Object top() throws PilhaVaziaExcecao {
        if(isEmpty()) {
            throw new PilhaVaziaExcecao("essa pilha tá vazia hein!");
        }
        
        return vector.ultimoElemento(); 
    }

    @Override
    public Object pop() throws PilhaVaziaExcecao {
        if(isEmpty()) {
            throw new PilhaVaziaExcecao("essa pilha ta vazia hein!"); 
        }
        Object pegar = vector.lastElement(); 
        vector.remove(vector.size() - 1);
        return pegar; 
    }

    @Override
    public void push(Object a) {
        vector.add(a);
    }

    @Override
    public boolean isEmpty() {
        return vector.isEmpty(); 
    }

    
}