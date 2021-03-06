/*********************************************************************/
/*                                                                   */
/* Copyright 2017-2018 Rémi Synave, Ryan Verlande                    */
/*                                                                   */
/* This file is part of MG3D.                                        */
/* This library uses javazoom library piece of code                  */
/* http://www.javazoom.net                                           */
/* and can be found with this library (file jlayer1.0.1.tar.gz)      */
/*                                                                   */
/* MG3D is free software: you can redistribute it and/or modify      */
/* it under the terms of the GNU General Public License as published */
/* by the Free Software Foundation, either version 3 of the License, */
/* or (at your option) any later version.                            */
/*                                                                   */
/* MG3D is distributed in the hope that it will be useful,           */
/* but WITHOUT ANY WARRANTY; without even the implied warranty of    */
/* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the      */
/* GNU General Public License for more details.                      */
/*                                                                   */
/* You should have received a copy of the GNU General Public License */
/* along with MG3D. If not, see <http://www.gnu.org/licenses/>.      */
/*                                                                   */
/*********************************************************************/

package MG3D.geometrie;

public class Parallelepipede extends Objet3D {

    private Point3D origine;
    private double tailleX,tailleY,tailleZ;

    /**
     * Création d'un parallélépipède par défaut.<br />
     * Son coin inférieur se trouvera en (0,0,0) et sera de taille 3 suivant X,
     * 1 suivant Y (la hauteur) et 2 suivant Z (la profondeur).
     */
    public Parallelepipede() {
	super();
	origine = new Point3D(0,0,0);
	tailleX=3;
	tailleY=1;
	tailleZ=2;

	genereMaillage();
    }

    public Parallelepipede(Point3D oorigine, double ttailleX, double ttailleY, double ttailleZ) {
	super(Couleur.NOIR);
	if(ttailleX>=0 && ttailleY>=0 && ttailleZ>=0){
	    origine=new Point3D(oorigine);
	    tailleX=ttailleX;
	    tailleY=ttailleY;
	    tailleZ=ttailleZ;
	} else {
	    origine = new Point3D(0,0,0);
		tailleX=3;
		tailleY=1;
		tailleZ=2;
	    System.out.println("ERREUR : Les valeurs doivent être positives ! Parallelepipede par défaut créé");
	}

	genereMaillage();
    }
    
    public Parallelepipede(Couleur couleur, Point3D oorigine, double ttailleX, double ttailleY, double ttailleZ) {
	super(couleur);
	if(ttailleX>=0 && ttailleY>=0 && ttailleZ>=0){
	    origine=new Point3D(oorigine);
	    tailleX=ttailleX;
	    tailleY=ttailleY;
	    tailleZ=ttailleZ;
	} else {
	    origine = new Point3D(0,0,0);
		tailleX=3;
		tailleY=1;
		tailleZ=2;
	    System.out.println("ERREUR : Les valeurs doivent être positives ! Parallelepipede par défaut créé");
	}

	genereMaillage();
    }

    public Parallelepipede(Parallelepipede p) {
	super(p.getCouleur());
	
	origine=new Point3D(p.origine);
	tailleX=p.tailleX;
	tailleY=p.tailleY;
	tailleZ=p.tailleZ;
	genereMaillage();
    }

    protected void genereMaillage(){
	    add(new Sommet(0 + origine.getX(), 0 + origine.getY(), 0 + origine.getZ()));
	    add(new Sommet(tailleX + origine.getX(), 0 + origine.getY(), 0 + origine.getZ()));
	    add(new Sommet(0 + origine.getX(), tailleY + origine.getY(), 0 + origine.getZ()));
	    add(new Sommet(tailleX + origine.getX(), tailleY + origine.getY(), 0 + origine.getZ()));
	    add(new Sommet(0 + origine.getX(), 0 + origine.getY(), tailleZ + origine.getZ()));
	    add(new Sommet(tailleX + origine.getX(), 0 + origine.getY(), tailleZ + origine.getZ()));
	    add(new Sommet(0 + origine.getX(), tailleY + origine.getY(), tailleZ + origine.getZ()));
	    add(new Sommet(tailleX + origine.getX(), tailleY + origine.getY(), tailleZ + origine.getZ()));
	    
	    add(new Face(3, 1, 0));
	    add(new Face(2, 3, 0));
	    add(new Face(3, 7, 1));
	    add(new Face(5, 1, 7));
	    add(new Face(6, 5, 7));
	    add(new Face(5, 6, 4));
	    add(new Face(4, 6, 2));
	    add(new Face(4, 2, 0));
	    add(new Face(6, 7, 3));
	    add(new Face(3, 2, 6));
	    add(new Face(1, 5, 0));
	    add(new Face(4, 0, 5));
    }

}
