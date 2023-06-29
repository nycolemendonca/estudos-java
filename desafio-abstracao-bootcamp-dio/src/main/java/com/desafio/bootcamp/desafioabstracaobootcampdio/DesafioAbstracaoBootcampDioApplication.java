package com.desafio.bootcamp.desafioabstracaobootcampdio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DesafioAbstracaoBootcampDioApplication {

	public static void main(String[] args) {

		SpringApplication.run(DesafioAbstracaoBootcampDioApplication.class, args);

		Curso curso01 = new Curso();
		curso01.setTitulo("Curso Java");
		curso01.setDescricao("Descrição Curso Java");
		curso01.setCargaHoraria(8);
//		System.out.println(curso01);

		Curso curso02 = new Curso();
		curso02.setTitulo("Curso JavaScript");
		curso02.setDescricao("Descrição Curso JavaScript");
		curso02.setCargaHoraria(6);
//		System.out.println(curso02);

		Mentoria mentoria01 = new Mentoria();
		mentoria01.setTitulo("Mentoria de Java");
		mentoria01.setDescricao("Descrição Mentoria Java");
		mentoria01.setData(LocalDate.now());
//		System.out.println(mentoria01);

		Mentoria mentoria02 = new Mentoria();
		mentoria02.setTitulo("Mentoria de JavaScript");
		mentoria02.setDescricao("Descrição Mentoria JavaScript");
		mentoria02.setData(LocalDate.now());
//		System.out.println(mentoria02);

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição");
		bootcamp.getConteudos().add(curso01);
		bootcamp.getConteudos().add(curso02);
		bootcamp.getConteudos().add(mentoria01);

		Dev devMargot = new Dev();
		devMargot.setNome("Margot");
		devMargot.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Margot: " + devMargot.getConteudosInscritos());
		devMargot.progredir();
		devMargot.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos: " + devMargot.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos: " + devMargot.getConteudosConcluidos());
		System.out.println("XP: " + devMargot.calcularXpTotal());

		System.out.println("---------------");

		Dev devNycole = new Dev();
		devNycole.setNome("Nycole");
		devNycole.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Nycole: " + devNycole.getConteudosInscritos());
		devNycole.progredir();
		devNycole.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos: " + devNycole.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos: " + devNycole.getConteudosConcluidos());
		System.out.println("XP: " + devNycole.calcularXpTotal());
	}

}
