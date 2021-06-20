package exc007;

public class TesteEscopo {
	
	public static void main(String[] args) {
		System.out.println("Testando Escopo de Variáveis:");
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado;
		
		if(quantidadePessoas > 1) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		
		if(idade >= 18 || acompanhado) {
			System.out.println("Seja Bem-Vindo(a)!!!");
		}else {
			System.out.println("Infelizmente, voçê não pode entrar.");
		}
	}
}
