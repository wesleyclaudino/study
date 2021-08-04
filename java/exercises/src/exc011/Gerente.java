package exc011;

public class Gerente extends Funcionario implements Autenticavel {
	public int senhaDoCofre;
	
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
	
	@Override
	public double getBonificacao() {
		return super.getSalario() + (super.getSalario() / 2);
	}
}