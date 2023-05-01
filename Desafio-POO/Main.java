import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Curso para aprender Java");
        curso.setCargaHoraria(114);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaSCRIPT");
        curso2.setDescricao("Curso para aprender JavaSCRIPT");
        curso2.setCargaHoraria(100);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Mentoria sobre Java");
        mentoria.setData(LocalDate.now()); //na hora que criar instancia a atribuilçao
       
       // Conteudo conteudo = new Curso(); //polimorfismo
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Sobre Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-------------------");
        System.out.println("Conteudos inscritos: "+ devPedro.getConteudoInscritos());
        System.out.println("Conteudos concluidos: "+ devPedro.getConteudoConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());

        System.out.println("********");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-------------------");
        System.out.println("Conteudos inscritos: "+ devJoao.getConteudoInscritos());
        System.out.println("Conteudos concluidos: "+ devJoao.getConteudoConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


       


    }
}
