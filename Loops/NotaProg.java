/*Ler nota, entre zero e dez, mostrar mensagem de erro caso o valor seja invalido e continuar
 * pedindo valores até usuário informar um válido
 */

import java.util.Scanner;
public class NotaProg {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Nota: ");
        nota = scan.nextInt();

        while((nota<0) || (nota>10)){
            System.out.println("nota inválida, digite novamente: ");
            nota = scan.nextInt();
        }

    }
}
