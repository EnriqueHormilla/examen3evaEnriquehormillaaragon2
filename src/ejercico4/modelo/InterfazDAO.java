/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico4.modelo;

import java.util.ArrayList;

/**
 *
 * @author VESPERTINO
 */
public interface InterfazDAO {
    public abstract void consulta();
    public abstract void crear(Carta c);
    public abstract void modificar(Carta c,Carta cartaAModificar);
    public abstract void eliminar(Carta c);
    public abstract void guardarCartas(ArrayList baraja);
    public abstract void cerrar();
    
}
