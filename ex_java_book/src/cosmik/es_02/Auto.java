package cosmik.es_02;

public class Auto {
	public static final int NUMERO_RUOTE = 4;
	public int cilindrata;
	public void muoviti() {
		if (cilindrata < 1200) {
			System.out.println("La mia cilindrata e' "+cilindrata+". Poco potente...");
		} else {
			System.out.println("Ho "+cilindrata+" di cilindrata. Potente!");
		}
	}
}