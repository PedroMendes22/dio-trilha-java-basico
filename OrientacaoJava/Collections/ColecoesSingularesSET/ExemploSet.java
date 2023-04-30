package ColecoesSingularesSET;

//import java.util.Collections;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//entendendo diferenca entre List e Set
public class ExemploSet {
    public static void main(String[] args) {
        //dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        System.out.println("Criar um conjunto e adicionar as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notas.toString());

       // System.out.println("Exiba a posicao da nota 5.0: "); //com Set nao consigo fazer busca por posicao
       // System.out.println("Adicionar a nota 8 na posicao 4");//com Set nao consigo fazer busca por posicao
        //System.out.println("Substituir uma nota por outra");//com Set nao consigo fazer busca por posicao
        
        System.out.println("Conferir se a nota 5.0 está no conjunto: "+ notas.contains(5d));

       // System.out.println("Exibir a terceira nota adicionada"); //com Set nao consigo fazer busca por posicao
        
       System.out.println("Exibir a menor nota: "+ Collections.min(notas));
       System.out.println("Exibir a maior nota: "+ Collections.max(notas));

       System.out.println("Exibir a soma dos valores: ");
       Iterator<Double> iterator = notas.iterator();   
       Double soma = 0d;
       while(iterator.hasNext()){
           Double next = iterator.next();
           soma +=next;
       }
       System.out.println("A soma dos valores: "+ soma);
   
       System.out.println("Exibir a media das notas" + (soma/notas.size()));

       System.out.println("remover a nota 0: ");
       notas.remove(0d);

       System.out.println(notas);

       //System.out.println("remova a nota da posicao 0");//com Set nao consigo fazer busca por posicao

       System.out.println("remover as notas menores que 7 e exibir");
       Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if(next<7) iterator2.remove();
        }
        System.out.println(notas);

        System.out.println("Exibir todas as notas na oredem em que foram informadas: ");
        Set<Double> notas2 = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notas2);

        System.out.println("Exiba as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2); //pq tem o comparable
        System.out.println(notas3); 

        System.out.println("Apagar tudo");
        notas.clear();
        System.out.println("COnferir se está vazio: " + notas2.isEmpty());
    }
}
