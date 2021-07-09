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
		Gerente gen1 = new Gerente();
		gen1.setNome("Primeiro Gerente");
		gen1.setCpf("111.111.111-11");
		gen1.setSalario(5000);
		
		System.out.println("O salário de " + gen1.getNome() + " é de: " + gen1.getSalario());
		
		gen1.setSenha(40028922);
		boolean autentica = gen1.autenticacao(40028922);
		
		System.out.println(autentica);
	}
}