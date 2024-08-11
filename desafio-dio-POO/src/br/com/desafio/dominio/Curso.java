package br.com.desafio.dominio;


public class Curso extends Conteudo{
	
	private Integer cargaHoraria;
	
	public Curso() {
	
	}
	
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + this.getTitulo() + ", descricao=" + this.getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}

	@Override
	public Double calcularXP() {
		return XP_PADRAO + 20d;
	}
	
	

}
