public class No {
    private Object object; //conteudo do nó
    private No refNo;

    public No(){
    }
    
    public No(Object object){
        this.refNo = null;
        this.object = object;
    }

    //gets e sets
    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
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
