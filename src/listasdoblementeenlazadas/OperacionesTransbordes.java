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

//    public void distanciaATransbordes(int linea, String a) {
//        NodoDoble estaciones = this.getEstaciones(linea);
//        ArrayList<String> trans = this.getTrasbordesPorlinea(linea);
//        trans.forEach(dato -> {
//            System.out.println(this.DistanciaNodos(a, dato, estaciones) - 1);
//        });
//    }
    public ArrayList<Object> existeTransborde(NodoDoble estaciones, ArrayList<String> transbordesDestino) { /// chabacno -> transbordes destino   tacuba,chabano,bellas artes
        System.out.println("datooos");
        System.out.println(estaciones.dato);
        int distancia = 1000;
        String transbordePerfecto = null;
        NodoDoble aux = estaciones;
        boolean ida = false;
        boolean vuelta = false;
        while (estaciones != null) {
            int index = transbordesDestino.indexOf(estaciones.dato);
            if (index != -1) {
                int a = this.DistanciaNodos(aux.dato, transbordesDestino.get(index), aux);
                if (a < distancia) {
                    distancia = a;
                    transbordePerfecto = transbordesDestino.get(index);
                }
            }
            if (ida == false) {
                estaciones = estaciones.siguiente;
                if (estaciones == null) {
                    estaciones = aux;
                    ida = true;
                }
            } else {
                estaciones = estaciones.anterior;
            }

        }
        ArrayList<Object> elementos = new ArrayList();
        elementos.add(transbordePerfecto);
        elementos.add(distancia);
        return elementos;
    }

    public ArrayList<Object> transbordar(int evitarLinea, String nombreTransborde, ArrayList<String> transbordesDestino) { // string 0, distancia 1

        ArrayList<Object> objetos = new ArrayList();
        objetos.add("");
        objetos.add(1000);
        Transbordes aux = this.transbordes;
        while (aux != null) {
            if (aux.NombreEstacion.equals(nombreTransborde)) {
                break;
            }
            aux = aux.sig;
        }
        System.out.println("TRanborde querido");
        System.out.println(aux.getNombreEstacion());
        Lineas lineas = aux.getLinea();
        while (lineas != null) {

            if (lineas.getNlinea() != evitarLinea && lineas.getEstaciones().getInicio() != null) {
                System.out.println("Tengo la linea " + lineas.getNlinea());

                ArrayList<Object> obj = this.existeTransborde(lineas.getEstaciones().getInicio(), transbordesDestino);
                if ((int) obj.get(1) < (int) objetos.get(1)) {
                    objetos.set(1, obj.get(1));
                    objetos.set(0, obj.get(0));
                    System.out.println("lo mejor al momenot es");
                    System.out.println(obj.get(0));
                }

            }
            lineas = lineas.getLineaSiguiente();

        }

        return objetos;

    }

    public void recursividad(int lineaBase, int lineaLegada, int intento) {
        ArrayList<String> transbordesa = this.getTrasbordesPorlinea(lineaBase);// tenemos
        ArrayList<String> transbordesb = this.getTrasbordesPorlinea(lineaLegada);// necesitamos
        
        

    }

    public void caso2(int linea1, int linea2, String estacion1, String estacion2) {
        ArrayList<String> transbordesb = this.getTrasbordesPorlinea(linea2);// necesitamos
        ArrayList<String> transbordesa = this.getTrasbordesPorlinea(linea1);// tenemos
        int lomejotNum = 100;
        String lomejorNombre = "";
        ArrayList<Object> algo = new ArrayList();

        int distanciaPrimeros = 1000;
        for (int i = 0; i < transbordesa.size(); i++) {
            System.out.println("=-----------------------------------------------------------------------------");
            System.out.println(transbordesa.get(i));
            int a = this.DistanciaNodos(estacion1, transbordesa.get(i), this.getEstaciones(linea1)) - 1;
            System.out.println(a);

            algo = this.transbordar(linea1, transbordesa.get(i), transbordesb);
            int intento = (int) algo.get(1) + distanciaPrimeros;
            System.out.println("intento es");
            System.out.println(intento);
            if (lomejotNum > intento) {
                lomejotNum = intento;
                lomejorNombre = (String) algo.get(0);

            }
        }

        System.out.println("lo mejor fue");
        System.out.println(lomejorNombre);

    }
}
