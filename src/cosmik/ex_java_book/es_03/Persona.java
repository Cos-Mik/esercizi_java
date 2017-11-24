package cosmik.ex_java_book.es_03;

public class Persona {
	public String nome, cognome;
	public int eta;

	public Persona(String nome, String cognome, int eta){
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public String toString() {
		return "Nome: " + nome + "\nCognome: " + cognome + "\nEta: " + eta;
	}
}