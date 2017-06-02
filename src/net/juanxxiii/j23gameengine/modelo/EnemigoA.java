/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.juanxxiii.j23gameengine.modelo;

import java.awt.image.BufferedImage;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;

/**
 *
 * @author dam1b
 */
public class EnemigoA extends Enemigo implements Runnable{

    public EnemigoA() throws IOException {
         super(100, 20, 1, 0, 100, ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/A.png")));
    }

    @Override
    public void recibirImpacto() {
        
    }

    @Override
    public void run() {
        try {
            coordX++;
            sleep(10);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
}
