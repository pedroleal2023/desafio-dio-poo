import br.com.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descrição: Bootcamp Java.");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("Descrição: Bootcamp Javascript.");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("Descrição: mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição: Bootcamp Java Developer.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devPedro.getConteudosInscritos());

        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Pedro: " + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Pedro: " + devPedro.getConteudosConcluido());
        System.out.println("XP: " + devPedro.calcularTotalXp());

        System.out.println("---------");

        Dev devMatue = new Dev();
        devMatue.setNome("Matue");
        devMatue.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devMatue.getConteudosInscritos());
        devMatue.progredir();
        devMatue.progredir();
        devMatue.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Matue: " + devMatue.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Matue: " + devPedro.getConteudosConcluido());
        System.out.println("XP: " + devMatue.calcularTotalXp());

    }
}