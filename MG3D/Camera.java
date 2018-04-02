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

package MG3D;

import MG3D.geometrie.Point3D;
import java.text.DecimalFormat;

public class Camera {

    private Point3D position;
    private float angleHB, angleGD;

    public Camera() {
	position = new Point3D(0, 0, 0);
	angleHB = 0.0f;
	angleGD = 0.0f;
    }

    public Camera(Camera c) {
	position = new Point3D(c.getPosition());
	angleHB = c.angleHB;
	angleGD = c.angleGD;
    }
	
    public void decalerGauche(float distance) {
	double dx, dz;
	dx = Math.cos(Math.toRadians(90 - angleGD)) * distance;
	dz = -Math.sin(Math.toRadians(90 - angleGD)) * distance;
	position.setX(position.getX() + dz);
	position.setZ(position.getZ() - dx);
    }

    public void decalerDroite(float distance) {
	double dx, dz;
	dx = Math.cos(Math.toRadians(90 - angleGD)) * distance;
	dz = -Math.sin(Math.toRadians(90 - angleGD)) * distance;
	position.setX(position.getX() - dz);
	position.setZ(position.getZ() + dx);
    }

    public void deplacerVersRegard(float distance) {
	double dx, dz;
	dx = Math.cos(Math.toRadians(90 - angleGD)) * distance;
	dz = -Math.sin(Math.toRadians(90 - angleGD)) * distance;
	position.setX(position.getX() + dx);
	position.setZ(position.getZ() + dz);
    }

    public Point3D getFuturePosition(float distance){
	double dx, dz;
	dx = Math.cos(Math.toRadians(90 - angleGD)) * distance;
	dz = -Math.sin(Math.toRadians(90 - angleGD)) * distance;
	return new Point3D(position.getX() + dx,position.getY(),position.getZ() + dz);
    }

    public Point3D pointRegarde() {
	double x, y, z;
	x = position.getX() + Math.cos(Math.toRadians(90 - angleGD));
	y = position.getY() - Math.cos(Math.toRadians(90 - angleHB));
	z = position.getZ() - Math.sin(Math.toRadians(90 - angleGD));
	return new Point3D(x, y, z);
    }

    /*** GETTERS ***/

    public Point3D getPosition() {
	return position;
    }

    public float getAngleHB() {
	return angleHB;
    }

    public float getAngleGD() {
	return angleGD;
    }

    /*** SETTERS ***/

    public void setPosition(Point3D position) {
	this.position = new Point3D(position);
    }

    public void setAngleHB(float angleHB) {
	this.angleHB = angleHB;
    }

    public void setAngleGD(float angleGD) {
	this.angleGD = angleGD;
    }

    public String toString() {
	DecimalFormat fmt = new DecimalFormat("#,##0.000#");
	return new String("Camera en " + position + " regardant vers " + pointRegarde()+"\nangle Gauche/Droite : "+fmt.format(angleGD)+ "\nangle Haut/Bas : "+fmt.format(angleHB));
    }

}
