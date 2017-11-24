package cosmik.es_05;

public class Auto {
	private String scuderia;
	private Pilota pilota;

	public Auto(){
		scuderia = "-";
		pilota = new Pilota();
	}

	public Auto(String s, Pilota p) {
		setScuderia(s);
		setPilota(p);
	}

	private void setScuderia (String s) {
		scuderia = s;
	}

	private void setPilota (Pilota p) {
		pilota = p;
	}

	public String getDettagliAuto() {
		return "Scuderia: "+scuderia+" - Pilota: "+pilota.getDettagliPilota();
	}
}