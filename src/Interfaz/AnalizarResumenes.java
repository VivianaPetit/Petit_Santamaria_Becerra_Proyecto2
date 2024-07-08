/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;


import static Interfaz.Inicio.titulos;
import metromendeley.Resumen;
import javax.swing.*;
import metromendeley.Lista;
import metromendeley.Nodo;

/**
 *
 * @author KelvinCi
 */
public class AnalizarResumenes extends javax.swing.JFrame {
    Fuentes tipoFuente; 
    DefaultListModel modelo;

    /**
     * Creates new form AnalizarResumeness
     */
    public AnalizarResumenes() {
        initComponents();
        modelo = new DefaultListModel();
        jList2.setModel(modelo);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        tipoFuente = new Fuentes();
        jLabel4.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 19));
        jLabel7.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 16));
        jLabel8.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 16));
        
        CargarTitulosResumenes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRound1 = new Interfaz.PanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        pizarra = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        seleccionarBtn = new Interfaz.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        menuBtn = new Interfaz.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 74, -1, -1));

        panelRound1.setBackground(new java.awt.Color(213, 228, 207));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        panelRound1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 260, 100));

        pizarra.setEditable(false);
        pizarra.setColumns(20);
        pizarra.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        pizarra.setRows(5);
        pizarra.setToolTipText("");
        jScrollPane1.setViewportView(pizarra);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 330, 190));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Metro mendeley (3).png"))); // NOI18N
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Metro mendeley.png"))); // NOI18N
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Metro mendeley comp.png"))); // NOI18N
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 240, 80));

        jLabel4.setForeground(new java.awt.Color(2, 64, 83));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Análisis del documento");
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 170, 20));

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

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 64, 83));
        jLabel5.setText("Seleccione un documento para ver más detalles");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 270, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("U");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 110, -1));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
    *Cuenta la cantidad de veces que se repite cierta palabra en el resumen seleccionado por el titulo pasado por parametro
    *@param titulo
    *@return cadena con la frecuencia de la palabra en el texto
    */
    public String contadorFrecuencia(String titulo) {

        String text = Inicio.tabla.getResumen(titulo).getCuerpo();
        Resumen rsm = Inicio.tabla.getResumen(titulo);

        // Palabras clave a buscar
        Lista<String> keywordss = Inicio.palabrasClavesBD;
        String[] keywords = new String[keywordss.getLenght()];
        Nodo<String> aux = Inicio.palabrasClavesBD.getFirst();
        for (int i = 0; i < keywordss.getLenght(); i++) {
            keywords[i] = aux.getValor();
            aux = aux.getSiguiente();
        }

        // Arreglo para contar las apariciones
        int[] keywordCounts = new int[keywords.length];

        // Contar las apariciones de cada palabra clave
        for (int i = 0; i < keywords.length; i++) {
            keywordCounts[i] = contadorApariciones(text, keywords[i]);
        }
        String cadena = "";
        cadena += rsm.getTitulo() + "\n" + "Autores: " + rsm.getAutores().toString() + "\n\n";
        
        for (int i = 0; i < keywords.length; i++) {
            cadena += capitalize(keywords[i]) + ": " + keywordCounts[i] + " coincidencia/as. \n";
        }
        return cadena;
    }

    /**
    * Funcion encargada de contar las veces que hay cierta palabra dentro del texto
    * @param text 
    * @param keyword
    * @return cantidad de veces
    */
    private static int contadorApariciones(String text, String keyword) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(keyword, index)) != -1) {
            count++;
            index += keyword.length();
        }

        return count;
    }
    /**
    *Vuelve en mayusculas la primera letra de cada palabra
    *@param input
    *@return input retorna el string con la primera letra en mayusculas
    */
    public String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
    /**
    *Encargada de cargar los titulos de los resumenes atraves de una lista
    *Funcion vacia
    */
    public final void CargarTitulosResumenes() {
        Lista lista = new Lista();
        DefaultListModel<String> listModel = new DefaultListModel<>();

        
        Lista<String> titulosOrdenados = lista.obtenerTitulosOrdenados(titulos);

        Nodo<String> nodoTitulo = titulosOrdenados.getFirst();
        while (nodoTitulo != null) {
            listModel.addElement(nodoTitulo.getValor());
            nodoTitulo = nodoTitulo.getSiguiente();
        }
        jList2.setModel(listModel);
    }
/*
    Funcion encargada de la seleccion UNICA de las opciones presentes en el JList */

    private void seleccionarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionarBtnMousePressed

        jList2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        String selectedValue = jList2.getSelectedValue();
        if (selectedValue != null) {
            String cadena = contadorFrecuencia(selectedValue);//Frecuencia
            pizarra.setText(cadena);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccionar un documento");
        }
    }//GEN-LAST:event_seleccionarBtnMousePressed
    /**
    *Funcion que conecta la interfaz con el codigo para moverse de Analizar Resumen a Menu
    */
    private void menuBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBtnMousePressed
        Menu menu = new Menu();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_menuBtnMousePressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private Interfaz.PanelRound menuBtn;
    private Interfaz.PanelRound panelRound1;
    private javax.swing.JTextArea pizarra;
    private Interfaz.PanelRound seleccionarBtn;
    // End of variables declaration//GEN-END:variables
}
