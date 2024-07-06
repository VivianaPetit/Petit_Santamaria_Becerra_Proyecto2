/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metromendeley;

import Interfaz.*;
import javax.swing.JOptionPane;

/**
 * Clase HashTable que implementa una tabla hash para almacenar objetos de tipo Resumen.
 * Proporciona métodos para insertar, buscar y manipular resúmenes.
 * 
 * @autor VivianaPetit
 */
public class HashTable {
    private Resumen array[];

    /**
     * Constructor de la clase HashTable.
     * Inicializa el array de resúmenes con el tamaño especificado.
     * 
     * @param n Tamaño de la tabla hash.
     */
    public HashTable(int n) {
        this.array = new Resumen[n];
    }

    /**
     * Genera un índice hash para un título dado.
     * 
     * @param titulo El título del resumen.
     * @return El índice hash generado.
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
     * Genera un índice hash alternativo para un título dado.
     * 
     * @param titulo El título del resumen.
     * @return El índice hash alternativo generado.
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
     * Inserta un resumen en la tabla hash.
     * Si el índice generado ya está ocupado y el título no coincide, se utiliza el índice alternativo.
     * 
     * @param resumen El resumen a insertar.
     * @return true si la inserción fue exitosa, false si el título ya existe en la tabla.
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
     * Inserta un resumen en la tabla hash utilizando sus palabras clave para generar los índices.
     * 
     * @param resumen El resumen a insertar.
     */
    public void insertar2(Resumen resumen) {
        Nodo<String> aux = resumen.getPalabras_clave().getFirst();
        while (aux != null){
            int index = generarIndex(aux.getValor().trim().toLowerCase());
            if (this.array[index] == null) {
                this.array[index] = resumen;
            } else if (this.array[index].getPalabras_clave().contains(aux.getValor())){
                index = generarIndexAux(aux.getValor().trim().toLowerCase());
                this.array[index] = resumen;
            }
            aux = aux.getSiguiente();
        }
    }
    
    /**
     * Imprime los títulos de los resúmenes almacenados en la tabla hash.
     */
    public void imprimir() {
        for (Resumen array1 : this.array) {
            if (array1 != null) {
                System.out.println("Titulo: " + array1.getTitulo());
            }
        }
    }
    
    /**
     * Obtiene un resumen a partir de su título.
     * 
     * @param titulo El título del resumen.
     * @return El resumen correspondiente al título, o null si no se encuentra.
     */
    public Resumen getResumen(String titulo) {
        int index = generarIndex(titulo);
        Resumen resumen = getResumenAt(index);
        if (resumen == null){
            index = generarIndexAux(titulo);
            resumen = getResumenAt(index);
        }
        return resumen;
    }
    
    /**
     * Obtiene un resumen en una posición específica de la tabla hash.
     * 
     * @param index El índice del resumen.
     * @return El resumen en la posición especificada.
     */
    public Resumen getResumenAt(int index) {
        return array[index];
    }
    
    /**
     * Verifica si hay un resumen en una posición específica de la tabla hash.
     * 
     * @param index El índice a verificar.
     * @return true si hay un resumen en la posición especificada, false en caso contrario.
     */
    public boolean isResumenAt(int index) {
        boolean encontrado = false;
        if (array[index] != null) {
            encontrado = true;
        }
        return encontrado;
    }
    
    /**
     * Obtiene el array de resúmenes de la tabla hash.
     * 
     * @return El array de resúmenes.
     */
    public Resumen[] getArray() {
        return array;
    }
    
    /**
     * Establece el array de resúmenes de la tabla hash.
     * 
     * @param array El nuevo array de resúmenes.
     */
    public void setArray(Resumen[] array) {
        this.array = array;
    }
    
    /**
     * Metodo Busca resúmenes por autor.
     * 
     * @param autor El nombre del autor.
     * @return Una lista de resúmenes escritos por el autor especificado.
     */
    public Lista<Resumen> buscarPorAutor(String autor) {
        Lista<Resumen> listaResum = new Lista<>();
        for (Resumen resumen : array) {
            if (resumen != null && resumen.tieneAutor(autor)) {
                listaResum.insertFinal(resumen);
            }
        }
        return listaResum;
    }
    
}
