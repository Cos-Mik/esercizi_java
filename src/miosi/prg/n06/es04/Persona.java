package miosi.prg.n06.es04;

import java.util.Date;

public class Persona {
	private Date dataDiNascita;
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private String indirizzo;
	private int cap;

	public Persona() {
		dataDiNascita = null;
		nome = "-";
		cognome = "-";
		codiceFiscale = "-";
		indirizzo = "-";
		cap = 0;
	}

	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public Date getDataDiNascita() {
		return dataDiNascita;
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

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public int getCap() {
		return cap;
	}

	public String toString() {
		return nome + " " + cognome + " " + dataDiNascita + " " + indirizzo;
	}
}