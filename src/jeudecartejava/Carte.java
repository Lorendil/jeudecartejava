package jeudecartejava;

public class Carte {
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

	enum comparaison {
		SUPERIEUR,
		INFERIEUR,
		EGALITE
	}

	public static void print(Carte carte) {
		if (carte.chiffre < 11) {
			System.out.println(carte.chiffre + " de " + carte.couleur);
		}
		else if (carte.chiffre == 11) {
			System.out.println("Valet de " + carte.couleur);
		}
		else if (carte.chiffre == 12) {
			System.out.println("Dame de " + carte.couleur);
		}
		else if (carte.chiffre == 13) {
			System.out.println("Roi de " + carte.couleur);
		}
		
	}

	public static comparaison compare(Carte carte1, Carte carte2) {
		if (carte1.chiffre > carte2.chiffre) {
			System.out.println("La carte la plus forte est le " + carte1.chiffre + " de " + carte1.couleur);
			return comparaison.SUPERIEUR;
		} else if (carte1.chiffre < carte2.chiffre) {
			System.out.println("La carte la plus forte est le " + carte2.chiffre + " de " + carte2.couleur);
			return comparaison.INFERIEUR;
		} else if (carte1.couleurvaleur > carte2.couleurvaleur) {
			System.out.println("La carte la plus forte est le " + carte1.chiffre + " de " + carte1.couleur);
			return comparaison.SUPERIEUR;
		} else if (carte1.couleurvaleur < carte2.couleurvaleur) {
			System.out.println("La carte la plus forte est le " + carte2.chiffre + " de " + carte2.couleur);
			return comparaison.INFERIEUR;
		} else {
			System.out.println("C'est juste la même carte en fait... le " + carte2.chiffre + " de " + carte2.couleur);
			return comparaison.EGALITE;
		}
		
	}
}
