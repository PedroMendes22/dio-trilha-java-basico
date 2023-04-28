import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Volks"));

        System.out.println(listCarros.get(2)); //pegando na posicao 2

    }
}
