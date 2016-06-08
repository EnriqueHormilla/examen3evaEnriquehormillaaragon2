/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico4.vista;

import ejercico4.controlador.Controlador;
import java.awt.event.ActionEvent;
import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class ImplementacionConsola implements InterfazVista {

    private Scanner sc;

    public ImplementacionConsola() {

    }

    @Override
    public String damePaloAEliminar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el palo a eliminar en mayus");
        return sc.nextLine();
    }

    @Override
    public void meterValorCarta(String i) {

        System.out.println("Sy valor de esta carta es --->" + i);

    }

    @Override
    public void meterPaloCarta(String palo) {
        System.out.println("Su valor de esta carta es --->" + palo);
    }

    @Override
    public void iniciarPrograma() {
    }

    @Override
    public void salir() {
        System.exit(1);
    }

    @Override
    public void setControlador(Controlador c) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Iime la opcion que quieres");
            System.out.println("1 dame carta");
            System.out.println("2 Barajar");
            System.out.println("3 Guardar");
            System.out.println("4 Quitar del palo");
            System.out.println("5 Salir");
            opcion = sc.nextInt();

            if (opcion == 1) {
                c.actionPerformed(new ActionEvent("", 1, "DameCarta"));
            } else if (opcion == 2) {
                c.actionPerformed(new ActionEvent("", 2, "Barajar"));
            } else if (opcion == 3) {
                c.actionPerformed(new ActionEvent("", 3, "GuardarCartas"));
            } else if (opcion == 4) {
                c.actionPerformed(new ActionEvent("", 4, "QuitarPalo"));
            } else {
                c.actionPerformed(new ActionEvent("", 5, "Salir"));
            }

        } while ((opcion > 0) && (opcion < 5));
    }

}
