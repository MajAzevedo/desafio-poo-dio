package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	
	
	private LocalDate data;
	
	public Mentoria() {
		
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + this.getTitulo() + ", descricao=" + this.getDescricao() + ", data=" + data + "]";
	}

	@Override
	public Double calcularXP() {
		return XP_PADRAO + 20d;
	}
	
	
	

}
