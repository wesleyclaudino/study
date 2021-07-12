package exc011;

public class TesteMetodos {
	
	public static void main(String[] args) {
		
		//Teste de Funcionário
		Funcionario func1 = new Funcionario();
		
		func1.setNome("Primeiro Funcionário");
		func1.setSalario(2300);
		func1.setCpf("000.000.000-00");
		
		System.out.println("O salário de " + func1.getNome() + " é de: " + func1.getSalario());
		
		System.out.println("Agora com a bonificação seu salário é de: " + func1.getBonificacao());
		
		//Teste de Gerente
		Gerente g1 = new Gerente();
		g1.setNome("Primeiro Gerente");
		g1.setCpf("111.111.111-11");
		g1.setSalario(5000);
		
		System.out.println("O salário de " + g1.getNome() + " é de: " + g1.getSalario());
		
		g1.setSenha(40028922);
		boolean autentica = g1.autenticacao(40028922);
		
		System.out.println(autentica);
		
		System.out.println("Com a bonificação, o salário do gerente " + g1.getNome() + " é de: " + g1.getBonificacao());
	}
}