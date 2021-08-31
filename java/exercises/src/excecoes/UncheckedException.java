package excecoes;

public class UncheckedException extends RuntimeException {
	
	public UncheckedException() {
		super();
	}
	
	public UncheckedException(String msg) {
		super(msg);
	}
}