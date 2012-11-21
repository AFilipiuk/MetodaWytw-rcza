/* 2. zestaw */
class Strobist extends Lustrzanka{
	public Strobist(){
		about = "Strobist";
	}

	public void addStatyw(){
		System.out.println("Dodaje Statyw QUANTUM 260 cm");
	}
	
	public void addLampa(){
		System.out.println("Dodaje Lampa Youngnoun 560II");
	}
	
	public void addBlenda(){
		System.out.println("Dodaje Blende 60X90 Sunfire 5w1");
	}
	
	public Lustrzanka getLustrzanka(){
		System.out.println(about);
		addBody();
		addBlenda();
		addStatyw();
		addLampa();
		return this;
	}
}
