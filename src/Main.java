public class Main {
	public static void main(String[]args){
		
		SklepCyfrowe sklep = new SklepCyfrowe();
		Lustrzanka[] tab = new Lustrzanka[3];
		
		
		System.out.println("Tworzenie zestawów promocyjnych:");
		System.out.println();
		tab[0] = sklep.skladanieZestawow("Natura");
		System.out.println();
		tab[1] = sklep.skladanieZestawow("Strobist");
		System.out.println();
		tab[2] = sklep.skladanieZestawow("Portret");
	}
}
