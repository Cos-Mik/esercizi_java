package cosmik.ex_java_book.es_05;

public class Persona {
	private String nome, cognome, telefono;
	public Persona (String nome, String cognome) {
		this(nome,cognome,"non pervenuto");
	}

	public Persona (String nome, String cognome, String telefono) {
		this.setNome(nome);
		this.setCognome(cognome);
		this.setTelefono(telefono);
	}

	private void setNome(String n) {
		nome = n;
	}

	private void setCognome(String c) {
		cognome = c;
	}

	private void setTelefono(String t) {
		telefono = t;
	}

	// mancano i getter

	public String dettagli() {
		return nome+" "+cognome+": "+telefono;
	}

	public String toString() {
		return dettagli();
		// ho sentito il bisogno di aggiungerlo
	}
}