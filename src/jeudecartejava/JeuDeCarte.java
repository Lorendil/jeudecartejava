package jeudecartejava;

import java.util.ArrayList;
import java.util.List;

public class JeuDeCarte {


	public static void main(String[] args) {
		List<Joueur> listeDesJoueurs = new ArrayList<Joueur>();
		int nombreDeJoueurs = 0;

		while (nombreDeJoueurs != 2) {

			Joueur nouveauJoueur = new Joueur();
			listeDesJoueurs.add(nouveauJoueur);
			nombreDeJoueurs += 1;
		}
		for (int i = 0; i < listeDesJoueurs.size(); i++){
			System.out.println(listeDesJoueurs.get(i).nom);
		}
		bataille(54, listeDesJoueurs);

	}

	private static void bataille(int nombreDeTours, List<Joueur> listeJoueurs) {
		int tour = 0;

		if (nombreDeTours > listeJoueurs.get(0).deck.length){
			nombreDeTours = listeJoueurs.get(0).deck.length;
			System.out.println("Le nombre de tours ne peut pas exceder les cartes des paquets, le nombre de tours est rabaissé à " + nombreDeTours + " tours.");
		}
		while (tour < nombreDeTours) {


			tour =+ 1;
		}
	}
}
