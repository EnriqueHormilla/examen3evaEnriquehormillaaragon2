/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico4.run;

import ejercico4.controlador.Controlador;
import ejercico4.modelo.Baraja;
import ejercico4.modelo.ImplementacionInterfazDAOFicheros;
import ejercico4.vista.ImplementacionConsola;
import ejercico4.vista.ImplementacionSwing;

/**
 *
 * @author VESPERTINO
 */
public class Run {
    public static void main(String[] args) {
        //ImplementacionConsola v=new ImplementacionConsola();
        ImplementacionSwing v=new ImplementacionSwing();
        ImplementacionInterfazDAOFicheros dao=new ImplementacionInterfazDAOFicheros();
        Baraja baraja=new Baraja(dao);
        Controlador con=new Controlador(v, baraja);
    }
    
}
