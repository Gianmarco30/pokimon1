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
    public String nombre;
    private int nivel;
    public int vida;

    
    public Pokemon(String nombre) {
        this.nombre = nombre;
        nivel = 5;
        vida = 40 + nivel*5;
    }

    
    
   
    public String MostrarEstado(){
        String estado = this.vida + " HP";
        return estado;
    }
    public int critic = 2;
    public int esqui = 15;
    public int ataque = (int)(Math.random()*5 + 5);
    
    public String Atacar(Pokemon contrincante){
        String resultado = "";
        ataque = ataque;
        int critico = (int)(Math.random()*100);
        int probabi = (int)(Math.random()*100);
        
        
        if (critico <= 20){
            ataque = (int)(ataque*critic);
            contrincante.vida = contrincante.vida - ataque;
            if (contrincante.vida < 0){
                contrincante.vida = 0;
            }
            resultado = contrincante.nombre + " recibio un ataque critico de " + ataque;
        }
        else if (probabi <= esqui){
            
            contrincante.vida = contrincante.vida;
            if (contrincante.vida < 0){
                contrincante.vida = 0;
            }
            resultado = contrincante.nombre + " esquivo el ataque.";
        }
        else{
            contrincante.vida = contrincante.vida - ataque;
            resultado = contrincante.nombre + " recibio un ataque de " + ataque;
            if (contrincante.vida < 0){
                contrincante.vida = 0;
            }
        }      
        
        return resultado;    
    }
    public String UsarPocion(Pokemon contrincante){
        String resultado = "";
        
        contrincante.vida = contrincante.vida + 15;
        if (contrincante.vida >65){
            contrincante.vida = 65;
        }
        resultado = contrincante.nombre + " uso una poción";
        return resultado;
    }

    

    
    
}
