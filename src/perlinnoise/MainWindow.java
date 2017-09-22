/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perlinnoise;

import javax.swing.JFrame;

/**
 *
 * @author plucarelli
 */
public class MainWindow  extends JFrame{
    
    private MainPanel mainPanel = new MainPanel();
    
    public MainWindow(){
        add(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(Settings.WIDTH,Settings.HEIGHT);
        setVisible(true);
    }
}
