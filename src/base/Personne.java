package base;

public abstract class Personne {
	public String nom;
	public String prénom;
	public int id;

	public Personne(String nom, String prénom, int id) {
		this.nom = nom;
		this.prénom = prénom;
		this.id = id;
	}

	public void afficherDetails() {
		System.out.println("Nom : " + this.nom);
		System.out.println("Prénom : " + this.prénom);
		System.out.println("Id : " + this.id);
	}
}
