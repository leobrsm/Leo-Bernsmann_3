package p2;

public class P2_main {
	public static void main(String[] args) {
		int a = 2;
		int b = 11;
		int c = 12;
		int d = 7;
		
		d=0;
		
		boolean E1;
		E1 = (a == b);
		boolean E2;
		E2 = ((a == b) || (a == c));
		boolean E3;
		E3 = (a + b >= c);
		boolean E4;
		E4 = (a + b + c >= 100);
		
		if (E1) {
			d = d+1;
		}if (E2) {
			d++;
		}if (E3) {
			d++;
		}if(E4) {
			d++;
		}
		
		
		System.out.println("d = " +d);
			
		}
		}
		
		
		
		
		
		
		


