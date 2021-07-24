package exc011;

public class Gerente extends FuncionarioAutenticavel {
	
	@Override
	public double getBonificacao() {
		return super.getSalario() + (super.getSalario() / 2);
	}
}