package exc005;

public class TesteCondicional {
	
	public static void main(String[] args) {
		System.out.println("Testando Condicionais:");
		int idade = 16;
		int quantidadePessoas = 3;
		
		if(idade >= 18) {
			System.out.println("Maior de idade.");
			System.out.println("Seja Bem-Vindo(a)!!!");
		}else if(quantidadePessoas >= 2){
			System.out.println("Menor de idade, mas pode entrar, pois está acompanhado.");
			System.out.println("Seja Bem-Vindo(a)!!!");
		}else {
			System.out.println("Infelizmente, voçê não pode entrar.");
		}
	}
}