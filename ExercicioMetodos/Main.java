public class Main {
    public static void main(String[] args) {
        System.out.println("Calculadora:");
        Calculadora.soma(2,3);
        Calculadora.subtracao(2,3);
        Calculadora.multiplicacao(2,3);
        Calculadora.divisao(3,3);

        System.out.println("Mensagem: ");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(2);



        System.out.println("Emprestimo: ");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
