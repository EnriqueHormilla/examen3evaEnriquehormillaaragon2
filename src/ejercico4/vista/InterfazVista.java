/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico4.vista;

import ejercico4.controlador.Controlador;

/**
 *
 * @author VESPERTINO
 */
public interface InterfazVista {
    //para quitar por Palo
    public abstract String damePaloAEliminar();
    public abstract void meterValorCarta(String i);
    public abstract void meterPaloCarta(String palo);
        
    public abstract void setControlador(Controlador c);
    public abstract void iniciarPrograma();
    public abstract void salir();
    
}
