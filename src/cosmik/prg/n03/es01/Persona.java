package cosmik.prg.n03.es01;

public class Persona {
	private String nome, cognome;
	private int eta;

	public Persona() {
		this("--","--",0);
	}

	public Persona (String nome, String cognome, int eta) {
		setNome(nome);
		setCognome(cognome);
		setEta(eta);
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public int getEta() {
		return eta;
	}

	public String toString () {
		return nome + " " + cognome + ", " + eta + " anni.";
	}

	public String dettagli() {
		return toString();
	}


}