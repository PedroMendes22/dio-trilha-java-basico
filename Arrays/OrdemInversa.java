public class OrdemInversa {
    public static void main(String[] args){
        int[] vetor={1, 5, -5, 3, 8, 10};    //declaração de vetor em JAVA
        int count = 0;

        System.out.print("Vetor: ");
        while(count<(vetor.length)){      //propreidade length retorna o tamanmho do array
            System.out.print(vetor[count]+" ");
            count++;
        }
        System.out.print("\nVetor inverso: ");
        for(int i = (vetor.length-1); i>=0;i--){
            System.out.print(vetor[i]+ " ");
        }
    }
}
