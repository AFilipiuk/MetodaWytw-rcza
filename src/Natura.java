/*3. zestaw*/
class Natura extends Lustrzanka {
	public Natura(){
		about = "Natura";
	}
	
	public void addSzerokokatny(){
		System.out.println("Dodaje Samyang 8 mm f/4.5");
	}
	
	public Lustrzanka getLustrzanka(){
		System.out.println(about);
		addBody();
		addSzerokokatny();
		return this;
	}
}
