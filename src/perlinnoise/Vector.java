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
public class Vector {
    
    private double x;
    private double y;
    private double magnitude;

    public Vector(double angle) {
        this.magnitude = 1.0;
        this.x = this.magnitude * Math.cos(angle);
        this.y = this.magnitude * Math.sin(angle);
    }
    
    public Vector(double angle, double mag) {
        this.magnitude = mag;
        this.x = this.magnitude * Math.cos(angle);
        this.y = this.magnitude * Math.sin(angle);
    }
    

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void add(Vector v){
        this.x += v.getX();
        this.y += v.getY();
    }
    
    public double calMagn(){
        double mag = Math.sqrt( (Math.pow(x, 2) + Math.pow(y, 2)) );
        return mag;
    }
}
