package exc011;

public class TesteMetodos {
	
	public static void main(String[] args) {
		
		//Teste de Funcion�rio
		Funcionario func1 = new Funcionario();
		
		func1.setNome("Primeiro Funcion�rio");
		func1.setSalario(2300);
		func1.setCpf("000.000.000-00");
		
		System.out.println("O sal�rio de " + func1.getNome() + " � de: " + func1.getSalario());
		
		System.out.println("Agora com a bonifica��o seu sal�rio � de: " + func1.getBonificacao());
		
		//Teste de Gerente
		Gerente gen1 = new Gerente();
		gen1.setNome("Primeiro Gerente");
		gen1.setCpf("111.111.111-11");
		gen1.setSalario(5000);
		
		System.out.println("O sal�rio de " + gen1.getNome() + " � de: " + gen1.getSalario());
		
		gen1.setSenha(40028922);
		boolean autentica = gen1.autenticacao(40028922);
		
		System.out.println(autentica);
	}
}