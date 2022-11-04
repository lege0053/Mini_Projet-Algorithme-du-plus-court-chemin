package projet;

import java.util.List;

public class Carte {

	private List<Ville> villes;
	
	public Carte(List<Ville> villes) {
		this.villes = villes;
	}
	
	public void addVille(Ville ville) {
		this.villes.add(ville);
	}
	
	public List<Ville> getVilles() {
		return this.villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}
	
	@Override
	public String toString() {
		return "Carte [villes=" + villes + "]";
	}
	
}
