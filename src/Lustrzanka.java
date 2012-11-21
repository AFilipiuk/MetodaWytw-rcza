/* Lustrzanka - ogólnie */
abstract class Lustrzanka {
	protected String about;
	
	public abstract Lustrzanka getLustrzanka();
	
	protected void addBody(){
		System.out.println("Dodaje Body Canon 650d");
	}
}