package jeudecartejava;

public class JeuDeCarte {
	public static void main(String[] args) {
		Joueur j1 = new Joueur("Quentin");
		for(int i = 0; i < j1.deck.length; i++){
			Carte.print(j1.deck[i]);
		}
		
	}
}



