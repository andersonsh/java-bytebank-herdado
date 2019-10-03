
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador ad = new Administrador();
		ad.setSenha(333);
		
		Cliente cl = new Cliente();
		cl.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(ad);
		si.autentica(cl);
	}

}
