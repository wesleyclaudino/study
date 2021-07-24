package exc011;

public abstract class FuncionarioAutenticavel extends Funcionario {
	private int senhaDoCofre;
	
	public boolean autenticacao(int senha){
		if(senha == this.senhaDoCofre){
			return true;
		}else {
			return false;
		}
	}
	
	public void setSenhaDoCofre(int senha) {
		this.senhaDoCofre = senha;
	}
}