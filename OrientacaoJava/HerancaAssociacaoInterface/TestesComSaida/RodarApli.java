package TestesComSaida;

public class RodarApli {
    public static void main(String[] args) {
        //vetor do tipo CLasseMae com objetos do tipo ClassiFilha e CLasseMae
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for(ClasseMae classe: classes){
            classe.metodo1(); //sobrescrita com polimorfismo
        }
        System.out.println("");

        for(ClasseMae classe: classes){
            classe.metodo2();
        }
        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2(); //sobrescrita pura
        classeFilha2.metodo2();
    }

}
