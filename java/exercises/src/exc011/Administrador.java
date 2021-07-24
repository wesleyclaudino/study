package exc011;

public class Administrador extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
		return super.getSalario() * 2;
	}

}