package h3;

public class H3_main {
	public static void main(String[] args) {
		
		int max = 5;
		int fix = 2;
		int wartend = 1;
		boolean istVoll = false;
		
		int frei = max - fix;
		
		if (frei > 0 && wartend > 0) {
			int zuweisen = Math.min(frei, wartend);
			fix += zuweisen;
			wartend -= zuweisen;
		}
		istVoll = (fix == max);
		
		System.out.println("fix: " + fix);
		System.out.println("wartend: " + wartend);
		System.out.println("istVoll: " +istVoll);
	}

}
