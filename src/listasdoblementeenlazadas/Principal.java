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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Transbordes elRosario = new Transbordes("El Rosario");
        Lineas linea6 = new Lineas(6);
        elRosario.setLinea(linea6);
        Lineas linea7 = new Lineas(7);
        linea6.setLineaSiguiente(linea7);

        Transbordes tacuba = new Transbordes("Tacuba");
        Lineas linea2 = new Lineas(2);
        tacuba.setLinea(linea2);
        Lineas linea7a = new Lineas(7);
        linea2.setLineaSiguiente(linea7a);
        elRosario.setSig(tacuba);

        Transbordes tacubaya = new Transbordes("Tacubaya");
        Lineas linea1 = new Lineas(1);
        tacubaya.setLinea(linea1);
        Lineas linea7b = new Lineas(7);
        linea1.setLineaSiguiente(linea7b);
        Lineas linea9 = new Lineas(9);
        linea7b.setLineaSiguiente(linea9);
        tacuba.setSig(tacubaya);

        Transbordes mixcoatl = new Transbordes("Mixcoatl");
        Lineas linea12 = new Lineas(12);
        mixcoatl.setLinea(linea12);
        Lineas linea7c = new Lineas(7);
        linea12.setLineaSiguiente(linea7c);
        tacubaya.setSig(mixcoatl);

        Transbordes zapata = new Transbordes("Zapata");
        Lineas linea12a = new Lineas(12);
        zapata.setLinea(linea12a);
        Lineas linea3 = new Lineas(3);
        linea12a.setLineaSiguiente(linea3);
        mixcoatl.setSig(zapata);

        Transbordes centroMedico = new Transbordes("Centro Medico");
        Lineas linea3a = new Lineas(3);
        centroMedico.setLinea(linea3a);
        Lineas linea9a = new Lineas(9);
        linea3a.setLineaSiguiente(linea9a);
        zapata.setSig(centroMedico);

        Transbordes balderas = new Transbordes("Balderas");
        Lineas linea3b = new Lineas(3);
        balderas.setLinea(linea3b);
        Lineas linea1a = new Lineas(1);
        linea3b.setLineaSiguiente(linea1a);
        centroMedico.setSig(balderas);

        Transbordes hidalgo = new Transbordes("Hidalgo");
        Lineas linea3c = new Lineas(3);
        hidalgo.setLinea(linea3c);
        Lineas linea2a = new Lineas(2);
        linea3c.setLineaSiguiente(linea2a);
        balderas.setSig(hidalgo);

        Transbordes buenavista = new Transbordes("Buenavista");
        Lineas linea3d = new Lineas(3);
        buenavista.setLinea(linea3d);
        Lineas linea10 = new Lineas(10);
        linea3d.setLineaSiguiente(linea10);
        hidalgo.setSig(buenavista);

        Transbordes laRaza = new Transbordes("La Raza");
        Lineas linea3e = new Lineas(3);
        laRaza.setLinea(linea3e);
        Lineas linea5 = new Lineas(5);
        linea3e.setLineaSiguiente(linea5);
        buenavista.setSig(laRaza);

        Transbordes deportivo = new Transbordes("Deportivo 18 de Marzo");
        Lineas linea3f = new Lineas(3);
        deportivo.setLinea(linea3f);
        Lineas linea6a = new Lineas(6);
        linea3f.setLineaSiguiente(linea6a);
        laRaza.setSig(deportivo);

        Transbordes institutoPetroleto = new Transbordes("Instituto del Petroleo");
        Lineas linea6b = new Lineas(6);
        institutoPetroleto.setLinea(linea6b);
        Lineas linea5a = new Lineas(5);
        linea6b.setLineaSiguiente(linea5a);
        deportivo.setSig(institutoPetroleto);

        Transbordes garibaldi = new Transbordes("Garibaldi");
        Lineas linea8 = new Lineas(8);
        garibaldi.setLinea(linea8);
        Lineas linea10a = new Lineas(10);
        linea8.setLineaSiguiente(linea10a);
        institutoPetroleto.setSig(garibaldi);

        Transbordes bellasArtes = new Transbordes("Bellas Artes");
        Lineas linea8a = new Lineas(8);
        bellasArtes.setLinea(linea8a);
        Lineas linea2b = new Lineas(2);
        linea8a.setLineaSiguiente(linea2b);
        garibaldi.setSig(bellasArtes);

        Transbordes saltoDelAgua = new Transbordes("Salto del Agua");
        Lineas linea8b = new Lineas(8);
        saltoDelAgua.setLinea(linea8b);
        Lineas linea1b = new Lineas(1);
        linea8b.setLineaSiguiente(linea1b);
        bellasArtes.setSig(saltoDelAgua);

        Transbordes pinoSuarez = new Transbordes("Pino Suarez");
        Lineas linea2c = new Lineas(2);
        pinoSuarez.setLinea(linea2c);
        Lineas linea1c = new Lineas(1);
        linea2c.setLineaSiguiente(linea1c);
        saltoDelAgua.setSig(pinoSuarez);

        Transbordes chabacano = new Transbordes("Chabacano");
        Lineas linea2d = new Lineas(2);
        chabacano.setLinea(linea2d);
        Lineas linea8c = new Lineas(8);
        linea2d.setLineaSiguiente(linea8c);
        Lineas linea9b = new Lineas(9);
        linea8c.setLineaSiguiente(linea9b);
        saltoDelAgua.setSig(chabacano);

        Transbordes ermita = new Transbordes("Ermita");
        Lineas linea2e = new Lineas(2);
        ermita.setLinea(linea2e);
        Lineas linea12b = new Lineas(12);
        linea2e.setLineaSiguiente(linea12b);
        chabacano.setSig(ermita);

        Transbordes atlalico = new Transbordes("Atlalico");
        Lineas linea8d = new Lineas(8);
        atlalico.setLinea(linea8d);
        Lineas linea12c = new Lineas(12);
        linea8d.setLineaSiguiente(linea12c);
        ermita.setSig(atlalico);

        Transbordes santaAnita = new Transbordes("Santa Anita");
        Lineas linea8e = new Lineas(8);
        santaAnita.setLinea(linea8e);
        Lineas linea4 = new Lineas(4);
        linea8e.setLineaSiguiente(linea4);
        atlalico.setSig(santaAnita);

        Transbordes jamaica = new Transbordes("Jamaica");
        Lineas linea9c = new Lineas(9);
        jamaica.setLinea(linea9c);
        Lineas linea4b = new Lineas(4);
        linea9c.setLineaSiguiente(linea4b);
        santaAnita.setSig(jamaica);

        Transbordes candelaria = new Transbordes("Candelaria");
        Lineas linea1d = new Lineas(1);
        candelaria.setLinea(linea1d);
        Lineas linea4c = new Lineas(4);
        linea1d.setLineaSiguiente(linea4c);
        jamaica.setSig(candelaria);

        Transbordes morelos = new Transbordes("Morelos");
        Lineas linea10b = new Lineas(10);
        morelos.setLinea(linea10b);
        Lineas linea4d = new Lineas(4);
        linea10.setLineaSiguiente(linea4d);
        candelaria.setSig(morelos);

        Transbordes sanLazaro = new Transbordes("San Lazaro");
        Lineas linea10c = new Lineas(10);
        sanLazaro.setLinea(linea10c);
        Lineas linea1e = new Lineas(1);
        linea10c.setLineaSiguiente(linea1e);
        morelos.setSig(sanLazaro);

        Transbordes consulado = new Transbordes("Consulado");
        Lineas linea5b = new Lineas(5);
        consulado.setLinea(linea5b);
        Lineas linea4e = new Lineas(4);
        linea5b.setLineaSiguiente(linea4e);
        sanLazaro.setSig(consulado);

        Transbordes martinCarrera = new Transbordes("Martin Carrera");
        Lineas linea6c = new Lineas(6);
        martinCarrera.setLinea(linea6c);
        Lineas linea4f = new Lineas(4);
        linea6c.setLineaSiguiente(linea4f);
        consulado.setSig(martinCarrera);

        Transbordes oceania = new Transbordes("Oceania");
        Lineas linea10d = new Lineas(10);
        oceania.setLinea(linea10d);
        Lineas linea5e = new Lineas(5);
        linea10d.setLineaSiguiente(linea5e);
        martinCarrera.setSig(oceania);

        Transbordes pantitlan = new Transbordes("Pantitlan");
        Lineas linea1f = new Lineas(1);
        pantitlan.setLinea(linea1f);
        Lineas linea5c = new Lineas(5);
        linea1f.setLineaSiguiente(linea5c);
        Lineas linea9d = new Lineas(9);
        linea5c.setLineaSiguiente(linea9d);
        Lineas linea11 = new Lineas(11);
        linea9d.setLineaSiguiente(linea11);
        oceania.setSig(pantitlan);

        Estaciones listita = new Estaciones();

        listita.InsertarInicio("El Rosario");
        listita.InsertarInicio("Tezozomoc");
        listita.InsertarInicio("Azcapotzalco");
        listita.InsertarInicio("Ferreria");
        listita.InsertarInicio("Norte 45");
        listita.InsertarInicio("Vallejo");
        listita.InsertarInicio("Instituto del Petroleo");
        listita.InsertarInicio("Lindavista");
        listita.InsertarInicio("Deportivo 18 de Marzo");
        listita.InsertarInicio("La Villa");
        listita.InsertarInicio("Martin Carrera");

        linea6.setEstaciones(listita);
        linea6a.setEstaciones(listita);
        linea6b.setEstaciones(listita);
        linea6c.setEstaciones(listita);

  
        
        OperacionesTransbordes operaciones = new OperacionesTransbordes(elRosario);
      //  operaciones.mostrarTransbordes();
//        
 //      operaciones.getTrasbordesPorlinea(6);
//        
        operaciones.distanciaATransbordes(6, "Lindavista");

//
//          listita.mostrarDatos();
//        Lineas lis = new Lineas();
//
//        int hola = listita.DistanciaNodos("Vallejo", "MartinCarrera");
//        System.out.println(hola);
    }

}
