/* 1. zestaw do³¹czony do lustrzanki */
class Portret extends Lustrzanka {
	public Portret(){
		about = "Portret";
	}

	public void addPortretowka(){
		System.out.println("Dodaje Canon 50 mm f/1.4");
	}
	
	public void addBlenda(){
		System.out.println("Dodaje Blende 60X90 Sunfire 5w1");
	}
	
	public Lustrzanka getLustrzanka(){
		System.out.println(about);
		addBody();
		addBlenda();
		addPortretowka();
		return this;
	}
}