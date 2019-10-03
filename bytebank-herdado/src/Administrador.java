
public class Administrador extends Funcionario implements Autenticavel {
	private AutenticacaoUtil autenticador;
	
	public Administrador() {
		 this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean auntentica(int senha) {
		return this.autenticador.auntentica(senha);
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}
	

}
