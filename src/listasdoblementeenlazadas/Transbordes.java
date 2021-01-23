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
public class Transbordes {
    String NombreEstacion;
    Transbordes sig;
    Lineas linea;
    
    public Transbordes(String nombre){
        this.NombreEstacion=nombre;
        this.linea=null;
        this.sig=null;
    }

    @Override
    public String toString() {
        return "Transbordes{" + "NombreEstacion=" + NombreEstacion  + ", linea=" + linea + '}';
    }

    public String getNombreEstacion() {
        return NombreEstacion;
    }

    public void setNombreEstacion(String NombreEstacion) {
        this.NombreEstacion = NombreEstacion;
    }

    public Transbordes getSig() {
        return sig;
    }

    public void setSig(Transbordes sig) {
        this.sig = sig;
    }

    public Lineas getLinea() {
        return linea;
    }

    public void setLinea(Lineas linea) {
        this.linea = linea;
    }
    
    
    
}
