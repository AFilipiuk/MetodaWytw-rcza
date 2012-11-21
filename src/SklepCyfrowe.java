/* sklep */
class SklepCyfrowe{	
	public Lustrzanka skladanieZestawow(String about){
		Lustrzanka lustrzanka = null;
		
		/* decyzja jaki zestaw stworzyc */
		if(about.equalsIgnoreCase("Portret")){
			lustrzanka = new Portret();
		}
		else if(about.equalsIgnoreCase("Strobist")){
			lustrzanka = new Strobist();
		}
		else if(about.equalsIgnoreCase("Natura")){
			lustrzanka = new Natura();
		}
		return lustrzanka.getLustrzanka();
	}
}