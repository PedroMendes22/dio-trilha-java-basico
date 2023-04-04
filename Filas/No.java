public class No<T> { //trasnfomrnado em generic
    private T object; //conteudo do nó
    private No<T> refNo;

    public No(){
    }
    
    public No(T object){
        this.refNo = null;
        this.object = object;
    }

    //gets e sets
    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No [object=" + object + ", refNo=" + refNo + "]";
    }

    
}
