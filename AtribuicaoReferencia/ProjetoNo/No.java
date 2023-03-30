
public class No<T>{
    public T conteudo;
    private No<T> proximoNo;

    public No(T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }
    public T getConteudo(){
        return conteudo;
    }
    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }
    public No<T> getProximoNo(){
        return proximoNo;
    }
    public void setProximoNo(No<T> proximNo){
        this.proximoNo = proximNo;
    }


    @Override
    public String toString(){
        return "No{"+
                "conteudo='" + conteudo + '\'' +
                "}";
    }
    /* 
    @Override
    public String toString(){
        return "No{"+
                "conteudo='" + conteudo + '\'' +
                ", proximoNo=" + proximoNo +
                "}";
    }*/
}