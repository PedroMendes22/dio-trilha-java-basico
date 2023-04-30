public class RodarAplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(); //instanciado o Obj da classe

        Funcionario gerente = new Gerente();     //todas do tipo Funcionario (upcast, é implicito)
        Funcionario vendedor = new Vendedor();   //todas do tipo Funcionario (upcast, é implicito)
        Funcionario faxineiro = new Faxineiro(); //todas do tipo Funcionario (upcast, é implicito)

        Vendedor vendedor2 = (Vendedor) new Funcionario();  //DOwncast é explicito, classe Funcionario(mae) para classe Vendedor(filha)
        //Downcast deve ser evitado
    }
}
