package jeudecartejava;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jeudecartejava.Carte.comparaison;

public class JeuDeCarte {

	public static void main(String[] args) throws InterruptedException {
		List<Joueur> listeDesJoueurs = new ArrayList<Joueur>();
		int nombreDeJoueurs = 0;

		while (nombreDeJoueurs != 2) {

			Joueur nouveauJoueur = new Joueur();
			listeDesJoueurs.add(nouveauJoueur);
			nombreDeJoueurs += 1;
		}
		bataille(10, listeDesJoueurs);

	}

	private static void bataille(int nombreDeTours, List<Joueur> listeJoueurs) throws InterruptedException {
		int tour = 0;
		int scoreJoueurs[] = new int[] { 0, 0 };

		if (nombreDeTours > listeJoueurs.get(0).deck.length) {
			nombreDeTours = listeJoueurs.get(0).deck.length;
			System.out.println(
					"Le nombre de tours ne peut pas exceder les cartes des paquets, le nombre de tours est rabaissé à "
							+ nombreDeTours + " tours.");
		}
		while (tour < nombreDeTours) {
			if (Carte.compare(listeJoueurs.get(0).deck[tour],
					listeJoueurs.get(1).deck[tour]) == comparaison.SUPERIEUR) {
				scoreJoueurs[0] += 1;
			} else if (Carte.compare(listeJoueurs.get(0).deck[tour],
					listeJoueurs.get(1).deck[tour]) == comparaison.INFERIEUR) {
				scoreJoueurs[1] += 1;
			}
			System.out.println("Tour n°" + (tour + 1) + " (" + scoreJoueurs[0] + " - " + scoreJoueurs[1] + ")"
					+ "\n" + listeJoueurs.get(0).nom + " : " + listeJoueurs.get(0).deck[tour]);
			System.out.println(listeJoueurs.get(1).nom +" : " + listeJoueurs.get(1).deck[tour] + "\n");

			TimeUnit.MILLISECONDS.sleep(500);
			tour += 1;
		}
		System.out.println("Le score est de " + scoreJoueurs[0] + " à " + scoreJoueurs[1] + " après " + nombreDeTours
				+ " tours de jeu.");
		if (scoreJoueurs[0] > scoreJoueurs[1]) {
			System.out.println(listeJoueurs.get(0).nom + " remporte la victoire !");
		} else if (scoreJoueurs[0] < scoreJoueurs[1]) {
			System.out.println(listeJoueurs.get(1).nom + " remporte la victoire !");
		} else {
			System.out.println("C'est un match nul !");
		}
	}
}
