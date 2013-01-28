package br.com.caelum.estoque;

import org.springframework.beans.factory.FactoryBean;

@SuppressWarnings("rawtypes")
public class RelatorioFactoryBean implements FactoryBean {

	public Object getObject() throws Exception {

		return Relatorio.comResumo("Relatorio de progresso");

	}

	public Class getObjectType() {
		return Relatorio.class;
	}

	public boolean isSingleton() {
		return false;
	}

}
