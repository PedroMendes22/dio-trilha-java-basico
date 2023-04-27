import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Fiat"));
        stackCarros.push(new Carro("BYD"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop()); //tira o elemento do toopo da pilha
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek()); //mostra o topo mas não retira
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty()); //retorna se está vazia

    }
}
