package base;

public class principal {

	public static void main(String[] args) { // Attention Main (majuscule) ne fonctionne pas !!
		// TODO Auto-generated method stub
		Membre Antoine = new Membre("ENGASSER", "Antoine", 1, "11/09/2001", "Actif");
		Membre Erwan = new Membre("CLOUX", "Erwan", 2, "11/09/2001", "Actif");
		Membre Hugo = new Membre("DE MARCO", "Hugo", 3, "11/09/2001", "Non-Actif");

		Employe Swann = new Employe("CAPE", "Swann", 4, "Seigneur des Livres", 0.0);
		Employe Arthur = new Employe("GUILET", "Arthur", 5, "BIG CEO", 1000000000.0);
		Employe Napoleon = new Employe("BONAPARTE", "Napoleon", 6, "There is nothing we can do...", 0.0);

		Antoine.AfficherMembre();
		Erwan.AfficherMembre();
		Hugo.AfficherMembre();

		Swann.afficherDetails();
		Arthur.afficherDetails();
		Napoleon.afficherDetails();

		// Livre Livre1 = new Livre.Livre("Journal intime de Swann","Swann CAPE","978-3-6-84-45-95-0",true);
	}

}
