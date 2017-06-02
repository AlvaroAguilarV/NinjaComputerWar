/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.juanxxiii.j23gameengine.modelo;

import java.awt.image.BufferedImage;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author dam1b
 */
public class EnemigoJ extends Enemigo implements Runnable{
    
    public EnemigoJ() throws IOException {
        super(100, 15, 1, 0, 300, ImageIO.read(ClassLoader.getSystemResource("assets/J.png")));
    }
    
    @Override
    public void recibirImpacto() {
    }
    
    @Override
    public void run() {
        while(true){
            try {
                coordX++;
                if(vida<30){
                    sleep(10);
                } else if (vida<70){
                    sleep(20);
                } else {
                    sleep(30);
                }
                
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
    }
        
    }
    /*
    crear objeto
    new Thread(NObjeto).start();
    */
}
