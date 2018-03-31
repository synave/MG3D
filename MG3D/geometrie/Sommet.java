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

import java.util.ArrayList;

public class Sommet extends Point3D{

    // TODO voir s'il ne faut pas plutôt utiliser un Set, un HashSet ? Autre chose ?
    // Permet de stocker les indices des sommets voisins dans le maillage.
    private ArrayList<Integer> voisins;
    
    public Sommet(){
	super();
	voisins = new ArrayList<Integer>();
    }

    public Sommet(double x, double y, double z){
	super(x,y,z);
	voisins = new ArrayList<Integer>();
    }

    public Sommet(Sommet s){
	super(s.getX(),s.getY(),s.getZ());
	voisins = new ArrayList<Integer>();
    }

    public boolean ajouterVoisin(int indice){
	boolean contient=estVoisin(indice);
	if(!contient)
	    voisins.add(new Integer(indice));
	return !contient;
    }

    public boolean estVoisin(int indice){
	return voisins.contains(new Integer(indice));
    }
}
