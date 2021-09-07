package excecoes;

public class Conexao implements AutoCloseable {
	
	@Override
	public void close() {
		System.out.println("Fechando a conexão.");

	}

	public Conexao() {
		System.out.println("Abrindo a conexão.");
	}
	
	public void leDados() {
		System.out.println("Recebendo dados.");
		throw new IllegalStateException();
	}
}