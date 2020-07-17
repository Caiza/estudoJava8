package br.com.estudoJava.exemplo;

import java.util.List;

import br.com.estudoJava.Fatura;
import br.com.estudoJava.dao.FaturaDao;
import br.com.estudoJava.email.EnviarEmail;

public class Exemplo {

	public static void main(String[] args) {
		
		List<Fatura> faturasVencidas = new FaturaDao().buscarFaturaVencida();
		
		EnviarEmail  enviarEmail = new EnviarEmail();
		
//		for(Fatura f: faturasVencidas) {
//			enviarEmail.enviar(f.getEmailDevedor(), f.resumo());
//		}
		
		faturasVencidas.forEach(f -> {
			enviarEmail.enviar(f.getEmailDevedor(), f.resumo());
			f.setNotificacaoEnviada(true);
		});// enviarEmail é final e não pode ser mais alterado
	}

}
