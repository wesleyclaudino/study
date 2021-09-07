package excecoes;

public class Conexao implements AutoCloseable {
	
	@Override
	public void close() {
		System.out.println("Fechando a conex�o.");

	}

	public Conexao() {
		System.out.println("Abrindo a conex�o.");
	}
	
	public void leDados() {
		System.out.println("Recebendo dados.");
		throw new IllegalStateException();
	}
}