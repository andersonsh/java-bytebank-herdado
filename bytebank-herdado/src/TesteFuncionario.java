
public class TesteFuncionario {

	public static void main(String[] args) {

		EditorVideo nico = new EditorVideo();
		
		nico.setNome("Nico Pinico");
		nico.setCpf("32552669880");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		Autenticavel referencia = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Luciano");
		g1.setCpf("25566547880");
		g1.setSalario(5000.0);
		g1.setSenha(2222);
		
		System.out.println("Funcionario " + g1.getNome() +
				" recebe " + g1.getBonificacao() + " de bonus");
	
		System.out.println(g1.auntentica(2222));
	}

}
