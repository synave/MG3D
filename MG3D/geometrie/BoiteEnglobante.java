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

public class BoiteEnglobante {

	private Point3D min, max;

	public BoiteEnglobante() {
		min = new Point3D(0, 0, 0);
		max = new Point3D(0, 0, 0);
	}

	public BoiteEnglobante(Point3D mmin, Point3D mmax) {
		min = new Point3D(mmin);
		max = new Point3D(mmax);
	}

	public BoiteEnglobante(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
		min = new Point3D(minX, minY, minZ);
		max = new Point3D(maxX, maxY, maxZ);
	}

	public boolean intersection(BoiteEnglobante be) {
		boolean collision = true;
		
		if (
			 be.getMin().getX() > this.getMax().getX() ||
		     be.getMin().getY() > this.getMax().getY() ||
		     be.getMin().getZ() > this.getMax().getZ() ||
		     be.getMax().getX() < this.getMin().getX() ||
		     be.getMax().getY() < this.getMin().getY() ||
		     be.getMax().getZ() < this.getMin().getZ()
		)
			collision = false;
		
		return collision;
	}

	public Point3D getMin() {
		return min;
	}

	public Point3D getMax() {
		return max;
	}

}
