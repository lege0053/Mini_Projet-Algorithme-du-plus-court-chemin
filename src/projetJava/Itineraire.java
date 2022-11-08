package projetJava;

public class Itineraire {
	
	private Carte carte;
	private Ville source;
	private Ville destination;
	
	public Itineraire(Carte carte, Ville source, Ville destination) {
		this.carte = carte;
		this.source = source;
		this.destination = destination;
	}
	
	public Carte getCarte() {
		return carte;
	}
	
	public void setCarte(Carte carte) {
		this.carte = carte;
	}
	
	public Ville getSource() {
		return source;
	}
	
	public void setSource(Ville source) {
		this.source = source;
	}
	
	public Ville getDestination() {
		return destination;
	}
	
	public void setDestination(Ville destination) {
		this.destination = destination;
	}
	
	@Override
	public String toString() {
		return "Itineraire [carte=" + carte + ", source=" + source + ", destination=" + destination + "]";
	}

	
}
