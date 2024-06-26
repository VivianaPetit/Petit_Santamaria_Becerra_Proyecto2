/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Interfaz.Fuentes;
import Interfaz.Inicio;
import Interfaz.Menu;
import javax.swing.*;
import metromendeley.*;

/**
 *
 * @author LuisSantamaria
 */
public class BuscarPorAutor extends javax.swing.JFrame {

    DefaultListModel<String> modelo;
    Fuentes tipoFuente;

    /**
     * Creates new form Ventana4
     */
    public BuscarPorAutor() {
        initComponents();
        modelo = new DefaultListModel();
        jList2.setModel(modelo);
        tipoFuente = new Fuentes();
        jLabel4.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 19));
        jLabel7.setFont(tipoFuente.fuente(tipoFuente.nombre, 0, 16));
        jLabel8.setFont(tipoFuente.fuente(tipoFuente.nombre, 0, 18));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        cargarAutores();
    }

    private void cargarAutores() {
        Autores.removeAllItems(); // Limpiamos los items existentes en el JComboBox
        Nodo<String> autorAux = Inicio.autores.getFirst(); // Obtenemos el primer autor
        for (int i = 0; i < Inicio.autores.getLenght(); i++) { // Recorremos todos los autores
            System.out.println(autorAux.getValor()); // Mensaje de depuración
            Autores.addItem(autorAux.getValor()); // Agregamos cada autor al JComboBox
            autorAux = autorAux.getSiguiente(); // Avanzamos al siguiente autor
        }
    }

    public Lista<Resumen> buscarPorAutor(String autor) {
        Lista<Resumen> resumenesDelAutor = new Lista<>();

        Nodo<Resumen> nodoResumen = Inicio.resumenes.getFirst(); // Accedemos a la lista global de resúmenes
        while (nodoResumen != null) {
            Resumen resumen = nodoResumen.getValor();

            Lista<String> autoresResumen = resumen.getAutores();
            Nodo<String> nodoAutor = autoresResumen.getFirst();
            while (nodoAutor != null) {
                if (nodoAutor.getValor().equalsIgnoreCase(autor)) {
                    resumenesDelAutor.insertFinal(resumen);
                    break; // Si encuentra el autor en el resumen, no es necesario seguir buscando
                }
                nodoAutor = nodoAutor.getSiguiente();
            }

            nodoResumen = nodoResumen.getSiguiente();
        }

        return resumenesDelAutor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Interfaz.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        seleccionarBtn = new Interfaz.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        menuBtn = new Interfaz.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        Autores = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(213, 228, 207));
        panelRound1.setRoundBottomLeft(10);
        panelRound1.setRoundBottomRight(10);
        panelRound1.setRoundTopLeft(10);
        panelRound1.setRoundTopRight(10);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Buscar Por Autor");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 250, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Metro mendeley.png"))); // NOI18N
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Metro mendeley comp.png"))); // NOI18N
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 240, 80));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 330, 190));

        jList2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jList2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        panelRound1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 250, 80));

        jLabel4.setForeground(new java.awt.Color(2, 64, 83));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Detalles del documento");
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 170, 20));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 64, 83));
        jLabel5.setText("Seleccione un documento para ver más detalles");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 270, -1));

        seleccionarBtn.setBackground(new java.awt.Color(2, 64, 83));
        seleccionarBtn.setRoundBottomLeft(10);
        seleccionarBtn.setRoundBottomRight(10);
        seleccionarBtn.setRoundTopLeft(10);
        seleccionarBtn.setRoundTopRight(10);
        seleccionarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                seleccionarBtnMousePressed(evt);
            }
        });
        seleccionarBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(213, 228, 207));
        jLabel7.setForeground(new java.awt.Color(213, 228, 207));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Seleccionar");
        seleccionarBtn.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 20));

        panelRound1.add(seleccionarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 100, 20));

        menuBtn.setBackground(new java.awt.Color(2, 64, 83));
        menuBtn.setRoundBottomLeft(10);
        menuBtn.setRoundBottomRight(10);
        menuBtn.setRoundTopLeft(10);
        menuBtn.setRoundTopRight(10);
        menuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuBtnMousePressed(evt);
            }
        });
        menuBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(213, 228, 207));
        jLabel8.setForeground(new java.awt.Color(213, 228, 207));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Menú");
        menuBtn.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 20));

        panelRound1.add(menuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 80, 20));

        Autores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Autores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoresActionPerformed(evt);
            }
        });
        panelRound1.add(Autores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 250, 40));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(2, 64, 83));
        jLabel10.setText("Seleccione un autor");
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 130, -1));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jList2ValueChanged

    private void seleccionarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionarBtnMousePressed
        jTextArea1.setText("");
        jList2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        String selectedValue = jList2.getSelectedValue();
        if (selectedValue != null) {
            Resumen resumen = Inicio.tabla.getResumen(selectedValue);
            String resumenStr = resumen.toString();
            jTextArea1.setText(resumenStr);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un documento.");
        }

    }//GEN-LAST:event_seleccionarBtnMousePressed

    private void menuBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBtnMousePressed
        Menu menu = new Menu();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_menuBtnMousePressed

    private void AutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoresActionPerformed
        String autor = (String) Autores.getSelectedItem();
        if (autor != null) {
            Lista<Resumen> listaResum = buscarPorAutor(autor);
            modelo.removeAllElements();
            Nodo<Resumen> resumenAux = listaResum.getFirst();
            while (resumenAux != null) {
                modelo.addElement(resumenAux.getValor().getTitulo());
                resumenAux = resumenAux.getSiguiente();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Autores Cargados");
        }
    }//GEN-LAST:event_AutoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Autores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private Interfaz.PanelRound menuBtn;
    private Interfaz.PanelRound panelRound1;
    private Interfaz.PanelRound seleccionarBtn;
    // End of variables declaration//GEN-END:variables
}
