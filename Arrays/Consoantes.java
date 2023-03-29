/*Receber 6 letras e exibir apenas as consoantes e quantidade */
import java.util.Scanner;
public class Consoantes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];
        int cont=0, quantidadeConsoantes=0;

        do{
            System.out.println("Digite 6 consoantes: ");
            String letra = scan.next();

            if(!(letra.equalsIgnoreCase("a") | 
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u")) ){
                    consoantes[cont]=letra;
                    quantidadeConsoantes++;
                }
             cont++;   
        }while(cont<consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {               //laço for-each
            if(consoante!=null)
               System.out.print(consoante + " ");
        }
        System.out.println("\nQuantidade de consoantes: "+quantidadeConsoantes);
    }
}
