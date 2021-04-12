package br.exercico2_poo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaAmigoMap {
	
	private Map< String, Amigo> amigos;
	private List<Mensagem> mensagens;
	private int maxMensagens;
	public static final int DEFAULT_MAX_MENSAGENS = 1000;
	
	
	public SistemaAmigoMap(int maxMensagens) {
		this.amigos = new HashMap<>();
		this.mensagens = new ArrayList<>();
		this.setMaxMensagens(maxMensagens);
	}
	private void setMaxMensagens(int maxMensagens) {
		this.maxMensagens= maxMensagens;
		
	}
	
	public int getMaxMensagens() {
		return maxMensagens;
	}
	public SistemaAmigoMap() {
		this (DEFAULT_MAX_MENSAGENS);
	}
	
	
	public void cadastraAmigo(String nomeAmigo, String emailAmigo) throws AmigoJaExisteException {
		if(!this.amigos.containsKey(emailAmigo)) {
			Amigo novoAmigo = new Amigo(nomeAmigo, emailAmigo);
			this.amigos.put(emailAmigo,novoAmigo);
		}else {
			throw new AmigoJaExisteException("Já Existe essa Pessoa no Sistema.");
		}
			}
	
	public Amigo pesquisaAmigo(String emailAmigo) throws AmigoInexistenteException{
		Amigo a = this.amigos.get(emailAmigo);
		if(a!=null) {
			return a;
			} else {
				throw new AmigoInexistenteException("Não Existe Usuário com esse Email.");	
			}	
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
		List<Mensagem> todasMensagens = new ArrayList<>();
		if(Mensagem msg: this.mensagens) {
			todasMensagens.add(msg);
		}
		return todasMensagens;
	}
	public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException{
			if(pesquisaAmigo(emailDaPessoa).getEmail() != null) {
				pesquisaAmigo(emailDaPessoa).setEmailAmigoSorteado(emailAmigoSorteado);
				
			}
			throw new AmigoInexistenteException("Não existe um amigo com este email cadastrado no sistema.");
		}
		
	
	public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException{
		if(this.amigos.containsKey(emailDaPessoa)) {
			if(this.amigos.get(emailDaPessoa).getEmailAmigoSorteado() != null) {
				String emailAmigoSorteado = this.amigos.get(emailDaPessoa).getEmailAmigoSorteado();
				return emailAmigoSorteado;
			}
			
			} else {
				throw new AmigoInexistenteException("Não exixte nenhum amigo com esse email cadastrado.");
				
			}
		
		}
			
	public Map<String,Amigo> pesquisaTodosOsParticipantes() {
		Map<String,Amigo> participantes = this.amigos;
		return participantes;
	}
	

}
