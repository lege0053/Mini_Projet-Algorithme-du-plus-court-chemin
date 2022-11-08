package projetJava;

import java.util.List;

public class Ville {

	private String name;
	private List<Arete> arete;
	
	public Ville(String name, List<Arete> arete){
		this.name = name;
		this.arete = arete;
	}
	
	public Ville(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Arete> getArete() {
		return arete;
	}

	public void setArete(List<Arete> arete) {
		this.arete = arete;
	}
	
	public void addAretes(Ville ville, int distance) {
		this.arete.add(new Arete(this, ville, distance));
	}
	
	@Override
	public String toString() {
		return "Ville [name=" + name + ", arete=" + arete + "]";
	}

   
}
