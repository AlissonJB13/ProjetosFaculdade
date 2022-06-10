package br.edu.ifprPo;

public class Pessoa {
		private String nome;
		private int idade;
		private String estado, sexo, cidade, email, sCaminhar, sLer, sAssistir, sMusica;
		//private boolean ler, caminhar, assistir, musica;
		
		public Pessoa(String n, int i, String s, String c, String e, String em, String cam, String ler, String ass, String mus) {
			this.nome = n;
			this.idade = i;
			this.sexo = s;
			this.cidade = c;
			this.estado = e;
			this.email = em;
			this.sCaminhar = cam;
			this.sLer = ler;
			this.sAssistir = ass;
			this.sMusica = mus;
		}
		
		/*public boolean isLer() {
			return ler;
		}

		public void setLer(boolean ler) {
			this.ler = ler;
		}

		public boolean isCaminhar() {
			return caminhar;
		}

		public void setCaminhar(boolean caminhar) {
			this.caminhar = caminhar;
		}

		public boolean isAssistir() {
			return assistir;
		}

		public void setAssistir(boolean assistir) {
			this.assistir = assistir;
		}

		public boolean isMusica() {
			return musica;
		}

		public void setMusica(boolean musica) {
			this.musica = musica;
		}*/
		public String getsCaminhar() {
			return sCaminhar;
		}

		public void setsCaminhar(String sCaminhar) {
			this.sCaminhar = sCaminhar;
		}

		public String getsLer() {
			return sLer;
		}

		public void setsLer(String sLer) {
			this.sLer = sLer;
		}

		public String getsAssistir() {
			return sAssistir;
		}

		public void setsAssistir(String sAssistir) {
			this.sAssistir = sAssistir;
		}

		public String getsMusica() {
			return sMusica;
		}

		public void setsMusica(String sMusica) {
			this.sMusica = sMusica;
		}

		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public String toString() {
			return "Nome Completo: " + this.nome
					+ "\nIdade: " + this.idade
					+ "\nSexo: " + this.sexo
					+ "\nCidade: " + this.cidade
					+ "\nEstado: " + this.estado
					+ "\nEmail: " + this.email
					+ "\nHobbies\nCaminhar: " + this.sCaminhar + "\nLer: " + 
					this.sLer + "\nAssistir TV: " + this.sAssistir + 
					"\nEscutar musica: " + this.sMusica;
		}
		
	}



