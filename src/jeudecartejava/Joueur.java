package jeudecartejava;

public class Joueur {
	String nom;
	Carte[] deck;

	public Joueur(String nom) {
		this.nom = nom;
		this.deck = Joueur.createdeck();

	}

	private static Carte[] createdeck() {
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
}