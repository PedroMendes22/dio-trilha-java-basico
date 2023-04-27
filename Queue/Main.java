import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Fiat"));
        queueCarros.add(new Carro("BYD"));

        System.out.println(queueCarros.add(new Carro("Peugeut")));

        System.out.println(queueCarros);
        
        System.out.println(queueCarros.offer(new Carro("Renault"))); //se não conseguir adicionar reotrna false
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek()); //pega o topo da pilha, se estiver vazia retorna null e não remove
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll()); //pega o topo da pilha, se estiver vazia retorna null e  remove
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty()); 
        System.out.println(queueCarros);

        System.out.println(queueCarros.size()); 
        System.out.println(queueCarros);
    }
}
