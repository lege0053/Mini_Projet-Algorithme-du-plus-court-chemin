package projetJava;

import java.util.ArrayList;
import java.util.List;

public class Ville {

	private String name;
	private ArrayList<Arete> aretes = new ArrayList<Arete>();
	
	public Ville(String name, ArrayList<Arete> arete){
		this.name = name;
		this.aretes = arete;
	}
	
	public Ville(String name){
		this.name = name;
		this.addAretes(this, 0);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Arete> getAretes() {
		return aretes;
	}

	public void setAretes(ArrayList<Arete> arete) {
		this.aretes = arete;
	}
	
	public void addAretes(Ville ville, int distance) {
		this.aretes.add(new Arete(this, ville, distance));
	}
	
	@Override
	public String toString() {
		return "Ville [name=" + this.name + "]";
	}
	
	public static void main(String[] args) {
		Ville lille = new Ville("Lille");
		System.out.println(lille);
	}
	  
}
