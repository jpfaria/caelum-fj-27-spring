package br.com.caelum.estoque;

import java.util.List;

import br.com.caelum.estoque.dao.ProdutoDAO;

public class GerenciadorDeProduto {
	
	private ProdutoDAO produtoDao;
	
	private Relatorio relatorio;
	
	/*
	public GerenciadorDeProduto(ProdutoDAO produtoDao) {
		this.produtoDao = produtoDao;
	}
	*/

	public void setProdutoDAO(ProdutoDAO produtoDao) {
		this.produtoDao = produtoDao;
	}

	public void novoProduto(Produto produto) {
		System.out.println("Salvando produto.");
		this.produtoDao.salvar(produto);
	}
	
	public List<Produto> getProdutos() {
		return produtoDao.listar();
	}

	public Relatorio getRelatorio() {
		return relatorio;
	}

	public void setRelatorio(Relatorio relatorio) {
		this.relatorio = relatorio;
	}
	

}
