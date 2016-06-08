/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico4.modelo;

import java.util.Objects;

/**
 *
 * @author VESPERTINO
 */
public class Carta {
    private String palo,valorVisual;
    private int valor;

    public Carta(String palo, String valorVisual, int valor) {
        this.palo = palo;
        this.valorVisual = valorVisual;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getValorVisual() {
        return valorVisual;
    }

    public void setValorVisual(String valorVisual) {
        this.valorVisual = valorVisual;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", valorVisual=" + valorVisual + ", valor=" + valor + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.palo);
        hash = 17 * hash + this.valor;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (!Objects.equals(this.palo, other.palo)) {
            return false;
        }
        if (this.valor != other.valor) {
            return false;
        }
        return true;
    }



    

   

 
    
    
    
}
