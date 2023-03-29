/*Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
 * Ao final mostre os números e seus sucessores.
 */
import java.util.Random;
public class NumerosAleatorios {
    public static void main(String[] args){
        Random random = new Random();       //classe que gera números aleatórios
        int[] numerosAleatorios = new int[20];

        for(int i=0;i<numerosAleatorios.length;i++){    //i tem que ser menor que o tamanho do array
            int numero = random.nextInt(100);       //gerar de 0 a 100
            numerosAleatorios[i]=numero; 
        }

        System.out.println("Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.println("\nSucessores dos Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }
    }
}
