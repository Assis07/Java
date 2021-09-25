package Aula3;

public class TestaConta {

	public static void main(String[] args) {
		
		//instanciando objeto conta 1 dot tipo ContaCorrente
		ContaCorrente conta1 = new ContaCorrente();
		
		conta1.setNumeroConta(777);
		conta1.setAgencia("Agiotagem");
		conta1.setCliente("Zeca Pagodinho");
		conta1.setClienteVip(true);
		conta1.deposito(10);
		conta1.deposito(10);
		conta1.deposito(10);
		conta1.transferencia(10);
		conta1.saque(10);
		conta1.setNumeroAgencia(2346784);
		
		conta1.imprimeExtrato();
	}

}
