package jeudecartejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JeuDeCarte {
	private static Scanner nom;

	public static void main(String[] args) {
		Map<String, Joueur> listeDesJoueurs = new HashMap<String, Joueur>();
		int nombreDeJoueurs = 0;

		while (nombreDeJoueurs != 2) {
			String nomNouveauJoueur = initialisation();
			Joueur nouveauJoueur = new Joueur(nomNouveauJoueur);
			listeDesJoueurs.put(nomNouveauJoueur, nouveauJoueur);
			nombreDeJoueurs += 1;
		}
		for (Map.Entry<String, Joueur> clef : listeDesJoueurs.entrySet()) {
			Joueur clefJoueur = clef.getValue();
			Carte.print(clefJoueur.deck[1]);
		}

	}

	private static String initialisation() {

		nom = new Scanner(System.in);
		System.out.print("Entrez le nom du joueur \n");

		String nomJoueur = nom.nextLine();
		// nom.close();

		return nomJoueur;

	}
}
