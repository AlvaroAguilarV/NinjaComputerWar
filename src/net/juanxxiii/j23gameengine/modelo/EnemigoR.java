/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.juanxxiii.j23gameengine.modelo;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;

/**
 *
 * @author Rober
 */
public class EnemigoR extends Enemigo implements Runnable{
    
    public EnemigoR() throws IOException {
        super(100, 15, 1, 0, 350, ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/RVivo.png")));
    }

    @Override
    public void recibirImpacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    /*
    crear objeto
    new Thread(NObjeto).start();
    */
}
