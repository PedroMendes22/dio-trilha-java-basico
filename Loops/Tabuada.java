import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Tabuada de: ");
        int i, numero = scan.nextInt();

        System.out.println("Tabuada de " + numero);
        for(i=1;i<=10;i++){
            System.out.println(numero + " X " + i + " = " + (numero*i));
        }

    }
}
