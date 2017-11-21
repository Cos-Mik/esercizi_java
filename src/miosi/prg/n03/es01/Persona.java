package miosi.prg.n03.es01;

public class Persona {
	private String nome, cognome;
	private int eta;

	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getEta() {
		return eta;
	}

	public String toString() {
		return nome + " " + cognome + " - " + eta;
	}
}