public class Main {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>(); // limitando a fila à Strings
        
        System.out.println("========================================================================================================");
        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Quarto");
        System.out.println(minhaFila);
        System.out.println("========================================================================================================");

        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
        minhaFila.enqueue("Ultimo");
        System.out.println(minhaFila);

        System.out.println(minhaFila.first());
        System.out.println(minhaFila);


    }
}
