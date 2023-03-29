public class Main{
    public static void main(String[] args){
        int A = 1;
        int B=A;

        System.out.println("Numero A = " + A + "\nNumero B = " + B);
        A=2;
        System.out.println("Numero A = " + A + "\nNumero B = " + B);

        MeuObj objA= new MeuObj(1);
        MeuObj objB= objA;              //Não copia o próprio objeto A para B, e sim copiando a referência de memória do objA para o objB, estarao apontando para o mesmo endereço de memória
        System.out.println("ObjA = " + objA + " ObjB = " + objB);
        objA.setNum(2);
        System.out.println("ObjA = " + objA + " ObjB = " + objB);

    }
    
}