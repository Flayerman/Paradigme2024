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
		afficherDetails();
		System.out.println("Date d'adhésion : " + this.dateAdhesion);
		System.out.println("Statut : " + this.statut);
	}
}
