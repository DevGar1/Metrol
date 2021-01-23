package listasdoblementeenlazadas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abraham Arvizu;
 */
public class Nodo {
    public int dato;
    public Nodo sig; //Puntero enlace
    
    //Constructor para insertar al final
    public Nodo(int d){
        this.dato=d;
        this.sig=null;
    }
    
    //Constructor para insertar al inicio
    public Nodo(int d, Nodo n){
        dato=d;
        sig=n;
    }
    
}
