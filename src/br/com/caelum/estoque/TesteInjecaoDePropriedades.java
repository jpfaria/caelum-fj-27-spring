package br.com.caelum.estoque;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesteInjecaoDePropriedades {

	public static void main(String[] args) {
		
		// cria contexto do Spring
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		SpringBean springBean = (SpringBean) applicationContext.getBean("springBean");
		
		if (springBean != null) {
			
			System.out.println("instanciado!");
			System.out.println(springBean.getNome());
			System.out.println(springBean.getQuantidade());
			System.out.println(springBean.getPropriedades().get("cidade"));
			
			for (String string : springBean.getNomes()) {
				
				System.out.println(string);
				
			}
			
		}
		
	}
	
}