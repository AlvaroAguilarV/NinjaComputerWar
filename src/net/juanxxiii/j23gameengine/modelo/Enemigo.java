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
public abstract class Enemigo {
    float vida;
    float danyo;
    float velocidad;
    int coordX;
    int coordY;
    BufferedImage imagen;

    public Enemigo(float vida, float danyo, float velocidad, int coordX, int coordY, BufferedImage imagen) {
        this.vida = vida;
        this.danyo = danyo;
        this.velocidad = velocidad;
        this.coordX = coordX;
        this.coordY = coordY;
        this.imagen = imagen;
        
    }

    public float getDanyo() {
        return danyo;
    }

    public void setDanyo(float danyo) {
        this.danyo = danyo;
    }
    
    public abstract void recibirImpacto();

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public BufferedImage getImagen() {
        return imagen;
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
    }
    
}
