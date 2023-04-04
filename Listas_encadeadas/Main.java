public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhListaEncadeada = new ListaEncadeada<>();

        minhListaEncadeada.add("TestandoAdd");
        minhListaEncadeada.add("TestandoAdd2");
        minhListaEncadeada.add("TestandoAdd3");

        System.out.println(minhListaEncadeada.get(0));
        System.out.println(minhListaEncadeada.get(1));
        System.out.println(minhListaEncadeada.get(2));

        System.out.println(minhListaEncadeada);

        System.out.println(minhListaEncadeada.remove(1));
        System.out.println(minhListaEncadeada);

    }
}
