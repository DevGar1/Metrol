/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdoblementeenlazadas;

/**
 *
 * @author Abraham Arvizu;
 */
public class NodoDoble {
    public String dato;
    NodoDoble siguiente;
    NodoDoble anterior;   
    
    //
    
    
    
    //Constructor para cuando ya hay nodos
    public NodoDoble(String el, NodoDoble sig, NodoDoble a){
        dato=el;
        siguiente=sig;
        anterior=a;        
    }
    
    
    //Constructor para cuando aun no hay nodos
    public NodoDoble(String el){
         this(el,null,null);
    }
}
