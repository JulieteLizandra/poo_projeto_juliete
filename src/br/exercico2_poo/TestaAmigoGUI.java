package br.exercico2_poo;
import java.util.List;
import javax.swing.JOptionPane;

public class TestaAmigoGUI {

	public static void main(String[] args) {
		int maxMensagens = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade m�xima de Mensagens?"));
		SistemaAmigo sistema = new SistemaAmigo(maxMensagens);
		int numAmigos = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de participantes da brincadeira?"));
		for (int k=0; k < numAmigos; k++) {
			String nomeAmigo = JOptionPane.showInputDialog("Qual o seu nome?");
			String emailAmigo = JOptionPane.showInputDialog("Qual o seu email?");
			
			try {
				sistema.cadastraAmigo(nomeAmigo, emailAmigo);
				
			}catch(AmigoJaExisteException e) {
				JOptionPane.showInputDialog(null,"N�o foi poss�vel cadastar");
				e.printStackTrace();
			}
			
		}
		List<Amigo> todosOsParticipantes = sistema.pesquisaTodosOsParticipantes();
		for(Amigo a: todosOsParticipantes) {
			String emailSorteado = JOptionPane.showInputDialog("Quem � o amigo de"+a.getEmail()+"?");
			try {
			sistema.configuraAmigoSecretoDe(a.getEmail(), emailSorteado);	
			
		} catch(AmigoInexistenteException e) {
			JOptionPane.showInputDialog(null, "Problema no sorteio.");
			e.printStackTrace();
		}
		
	}
		String texto = JOptionPane.showInputDialog("Digite sua mensagem:");
		String emailRemetente = JOptionPane.showInputDialog("Qual seu email?");
		String mensagemEhAnonima = JOptionPane.showInputDialog("A mensagem � an�nima? Sim (S) ou N�o (N)?");
		boolean ehAnonima = false;
		if(mensagemEhAnonima.equals("S")) {
			ehAnonima = true;
		}
	 sistema.enviarMensagemParaTodos(texto, emailRemetente, ehAnonima);
		
	}

}
