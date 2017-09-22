/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perlinnoise;

import javax.swing.SwingUtilities;

/**
 *
 * @author plucarelli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
                new MainWindow();
            }
            
        });
//        ImprovedNoise noise = new ImprovedNoise();
//        for(double x = 0.0 ; x < 1.0 ; x += 0.1){
//            double val = noise.noise(x, x, x);
//            System.out.println(val);
//            System.out.println((val - 1) / 2);
//        }
    }
    
}
