/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio2 {
    private FileReader fileReader;
    private BufferedReader bufferedReader;
    private String cadena,cadenaAux;
    private int sumatorio;

    public Ejercicio2() {
        try {
            fileReader=new FileReader("ejercicio2.txt");
            bufferedReader=new BufferedReader(fileReader);
            cadena=bufferedReader.readLine();
            cadenaAux=cadena;
            sumatorio=0;
            while (cadenaAux!=null) {                                
                cadena.trim();
                int vueltasBucle=cadenaAux.length();
                for (int i = 0; i < vueltasBucle; i++) {
                    //System.out.println(cadenaAux);
                    sumatorio=sumatorio+Integer.parseInt(cadenaAux);                    
                    cadenaAux=cadena.substring(i+1);
                }
                System.out.println(sumatorio);
                sumatorio=0; 
                cadena=bufferedReader.readLine();
                cadenaAux=cadena;
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        
    }
    
    
}
