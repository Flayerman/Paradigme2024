package base;

public class Employe extends Personne {
	public String poste;
	public double salaire;

	public Employe(String nom, String prénom, int id, String poste, double salaire) {
		super(nom, prénom, id);
		this.poste = poste;
		this.salaire = salaire;
	}

	public void afficherDetails() {
		System.out.println("================================= ");
		System.out.println("Nom : " + this.nom);
		System.out.println("Prénom : " + this.prénom);
		System.out.println("Id : " + this.id);
		System.out.println("Poste : " + this.poste);
		System.out.println("Salaire : " + this.salaire);
	}

}
