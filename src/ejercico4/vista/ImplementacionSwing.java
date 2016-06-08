/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico4.vista;

import ejercico4.controlador.Controlador;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author VESPERTINO
 */
public class ImplementacionSwing extends JFrame implements InterfazVista{
    private JButton jbDameCarta,jbBarajar,jbGuardarCartas,jbQuitarPalo,jbSalir;
    private JLabel jlValorCarta,jlPaloCarta,jlVacio;
    private JComboBox jcEscogerPalo;
    
    private JPanel jpArriba,jpAbajo;
    public ImplementacionSwing() {
        //JP Arriba
        jpArriba=new JPanel(new FlowLayout(50, 20,20));
            //componentes del panel
            jbDameCarta=new JButton("Dame Carta");
            jbBarajar=new JButton("Barajar");
            jbGuardarCartas=new JButton("Guardar Cartas");
            //añadir esos componentes
            jpArriba.add(jbDameCarta);
            jpArriba.add(jbBarajar);
            jpArriba.add(jbGuardarCartas);
        //JP Arriba
        jpAbajo=new JPanel(new GridLayout(3,2));
            //componentes del panel
            jlValorCarta=new JLabel();           
            String[] auxArray=new String[4];
                auxArray[0]="PICAS";
                auxArray[1]="CORAZONES";
                auxArray[2]="DIAMANTES";
                auxArray[3]="TREBOLES";
            jcEscogerPalo=new JComboBox(auxArray);
            jlPaloCarta=new JLabel();           
            jbQuitarPalo=new JButton("Quitar por Palo");
            jlVacio=new JLabel();
            jbSalir=new JButton("Salir");
            
            //añadir esos componentes
            jpAbajo.add(jlValorCarta);
            jpAbajo.add(jcEscogerPalo);
            jpAbajo.add(jlPaloCarta);
            jpAbajo.add(jbQuitarPalo);
            jpAbajo.add(jlVacio);
            jpAbajo.add(jbSalir);
        //panel principal
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
            //añadimos
        this.getContentPane().add(jpArriba);
        this.getContentPane().add(jpAbajo);
        
        setTitle("Ejericico 5");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        
        
    }
     @Override
    public String damePaloAEliminar() {
       return (String) jcEscogerPalo.getSelectedItem();
    }

    @Override
    public void meterValorCarta(String i) {
        jlValorCarta.setText(i);
    }

    @Override
    public void meterPaloCarta(String palo) {
        jlPaloCarta.setText(palo);
    }

    @Override
    public void setControlador(Controlador c) {
       jbDameCarta.addActionListener(c);
       jbDameCarta.setActionCommand("DameCarta");
       
       jbBarajar.addActionListener(c);
       jbBarajar.setActionCommand("Barajar");
       
       jbGuardarCartas.addActionListener(c);
       jbGuardarCartas.setActionCommand("GuardarCartas");
       
       jbQuitarPalo.addActionListener(c);
       jbQuitarPalo.setActionCommand("QuitarPalo");
       
       jbSalir.addActionListener(c);
       jbSalir.setActionCommand("Salir");

    }

    @Override
    public void iniciarPrograma() {
       setVisible(true);   
    }
    @Override
    public void salir() {
        System.exit(1);
    }
    
    
    
    public JButton getJbDameCarta() {
        return jbDameCarta;
    }

    public void setJbDameCarta(JButton jbDameCarta) {
        this.jbDameCarta = jbDameCarta;
    }

    public JButton getJbBarajar() {
        return jbBarajar;
    }

    public void setJbBarajar(JButton jbBarajar) {
        this.jbBarajar = jbBarajar;
    }

    public JButton getJbGuardarCartas() {
        return jbGuardarCartas;
    }

    public void setJbGuardarCartas(JButton jbGuardarCartas) {
        this.jbGuardarCartas = jbGuardarCartas;
    }

    public JButton getJbQuitarPalo() {
        return jbQuitarPalo;
    }

    public void setJbQuitarPalo(JButton jbQuitarPalo) {
        this.jbQuitarPalo = jbQuitarPalo;
    }

    public JButton getJbSalir() {
        return jbSalir;
    }

    public void setJbSalir(JButton jbSalir) {
        this.jbSalir = jbSalir;
    }

    public JLabel getJlValorCarta() {
        return jlValorCarta;
    }

    public void setJlValorCarta(JLabel jlValorCarta) {
        this.jlValorCarta = jlValorCarta;
    }

    public JLabel getJlPaloCarta() {
        return jlPaloCarta;
    }

    public void setJlPaloCarta(JLabel jlPaloCarta) {
        this.jlPaloCarta = jlPaloCarta;
    }

    public JLabel getJlVacio() {
        return jlVacio;
    }

    public void setJlVacio(JLabel jlVacio) {
        this.jlVacio = jlVacio;
    }

    public JComboBox getJcEscogerPalo() {
        return jcEscogerPalo;
    }

    public void setJcEscogerPalo(JComboBox jcEscogerPalo) {
        this.jcEscogerPalo = jcEscogerPalo;
    }

    public JPanel getJpArriba() {
        return jpArriba;
    }

    public void setJpArriba(JPanel jpArriba) {
        this.jpArriba = jpArriba;
    }

    public JPanel getJpAbajo() {
        return jpAbajo;
    }

    public void setJpAbajo(JPanel jpAbajo) {
        this.jpAbajo = jpAbajo;
    }



   
    
    
}
