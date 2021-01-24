/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdoblementeenlazadas;

import java.util.ArrayList;

/**
 *
 * @author Abraham Arvizu;
 */
public class Estaciones {

    private NodoDoble inicio, fin;

    public Estaciones() {
        inicio = fin = null;
    }

    public NodoDoble getInicio() {
        return inicio;
    }

    public void setInicio(NodoDoble inicio) {
        this.inicio = inicio;
    }

    public NodoDoble getFin() {
        return fin;
    }

    public void setFin(NodoDoble fin) {
        this.fin = fin;
    }
    
        

    //Metodo para saber cuando la lista esta vacia
    public boolean estaVacia() {
        return inicio == null;
    }

    //MetodoInsertarAlFinal
    public void InsertarFinal(String dato) {
        if (!estaVacia()) {
            fin = new NodoDoble(dato, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new NodoDoble(dato);
        }
    }

    //MetodoInsertarAlInicio
    public void InsertarInicio(String dato) {
        if (!estaVacia()) {
            inicio = new NodoDoble(dato, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new NodoDoble(dato);
        }
    }

    //MetodoParaMostrarDatos
    public void mostrarDatos() {
        if (!estaVacia()) {
            String datos = "<=>";
            NodoDoble aux = inicio;
            while (aux != null) {
                datos = datos + "[" + aux.dato + "]";
                aux = aux.siguiente;
            }
        }
    }

    public ArrayList<String> Caso1(String d1, String d2) {
        String datos = "<=>";
        String datos1 = "<=>";
        NodoDoble aux = inicio;
        while (aux != null) {
            if (aux.dato.equals(d1)) {
                System.out.println("Se rompe***************************************");
                break;
            }
            System.out.println("PrimerWhile----------------------------------------------------------");
            System.out.println(aux.dato);
            aux = aux.siguiente;

        }
        ArrayList<String> obj = new ArrayList();
        NodoDoble aux2 = aux;
        boolean ida = false;
        while (aux != null) {
            if (aux.dato.equals(d2)) {
                break;
            }
            System.out.println(aux.dato);
            obj.add(aux.dato);

            if (ida == false) {
                aux = aux.siguiente;
                if (aux == null) {
                    aux = aux2;
                    ida = true;
                    obj.clear();
                }
            } else {
                aux = aux.anterior;
            }

        }
        return obj;
    }



}
