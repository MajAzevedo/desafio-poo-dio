package br.com.desafio;

import java.time.LocalDate;

import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

public class Application {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Curso de Java para iniciantes");
		curso1.setCargaHoraria(60);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso de Spring Boot");
		curso2.setDescricao("Curso de Spring Boot para intermediario");
		curso2.setCargaHoraria(90);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Iniciação Java");
		mentoria.setDescricao("Vídeo sobre iniciação Java");
		mentoria.setData(LocalDate.of(2024, 8, 11));
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição para Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);	
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devMarcelo = new Dev();
		devMarcelo.setNome("Marcelo");
		devMarcelo.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos de Marcelo: " + devMarcelo.getConteudosInscritos());
		devMarcelo.progredir();
		System.out.println("Conteudos Inscritos de Marcelo: " + devMarcelo.getConteudosInscritos());
		System.out.println("Conteudos concluídos de Marcelo: " + devMarcelo.getConteudosConcluidos());
		System.out.println("XP: " + devMarcelo.calcularTotalXp());
		
		devMarcelo.progredir();
		System.out.println("Conteudos Inscritos de Marcelo: " + devMarcelo.getConteudosInscritos());
		System.out.println("Conteudos concluídos de Marcelo: " + devMarcelo.getConteudosConcluidos());
		System.out.println("XP: " + devMarcelo.calcularTotalXp());
		
		Dev devJoao = new Dev();
		devJoao.setNome("Marcelo");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos de João: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("Conteudos Inscritos de João: " + devJoao.getConteudosInscritos());
		System.out.println("Conteudos concluídos de João: " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
		
	}

}
