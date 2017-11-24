package cosmik.es_04;

public class Main {
	public static void main(String[] args) {
		for (char c = 'a'; c <= 'z';++c) {
			//if (c == 'j' || c == 'l' || c == 'w' || c == 'x' || c == 'y') continue;
			//nie volevo solo che ritornasse l'alfabeto italiano senza i caratteri stranieri, tutto qui
			System.out.print(c+" ");
		}
	}
}