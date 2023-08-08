package bytebank_herdado;

public class EditorVideo extends Funcionario {
		
	public double getBonificacao(){
		System.out.println("chamando o metodo de bonificacao do editor de video");
		return super.getBonificacao() + 100;
	}

}

	
