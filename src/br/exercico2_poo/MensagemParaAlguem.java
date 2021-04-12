package br.exercico2_poo;

public class MensagemParaAlguem extends Mensagem {
	public String emailDestinatario;
	
	public MensagemParaAlguem(String texto,String emailRemetente, String emailDestinatario, boolean anonima ) {
		super(texto, emailRemetente, anonima);
		this.emailDestinatario = emailDestinatario;
	}
	
	public String getTextoCompletoAExibir() {
		if(super.ehAnonima()) {
			return "Mensagem para"+getEmailDestinatario()+"Texto:"+super.getTexto();
		}else {
			return getTextoCompletoAExibir();
			
		}

	}

	public String getEmailDestinatario() {
		return emailDestinatario;
	}

	public void setEmailDestinatario(String emailDestinatario) {
		this.emailDestinatario = emailDestinatario;
	}
	
}
