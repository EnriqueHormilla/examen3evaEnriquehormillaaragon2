/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico4.modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class ImplementacionInterfazDAOFicheros implements InterfazDAO{
    private FileWriter fileWriter ;
    private BufferedWriter bufferedWriter;

    public ImplementacionInterfazDAOFicheros() {
        try {
            fileWriter = new FileWriter("RestoCartas.txt");
        } catch (IOException ex) {
            Logger.getLogger(ImplementacionInterfazDAOFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        bufferedWriter = new BufferedWriter(fileWriter);
    }
    
    
    @Override
    public void consulta() {}

    @Override
    public void crear(Carta c) {}

    @Override
    public void modificar(Carta c, Carta cartaAModificar) {}

    @Override
    public void eliminar(Carta c) {}

    @Override
    public void guardarCartas(ArrayList baraja) {
        try {
            
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("hola holal");
            
//            for (Iterator<Carta> iterator = baraja.iterator(); iterator.hasNext();) {
//                Carta next = iterator.next();
//                String cadena=next.getValor()+" de "+next.getPalo();
//                bufferedWriter.write(cadena);
//                bufferedWriter.newLine();
//            }
        } catch (IOException ex) {
            Logger.getLogger(ImplementacionInterfazDAOFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                bufferedWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(ImplementacionInterfazDAOFicheros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    @Override
    public void cerrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        ImplementacionInterfazDAOFicheros a=new ImplementacionInterfazDAOFicheros();
        a.guardarCartas(null);
    }

}
