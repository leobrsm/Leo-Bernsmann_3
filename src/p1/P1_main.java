package p1;

public class P1_main {
	public static void main(String[] args) {
		int wuerfel = 6;
		
		if ((wuerfel < 2) || ((wuerfel > 3) && (wuerfel < 5))) {
			System.out.println("Glückwunsch du hast gewonnen! :)");	
			}else if (wuerfel == 2){
				System.out.println("Schade, du hast verloren. :(");
			}else if (wuerfel == 5) {
				System.out.println("Das Spiel endet unentschieden");
			}else {
				System.out.println("Es konnte kein Ausgang festgestellt werden. :/");
			}
	}

}
