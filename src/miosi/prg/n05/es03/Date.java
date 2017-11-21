package miosi.prg.n05.es03;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
		day = 1;
		month = 1;
		year = 1990;
	}

	public Date(int day, int year) {
		// TODO algoritmo per contare i mesi
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date(int day, String month, int year) {
		this.day = day;
		this.month = getMonthByName(month);
		this.year = year;
	}

	public static int getMonthByName(String name) {
		// TODO a' fari un dictionary con i nomi dei mesi
		return 1;
	}

	// TODO getter e setter
}