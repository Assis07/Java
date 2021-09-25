package Testes;

import bancario.Agencia;
import bancario.ContaCorrente;
import cadastral.Pessoa;
import cadastral.Endereco;
import cadastral.Cidade;

public class TestaBanco {

	public static void main(String[] args) {
		
		Pessoa pCliente = new Pessoa();
		
		// objeto pCliente
		pCliente.setNome("Jorisvaldo");
		pCliente.setCpf("666.124.666-66");
		pCliente.setDataNasc("01/02/2003");
		
		
		Endereco endereco_cliente = new Endereco();
		endereco_cliente.setBairro("Velha Grande");
		endereco_cliente.setCep(89045443);
		endereco_cliente.setComplemento("Perto do barzinho");
		endereco_cliente.setLogradouro("Casa");
		endereco_cliente.setNumero(164);
		endereco_cliente.setEndereco("Rua Alwin Kroenke");
		
		Cidade cidade_cliente = new Cidade();
	
		cidade_cliente.setEstado("Santa Catarina");
		cidade_cliente.setQt_homicidios(10);
		cidade_cliente.setRenda(150000);
		cidade_cliente.setCidade("Blumenau");
		pCliente.setEndereco_p(endereco_cliente);
		endereco_cliente.setCidade(cidade_cliente);
		
		
		// objeto pGerente
		Pessoa pGerente = new Pessoa();
		pGerente.setNome("Tio Zeca");
		pGerente.setCpf("626.154.244-24");
		pGerente.setDataNasc("11/10/1950");
		
		
		// objeto agencia
		Agencia objAgencia = new Agencia();
		
		objAgencia.setNome("Sem palavras");
		objAgencia.setDigito(2);
		objAgencia.setNumero(150);
		objAgencia.setGerente(pGerente);
		
		// objeto conta corrente
		ContaCorrente cCorrente = new ContaCorrente();
		
		cCorrente.setSaldo(250); 
		cCorrente.setAgencia(objAgencia);
		cCorrente.setCliente(pCliente);
		cCorrente.setDigito(7);
		cCorrente.setNumero(177777);
		
		// nome do meu cliente
		cCorrente.getCliente().getNome();
		
		//nome do meu gerente
		cCorrente.getAgencia().getGerente().getNome();
		
		//nome do cliente
		System.out.println("Cliente: "+cCorrente.getCliente().getNome());
		
		//nome do gerente
		System.out.println("Gerente: "+cCorrente.getAgencia().getGerente().getNome());
		
		//nome da agencia, numero e digito
		//nome, numero e digito da agencia
		//nome e cpf gerente
		//nome e cpf do cliente
		
		System.out.println("Agencia: "+cCorrente.getAgencia().getNome());
		System.out.println("Numero: "+cCorrente.getAgencia().getNumero());
		System.out.println("Digito: "+cCorrente.getAgencia().getDigito());
		System.out.println("Nome Gerente: "+cCorrente.getAgencia().getGerente().getNome());
		System.out.println("Cpf: "+cCorrente.getAgencia().getGerente().getCpf());
		System.out.println("Nome Cliente: "+cCorrente.getCliente().getNome());
		System.out.println("Cpf cliente: "+cCorrente.getCliente().getCpf());
		System.out.println("Endereco: "+cCorrente.getCliente().getEndereco_p().getEndereco()); // puxando o endereco após relacionar ele com a pessoa utilizando end_p e pegando a variavel endereco na classe
		
	}

}
