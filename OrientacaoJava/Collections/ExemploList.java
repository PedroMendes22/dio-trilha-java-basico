import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.print.attribute.standard.MediaSize.Other;

class ExemploList{
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posicao da nota 5.0: "+ notas.indexOf(5d));
        System.out.println("Add na lista a nota 8.0 na posicao 4: ");
        notas.add(4,8d);
        System.out.println(notas);
        System.out.println("Substituir a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as  notas na ordem em que foram informadas: ");
        for(Double nota: notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: "+ notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();   //não funcionou aqui
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma +=next;
        }
        System.out.println("A soma dos valores: "+ soma);
        //poderia somar assim também:
        /*double soma = 0;
        for (double nota : notas) soma += nota;
        System.out.println("Soma das notas: " + soma);*/

        System.out.println("Medía das notas: "+ (soma/notas.size()));

        System.out.println("Remover a nota 0: ");
        notas.remove(0d); //elemento '0' e não posicão 0
        System.out.println(notas);
        System.out.println("Remover a nota da posição 0: ");
        notas.remove(0); //posicao '0' e não nota 0
        System.out.println(notas);

        System.out.println("Remover notas menores que 7 e exibir a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if(next<7) iterator2.remove();
        }
        System.out.println(notas);

        System.out.println("Apagar toda a lista");
        notas.clear();
        System.out.println(notas);
        System.out.println("COnferir se a lista está vazia: " + notas.isEmpty());

    }
}