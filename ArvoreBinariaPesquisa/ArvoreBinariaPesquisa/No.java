package ArvoreBinariaPesquisa;

public class No {
    private No parent;
    private No leftchild;
    private No rightchild;
    private Object key;

    public No (No painho, Object b) {
        parent = painho;
        key = b;

    }

    public void setParent(No parent) {
        this.parent = parent;
    }

    public void setLeftchild(No leftchild) {
        this.leftchild = leftchild;
    }

    public void setRightchild(No rightchild) {
        this.rightchild = rightchild;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public No getParent() {
        return parent;
    }

    public No getLeftchild() {
        return leftchild;
    }

    public No getRightchild() {
        return rightchild;
    }

    public Object getKey() {
        return key;
    }

    public boolean isExternal() {
        return this.isExternal();
    }


    

   
}