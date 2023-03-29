import java.util.Scanner;

public class ParEimpar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int quantNumeros, quantPares = 0, quantImpares = 0,numero, cont = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero%2==0) quantPares++;
            else quantImpares++;

            cont++;
        }while(cont<quantNumeros);
        System.out.println("Quantidade de números pares: " + quantPares);
        System.out.println("Quantidade de números ímpares: " + quantImpares);

    }
}
