package bytebank_herdado;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		
		
		Gerente valter = new Gerente();
		valter.setNome("Valter Vitor");
		valter.setCpf("223385489-5");
		valter.setSalario(2600.00);
		
		System.out.println(valter.getNome());
		System.out.println(valter.getBonificacao());

	}

}
