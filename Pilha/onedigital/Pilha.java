package onedigital;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){    //guardo a referencia de topo
        No refAuxiliar = refNoEntradaPilha;  //criando novo nó e guardando referência de entrada do novo Nó, par que seja o do topo da pilha
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReferenciaNo(refAuxiliar); //seto a nova refrencia de topo sobre o nó que eu acabei de criar, para que o nó anterior seja a antigareferencia de no
    }

    public No pop(){
        if(!isEmpty()){ //se a pilha nao estiver vazia
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getReferenciaNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){           //mnétodo isEmpty
       // if(refNoEntradaPilha == null){
         //   return true;                //Se a pilha iniciou vazia
        //}
        // return false;

        return refNoEntradaPilha == null ? true : false;    //maneira resumida de escrever a condição acima
    }
    
    @Override
    public String toString(){
        String stringRetorno = "------------\n";
        stringRetorno +="|   Pilha  |\n";
        stringRetorno +="------------\n";

        No noAuxiliar = refNoEntradaPilha;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() +"}]\n";
                noAuxiliar = noAuxiliar.getReferenciaNo();   //passa a ser o segundo nó da pilha
            }else{
                break;
            }
        }
        stringRetorno +="=============\n";
        return stringRetorno;
    }

}
