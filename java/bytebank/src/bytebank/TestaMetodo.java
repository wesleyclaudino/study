package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDoFulano = new ContaPoupanca(1337, 24226);
		
		contaDoFulano.getTitular().setNome("Fulano da Silva");

		contaDoFulano.deposita(100);
		System.out.println("Dep�sito feito com sucesso. " + contaDoFulano.getTitular().getNome() + ", seu novo saldo � de: " + contaDoFulano.getSaldo() + " R$");
		
		contaDoFulano.saca(20);
		System.out.println("Saque efetuado com sucesso. " + contaDoFulano.getTitular().getNome() + ", seu novo saldo � de: " + contaDoFulano.getSaldo() + " R$");
		
		Conta contaDoSicrano = new ContaCorrente(1337, 24227);
		
		contaDoSicrano.getTitular().setNome("Sicrano Avelar");
		
		contaDoSicrano.deposita(1000);
		System.out.println("Dep�sito feito com sucesso. " + contaDoSicrano.getTitular().getNome() + ", seu novo saldo � de: " + contaDoSicrano.getSaldo() + " R$");
		
		if(contaDoSicrano.transfere(300, contaDoFulano)) {
			System.out.println("Transfer�ncia de " + contaDoSicrano.getTitular().getNome() + " para " + contaDoFulano.getTitular().getNome() + ", foi feita com sucesso, seu novo saldo � de: " + contaDoSicrano.getSaldo() + " R$");
		}else {
			System.out.println("Falha na transfer�ncia. Seu saldo n�o � suficiente.");
		}
		System.out.println("Novo saldo de " + contaDoFulano.getTitular().getNome() + ": " + contaDoFulano.getSaldo() + " R$");
	}
}