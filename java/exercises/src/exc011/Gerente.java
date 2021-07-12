package exc011;

public class Gerente extends Funcionario {
	private int senha;
	
	public boolean autenticacao(int senha){
		if(senha == this.senha){
			return true;
		}else {
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + (super.getSalario() / 2);
	}
}