/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico3;

/**
 *
 * @author VESPERTINO
 */
public class Ejericio3 {

    private int n, asteriscosNumeroVeces;

    public Ejericio3(int numero) {
        this.n = numero;
        asteriscosNumeroVeces = 1;
    }

    public void metodoDibujar() {
        
        for (int i = 1; i <= n + n; i++) {
            //Significa que ya has pasado el medio
            if (i > n) {
                llenarCon(n - 1, ' ');
                llenarCon(1, '*');
                System.out.println();
            } else {
                llenarCon(n - i, ' ');
                llenarCon(asteriscosNumeroVeces, '*');
                asteriscosNumeroVeces++;
                asteriscosNumeroVeces++;
                System.out.println();
            }
        }
    }

    public void llenarCon(int numeroDeVeces, char caracter) {
        for (int i = 0; i < numeroDeVeces; i++) {
            System.out.print(caracter);
        }
    }

    public static void main(String[] args) {
        Ejericio3 a = new Ejericio3(5);
        a.metodoDibujar();
    }

}
