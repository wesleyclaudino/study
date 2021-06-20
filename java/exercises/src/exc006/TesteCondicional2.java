package exc006;

public class TesteCondicional2 {
	
	public static void main(String[] args) {
		System.out.println("Testando Condicionais 2:");
		int idade = 16;
		boolean acompanhado = true;
		
		if(idade >= 18 || acompanhado) {
			System.out.println("Seja Bem-Vindo(a)!!!");
		}else {
			System.out.println("Infelizmente, voçê não pode entrar.");
		}
	}
}