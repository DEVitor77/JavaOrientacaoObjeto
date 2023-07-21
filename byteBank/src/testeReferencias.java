
public class testeReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("O SALDO DA PRIMEIRA CONTA É "  + primeiraConta.saldo);
		
		
		Conta segundaConta = primeiraConta;
		System.out.println("O SALDO DA SEGUNDA CONTA É " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("O SALDO DA SEGUNDA CONTA É " + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("sao a mesmissima conta");
		}
		System.out.println(primeiraConta);
	} 
}
 