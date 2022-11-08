package projetJava;

public class Arete {
	
	private Ville ville1;
	private Ville ville2;
	private int distance;
	
	public Arete(Ville v1, Ville v2, int dist) {
		this.ville1 = v1;
		this.ville2 = v2;
		this.distance = dist;
	}
	
	public Ville getVille1() {
		return ville1;
	}
	
	public void setVille1(Ville ville1) {
		this.ville1 = ville1;
	}
	
	public Ville getVille2() {
		return ville2;
	}
	
	public void setVille2(Ville ville2) {
		this.ville2 = ville2;
	}
	
	public int getDistance() {
		return distance;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	@Override
	public String toString() {
		return "Arete [ville1=" + ville1 + ", ville2=" + ville2 + ", distance=" + distance + "]";
	}

}
