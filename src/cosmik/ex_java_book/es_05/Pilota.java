package cosmik.ex_java_book.es_05;

public class Pilota { // extends Persona? no?
	private String nome;
	private int vittorie;

	public Pilota() {
		nome = "-";
		vittorie = 0;
	}

	public Pilota (String n, int w) {
		setNome(n);
		setVittorie(w);
	}

	private void setNome(String n) {
		nome = n;
	}

	private void setVittorie(int w) {
		vittorie = w;
	}

	public String getDettagliPilota() {
		return nome;
	}

	public int getDettagliVittorie() {
		return vittorie;
	}
}