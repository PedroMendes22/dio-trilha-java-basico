package onedigital;

public class Main {
    public static void main(String[] args) {
        Pilha minhPilha = new Pilha();      //criando/declarando uma Pilha

        minhPilha.push(new No(1));      //espera um nó que contenha um inteiro
        minhPilha.push(new No(2));
        minhPilha.push(new No(3));
        minhPilha.push(new No(4));
        minhPilha.push(new No(5));
        minhPilha.push(new No(6));
        System.out.println(minhPilha);      //roda o medo ToString da classe Pilha
        
        System.out.println(minhPilha.pop());
        System.out.println(minhPilha);

        minhPilha.push(new No(99));
        System.out.println(minhPilha);


    }
}
