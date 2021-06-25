package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoFulano = new Conta();
		
		contaDoFulano.deposita(100);
		System.out.println(contaDoFulano.saldo);
		
		contaDoFulano.saca(20);
		System.out.println(contaDoFulano.saldo);
		
		Conta contaDoSicrano = new Conta();
		
		contaDoSicrano.deposita(1000);
		System.out.println(contaDoSicrano.saldo);
		
		if(contaDoSicrano.transfere(300, contaDoFulano)) {
			System.out.println("Transfer�ncia foi feita com sucesso, seu novo saldo � de: " + contaDoSicrano.saldo);
		}else {
			System.out.println("Falha na transfer�ncia. Seu saldo n�o � suficiente.");
		}
		System.out.println(contaDoFulano.saldo);
	}
}