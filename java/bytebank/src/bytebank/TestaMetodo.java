package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoFulano = new Conta();
		contaDoFulano.titular = new Cliente();
		
		contaDoFulano.titular.nome = "Fulano da Silva";

		contaDoFulano.deposita(100);
		System.out.println("Dep�sito feito com sucesso. " + contaDoFulano.titular.nome + ", seu novo saldo � de: " + contaDoFulano.saldo);
		
		contaDoFulano.saca(20);
		System.out.println("Saque efetuado com sucesso. " + contaDoFulano.titular.nome + ", seu novo saldo � de: " + contaDoFulano.saldo);
		
		Conta contaDoSicrano = new Conta();
		contaDoSicrano.titular = new Cliente();
		
		contaDoSicrano.titular.nome = "Sicrano Avelar";
		
		contaDoSicrano.deposita(1000);
		System.out.println("Dep�sito feito com sucesso. " + contaDoSicrano.titular.nome + ", seu novo saldo � de: " + contaDoSicrano.saldo);
		
		if(contaDoSicrano.transfere(300, contaDoFulano)) {
			System.out.println("Transfer�ncia de " + contaDoSicrano.titular.nome + " para " + contaDoFulano.titular.nome + ", foi feita com sucesso, seu novo saldo � de: " + contaDoSicrano.saldo);
		}else {
			System.out.println("Falha na transfer�ncia. Seu saldo n�o � suficiente.");
		}
		System.out.println("Novo saldo de " + contaDoFulano.titular.nome + ": " + contaDoFulano.saldo);
	}
}