import java.util.Scanner;

/*
 * Ler nome e idade até inserir 0 no campo nome
 */
public class NomeEidade{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        
        while(true){
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0"))break; //forma de comparar

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
        
        

    }
}