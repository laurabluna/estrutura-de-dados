public class No {
    No prox;
    Object elemento; 

    public No(Object elemento) {
        this.prox = null; 
        this.elemento = elemento;
    }
    
    @Override
    public String toString() {
        return " " + this.elemento;
    }
}