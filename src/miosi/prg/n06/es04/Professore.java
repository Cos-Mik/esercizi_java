package miosi.prg.n06.es04;

import java.util.Date;

public class Professore extends Persona {
	private Date dataAssunzione;
	private String ruolo;
	private String dipartimento;
	private int salario;

	public Professore() {
		dataAssunzione = null;
		ruolo = "-";
		dipartimento = "-";
		salario = 0;
	}

	public void setDataAssunzione(Date dataAssunzione) {
		this.dataAssunzione = dataAssunzione;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public void setDipartimento(String dipartimento) {
		this.dipartimento = dipartimento;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Date getDataAssunzione() {
		return dataAssunzione;
	}

	public String getRuolo() {
		return ruolo;
	}

	public String getDipartimento() {
		return dipartimento;
	}

	public int getSalario() {
		return salario;
	}
}