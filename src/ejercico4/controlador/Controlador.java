/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico4.controlador;


import ejercico4.modelo.Baraja;
import ejercico4.modelo.Carta;
import ejercico4.modelo.InterfazDAO;
import ejercico4.vista.InterfazVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author VESPERTINO
 */
public class Controlador implements ActionListener{
    private InterfazVista v;
    private Baraja m;
 

    public Controlador(InterfazVista v, Baraja m) {
        this.v = v;
        this.m = m;
      
        
        v.setControlador(this);
        v.iniciarPrograma();
    }       

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand()=="DameCarta"){
           Carta cartaAux=m.dameCarta();
           v.meterValorCarta(cartaAux.getValorVisual());
           v.meterPaloCarta(cartaAux.getPalo());
       }else if(e.getActionCommand()=="Barajar"){
           m.barajar();
           
       }else if(e.getActionCommand()=="GuardarCartas"){
           m.guardarCartas();
       }else if(e.getActionCommand()=="QuitarPalo"){
           String auxString=v.damePaloAEliminar();
           m.quitarPorPalo(auxString);
       }else if(e.getActionCommand()=="Salir"){
           v.salir();
       }
    }
    
}
