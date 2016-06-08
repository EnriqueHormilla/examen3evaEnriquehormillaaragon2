/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico4.modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class Baraja {

    
    private ArrayList<Carta> baraja;
    private InterfazDAO interfazDao;
    public Baraja(InterfazDAO interfazDaoPasa) {
        baraja = new ArrayList<Carta>();
        llenarBarajaInicial();
        barajar();
        interfazDao=interfazDaoPasa;
    }

    public Carta dameCarta() {
        int numeroAleatorioUno = (int) Math.floor(Math.random() * (0 - (baraja.size())) + (baraja.size()));
        Carta cartaUno = dameLaCartaDeEstaPodicion(numeroAleatorioUno);
        baraja.remove(cartaUno);
        
        //para ver que va borrando
        System.out.println(baraja.size());
        return cartaUno;
    }

    public void barajar() {
        // ArrayList collecionAux=new ArrayList(baraja);
        Carta cartaUno;
        int numeroAleatorioUno = 0;
        for (int i = 0; i < baraja.size(); i++) {
            numeroAleatorioUno = (int) Math.floor(Math.random() * (0 - (baraja.size())) + (baraja.size()));
            cartaUno = dameLaCartaDeEstaPodicion(numeroAleatorioUno);
            if (cartaUno != null) {
                baraja.remove(cartaUno);
                baraja.add(cartaUno);
            }
        }
        //no es obligatorio per es por verlo
       mostarBaraja();
        //Por ver que borra
     
       
    }

    public void quitarPorPalo(String palo) {
        ArrayList auxBaraja = new ArrayList();
        for (Iterator<Carta> iterator = baraja.iterator(); iterator.hasNext();) {
            Carta next = iterator.next();
            if (next.getPalo() == palo) {
                auxBaraja.add(next);
            }
        }
        baraja.removeAll(auxBaraja);

    }

    public void guardarCartas() {
        interfazDao.guardarCartas(baraja);
    }

    private void llenarBarajaInicial() {
        //Las cartas son un conjunto de 4 Palos con su valor de cartas 13 veces =52
        for (int i = 1; i <= 13; i++) {
            //HASTA 11 EL VALORVISIAL D ELA CARTA ES IGUAL A SU VALOR
            if (i < 11) {
                baraja.add(new Carta("PICAS", "" + i, i));
                baraja.add(new Carta("CORAZONES", "" + i, i));
                baraja.add(new Carta("DIAMANTES", "" + i, i));
                baraja.add(new Carta("TREBOLES", "" + i, i));
            } else {
                if (i == 11) {
                    baraja.add(new Carta("PICAS", "J", i));
                    baraja.add(new Carta("CORAZONES", "J", i));
                    baraja.add(new Carta("DIAMANTES", "J", i));
                    baraja.add(new Carta("TREBOLES", "J", i));
                }
                if (i == 12) {
                    baraja.add(new Carta("PICAS", "Q", i));
                    baraja.add(new Carta("CORAZONES", "Q", i));
                    baraja.add(new Carta("DIAMANTES", "Q", i));
                    baraja.add(new Carta("TREBOLES", "Q", i));
                }
                if (i == 13) {
                    baraja.add(new Carta("PICAS", "K", i));
                    baraja.add(new Carta("CORAZONES", "K", i));
                    baraja.add(new Carta("DIAMANTES", "K", i));
                    baraja.add(new Carta("TREBOLES", "K", i));
                }
            }
        }
    }

    private Carta dameLaCartaDeEstaPodicion(int posicionDeLaCarta) {
        int vueltas = 0;
        Carta auxCarta = null;
        for (Iterator<Carta> iterator = baraja.iterator(); iterator.hasNext();) {
            Carta next = iterator.next();
            if (vueltas == posicionDeLaCarta) {
                auxCarta = next;
            }
            vueltas++;
        }
        return auxCarta;
    }

    public void mostarBaraja() {

        for (Iterator<Carta> iterator = baraja.iterator(); iterator.hasNext();) {
            Carta next = iterator.next();
            System.out.println(next);
        }
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

//    public static void main(String[] args) {
//        ImplementacionInterfazDAOFicheros a=new ImplementacionInterfazDAOFicheros();
//        Baraja b = new Baraja(a);
//        // b.mostarBaraja();
//        b.dameCarta();
//        System.out.println(b.getBaraja().size());
//        b.mostarBaraja();
//        b.quitarPorPalo("PICAS");
//        System.out.println("-----------------");
//        b.mostarBaraja();
//        b.guardarCartas();
//
//    }
}
