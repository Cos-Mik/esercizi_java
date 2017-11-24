package cosmik.es_02;

public class Main  {
	public static void main(String[] args) {
		Auto fiat600 = new Auto();
		fiat600.cilindrata = 1000;
		fiat600.muoviti();
		Auto alfaromeo = new Auto();
		alfaromeo.cilindrata = 1800;
		alfaromeo.muoviti();
		System.out.println();
		NumeroIntero n1 = new NumeroIntero(4);
		NumeroIntero n2 = new NumeroIntero(25);
		n1.stampaNumero();
		n2.stampaNumero();
	}
}