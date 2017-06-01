/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.juanxxiii.j23gameengine.modelo;

import java.awt.image.BufferedImage;

/**
 *
 * @author dam1b
 */
public class EnemigoA extends Enemigo{

    public EnemigoA(float vida, float danyo, float velocidad, int coordX, int coordY, BufferedImage imagen) {
        super(vida, danyo, velocidad, coordX, coordY, imagen);
    }

    @Override
    public void recibirImpacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
