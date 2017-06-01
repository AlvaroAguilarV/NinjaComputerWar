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

/**
 *
 * @author Rober
 */
public class EnemigoR extends Enemigo{
    
    public EnemigoR(float vida, float danyo, float velocidad, int coordX, int coordY, BufferedImage imagen) throws IOException {
        super(100, 15, 1, 700, 400, ImageIO.read(ClassLoader.getSystemResource("assets/RVivo.jpg")));
    }

    @Override
    public void recibirImpacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
