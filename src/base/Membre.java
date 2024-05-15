package base;

public class Membre extends Personne {
	public String dateAdhesion;
	public String statut;

	public Membre(String nom, String prénom, int id, String dateAdhesion, String statut) {
		super(nom, prénom, id);
		this.dateAdhesion = dateAdhesion;
		this.statut = statut;
	}

	public void AfficherMembre() {
		System.out.println("================================= ");
		System.out.println("Nom : " + this.nom);
		System.out.println("Prénom : " + this.prénom);
		System.out.println("Id : " + this.id);
		System.out.println("Date d'adhésion : " + this.dateAdhesion);
		System.out.println("Statut : " + this.statut);
	}
}
