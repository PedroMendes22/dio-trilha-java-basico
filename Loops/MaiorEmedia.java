/*Ler 5 numeros e informar o maior e a média desses números */
import java.util.Scanner;
public class MaiorEmedia {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numero , cont = 0, maior = 0;
        float soma = 0;

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            
            soma = soma + numero;
            if(numero > maior) maior = numero;

            cont++;
        }while(cont < 5);
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));



    }
}
