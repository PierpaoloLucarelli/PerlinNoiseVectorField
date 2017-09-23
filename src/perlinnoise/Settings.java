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
public class Settings {
    
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int SCALE = 20;
    public static final int ROWS = (int)Math.floor(HEIGHT / SCALE);
    public static final int COLLUMNS = (int) Math.floor(WIDTH / SCALE);
    
    public static final int NO_PARTICLES = 100;
}
