package miosi.prg.n06.es04;

public class StudenteMagistrale extends Studente {
	private String corsoTriennale;
	private int crediti;

	private static final int CREDITI_DA_CONSEGUIRE = 120;

	public StudenteMagistrale() {
		corsoTriennale = "-";
		crediti = 0;
	}

	public void setCorsoTriennale(String corsoTriennale) {
		this.corsoTriennale = corsoTriennale;
	}

	public String getCorsoTriennale() {
		return corsoTriennale;
	}

	public void conseguiCrediti(int crediti) {
		this.crediti += crediti;
	}

	public boolean laureato() {
		return crediti >= CREDITI_DA_CONSEGUIRE;
	}
}