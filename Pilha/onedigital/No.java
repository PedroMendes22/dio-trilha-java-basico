package onedigital;

public class No {
    private int dado;
    private No ReferenciaNo = null;

    public No() {   //Construtor vazio
    }

    public No(int dado) {       //construtor do DADO
        this.dado = dado;
    }

    //Get e Set
    public int getDado() {
        return dado;
    }
    public void setDado(int dado) {
        this.dado = dado;
    }
    public No getReferenciaNo() {
        return ReferenciaNo;
    }
    public void setReferenciaNo(No ReferenciaNo) {
        this.ReferenciaNo = ReferenciaNo;
    }

    @Override
    public String toString() {
        return "No [dado=" + dado + "]";
    }

    

    
}
