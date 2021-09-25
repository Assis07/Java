package cadastral;

import cadastral.Pessoa;
public class Endereco {
		
	
		private String logradouro;
		private int numero;
		private String complemento;
		private int cep;
		private String bairro;
		
		private String endereco; //endereco_p > endereco
		
		private Cidade cidade; // cidade > cidade/Class



		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getLogradouro() {
			return logradouro;
		}

		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public String getComplemento() {
			return complemento;
		}

		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}

		public int getCep() {
			return cep;
		}

		public void setCep(int cep) {
			this.cep = cep;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}

		public Cidade getCidade() {
			return cidade;
		}

		public void setCidade(Cidade cidade) {
			this.cidade = cidade;
		}

		




		
}
