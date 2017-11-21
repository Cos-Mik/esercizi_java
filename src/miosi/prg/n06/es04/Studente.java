package miosi.prg.n06.es04;

import java.util.Date;

public class Studente extends Persona {
	private Date dataIscrizione;
	private int matricola;
	private String corsoDiLaurea;
	private int contributo;

	public Studente() {
		dataIscrizione = null;
		matricola = 0;
		corsoDiLaurea = "-";
		contributo = 0;
	}

	public void setDataIscrizione(Date dataIscrizione) {
		this.dataIscrizione = dataIscrizione;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public void setCorsoDiLaurea(String corsoDiLaurea) {
		this.corsoDiLaurea = corsoDiLaurea;
	}

	public void setContributo(int contributo) {
		this.contributo = contributo;
	}

	public Date getDataIscrizione() {
		return dataIscrizione;
	}

	public int getMatricola() {
		return matricola;
	}

	public String getCorsoDiLaurea() {
		return corsoDiLaurea;
	}

	public int getContributo() {
		return contributo;
	}

	public String toString() {
		return matricola + " " + super.toString() + " " + corsoDiLaurea;
	}
}