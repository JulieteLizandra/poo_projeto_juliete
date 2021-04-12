package br.exercico2_poo;

import java.util.List;

public class TestaSistemaAmigo {

	public static void main(String[] args) {
		SistemaAmigo sistema = new SistemaAmigo();
		try {
			sistema.cadastraAmigo("Roberto", "roberto@gmail.com");
			sistema.cadastraAmigo("Joana", "joanasilva@gmail.com");
			sistema.configuraAmigoSecretoDe("roberto@gmail.com","joanasilva@gmail.com");
			sistema.configuraAmigoSecretoDe("joanasilva@gmail.com", "roberto@gmail.com");
			sistema.enviarMensagemParaAlguem("Oi, Roberto", "joanasilva@gmail.com", "roberto@gmail.com", true);
			sistema.enviarMensagemParaTodos("Oi pessoal, tudo bem?", "joanasilva@gmail.com", true);
			List<Mensagem> mensagensAnonimas = sistema.pesquisaMensagensAnonimas(true);
			for(Mensagem m: mensagensAnonimas) {
				System.out.println(m.getTextoCompletoAExibir());
			}
			sistema.pesquisaAmigoSecretoDe("joanasilva@gmail.com");
			
		} catch(AmigoJaExisteException | AmigoInexistenteException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();

	}

}
}
