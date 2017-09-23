/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perlinnoise;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

/**
 *
 * @author plucarelli
 */
public class Particle {
    private Vector pos;
    private Vector vel;
    private Vector acc;
    private int maxSpeed;
    private int alpha = 5;
    
    private Vector prevPos;

    public Particle() {
        Random rnd = new Random();
        this.pos = new Vector(rnd.nextInt(Settings.WIDTH) , rnd.nextInt(Settings.HEIGHT));
        Boolean neg = rnd.nextBoolean();
        this.vel = new Vector(0,0);
        this.acc = new Vector(0, 0);
        this.maxSpeed = 15;
        this.prevPos = new Vector(this.pos.getX(), this.pos.getY());
    }
    
    public void update(){
        this.vel.add(this.acc);
        this.vel.limitMag(maxSpeed);
        this.pos.add(this.vel);
        this.acc.setX(0);
        this.acc.setY(0);
    }
    
    public void show(Graphics2D g){
        g.setColor(new Color(0,0,0,alpha));
//        g.drawOval((int)this.pos.getX(), (int)this.pos.getY(), 1, 1);
        g.drawLine((int)this.pos.getX(), (int)this.pos.getY(), (int)this.prevPos.getX(), (int)this.prevPos.getY());
        this.updatePrev();
//        System.out.println("x: " + this.pos.getX());
//        System.out.println("y: " + this.pos.getY());
    }
    
    public void edges(){
        if (this.pos.getX() >= Settings.WIDTH){
            this.pos.setX(0);  
            this.updatePrev();
        }
        if (this.pos.getX() < 0){
            this.pos.setX(Settings.WIDTH-1);
            this.updatePrev();
        }
        if (this.pos.getY() >= Settings.HEIGHT){
            this.pos.setY(0);
            this.updatePrev();
        }
        if (this.pos.getY() < 0){
            this.pos.setY(Settings.HEIGHT-1);
            this.updatePrev();
        }
    }
    
    public void updatePrev(){
        this.prevPos.setX((int)this.pos.getX());
        this.prevPos.setY((int)this.pos.getY());
    }
    
    
    public void follow(Vector[] ff){
        
        int x = (int)Math.floor(this.pos.getX() / Settings.SCALE);
        int y = (int)Math.floor(this.pos.getY() / Settings.SCALE);
        int index = x + (y * Settings.COLLUMNS);
//        System.out.println(index);
//        System.out.println("x: " + this.pos.getX());
//        System.out.println("y: " + this.pos.getY());
//        System.out.println("index: "  + index + " " + x + " " + y + " cols: "  + Settings.COLLUMNS);
        Vector force = ff[index];
        this.applyForce(force);
        
    }
    
    
    public void applyForce(Vector force){
        this.acc.add(force);
    }

    @Override
    public String toString() {
        return "Particle{" + "pos=" + pos + ", vel=" + vel + ", acc=" + acc + '}';
    }
    
    
    
    
}
