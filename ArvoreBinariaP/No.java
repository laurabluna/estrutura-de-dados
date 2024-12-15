package ArvoreBinariaP;

public class No {
    private No parent;
    private No leftchild;
    private No rightchild;
    private Object key;

    public No(No parent, Object key) {
        this.parent = parent;
        this.key = key;
    }

    // Getters e Setters
    public No getParent() {
        return parent;
    }

    public void setParent(No parent) {
        this.parent = parent;
    }

    public No getLeftchild() {
        return leftchild;
    }

    public void setLeftchild(No leftchild) {
        this.leftchild = leftchild;
    }

    public No getRightchild() {
        return rightchild;
    }

    public void setRightchild(No rightchild) {
        this.rightchild = rightchild;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    // Métodos Auxiliares
    public boolean isExternal() {
        return leftchild == null && rightchild == null;
    }

    public boolean isInternal() {
        return hasLeftChild() || hasRightChild();
    }

    public boolean hasLeftChild() {
        return leftchild != null;
    }

    public boolean hasRightChild() {
        return rightchild != null;
    }

    public boolean hasParent() {
        return parent != null;
    }
}
