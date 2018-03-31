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

public class Tube extends Objet3D{
	
	public Tube(){
		super();
	}
	
	public Tube(double diametre, double diametreInterne, double hauteur){
		super(Couleur.NOIR);
	}

public Tube(Couleur couleur, double diametre, double diametreInterne, double hauteur){
		super(couleur);
	}
	
	public Tube(Tube t){
		super(t.getCouleur());
	}

@Override
	protected void genereMaillage() {
		// TODO Auto-generated method stub
		
	}
	
}
