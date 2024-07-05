/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metromendeley;

import Interfaz.*;
import javax.swing.JOptionPane;

/**
 *
 * @author VivianaPetit
 */
public class HashTable {
    private Resumen array[];

    /**
     * Constructor de la clase HashTable.
     * @param n
     */
    public HashTable(int n) {
        this.array = new Resumen[n];
    }

    /**
     *
     * @param titulo
     * @return
     */
    public int generarIndex(String titulo) {
        int hash = 0;
        for (char caracter : titulo.toCharArray()) {
            hash = hash + caracter;
        }
        int index = Math.abs(hash) % array.length;
        return index;
    }
   
    /**
     *
     * @param titulo
     * @return
     */
    public int generarIndexAux(String titulo) {
        int hash = 0;
        for (char caracter : titulo.toCharArray()) {
            hash = (3 * hash) + caracter;
        }
        int index = Math.abs(hash) % array.length;
        return index;
    }

    /**
     *
     * @param resumen
     * @return
     */
    public boolean insertar(Resumen resumen) {
        int index = generarIndex(resumen.getTitulo());

        if (this.array[index] == null) {
            this.array[index] = resumen;
        } else {
            if (!this.array[index].getTitulo().equals(resumen.getTitulo())) {
                index = generarIndexAux(resumen.getTitulo());
                this.array[index] = resumen;
            } else {
                JOptionPane.showMessageDialog(null, "El resumen " + '"' + resumen.getTitulo() + '"' + " ya se encuentra en el sistema.");
                return false;
            }
        }
        return true;
    }
    
    /**
     *
     * @param resumen
     */
    public void insertar2(Resumen resumen) {
        Nodo<String> aux = resumen.getPalabras_clave().getFirst();
        while (aux != null){
            int index = generarIndex(aux.getValor());

            if (this.array[index] == null) {
                this.array[index] = resumen;
            } else {
                index = generarIndexAux(aux.getValor());
                this.array[index] = resumen;
            }
        }
    }
    

    public void imprimir() {
        for (Resumen array1 : this.array) {
            if (array1 != null) {
                System.out.println("Titulo: " + array1.getTitulo());
            }
        }
    }

    public Resumen getResumen(String titulo) {
        int index = generarIndex(titulo);
        Resumen resumen = getResumenAt(index);
        return resumen;
    }

    public Resumen getResumenAt(int index) {
        return array[index];
    }

    public boolean isResumenAt(int index) {
        boolean encontrado = false;
        if (array[index] != null) {
            encontrado = true;
        }
        return encontrado;
    }

    public Resumen[] getArray() {
        return array;
    }

    public void setArray(Resumen[] array) {
        this.array = array;
    }
    
    // Método: Busca resúmenes por autor.
    public Lista<Resumen> buscarPorAutor(String autor) {
        Lista<Resumen> listaResum = new Lista<>();
        for (Resumen resumen : array) {
            if (resumen != null && resumen.tieneAutor(autor)) {
                listaResum.insertFinal(resumen);
            }
        }
        return listaResum;
    }
    
     public Lista<Resumen> buscarPorPalabraClave(String palabra){
        Nodo<String> tituloAux = Inicio.titulos.getFirst();
        int index; 
        Resumen resumen;
        Lista<Resumen> resumscoincidentes = new Lista<>();
        for (int i=0; i<Inicio.titulos.getLenght(); i++) {
            index = Inicio.tabla.generarIndex(tituloAux.getValor());
            resumen = Inicio.tabla.getResumenAt(index);
            if (resumen.getPalabras_clave().contains(palabra.toLowerCase().trim())) {
                resumscoincidentes.insertFinal(resumen);     
            } 
            tituloAux = tituloAux.getSiguiente(); 
        }
        return resumscoincidentes;
    }
   
}
