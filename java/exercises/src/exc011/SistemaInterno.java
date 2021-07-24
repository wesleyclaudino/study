package exc011;

public class SistemaInterno {
	private int senhaDoCofre = 40028922;
	
	public void autenticacao(FuncionarioAutenticavel fa) {
		boolean autenticou = fa.autenticacao(this.senhaDoCofre);
		if(autenticou) {
			System.out.println("Pode entrar no sistema!");
		}else {
			System.out.println("N�o pode entrar no sistema!");
		}
	}
}