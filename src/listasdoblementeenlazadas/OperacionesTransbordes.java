/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdoblementeenlazadas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Abra_
 */
public class OperacionesTransbordes {

    private final Transbordes transbordes;
    private ArrayList<Object> nombres;
    private int distancia;
    private String nombre;

    public OperacionesTransbordes(Transbordes transbordes) {
        this.transbordes = transbordes;
        this.nombres = new ArrayList();
        this.nombres.add(100);
        this.nombres.add("");
        this.distancia = 100;
    }

    public void mostrarTransbordes() {
        Transbordes aux = this.transbordes;
        Lineas aux1;
        while (aux != null) {
            System.out.println(aux.getNombreEstacion());
            aux1 = aux.getLinea();
            while (aux1 != null) {
                System.out.println(aux1.getNlinea());
                aux1 = aux1.getLineaSiguiente();
            }
            aux = aux.getSig();

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
        }
        return null;
    }

    public NodoDoble recuperarEstacion(NodoDoble estaciones, String nombre) {
        NodoDoble aux2 = estaciones;
        boolean ida = false;
        while (estaciones != null) {
            if (estaciones.dato.equals(nombre)) {
                return estaciones;
            }

            if (ida == false) {
                estaciones = estaciones.siguiente;
                if (estaciones == null) {
                    estaciones = aux2;
                    ida = true;
                }
            } else {
                estaciones = estaciones.anterior;
            }
        }
        return null;
    }

    public int DistanciaNodos(String d1, String d2, NodoDoble estaciones) {
        int x = 0;

        NodoDoble aux2 = this.recuperarEstacion(estaciones, d1);
        NodoDoble aux = aux2;
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

    public Transbordes getTansborde(String nombre) {
        Transbordes aux = this.transbordes;
        while (aux != null) {
            if (aux.getNombreEstacion().equalsIgnoreCase(nombre)) {
                break;
            }
            aux = aux.sig;
        }
        return aux;
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
        Lineas lineas = aux.getLinea();
        while (lineas != null) {

            if (lineas.getNlinea() != evitarLinea && lineas.getEstaciones().getInicio() != null) {

                ArrayList<Object> obj = this.existeTransborde(lineas.getEstaciones().getInicio(), transbordesDestino);
                if ((int) obj.get(1) < (int) objetos.get(1)) {
                    objetos.set(1, obj.get(1));
                    objetos.set(0, obj.get(0));

                }

            }
            lineas = lineas.getLineaSiguiente();

        }

        return objetos;

    }

    public ArrayList<Lineas> getLineas(Transbordes transborde) {
        ArrayList<Lineas> lineasPosibles = new ArrayList();
        Lineas lineas = transborde.getLinea();
        while (lineas != null) {
            lineasPosibles.add(lineas);
            lineas = lineas.getLineaSiguiente();
        }
        return lineasPosibles;
    }

    public String Caso3(int lineaBase, int lineaLlegada, String salida, String estacionLlegada, int intentos) {
        System.out.println("----------------------------------------------------------------------------------------------------");
        ArrayList<String> transbordesa = this.getTrasbordesPorlinea(lineaBase);// tenemos
        ArrayList<String> transbordesb = this.getTrasbordesPorlinea(lineaLlegada);// necesitamos
        ArrayList<String> opciones = new ArrayList();

        if (intentos < 1) {
            return null;
        }
        if (lineaBase == lineaLlegada) {
//            int segundo = this.Caso1Numero(salida, estacionLlegada, lineaBase, false);
//            this.nombres.set(0, (int) this.nombres.get(0) + segundo);
//            this.nombres.set(0, (int) this.nombres.get(0) - 1);
//            this.nombres.add(estacionLlegada);

        } else {

            for (int i = 0; i < transbordesa.size(); i++) {
                Transbordes transborde = this.getTansborde(transbordesa.get(i));// regla 2
                ArrayList<Lineas> lineas = this.getLineas(transborde);// estas en la 3
                boolean esCaso2 = false;
                for (int j = 0; j < lineas.size(); j++) {

                    if (lineas.get(j).getNlinea() == lineaLlegada) {
                        ArrayList<String> camino = this.llamarCaso2(lineaBase, lineaLlegada, salida, estacionLlegada);
                        System.out.println(camino);
                        int tam = camino.size() - 4;
                        System.out.println(tam);
                        if (((int)this.nombres.get(0)) != 100) {
                            tam = tam + (int) this.nombres.get(0);
                        }
                        System.out.println(tam);
                        if ((int) this.nombres.get(0) > tam) {

                            this.distancia = tam;
                            this.nombres.set(0, this.distancia);
                            this.nombres.add(transborde.NombreEstacion);
                            this.nombres.add(estacionLlegada);
                        }
                        System.out.println(this.nombres);
                        esCaso2 = true;
                        return "hola";
                    }
                }
                if (!esCaso2) {
                    for (int j = 0; j < lineas.size(); j++) {
                        if (lineas.get(j).getNlinea() != lineaBase) {

                            String res = this.Caso3(lineas.get(j).getNlinea(), lineaLlegada, transborde.getNombreEstacion(), estacionLlegada, intentos - 1);
                            if (res != null) {
                                System.out.println("Es algo");

                            }
                        }
                    }
                }

            }

//            boolean flag = false;
//            if (intentos > 0) {
//                for (int i = 0; i < transbordesa.size(); i++) {
//                    for (int j = 0; j < transbordesb.size(); j++) {
//                        if (transbordesa.get(i).equalsIgnoreCase(transbordesb.get(j))) {
//                            opciones.add(transbordesa.get(i));
//
//                            flag = true;
//                            break;
//                        }
//                    }
//                }
//            }
//
//            if (flag == true) {
//                Transbordes aux = this.transbordes;
//                //opciones tenemos cuales cumplen caso 2
//                for (int i = 0; i < opciones.size(); i++) {
//
//                    while (aux != null) {
//                        if (aux.getNombreEstacion().equalsIgnoreCase(opciones.get(i))) {
//
//                            int distancias = this.Caso1Numero(salida, aux.getNombreEstacion(), lineaBase, false);
//
//                            if ((int) this.nombres.get(0) == 100) {
//                                this.nombres.set(0, distancias);
//                                this.nombres.add(aux.getNombreEstacion());
//
//                            } else {
//
//                                this.nombres.set(0, (int) this.nombres.get(0) + distancia);
//                            }
//                            Lineas linea = aux.getLinea();
//                            while (linea != null) {
//                                if (linea.getNlinea() != lineaBase) {
//                                    Caso3(linea.getNlinea(), lineaLlegada, aux.getNombreEstacion(), estacionLlegada, intentos - 1);
//                                }
//                                linea = linea.getLineaSiguiente();
//                            }
//                        }
//                        aux = aux.sig;
//                    }
//                }
//
//            } else {
//                System.out.println("mira");
//            }
        }
        System.out.println("lo mejor fuie");
        System.out.println(this.nombres);
        return null;
    }
    //    public String Caso3(int lineaBase, int lineaLlegada, String salida, String estacionLlegada, int intentos) {
    //        ArrayList<String> transbordesa = this.getTrasbordesPorlinea(lineaBase);// tenemos
    //        ArrayList<String> transbordesb = this.getTrasbordesPorlinea(lineaLlegada);// necesitamos
    //        Set<String> hashSet;
    //        String nombreM = null;
    //        System.out.println("Esta linea es la");
    //        System.out.println(lineaBase);
    //        ArrayList<String> opciones = new ArrayList();
    //        
    //        if (intentos > 0) {
    //            boolean flag = false;
    //            for (int i = 0; i < transbordesa.size(); i++) {
    //                for (int j = 0; j < transbordesb.size(); j++) {
    //                    if (transbordesa.get(i) == transbordesb.get(j)) {
    //                        System.out.println(transbordesa.get(i));
    //                        opciones.add(transbordesa.get(i));
    //                        flag = true;
    //                        break;
    //                    }
    //                }
    //                System.out.println(transbordesa.get(i));
    //                
    //            }
    //            
    //            if (flag && intentos < 1) {
    //                int mejor = 1000;
    //                nombreM = null;
    //                Transbordes aux = this.transbordes;
    //                for (int i = 0; i < opciones.size(); i++) {
    //                    
    //                    int distancia = this.DistanciaNodos(salida, opciones.get(i), this.getEstaciones(lineaBase));
    //                    if (distancia < mejor) {
    //                        mejor = distancia;
    //                        nombreM = opciones.get(i);
    //                        this.nombres.add(nombreM);
    //                    }
    //                }
    //            } else {
    //                Transbordes aux = this.transbordes;
    //                ArrayList<String> transbordes = this.getTrasbordesPorlinea(lineaBase);
    //                for (int i = 0; i < 10; i++) {
    //                    while (aux != null) {
    //                        if (aux.getNombreEstacion() == aux.getNombreEstacion()) {
    //                            Lineas linea = aux.getLinea();
    //                            while (linea != null) {
    //                                if (linea.getNlinea() != lineaBase) {
    //                                    String resultados = this.Caso3(linea.getNlinea(), lineaLlegada, aux.getNombreEstacion(), estacionLlegada, intentos - 1);
    //                                    if (resultados != null) {
    //                                        nombres.add(resultados);
    //                                    }
    //                                    hashSet = new HashSet<String>(nombres);
    //                                    nombres.clear();
    //                                    nombres.addAll(hashSet);
    //                                    
    //                                }
    //                                linea = linea.getLineaSiguiente();
    //                            }
    //                        }
    //                        aux = aux.sig;
    //                    }
    //                }
    //            }
    //            
    //        }
    //        System.out.println(nombres);
    //        return nombreM;
    //    }
    //    

    public String Caso2(int lineaBase, int lineaLlegada, String salida, String estacionLlegada) {
        ArrayList<String> transbordesa = this.getTrasbordesPorlinea(lineaBase);// tenemos
        ArrayList<String> transbordesb = this.getTrasbordesPorlinea(lineaLlegada);// necesitamos
        String nombreM = null;

        boolean flag = false;
        ArrayList<String> opciones = new ArrayList();
        for (int i = 0; i < transbordesa.size(); i++) {
            for (int j = 0; j < transbordesb.size(); j++) {
                if (transbordesa.get(i).equalsIgnoreCase(transbordesb.get(j))) {
                    opciones.add(transbordesa.get(i));
                    break;
                }
            }
        }
        int mejor = 1000;
        nombreM = null;
        Transbordes aux = this.transbordes;
        for (int i = 0; i < opciones.size(); i++) {

            int distanciass = this.DistanciaNodos(salida, opciones.get(i), this.getEstaciones(lineaBase));
            if (distanciass < mejor) {
                mejor = distanciass;
                nombreM = opciones.get(i);
            }
        }

        return nombreM;
    }

    public int Caso1Numero(String d1, String d2, int linea, boolean transborde) {

        int h = 0;
        NodoDoble aux = this.getEstaciones(linea);
        while (aux != null) {
            if (aux.dato.equals(d1)) {

                break;
            }
            aux = aux.siguiente;
        }
        NodoDoble aux2 = aux;
        boolean ida = false;
        while (aux != null) {

            if (aux.dato.equals(d2)) {

                break;
            }
            h++;
            if (ida == false) {
                aux = aux.siguiente;
                if (aux == null) {
                    aux = aux2;
                    ida = true;
                    h = 0;
                }
            } else {
                aux = aux.anterior;
            }
        }
        System.out.println(h);
        return h;
    }

    public ArrayList<String> Caso1(String d1, String d2, int linea, boolean transborde) {
        NodoDoble aux = this.getEstaciones(linea);
        while (aux != null) {
            if (aux.dato.equals(d1)) {
                break;
            }
            aux = aux.siguiente;
        }
        ArrayList<String> obj = new ArrayList();
        NodoDoble aux2 = aux;
        boolean ida = false;
        while (aux != null) {
            if (obj.size() == 0 && transborde) {
                obj.add("Transborda a linea " + linea);
            }
            obj.add(aux.dato);

            if (aux.dato.equals(d2)) {
                break;
            }

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

    public ArrayList<String> llamarCaso2(int linea1, int linea2, String estacion1, String estacion2) {
        String medioPaso = this.Caso2(linea1, linea2, estacion1, estacion2);
        ArrayList<String> caminitoDeLaEscuela = this.Caso1(estacion1, medioPaso, linea1, false);
        caminitoDeLaEscuela.addAll(this.Caso1(medioPaso, estacion2, linea2, true));
        System.out.println(caminitoDeLaEscuela);
        System.out.println("llamar caso 2");
        return caminitoDeLaEscuela;
    }

    public ArrayList<String> recursivo(int linea1, int linea2, String estacion1, String estacion2, int intentos) {
        String medioPaso = this.Caso3(linea1, linea2, estacion1, estacion2, intentos);
        ArrayList<String> caminitoDeLaEscuela = this.Caso1(estacion1, medioPaso, linea1, false);
        caminitoDeLaEscuela.addAll(this.Caso1(medioPaso, estacion2, linea2, true));
        return caminitoDeLaEscuela;
    }

    public void caso2(int linea1, int linea2, String estacion1, String estacion2) {
        ArrayList<String> transbordesb = this.getTrasbordesPorlinea(linea2);// necesitamos
        ArrayList<String> transbordesa = this.getTrasbordesPorlinea(linea1);// tenemos
        int lomejotNum = 100;
        String lomejorNombre = "";
        ArrayList<Object> algo = new ArrayList();

        int distanciaPrimeros = 1000;
        for (int i = 0; i < transbordesa.size(); i++) {
            int a = this.DistanciaNodos(estacion1, transbordesa.get(i), this.getEstaciones(linea1)) - 1;
            algo = this.transbordar(linea1, transbordesa.get(i), transbordesb);
            int intento = (int) algo.get(1) + distanciaPrimeros;
            if (lomejotNum > intento) {
                lomejotNum = intento;
                lomejorNombre = (String) algo.get(0);

            }
        }

        System.out.println("lo mejor fue");
        System.out.println(lomejorNombre);

    }
}
