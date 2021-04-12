package br.exercico2_poo;
/**
 * Classe para gerenciar um sistema de amigo secreto.
 *@author juhli
 */

public class Amigo extends SistemaAmigo {
	private String nome;
	private String email;
	private String emailAmigoSorteado;
	
	public Amigo(String nomeAmigo, String emailAmigo) {
		this.setNome(nomeAmigo);
		this.setEmail(emailAmigo);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailAmigoSorteado() {
		return emailAmigoSorteado;
	}

	public void setEmailAmigoSorteado(String emailAmigoSorteado) {
		this.emailAmigoSorteado = emailAmigoSorteado;
	}

}
