package br.com.caelum.estoque;

public class Relatorio {

	private String resumo;

	// constructor privado
	private Relatorio(String resumo) {
		this.resumo = resumo;
	}

	public String getResumo() {
		return resumo;
	}

	public static Relatorio comResumo(String resumo) {
		return new Relatorio(resumo);
	}

}
