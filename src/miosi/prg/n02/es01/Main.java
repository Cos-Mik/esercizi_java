package miosi.prg.n02.es01;

public class Main {
	public static void main(String[] args) {
		NumeroIntero num1 = new NumeroIntero(5);
		NumeroIntero num2 = new NumeroIntero(24);

		num1.stampaNumero();
		num2.stampaNumero();

		num1.numeroIntero = 40;
		num2.numeroIntero = 19;

		num1.stampaNumero();
		num2.stampaNumero();
	}
}