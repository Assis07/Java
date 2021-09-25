package Aula3;

public class ContaCorrente {
		
	private String agencia = "Ag�ncia do Lula";
	private String cliente;
	private double saldo;
	private int numeroConta;
	private int numeroAgencia;
	private boolean clienteVip;
	private String operacoesExtrato = "";
	
	// setter/getters
	// set = definir | get: retornar
		
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	
	//m�todo para aumentar saldo
	private void aumentaSaldo(double valor){
		this.saldo += valor;
	
	}
	
	//m�todo para diminuir saldo
	private void diminuiSaldo(double valor){
		this.saldo -= valor;
	
	}
	
	//public void setSaldo(double valor, char opcao) {
		//saldo atual + valorDeposito
		// D = Deposito +
		// T = Transferencia -
		// S = Saque -
		//if(opcao =='D'){
		//this.saldo += valor;
		//}
		//else if (opcao =='T' || opcao == 'S'){
			//this.saldo -= valor;		
		//}
	//}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public boolean isClienteVip() {
		return clienteVip;
	}
	public void setClienteVip(boolean clienteVip) {
		this.clienteVip = clienteVip;
	}
	
	public void deposito(double valorDeposito){
		if(valorDeposito >0){
		aumentaSaldo(valorDeposito);	
		System.out.println("Valor depositado: "+valorDeposito);
		System.out.println("Saldo atualizado: "+getSaldo());
		adicionaExtrato('D', valorDeposito);
		}
		else{
			System.out.println("N�o foi poss�vel depositar R$ "+valorDeposito);
			adicionaExtrato('X', valorDeposito);
		}		
	}
	
	public void transferencia(double valorTransferir){
		retirada(valorTransferir, "Transferencia", 'T');
	}
	
	private void retirada(double valor, String frase, char operacao){
		if (getSaldo () >= valor){
			diminuiSaldo(valor);
			System.out.println("Valor" +frase+": "+valor);
			System.out.println("Saldo atualizado: "+getSaldo());
			adicionaExtrato(operacao, valor);
		}
		else
		{
			System.out.println(frase+"de "+valor+" R$ n�o realizado");
			System.out.println("Saldo dispon�vel: "+getSaldo());
			adicionaExtrato('X', valor);
		}	
		
	}
	
	public void saque(double valorSacado){
		retirada(valorSacado, "Saque", 'S');	
	}
	
	private void adicionaExtrato(char operacao, double valor){
		String frase = "";
		
		switch (operacao){
		case 'D': {
			frase ="| Dep�sito de R$ "+valor+" .... Saldo: "+getSaldo()+" |\n";
			
			break;
		}
		
		case 'T': {
			frase ="| Transfer�ncia de R$ "+valor+" Saldo: "+getSaldo()+" |\n";
			
			break;
		}
		
		case 'S': {
			frase ="| Saque de R$ "+valor+" ......  Saldo: "+getSaldo()+ " |\n";
			
			break;
		}
		default: {
			frase = "| *****  Opera��o suspeita, valor R$ " +valor+" **** |\n";
			
			break;	
		}
		
		}
		
		this.operacoesExtrato += frase;
	}
	
	public void imprimeExtrato(){
		// cabe�alho
		System.out.println("===========================================");
		System.out.println("Nome cliente: "+getCliente());
		System.out.println("Cliente vip: "+isClienteVip());
		System.out.println("N�mero conta: "+getNumeroConta());
		System.out.println("Agencia: "+getAgencia());
		System.out.println("Numero Agencia: "+getNumeroAgencia());
		System.out.println("Saldo: "+getSaldo());
		System.out.println("===========================================");
		
		System.out.println(this.operacoesExtrato);
		
		System.out.println("===========================================");
		// rodap�
	}
	

}
