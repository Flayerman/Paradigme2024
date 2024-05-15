package base;

public abstract class Livre implements Empruntable {
	public String titre;
	public String auteur;
	public String isbn;
	public boolean disponible;

	public Livre(String titre, String auteur, String isbn, boolean disponible) {
		this.titre = titre;
		this.auteur = auteur;
		this.isbn = isbn;
		this.disponible = disponible;
	}

	public void afficheDetails() {
		System.out.println("Titre : " + this.titre);
		System.out.println("Auteur : " + this.auteur);
		System.out.println("ISBN : " + this.isbn);
		System.out.println("Disponible : " + this.disponible);
	}

	public void Emprunter(String isbn) {
		if (this.disponible == false) {
			System.out.println(this.titre + " n'est pas disponible\n");
		} else {
			System.out.println(this.titre + " est disponible\n");
		}
	}

	public void Retourner(String isbn) {
		this.disponible = true;
		System.out.println("Vous avez rendu le livre\n");
	}
}
