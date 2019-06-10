/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author alumno
 */
public class Pokemon {
    private String nombre;
    private int nivel;
    private int vida;

    public Pokemon(String nombre) {
        this.nombre = nombre;
        vida = 40 + nivel*5;
    }
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public String MostrarEstado(){
        String estado = this.vida + " HP";
        return estado;
    }
    public String Atacar(Pokemon contrincante){
        String resultado = "";
        int ataque = (int)(Math.random()*5 + 5);
        int critico = (int)(Math.random()*100);
        
        if (critico <= 20){
            ataque = (int)(ataque*2);
        }
        if (critico > 20 || critico <= 27){
            ataque = 0;
        }
        contrincante.vida = contrincante.vida - ataque;
        
        if (contrincante.vida < 0){
            contrincante.vida = 0;
        }
        if (critico <= 20){
            resultado = contrincante.nombre + " recibio un ataque critico de " + ataque;
        }
        else if (critico > 20 || critico <=27){
            resultado = contrincante.nombre + " esquivo el ataque.";
        }
        else{
            resultado = contrincante.nombre + " recibio un ataque de " + ataque;
        }        
        
        return resultado;    
    }
    
}
