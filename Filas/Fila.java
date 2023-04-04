public class Fila {
    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null; //instancio a fila vazia
    } 
    
    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public No first(){  //retorna o primeiro elemento da fila sem remover
        if(!this.isEmpty()){
            No primeirNo = refNoEntradaFila; //auxiliar
            while(true){
                if(primeirNo.getRefNo() != null){
                    primeirNo = primeirNo.getRefNo();
                }else{
                    break;
                }
            }
            return primeirNo;
        }
        return null;
    }

    public No dequeue(){ //retorna o primeiro elemento da fila removendo-o
        if(!this.isEmpty()){
            No primeirNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila; //auxiliar
            while(true){
                if(primeirNo.getRefNo() != null){
                    noAuxiliar = primeirNo;
                    primeirNo = primeirNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeirNo;
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null? true:false;
    }

    @Override
    public String toString() {
        String stringRetorno = " ";
        No noAuxiliar = refNoEntradaFila;
        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno +="null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }
        return stringRetorno;
    }

    
}
