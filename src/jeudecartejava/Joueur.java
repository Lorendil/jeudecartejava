package jeudecartejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Joueur {

	private static Scanner scanNom;

	String nom;
	Carte[] deck;

	public Joueur() {
		initialisation();
		this.deck = createdeck();
		melangeDeck();

	}

	private void initialisation() {

		scanNom = new Scanner(System.in);
		System.out.print("Entrez le nom du joueur \n");

		this.nom = scanNom.nextLine();
	}

	private Carte[] createdeck() {
		Carte[] deck = new Carte[52];
		int entreedeck = 0;
		int changecouleur = 1;
		String couleur = "";
		int nombreCartes = 1;

		while (entreedeck < deck.length) {

			if (nombreCartes == 14) {
				changecouleur += 1;
				nombreCartes = 1;
			}

			if (changecouleur == 1) {
				couleur = "Pique";
			} else if (changecouleur == 2) {
				couleur = "Trefle";
			} else if (changecouleur == 3) {
				couleur = "Carreau";
			} else {
				couleur = "Coeur";
			}
			Carte newcarte = new Carte(couleur, nombreCartes);
			deck[entreedeck] = newcarte;
			entreedeck += 1;
			nombreCartes += 1;
		}
		return deck;
	}

	private void melangeDeck() {
		List<Carte> deckList = Arrays.asList(this.deck);

		Collections.shuffle(deckList);
		deckList.toArray(this.deck);
		
	}
}