package teste;

public class Teste1 {
	private String login;
	private String senha;
	String nome;
	
	public Teste1(final String login, final String senha) {
		this.login = login;
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	
	protected String getSenha() {
		return senha;
	}
}
