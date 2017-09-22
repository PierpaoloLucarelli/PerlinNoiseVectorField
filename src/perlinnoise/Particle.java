/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perlinnoise;

import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author plucarelli
 */
public class Particle {
    private Vector pos;
    private Vector vel;
    private Vector acc;

    public Particle() {
        Random rnd = new Random();
        this.pos = new Vector(rnd.nextInt(Settings.WIDTH), rnd.nextInt(Settings.HEIGHT));
        this.vel = new Vector(0, 0);
        this.acc = new Vector(0, 0);
    }
    
    public void update(){
        this.vel.add(this.acc);
        this.pos.add(this.vel);
        this.acc.setX(0);
        this.acc.setY(0);
    }
    
    public void show(Graphics g){
        g.drawOval(this.pos.getX(), this.pos.getY(), 2, 2);
    }
    
    
}
