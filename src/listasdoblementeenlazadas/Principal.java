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

        Transbordes guerrero = new Transbordes("Guerrero");
        Lineas linea3d = new Lineas(3);
        guerrero.setLinea(linea3d);
        Lineas linea10 = new Lineas(10);
        linea3d.setLineaSiguiente(linea10);
        hidalgo.setSig(guerrero);

        Transbordes laRaza = new Transbordes("La Raza");
        Lineas linea3e = new Lineas(3);
        laRaza.setLinea(linea3e);
        Lineas linea5 = new Lineas(5);
        linea3e.setLineaSiguiente(linea5);
        guerrero.setSig(laRaza);

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
        pinoSuarez.setSig(chabacano);

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
        linea10b.setLineaSiguiente(linea4d);
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
        Estaciones Linea1 = new Estaciones();
        Estaciones Linea2 = new Estaciones();
        Estaciones Linea3 = new Estaciones();
        Estaciones Linea4 = new Estaciones();
        Estaciones Linea5 = new Estaciones();
        Estaciones Linea7 = new Estaciones();
        Estaciones Linea8 = new Estaciones();
        Estaciones Linea9 = new Estaciones();
        Estaciones LineaA = new Estaciones();
        Estaciones LineaB = new Estaciones();
        Estaciones Linea12 = new Estaciones();

        Linea1.InsertarInicio("Observatorio");
        Linea1.InsertarInicio("Tacubaya");
        Linea1.InsertarInicio("Juanacatlan");
        Linea1.InsertarInicio("Chapultepec");
        Linea1.InsertarInicio("Sevilla");
        Linea1.InsertarInicio("Insurgentes");
        Linea1.InsertarInicio("Cuauhtemoc");
        Linea1.InsertarInicio("Balderas");
        Linea1.InsertarInicio("Salto del Agua");
        Linea1.InsertarInicio("Isabel la Catolica");
        Linea1.InsertarInicio("Pino Suarez");
        Linea1.InsertarInicio("Merced");
        Linea1.InsertarInicio("Candelaria");
        Linea1.InsertarInicio("San Lazaro");
        Linea1.InsertarInicio("Moctezuma");
        Linea1.InsertarInicio("Balbuena");
        Linea1.InsertarInicio("Boulevard Pto. Aereo");
        Linea1.InsertarInicio("Gomez Farias");
        Linea1.InsertarInicio("Zaragoza");
        Linea1.InsertarInicio("Pantitlan");

        Linea2.InsertarInicio("Cuatro Caminos");
        Linea2.InsertarInicio("Panteones");
        Linea2.InsertarInicio("Tacuba");
        Linea2.InsertarInicio("Cuitlahuac");
        Linea2.InsertarInicio("Popotla");
        Linea2.InsertarInicio("Colegio Militar");
        Linea2.InsertarInicio("Normal");
        Linea2.InsertarInicio("San Cosme");
        Linea2.InsertarInicio("Revolucion");
        Linea2.InsertarInicio("Hidalgo");
        Linea2.InsertarInicio("Bellas Artes");
        Linea2.InsertarInicio("Allende");
        Linea2.InsertarInicio("Zocalo");
        Linea2.InsertarInicio("Pino Suarez");
        Linea2.InsertarInicio("San Antonio Abad");
        Linea2.InsertarInicio("Chabacano");
        Linea2.InsertarInicio("Viaducto");
        Linea2.InsertarInicio("Xola");
        Linea2.InsertarInicio("Villa de Cortes");
        Linea2.InsertarInicio("Nativitas");
        Linea2.InsertarInicio("Portales");
        Linea2.InsertarInicio("Ermita");
        Linea2.InsertarInicio("General Anaya");
        Linea2.InsertarInicio("Tasqueña");

        Linea3.InsertarInicio("Indios Verdes");
        Linea3.InsertarInicio("Deportivo 18 de Marzo");
        Linea3.InsertarInicio("Potrero");
        Linea3.InsertarInicio("La Raza");
        Linea3.InsertarInicio("Tlatelolco");
        Linea3.InsertarInicio("Guerrero");
        Linea3.InsertarInicio("Hidalgo");
        Linea3.InsertarInicio("Balderas");
        Linea3.InsertarInicio("Niños Heroes");
        Linea3.InsertarInicio("Hospital General");
        Linea3.InsertarInicio("Centro Medico");
        Linea3.InsertarInicio("Etiopia");
        Linea3.InsertarInicio("Eugenia");
        Linea3.InsertarInicio("Division del Norte");
        Linea3.InsertarInicio("Zapata");
        Linea3.InsertarInicio("Coyoacan");
        Linea3.InsertarInicio("Viveros");
        Linea3.InsertarInicio("Miguel Angel de Quevedo");
        Linea3.InsertarInicio("Copilco");
        Linea3.InsertarInicio("Universidad");

        Linea4.InsertarInicio("Martin Carrera");
        Linea4.InsertarInicio("Talisman");
        Linea4.InsertarInicio("Bondojito");
        Linea4.InsertarInicio("Consulado");
        Linea4.InsertarInicio("Canal del Norte");
        Linea4.InsertarInicio("Morelos");
        Linea4.InsertarInicio("Candelaria");
        Linea4.InsertarInicio("Fray Servando");
        Linea4.InsertarInicio("Jamaica");
        Linea4.InsertarInicio("Santa Anita");

        Linea5.InsertarInicio("Politecnico");
        Linea5.InsertarInicio("Instituto del Petroleo");
        Linea5.InsertarInicio("Autobuses del Norte");
        Linea5.InsertarInicio("La Raza");
        Linea5.InsertarInicio("Misterios");
        Linea5.InsertarInicio("Valle Gomez");
        Linea5.InsertarInicio("Consulado");
        Linea5.InsertarInicio("Eduardo Molina");
        Linea5.InsertarInicio("Aragon");
        Linea5.InsertarInicio("Oceania");
        Linea5.InsertarInicio("Terminal Aerea");
        Linea5.InsertarInicio("Hangares");
        Linea5.InsertarInicio("Pantitlan");
        Linea7.InsertarInicio("El Rosario");
        Linea7.InsertarInicio("Aquiles Serdan");
        Linea7.InsertarInicio("Camarones");
        Linea7.InsertarInicio("Refineria");
        Linea7.InsertarInicio("Tacuba");
        Linea7.InsertarInicio("San Joaquin");
        Linea7.InsertarInicio("Polanco");
        Linea7.InsertarInicio("Auditorio");
        Linea7.InsertarInicio("Constituyentes");
        Linea7.InsertarInicio("Tacubaya");
        Linea7.InsertarInicio("San Pedro de los Pinos");
        Linea7.InsertarInicio("San Antonio");
        Linea7.InsertarInicio("Mixcoac");
        Linea7.InsertarInicio("Barranca del Muerto");

        Linea8.InsertarInicio("Garibaldi");
        Linea8.InsertarInicio("Bellas Artes");
        Linea8.InsertarInicio("San Juan de Letran");
        Linea8.InsertarInicio("Salto del Agua");
        Linea8.InsertarInicio("Doctores");
        Linea8.InsertarInicio("Obrera");
        Linea8.InsertarInicio("Chabacano");
        Linea8.InsertarInicio("La Viga");
        Linea8.InsertarInicio("Santa Anita");
        Linea8.InsertarInicio("Coyuya");
        Linea8.InsertarInicio("Iztacalco");
        Linea8.InsertarInicio("Apatlaco");
        Linea8.InsertarInicio("Aculco");
        Linea8.InsertarInicio("Escuadron 201");
        Linea8.InsertarInicio("Atlalilco");
        Linea8.InsertarInicio("Iztapalapa");
        Linea8.InsertarInicio("C de la Estrella");
        Linea8.InsertarInicio("UAM I");
        Linea8.InsertarInicio("Constitucion de 1917");

        Linea9.InsertarInicio("Tacubaya");
        Linea9.InsertarInicio("Patriotismo");
        Linea9.InsertarInicio("Chilpancingo");
        Linea9.InsertarInicio("Centro Medico");
        Linea9.InsertarInicio("Lazaro Cardenas");
        Linea9.InsertarInicio("Chabacano");
        Linea9.InsertarInicio("Jamaica");
        Linea9.InsertarInicio("Mixiuhca");
        Linea9.InsertarInicio("Velodromo");
        Linea9.InsertarInicio("Ciudad Deportiva");
        Linea9.InsertarInicio("Puebla");
        Linea9.InsertarInicio("Pantitlan");

        LineaA.InsertarInicio("Pantitlan");
        LineaA.InsertarInicio("Agricola Oriental");
        LineaA.InsertarInicio("Canal de San Juan");
        LineaA.InsertarInicio("Tepalcates");
        LineaA.InsertarInicio("Guelatao");
        LineaA.InsertarInicio("Peñon Viejo");
        LineaA.InsertarInicio("Acatitla");
        LineaA.InsertarInicio("Santa Marta");
        LineaA.InsertarInicio("Los Reyes");
        LineaA.InsertarInicio("La Paz");

        LineaB.InsertarInicio("Buenavista");
        LineaB.InsertarInicio("Guerrero");
        LineaB.InsertarInicio("Garibaldi");
        LineaB.InsertarInicio("Lagunilla");
        LineaB.InsertarInicio("Tepito");
        LineaB.InsertarInicio("Morelos");
        LineaB.InsertarInicio("San Lazaro");
        LineaB.InsertarInicio("Flores Gomez");
        LineaB.InsertarInicio("Romero Rubio");
        LineaB.InsertarInicio("Oceania");
        LineaB.InsertarInicio("Deportivo Oceania");
        LineaB.InsertarInicio("Bosque de Aragon");
        LineaB.InsertarInicio("Villa de Aragon");
        LineaB.InsertarInicio("Nezahualtcoyotl");
        LineaB.InsertarInicio("Impulsora");
        LineaB.InsertarInicio("Rio de los Remedios");
        LineaB.InsertarInicio("Muzquiz");
        LineaB.InsertarInicio("Ecatepec");
        LineaB.InsertarInicio("Olimpica");
        LineaB.InsertarInicio("Plaza Aragon");
        LineaB.InsertarInicio("Ciudad Azteca");

        linea8.setEstaciones(Linea8);
        linea8a.setEstaciones(Linea8);
        linea8b.setEstaciones(Linea8);
        linea8c.setEstaciones(Linea8);
        linea8d.setEstaciones(Linea8);
        linea8e.setEstaciones(Linea8);

        linea7.setEstaciones(Linea7);
        linea7a.setEstaciones(Linea7);
        linea7b.setEstaciones(Linea7);
        linea7c.setEstaciones(Linea7);

        linea2.setEstaciones(Linea2);
        linea2a.setEstaciones(Linea2);
        linea2b.setEstaciones(Linea2);
        linea2c.setEstaciones(Linea2);
        linea2d.setEstaciones(Linea2);
        linea2e.setEstaciones(Linea2);

        linea9.setEstaciones(Linea9);
        linea9a.setEstaciones(Linea9);
        linea9b.setEstaciones(Linea9);
        linea9c.setEstaciones(Linea9);
        linea9d.setEstaciones(Linea9);

        linea1.setEstaciones(Linea1);
        linea1a.setEstaciones(Linea1);
        linea1b.setEstaciones(Linea1);
        linea1c.setEstaciones(Linea1);
        linea1d.setEstaciones(Linea1);
        linea1e.setEstaciones(Linea1);
        linea1f.setEstaciones(Linea1);

        linea3.setEstaciones(Linea3);
        linea3a.setEstaciones(Linea3);
        linea3b.setEstaciones(Linea3);
        linea3c.setEstaciones(Linea3);
        linea3d.setEstaciones(Linea3);
        linea3e.setEstaciones(Linea3);
        linea3f.setEstaciones(Linea3);

        linea5.setEstaciones(Linea5);
        linea5a.setEstaciones(Linea5);
        linea5b.setEstaciones(Linea5);
        linea5c.setEstaciones(Linea5);
        linea5e.setEstaciones(Linea5);

        linea4.setEstaciones(Linea4);
        linea4b.setEstaciones(Linea4);
        linea4c.setEstaciones(Linea4);
        linea4d.setEstaciones(Linea4);
        linea4e.setEstaciones(Linea4);
        linea4f.setEstaciones(Linea4);

        linea10.setEstaciones(LineaB);
        linea10a.setEstaciones(LineaB);
        linea10b.setEstaciones(LineaB);
        linea10c.setEstaciones(LineaB);
        linea10d.setEstaciones(LineaB);

        linea12.setEstaciones(Linea12);
        linea12a.setEstaciones(Linea12);
        linea12b.setEstaciones(Linea12);
        linea12c.setEstaciones(Linea12);

        linea11.setEstaciones(LineaA);
        OperacionesTransbordes operaciones = new OperacionesTransbordes(elRosario);
        operaciones.llamarCaso2(4, 10, "Martin Carrera", "San Lazaro");
        // operaciones.mostrarTransbordes();
//        
//        
        //   operaciones.distanciaATransbordes(8, "Aculco");

//
//          listita.mostrarDatos();
//        Lineas lis = new Lineas();
//
//        int hola = listita.DistanciaNodos("Vallejo", "MartinCarrera");
//        System.out.println(hola);
    }

}
