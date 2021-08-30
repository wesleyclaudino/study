package orientacao_a_objetos;

public class SistemaInterno {
	private int senhaDoCofre = 40028922;
	
	public void autenticacao(Autenticavel fa) {
		boolean autenticou = fa.autenticacao(this.senhaDoCofre);
		if(autenticou) {
			System.out.println("Pode entrar no sistema!");
		}else {
			System.out.println("Não pode entrar no sistema!");
		}
	}
}