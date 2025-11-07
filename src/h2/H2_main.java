package h2;

public class H2_main {
	public static void main(String[] args) {
		int jahr = 2028;
		boolean schaltjahr;
		if ((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0)) {
			schaltjahr = true;
		} else {
			schaltjahr = false;
		}
		
		System.out.println("Jahr: " + jahr);
		System.out.println("Schaltjahr: " + schaltjahr);
	}

}
