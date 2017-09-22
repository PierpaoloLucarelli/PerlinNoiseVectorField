/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perlinnoise;

import java.awt.image.BufferedImage;
import java.util.Random;

/**
 *
 * @author plucarelli
 */
public class RandomNoise {
    
    private static BufferedImage image = new BufferedImage(MainWindow.WIDTH, MainWindow.HEIGHT, BufferedImage.TYPE_INT_RGB);
    private static Random random = new Random();
    
    public static BufferedImage getNoiseImage(){
        for( int y = 0 ; y  < MainWindow.HEIGHT ;  y++){
            for(int x = 0 ; x < MainWindow.WIDTH ; x++){
                image.setRGB(x, y, random.nextInt(0xFFFFFF));
            }
        }
        return image;
    }
    
}
