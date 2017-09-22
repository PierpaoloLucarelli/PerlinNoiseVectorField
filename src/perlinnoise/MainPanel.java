/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perlinnoise;

import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author plucarelli
 */
public class MainPanel extends JPanel{
    private Timer timer = new Timer(30, e -> repaint());
    private Particle[] particles = new Particle[Settings.NO_PARTICLES];

  
    
    public MainPanel(){
        timer.start();
        for(int x = 0 ; x < this.particles.length ; x++){
            particles[x] = new Particle();
        }   
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
//        g.drawImage(ImprovedNoise.getNoiseImage(), 0 , 0, this);
        ImprovedNoise noise = new ImprovedNoise(particles);
        noise.getVectorGrid(g);
    }
}
