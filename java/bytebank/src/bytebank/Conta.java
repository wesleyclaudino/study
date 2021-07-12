package bytebank;

public class  Conta{
	private double saldo;
	private int agencia;
	private int numero;
	private int operacao;
	private Cliente titular;
	private static int totalDeContas;
	
	public Conta(int agencia, int numero) {
		totalDeContas++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Valor inv�lido.");
			return;
		}
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Valor inv�lido.");
			return;
		}
		this.numero = numero;
	}
	
	public int getOperacao() {
		return this.operacao;
	}
	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return totalDeContas;
	}
}