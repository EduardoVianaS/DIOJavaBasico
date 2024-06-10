import combr.com.dio.desafio.dominio.Bootcamp;
import combr.com.dio.desafio.dominio.Curso;
import combr.com.dio.desafio.dominio.Dev;
import combr.com.dio.desafio.dominio.Mentoria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria1 = new Mentoria();


        Bootcamp bootcamp1 = new Bootcamp();

        bootcamp1.setNome("Java developer");
        bootcamp1.setDescricao("desenvolvimento backend java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);


        Dev eduardo = new Dev();
        eduardo.setNome("Eduardo");
        eduardo.inscreverBootcamp(bootcamp1);
        System.out.println(eduardo.getConteudosInscritos());





    }
}