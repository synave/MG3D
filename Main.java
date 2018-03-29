
import java.util.ArrayList;

import MG3D.Camera;
import MG3D.Clavier;
import MG3D.Fenetre;
import MG3D.geometrie.Cone;
import MG3D.geometrie.Couleur;
import MG3D.geometrie.Cube;
import MG3D.geometrie.Cylindre;
import MG3D.geometrie.Maillage;
import MG3D.geometrie.Parallelepipede;
import MG3D.geometrie.Point3D;

class Main {

	public static void main(String[] args) {
	    Fenetre f = new Fenetre("Mon appli MG3D",1800,1000);
		Clavier clavier = f.getClavier();
		
		Camera cam = f.getCamera();
		f.activerLignes(true);
		cam.setPosition(new Point3D(23.2,10, 0.2));

		cam.setAngleHB(17.0f);
		
		float vitesse = 0.2f;
		float sensi = 1.0f;
		int isActivated = 1;

		Cube c1 = new Cube(Couleur.BLANC, new Point3D(13.5,2,-15),2);
		Cube c2 = new Cube(Couleur.BLANC, new Point3D(19.5,2,-15),2);
		Cube c3 = new Cube(Couleur.BLANC, new Point3D(24.5,2,-15),2);
		Cube c4 = new Cube(Couleur.BLANC, new Point3D(30.5,2,-15),2);
		
		c1.setCouleur(Couleur.ROUGE);
		c2.setCouleur(Couleur.BLEU);
		c3.setCouleur(new Couleur(0,128,0));
		c4.setCouleur(Couleur.GRIS);

		f.ajouter(c1);
		f.ajouter(c2);
		f.ajouter(c3);
		f.ajouter(c4);

		Maillage MG3D = new Maillage("./fic3D/3b.off");
		MG3D.setCouleur(new Couleur(0,128,0));
		MG3D.translater(54, -14, -200);
		f.ajouter(MG3D);
		
		int loin = -40;
		
		/***************************** M *****************************/
		
		f.ajouter(new Cube(Couleur.ROUGE, new Point3D(2, 0, loin), 2));
		f.ajouter(new Cube(Couleur.ROUGE, new Point3D(2, 2, loin), 2));
		f.ajouter(new Cube(Couleur.ROUGE, new Point3D(2, 4, loin), 2));
		f.ajouter(new Cube(Couleur.ROUGE, new Point3D(2, 6, loin), 2));
		f.ajouter(new Cube(Couleur.ROUGE, new Point3D(2, 8, loin), 2));
		
		f.ajouter(new Cube(Couleur.ROUGE, new Point3D(4, 6, loin), 2));
		f.ajouter(new Cube(Couleur.ROUGE, new Point3D(6, 4, loin), 2));
		f.ajouter(new Cube(Couleur.ROUGE, new Point3D(8, 6, loin), 2));
		
		f.ajouter(new Cube(Couleur.ROUGE, new Point3D(10, 0, loin), 2));
		f.ajouter(new Cube(Couleur.ROUGE, new Point3D(10, 2, loin), 2));
		f.ajouter(new Cube(Couleur.ROUGE, new Point3D(10, 4, loin), 2));
		f.ajouter(new Cube(Couleur.ROUGE, new Point3D(10, 6, loin), 2));
		f.ajouter(new Cube(Couleur.ROUGE, new Point3D(10, 8, loin), 2));
		
		
		/***************************** G *****************************/
		
		f.ajouter(new Cube(Couleur.BLEU, new Point3D(14, 0, loin), 2));
		f.ajouter(new Cube(Couleur.BLEU, new Point3D(14, 2, loin), 2));
		f.ajouter(new Cube(Couleur.BLEU, new Point3D(14, 4, loin), 2));
		f.ajouter(new Cube(Couleur.BLEU, new Point3D(14, 6, loin), 2));
		f.ajouter(new Cube(Couleur.BLEU, new Point3D(14, 8, loin), 2));
		
		f.ajouter(new Cube(Couleur.BLEU, new Point3D(16, 8, loin), 2));
		f.ajouter(new Cube(Couleur.BLEU, new Point3D(18, 8, loin), 2));
		f.ajouter(new Cube(Couleur.BLEU, new Point3D(20, 8, loin), 2));
		f.ajouter(new Cube(Couleur.BLEU, new Point3D(22, 8, loin), 2));
		
		f.ajouter(new Cube(Couleur.BLEU, new Point3D(16, 0, loin), 2));
		f.ajouter(new Cube(Couleur.BLEU, new Point3D(18, 0, loin), 2));
		f.ajouter(new Cube(Couleur.BLEU, new Point3D(20, 0, loin), 2));
		f.ajouter(new Cube(Couleur.BLEU, new Point3D(22, 0, loin), 2));
		f.ajouter(new Cube(Couleur.BLEU, new Point3D(22, 2, loin), 2));
		f.ajouter(new Cube(Couleur.BLEU, new Point3D(22, 4, loin), 2));
		f.ajouter(new Cube(Couleur.BLEU, new Point3D(20, 4, loin), 2));
		f.ajouter(new Cube(Couleur.BLEU, new Point3D(18, 4, loin), 2));
		
		
		/***************************** D *****************************/
		
		f.ajouter(new Cube(Couleur.GRIS, new Point3D(36, 0, loin), 2));
		f.ajouter(new Cube(Couleur.GRIS, new Point3D(36, 2, loin), 2));
		f.ajouter(new Cube(Couleur.GRIS, new Point3D(36, 4, loin), 2));
		f.ajouter(new Cube(Couleur.GRIS, new Point3D(36, 6, loin), 2));
		f.ajouter(new Cube(Couleur.GRIS, new Point3D(36, 8, loin), 2));
		
		f.ajouter(new Cube(Couleur.GRIS, new Point3D(38, 0, loin), 2));
		f.ajouter(new Cube(Couleur.GRIS, new Point3D(40, 0, loin), 2));
		f.ajouter(new Cube(Couleur.GRIS, new Point3D(42, 0, loin), 2));
		f.ajouter(new Cube(Couleur.GRIS, new Point3D(38, 8, loin), 2));
		f.ajouter(new Cube(Couleur.GRIS, new Point3D(40, 8, loin), 2));
		f.ajouter(new Cube(Couleur.GRIS, new Point3D(42, 8, loin), 2));
		
		f.ajouter(new Cube(Couleur.GRIS, new Point3D(44, 2, loin), 2));
		f.ajouter(new Cube(Couleur.GRIS, new Point3D(44, 4, loin), 2));
		f.ajouter(new Cube(Couleur.GRIS, new Point3D(44, 6, loin), 2));
		
		// boucle de jeu
		while (true) {
			try {
				Thread.sleep(10);
			} catch (Exception err) {}
			
			/*** Activer les lignes ou non ***/
			
			if ( clavier.getEntreeTape() ){
				if ( isActivated % 2 == 0){
					f.activerLignes(true);
				}else{
					f.activerLignes(false);
				}
				isActivated++;
				System.out.println("Lignes activees = "+isActivated);
			}
			
			/*** SNAAAAAP ***/
			if (clavier.getETape()){
				f.snapShot();
			}

			/*** DEPLACEMENTS ***/
			// avant
			if (clavier.getZEnfoncee()) {
				cam.deplacerVersRegard(vitesse);
				System.out.println("j'avance..."+cam.getPosition());
			}

			// arriere
			if (clavier.getSEnfoncee()) {
				cam.deplacerVersRegard(-vitesse);
				System.out.println("je recule..."+cam.getPosition());
			}

			// droite
			if (clavier.getDEnfoncee()) {
				cam.decalerDroite(vitesse);
				System.out.println("je vais a droite..."+cam.getPosition());
			}
			// gauche
			if (clavier.getQEnfoncee()) {
				cam.decalerGauche(vitesse);
				System.out.println("je vais a gauche..."+cam.getPosition());
			}
			
			/*** ORIENTATIONS / DIRECTIONS ***/
			// orientation droite
			if (clavier.getDroiteEnfoncee()) {
				cam.setAngleGD(cam.getAngleGD() + sensi);
				System.out.println("Je regarde a droite..." + cam.getAngleGD());
			}
			// orientation gauche
			if (clavier.getGaucheEnfoncee()) {
				cam.setAngleGD(cam.getAngleGD() - sensi);
				System.out.println("Je regarde a gauche..." + cam.getAngleGD());
			}

			// orientation haut
			if (clavier.getHautEnfoncee()) {
				cam.setAngleHB(cam.getAngleHB() - sensi);
				System.out.println("Je regarde en haut..." + cam.getAngleHB());
			}
			// orientation bas
			if (clavier.getBasEnfoncee()) {
				cam.setAngleHB(cam.getAngleHB() + sensi);
				System.out.println("Je regarde en bas..." + cam.getAngleHB());
			}

			f.rafraichir();
		}

	}

}
