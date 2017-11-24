package cosmik.es_05;

public class ContoBancario {
	private int numero_conto;
	private int codice_inserito;
	private float totaleconto = 50000.00F;
	private final int PASSWORD = 2588;
	private String nome, cognome;


	public ContoBancario(String nome, String cognome, int numero_conto){
		this.nome = nome;
		this.cognome = cognome;
		this.numero_conto = numero_conto;
	}

	public String toString(int codice_inserito) {
		if (codice_inserito == PASSWORD) {
			return "Dettagli del conto:\nNome:\t"+nome+"\nCognome:\t"+cognome+"\nNumero di conto:\t"+numero_conto+"\n\t\tTotale: \t E. "+totaleconto;
		} else {
			return "Errore: la password non e' corretta!";
		}
	}
}