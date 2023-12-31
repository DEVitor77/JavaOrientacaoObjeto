package bytebank_herdado;
// gerente é um Funcionario, gerente herda da classe funcionario, assina um contrato Autenticavel, é um autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao(){
		System.out.println("chamando o metodo de bonificacao do GERENTE");
		return  super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}

	
