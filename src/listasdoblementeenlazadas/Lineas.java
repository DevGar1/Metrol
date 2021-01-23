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
public class Lineas {

    private Lineas lineaSiguiente;
    private Estaciones estaciones;
    private int Nlinea;

    private Nodo inicio, fin; //Punteros para saber donde esta el inicio y el final



    public Lineas(int numLinea) {
        this.Nlinea = numLinea;
        this.lineaSiguiente = null;
        this.estaciones = null;
    }

    public int getNlinea() {
        return Nlinea;
    }

    public void setNlinea(int Nlinea) {
        this.Nlinea = Nlinea;
    }

    public Lineas getLineaSiguiente() {
        return lineaSiguiente;
    }

    public void setLineaSiguiente(Lineas lineaSiguiente) {
        this.lineaSiguiente = lineaSiguiente;
    }

    public Estaciones getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(Estaciones estaciones) {
        this.estaciones = estaciones;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    //Lista vacia
    public boolean estaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    //Mostrar datos

    public void MostrarDatos() {
        Nodo recorrer = inicio;
        while (recorrer != null) {
            System.out.print("[" + recorrer.dato + "]--->");
            recorrer = recorrer.sig;
        }
    }

    //Buscar nodo
    public boolean Buscar(int elemento) {
        Nodo temporal;
        temporal = inicio;
        while (temporal != null && temporal.dato != elemento) {
            temporal = temporal.sig;
        }
        return temporal != null;
    }

    //Agregar nodo al inicio
    public void InsertarAlInicio(int elemento) {
        //CREAR NODO
        inicio = new Nodo(elemento, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    //Agregar nodo al final
    public void InsertarAlFinal(int elemento) {
        if (!estaVacia()) {
            fin.sig = new Nodo(elemento);
            fin = fin.sig;
        } else {
            inicio = fin = new Nodo(elemento);
        }
    }

    //Eliminar Inicio
    public int EliminarInicio() {
        int elemento = inicio.dato;
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            inicio = inicio.sig;
        }
        return elemento;
    }
    //Eliminar Final

    public int EliminarFinal() {
        int elemento = fin.dato;
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            Nodo temporal = inicio;
            while (temporal.sig != fin) {
                temporal = temporal.sig;
            }
            fin = temporal;
            fin.sig = null;
        }
        return elemento;
    }

    //Eliminar NodoEspecifico
    public void eliminar(int elemento) {
        if (!estaVacia()) {
            if (inicio == fin && elemento == inicio.dato) {
                inicio = null;
                fin = null;
            } else if (elemento == inicio.dato) {
                inicio = inicio.sig;
            } else {
                Nodo anterior;
                Nodo temporal;
                anterior = inicio;
                temporal = inicio.sig;
                while (temporal != null && temporal.dato != elemento) {
                    anterior = anterior.sig;
                    temporal = temporal.sig;

                }
                if (temporal != null) {
                    anterior.sig = temporal.sig;
                    if (temporal == fin) {
                        fin = anterior;
                    }
                }
            }
        }
    }

    public boolean CompararLineas(int lin, Lineas linea) {
        while (linea != null) {
            if (linea.getNlinea() == lin) {
                return true;
            }
            linea = linea.lineaSiguiente;
        }

        return false;
    }

    public Estaciones BuscarTransborde(Transbordes trans, int... Estaciones) {
        boolean bandera = false;
        Lineas l = trans.getLinea();
        Lineas aux = l;
        while (trans != null) {
            int x = Estaciones.length;
            while (l != null) {
                bandera = CompararLineas(l.getNlinea(), aux);
                l = l.getLineaSiguiente();
            }

        }
        return null;
    }

    public String busqueda(int intentos, String estacion, int linea, Lineas t) {
        int x;
        while (t != null) {
            x = t.getNlinea();
            if (x != linea) {
                busqueda(2, estacion, linea, t.lineaSiguiente);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Lineas{" + "lineaSiguiente=" + lineaSiguiente + ", Nlinea=" + Nlinea + '}';
    }

}
