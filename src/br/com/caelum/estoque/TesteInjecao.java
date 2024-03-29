package br.com.caelum.estoque;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesteInjecao {

	public static void main(String[] args) {

		// cria contexto do Spring
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// obtém o gerenciador
		GerenciadorDeProduto gerenciador = context.getBean(
				"gerenciadorProduto", GerenciadorDeProduto.class);

		
		GerenciadorDeProduto gerenciador2 = context.getBean(
				"gerenciadorProduto", GerenciadorDeProduto.class);
		
		System.out.println(gerenciador == gerenciador2);
		
		// cria um Produto como se o usuário tivesse preenchido um formulário
		Produto produto = new Produto();
		produto.setDescricao("Livro Spring in Action");
		produto.setQuantidade(10);

		// chama a lógica e vê resultado
		gerenciador.novoProduto(produto);

		// verifica que o produto foi adicionado ao nosso dao em memoria
		for (Produto p : gerenciador.getProdutos()) {
			System.out.println("Descricao: " + p.getDescricao());
			System.out.println("Quantidade: " + p.getQuantidade());
		}
		
		System.out.println(gerenciador.getRelatorio().getResumo());

	}

}
