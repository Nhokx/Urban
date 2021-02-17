package controleur;

import vue.Urban_Marginal;

/**
 * Contrôleur et point d'entrée de l'applicaton 
 * @author emds
 *
 */
public class Controle {

	private Urban_Marginal frmEntreeJeu ;

	/**
	 * Méthode de démarrage
	 * @param args non utilisé
	 */
	public static void main(String[] args) {
		new Controle();
	}
	
	/**
	 * Constructeur
	 */
	private Controle() {
		this.frmEntreeJeu = new Urban_Marginal() ;
		this.frmEntreeJeu.setVisible(true);
	}

}
