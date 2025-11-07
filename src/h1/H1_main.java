package h1;

public class H1_main {
	public static void main(String[] args) {
		double guthaben = -100.00;
		double monEingang = 200.00;
		int rating = -2;
		boolean warnhinweis = false;
		boolean negativ = false;
		
		negativ = guthaben < 0;
		
		double betragGuthaben = Math.abs(guthaben);
		double betragMonEingang = Math.abs(monEingang);
		
		if (guthaben >0) {
			rating += 3;
		} else if (guthaben == 0) {
			rating += 2;
		} else {
			if (betragMonEingang >= betragGuthaben) {
				rating += 1;
		} else {
			rating -=1;
		}
}
		if (guthaben < 0 && betragMonEingang < betragGuthaben && rating < 0) {
			warnhinweis = true;
		} else {
			warnhinweis = false;
		}
		
		System.out.println("negativ: " + negativ);
		System.out.println("raiting: " + rating);
		System.out.println("warnhinweis: " + warnhinweis);
     }
}