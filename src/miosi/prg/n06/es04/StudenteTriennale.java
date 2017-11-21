package miosi.prg.n06.es04;

public class StudenteTriennale extends Studente {
	private String scuolaSuperiore;
	private int crediti;

	private static final int CREDITI_DA_CONSEGUIRE = 180;

	public StudenteTriennale() {
		scuolaSuperiore = "-";
		crediti = 0;
	}

	public void setScuolaSuperiore(String scuolaSuperiore) {
		this.scuolaSuperiore = scuolaSuperiore;
	}

	public String getScuolaSuperiore() {
		return scuolaSuperiore;
	}

	public void conseguiCrediti(int crediti) {
		this.crediti += crediti;
	}

	public boolean laureato() {
		return crediti >= CREDITI_DA_CONSEGUIRE;
	}
}