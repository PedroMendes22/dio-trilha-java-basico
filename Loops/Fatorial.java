import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Fatorial para calcular: ");
        int fatorial = scan.nextInt();
        int multiplicacao = 1;

        for(int i=fatorial;i>=1;i--){
            multiplicacao = multiplicacao*i;
        }
        System.out.println(multiplicacao);
    }
}
