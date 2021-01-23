/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdoblementeenlazadas;

import java.util.ArrayList;

/**
 *
 * @author Abra_
 */
public class OperacionesTransbordes {

    private final Transbordes transbordes;

    public OperacionesTransbordes(Transbordes transbordes) {
        this.transbordes = transbordes;
    }

    public void mostrarTransbordes() {
        Transbordes aux = this.transbordes;
        Lineas aux1;
        while (aux != null) {
            System.out.println("El transborde es");
            System.out.println(aux.getNombreEstacion());
            aux1 = aux.getLinea();
            System.out.println("Sus lineas son");
            while (aux1 != null) {
                System.out.println(aux1.getNlinea());
                aux1 = aux1.getLineaSiguiente();
            }
            aux = aux.getSig();
            System.out.println("");
            System.out.println("");
        }
    }

    public NodoDoble getEstaciones(int linea) {
        Transbordes aux = this.transbordes;
        Lineas aux1;
        while (aux != null) {
            aux1 = aux.getLinea();
            while (aux1 != null) {
                if (aux1.getNlinea() == linea) {
                    return aux1.getEstaciones().getInicio();
                }
                aux1 = aux1.getLineaSiguiente();
            }
            aux = aux.getSig();
            System.out.println("");
            System.out.println("");
        }
        return null;
    }

    public int DistanciaNodos(String d1, String d2, NodoDoble estaciones) {
        int x = 0;
        NodoDoble aux = estaciones;
        while (aux != null) {
            if (aux.dato.equals(d1)) {
                break;
            }
            aux = aux.siguiente;
        }
        NodoDoble aux2 = aux;
        boolean ida = false;
        while (aux != null) {
            x++;
            if (aux.dato.equals(d2)) {
                break;
            }

            if (ida == false) {
                aux = aux.siguiente;
                if (aux == null) {
                    aux = aux2;
                    ida = true;
                    x = 0;
                }
            } else {
                aux = aux.anterior;
            }
        }
        return x;
    }

    public ArrayList<String> getTrasbordesPorlinea(int lineaDeseada) {
        Transbordes aux = this.transbordes;
        ArrayList<String> transb = new ArrayList();
        Lineas aux2;
        while (aux != null) {
            aux2 = aux.getLinea();
            while (aux2 != null) {
                System.out.println(aux2.getNlinea());
                if (aux2.getNlinea() == lineaDeseada) {
                    transb.add(aux.getNombreEstacion());
                }
                aux2 = aux2.getLineaSiguiente();
            }
            aux = aux.sig;
        }
        System.out.println(transb);
        return transb;
    }
    
    
    public void distanciaATransbordes(int linea, String a){
        NodoDoble estaciones = this.getEstaciones(linea);
        ArrayList<String> trans = this.getTrasbordesPorlinea(linea);
        trans.forEach(dato->{
            System.out.println(this.DistanciaNodos(a, dato, estaciones));
        });
        
    }
}
