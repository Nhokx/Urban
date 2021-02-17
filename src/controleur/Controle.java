package controleur;

import vue.Urban_Marginal;

/**
 * Contr�leur et point d'entr�e de l'applicaton 
 * @author emds
 *
 */
public class Controle {

	private Urban_Marginal frmEntreeJeu ;

	/**
	 * M�thode de d�marrage
	 * @param args non utilis�
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
