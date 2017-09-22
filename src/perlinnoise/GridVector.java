/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perlinnoise;

/**
 *
 * @author plucarelli
 */
public class GridVector {
    private double angle;

    public GridVector(int angle) {
        this.angle = Math.toRadians(angle);
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
    
    
    
    
}
