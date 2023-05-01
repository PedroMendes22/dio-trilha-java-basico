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
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Mentoria sobre Java");
        mentoria.setData(LocalDate.now()); //na hora que criar instancia a atribuilçao
        System.out.println(mentoria);

        
    }
}
