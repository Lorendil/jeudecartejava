package jeudecartejava;

public class JeuDeCarte {
	public static void main(String[] args) {
		Joueur j1 = new Joueur("Quentin");
		Carte.print(j1.deck[1]);
	}
}

class Joueur {
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

class Carte {
	String couleur;
	int chiffre;
	int couleurvaleur;

	public Carte(String couleur, int chiffre) {
		this.couleur = couleur;
		this.chiffre = chiffre;
		if (couleur == "Pique") {
			this.couleurvaleur = 1;
		} else if (couleur == "Trefle") {
			this.couleurvaleur = 2;
		} else if (couleur == "Carreau") {
			this.couleurvaleur = 3;
		} else {
			this.couleurvaleur = 4;
		}

	}

	public static void print(Carte carte) {
		System.out.println(carte.chiffre + " de " + carte.couleur);
	}

	public static void compare(Carte carte1, Carte carte2) {
		if (carte1.chiffre > carte2.chiffre) {
			System.out.println("La carte la plus forte est le " + carte1.chiffre + " de " + carte1.couleur);
		} else if (carte1.chiffre < carte2.chiffre) {
			System.out.println("La carte la plus forte est le " + carte2.chiffre + " de " + carte2.couleur);
		} else if (carte1.couleurvaleur > carte2.couleurvaleur) {
			System.out.println("La carte la plus forte est le " + carte1.chiffre + " de " + carte1.couleur);
		} else if (carte1.couleurvaleur < carte2.couleurvaleur) {
			System.out.println("La carte la plus forte est le " + carte2.chiffre + " de " + carte2.couleur);
		} else {
			System.out.println("C'est juste la même carte en fait... le " + carte2.chiffre + " de " + carte2.couleur);
		}
	}
}
