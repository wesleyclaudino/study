package orientacao_a_objetos;

public class TesteMetodos {

	public static void main(String[] args) {
		// Teste de Gerente
		Funcionario g1 = new Gerente();
		g1.setNome("Marcelo");
		g1.setCpf("111.111.111-11");
		g1.setSalario(5000);

		System.out.println("O salário de " + g1.getNome() + " é de: " + g1.getSalario());

		((Gerente)g1).setSenhaDoCofre(40028922);
		boolean autentica = ((Gerente)g1).autenticacao(40028922);
		
		System.out.println(autentica);

		System.out.println("Com a bonificação, o salário do gerente " + g1.getNome() + " é de: " + g1.getBonificacao());

		// Teste de Estagiário
		Funcionario e1 = new Estagiario();
		e1.setNome("Wesley");
		e1.setCpf("222.222.222-22");
		e1.setSalario(900);

		System.out.println("O salário de " + e1.getNome() + " é de: " + e1.getSalario());

		System.out.println("Com a bonificação, o salário do estagiário " + e1.getNome() + " é de: " + e1.getBonificacao());
		
		// Teste do Sistema Interno
		Gerente g = new Gerente();
		g.setSenhaDoCofre(40028922);
		Administrador adm = new Administrador();
		adm.setSenhaDoCofre(40028922);
		
		SistemaInterno si = new SistemaInterno();
		si.autenticacao(g);
		si.autenticacao(adm);
	}
}