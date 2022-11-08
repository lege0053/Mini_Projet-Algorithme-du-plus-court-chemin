package projetJava;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		// Création des villes
		Ville lille = new Ville("Lille");
		Ville rouen = new Ville("Rouen");
		Ville paris = new Ville("Paris");
		Ville brest = new Ville("Brest");
		Ville rennes = new Ville("Rennes");
		Ville strasbourg = new Ville("Strasbourg");
		Ville nantes = new Ville("Nantes");
		Ville dijon = new Ville("Dijon");
		Ville limoges = new Ville("Limoges");
		Ville clermont = new Ville("Clermont");
		Ville lyon = new Ville("Lyon");
		Ville bordeaux = new Ville("Bordeaux");
		Ville grenoble = new Ville("Grenoble");
		Ville toulouse = new Ville("Toulouse");
		Ville montpellier = new Ville("Montpellier");
		Ville marseille = new Ville("Marseille");
		Ville nice = new Ville("Nice");
		
		//Ajout des arêtes
		lille.addAretes(rouen, 256);
		lille.addAretes(paris, 225);
		
		rouen.addAretes(lille, 256);
		rouen.addAretes(paris, 163);
		rouen.addAretes(rennes, 313);
		
		paris.addAretes(lille, 225);
		paris.addAretes(rouen, 163);
		paris.addAretes(rennes, 350);
		paris.addAretes(clermont, 425);
		paris.addAretes(dijon, 314);
		
		brest.addAretes(rennes, 237);
		
		rennes.addAretes(rouen, 313);
		rennes.addAretes(brest, 237);
		rennes.addAretes(nantes, 107);
		rennes.addAretes(paris, 350);
		
		strasbourg.addAretes(dijon, 333);
		
		nantes.addAretes(rennes, 107);
		nantes.addAretes(bordeaux, 346);
		nantes.addAretes(limoges, 317);
		
		dijon.addAretes(paris, 314);
		dijon.addAretes(lyon, 194);
		dijon.addAretes(strasbourg, 333);
		
		limoges.addAretes(nantes, 317);
		limoges.addAretes(bordeaux, 222);
		limoges.addAretes(clermont, 174);
		
		clermont.addAretes(paris, 425);
		clermont.addAretes(limoges, 174);
		clermont.addAretes(montpellier, 334);
		clermont.addAretes(lyon, 207);
		
		lyon.addAretes(dijon, 194);
		lyon.addAretes(clermont, 207);
		lyon.addAretes(montpellier, 304);
		lyon.addAretes(marseille, 316);
		lyon.addAretes(grenoble, 112);
		
		bordeaux.addAretes(nantes, 346);
		bordeaux.addAretes(toulouse, 244);
		bordeaux.addAretes(limoges, 222);
		
		grenoble.addAretes(lyon, 112);
		
		toulouse.addAretes(bordeaux, 244);
		toulouse.addAretes(montpellier, 241);
		
		montpellier.addAretes(clermont, 334);
		montpellier.addAretes(toulouse, 241);
		montpellier.addAretes(lyon, 304);
		
		marseille.addAretes(lyon, 316);
		marseille.addAretes(nice, 203);
		
		nice.addAretes(marseille, 203);
		
		List<Arete> listArete = new ArrayList<Arete>();
		List<Ville> listVilles = new ArrayList<Ville>();
		
		
	}
}
