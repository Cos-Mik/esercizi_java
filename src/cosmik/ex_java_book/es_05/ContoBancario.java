package cosmik.ex_java_book.es_05;

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


	// non ha senso usare toString in questo caso
	// perche' toString non ha il compito di cercare di accedere al conto,
	// ma di dare una descrizione dell'oggetto
	// il tuo metodo non veniva considerata come un override di Object.toString(), ma di un metodo a parte
	public String toString() {
		return "Dettagli del conto:\nNome:\t"+nome+"\nCognome:\t"+cognome+"\nNumero di conto:\t"+numero_conto+"\n\t\tTotale: \t E. "+totaleconto;
	}

	public void tryAccess(int codice_inserito) throws Exception {
		if (codice_inserito != PASSWORD) {
			// Qua sarebbe buono creare un'eccezione speciale per un accesso errato
			throw new Exception("Errore: la password non e' corretta!"); 
		} else {
			// all good
		}
	}
}