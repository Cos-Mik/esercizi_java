package cosmik.es_05;

public class Gara {
	private String nomeGara;
	private int tempoGara;
	private boolean meteo = Math.random() < 0.5; // il meteo e' un boolean?
	private Auto[] griglia_auto;
	private Pilota[] griglia_piloti;
	private int winner;
	private String[] commenti = {"WOOOAAA","Potere ai Bandicoot!!", "WOF!","La saggezza dei millenni e' con me." };

	public Gara(String n){
		setNomeGara(n);
		setTempo();
		iniziaGaraConPiloti();
	}

	private void iniziaGaraConPiloti() {
		if (meteo == true) {
			System.out.println("Signori e Signore!! Benvenuti alla gara "+nomeGara+"!\nRombino i motori!!\n\n");
			griglia_piloti = new Pilota[4];
			griglia_piloti [0] = new Pilota("Crash",45);
			griglia_piloti [1] = new Pilota("Coco",32);
			griglia_piloti [2] = new Pilota("Polar Bear",8);
			griglia_piloti [3] = new Pilota("Aku Aku",1856);
			griglia_auto = new Auto[4];
			griglia_auto[0] = new Auto("Wumpa",griglia_piloti[0]);
			griglia_auto[1] = new Auto("Pura",griglia_piloti[1]);
			griglia_auto[2] = new Auto("Ice",griglia_piloti[2]);
			griglia_auto[3] = new Auto("Uurbega'!",griglia_piloti[3]);
			System.out.println("Ecco a voi i partecipanti:\n");
			for (int i = 0; i < griglia_piloti.length; ++i) {
				System.out.println("Al posto n. "+(i+1)+" abbiamo: \n\t\t"+griglia_auto[i].getDettagliAuto());
			}
		} else {
			System.out.println("La gara "+nomeGara+" e' stata rinviata causa del mal tempo!\nCi scusiamo per il disagio.");
		}
	}

	//il metodo setTempo mi ~~ritornerà~~ setta il tempoGara con valore casuale fra 2 e 5
	//una garà non durerà meno di 2 ore
	private void setTempo () { // perche' setTempo e' private?
		/*int t = (int)(Math.random()*5);
		while (t < 2) {
			t = (int)(Math.random()*5);
		}*/
		// Il codice sopra e' sbagliato, si fa cosi' un numero casuale tra 2 e 5, se non hai Random.nextInt(int,int)
		tempoGara = (int)(Math.random() * 3.0 + 2.5);
		// Aggiungo 0.5 perche' il cast da double a int taglia totalmente la parte decimale
		// in questo modo posso approssimare per eccesso se supero 0.5
		// Per come hai scritto tu, teoricamente il codice potrebbe andare in loop infinito, e' non e' mai bella cosa
	}

	public String getRisultato(){
		if (meteo == true) {
			winner = (int)(Math.random()*4);
			return 
			"Gara conclusa in "+tempoGara+" ore!\n\n"+
			"Ed il vincitore e'....\n"+griglia_piloti[winner].getDettagliPilota()+"!!\nCongratulazioni!\n\n"+
			griglia_piloti[winner].getDettagliPilota()+" ha conseguito nella sua carriera "+griglia_piloti[winner].getDettagliVittorie()+" vittorie!\n"+
			"Ci dica cosa ne pensa!\n"+griglia_piloti[winner].getDettagliPilota()+": \""+commenti[winner]+"\"";
		} else {
			return "";
		}
	}

	private void setNomeGara(String nG) {
		nomeGara = nG;
	}
}