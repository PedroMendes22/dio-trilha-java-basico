
public class No{
    public String conteudo;
    private No proximoNo;

    public No(String conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }
    public String getConteudo(){
        return conteudo;
    }
    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }
    public No getProximoNo(){
        return proximoNo;
    }
    public void setProximoNo(No proximNo){
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