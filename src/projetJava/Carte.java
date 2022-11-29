package projetJava;

import java.util.ArrayList;

public class Carte {

	private ArrayList<Ville> villes;
	
	public Carte(ArrayList<Ville> villes) {
		this.villes = villes;
	}
	
	public void addVille(Ville ville) {
		this.villes.add(ville);
	}
	
	public ArrayList<Ville> getVilles() {
		return this.villes;
	}

	public void setVilles(ArrayList<Ville> villes) {
		this.villes = villes;
	}
	
	@Override
	public String toString() {
		return "Carte [villes=" + villes + "]";
	}
	
}
