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
        Boolean neg = rnd.nextBoolean();
        this.vel = new Vector(rnd.nextInt(5) * (neg ? -1 : 1), rnd.nextInt(5) * (neg ? -1 : 1));
        this.acc = new Vector(0, 0);
    }
    
    public void update(){
        this.vel.add(this.acc);
        this.pos.add(this.vel);
        this.acc.setX(0);
        this.acc.setY(0);
    }
    
    public void show(Graphics g){
        g.drawOval((int)this.pos.getX(), (int)this.pos.getY(), 2, 2);
    }
    
    public void edges(){
        if (this.pos.getX() > Settings.WIDTH)
            this.pos.setX(0);
        if (this.pos.getX() < 0)
            this.pos.setX(Settings.WIDTH);
        if (this.pos.getY() > Settings.HEIGHT)
            this.pos.setY(0);
        if (this.pos.getY() < 0)
            this.pos.setY(Settings.HEIGHT);
    }
    
    
}
