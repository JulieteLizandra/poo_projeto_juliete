package br.exercico2_poo;
import java.util.ArrayList;
import java.util.List;

/**
 * Construtor padrão da classe.
 * @author juhli
 */
public class SistemaAmigo {
	private List<Amigo> amigos;
	private List<Mensagem> mensagens;
	private int maxMensagens;
	public static final int DEFAULT_MAX_MENSAGENS = 1000;
	
	
	public SistemaAmigo(int maxMensagens) {
		this.amigos = new ArrayList<>();
		this.mensagens = new ArrayList<>();
		this.setMaxMensagens(maxMensagens);
	}
	private void setMaxMensagens(int maxMensagens) {
		this.maxMensagens= maxMensagens;
		
	}
	
	public int getMaxMensagens() {
		return maxMensagens;
	}
	public SistemaAmigo() {
		this (DEFAULT_MAX_MENSAGENS);
	}
	
	
	public void cadastraAmigo(String nomeAmigo, String emailAmigo) throws AmigoJaExisteException {
		Amigo novoAmigo = new Amigo(nomeAmigo, emailAmigo);
		if(!this.amigos.contains(novoAmigo)) {
			this.amigos.add(novoAmigo);
		}else {
			throw new AmigoJaExisteException("Já Existe essa Pessoa no Sistema.");
		}
			}
	
	public Amigo pesquisaAmigo(String emailAmigo) throws AmigoInexistenteException{
		
		for(Amigo a: this.amigos) {
			if(a.getEmail().equals(emailAmigo)) {
				return a;
			}
		}
		throw new AmigoInexistenteException("Não Existe Usuário com esse Email.");	
		}
	
	public void enviarMensagemParaTodos(String texto, String emailRemetente,boolean ehAnonima) {
		
	}
	public void enviarMensagemParaAlguem(String texto, String emailRemetente,String emailDestinatario, boolean ehAnonima) {
		
	}
	public List<Mensagem> pesquisaMensagensAnonimas(boolean ehAnonima) {
		List<Mensagem> MensagemA = new ArrayList<>();
		for (Mensagem msg: mensagens){
			if(msg.ehAnonima()) {
				MensagemA.add(msg);
			}
		}
		return MensagemA;
	}
	public List<Mensagem> pesquisaTodasAsMensagens() {
		return this.mensagens;
		
	}
	public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException{
			if(pesquisaAmigo(emailDaPessoa).getEmail() != null) {
				pesquisaAmigo(emailDaPessoa).setEmailAmigoSorteado(emailAmigoSorteado);
				
			}
			throw new AmigoInexistenteException("Não existe um amigo com este email cadastrado no sistema.");
		}
		
	
	public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException{
		
		for(Amigo a: this.amigos) {
			if(a.equals(emailDaPessoa)) {
				return a;				
			}
			throw new AmigoInexistenteException("Não exixte nenhum amigo com esse email cadastrado.");	
		}
		
		}
			
	public List<Amigo> pesquisaTodosOsParticipantes() {
		List<Amigo> participantes = amigos;
		participantes.addAll(amigos);
		return participantes;
	}
	

}
