package Interface;

public class Calculadora implements OperacaoMatematica {
    @Override
    public void soma(double number1, double number2){
        System.out.println("Soma: "+ (number1+number2));
    }
    @Override
    public void subtracao(double number1, double number2){
        System.out.println("Subtracao: " + (number1-number2));
    }
    @Override
    public void multiplicacao(double number1, double number2){
        System.out.println("Multiplicacao: "+ (number1*number2));
    }
    @Override
    public void divisao(double number1, double number2){
        System.out.println("Soma: "+ (number1/number2));
    }
}
