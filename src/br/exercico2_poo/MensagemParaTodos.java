package br.exercico2_poo;

public class MensagemParaTodos extends Mensagem {
	public MensagemParaTodos(String texto,String emailRemetente, boolean anonima ) {
		super(texto, emailRemetente, anonima);
		
	}
	public String getTextoCompletoAExibir() {
		if(super.ehAnonima()) {
			return "Mensagem para Todos. Texto:"+super.getTexto();
		}else {
			return "Mensagem de"+super.getEmailRemetente()+"para todos.\n"+"Texto:"+super.getTexto();
			
		}

	}
	
	}


