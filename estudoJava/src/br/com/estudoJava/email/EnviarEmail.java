package br.com.estudoJava.email;

public class EnviarEmail {
	//utiliza uma biblioteca de email
	
	public void enviar(String to, String text) {
		System.out.printf("Enviando email para: %s. O Texto: %s ", to, text);
	}
	

}
