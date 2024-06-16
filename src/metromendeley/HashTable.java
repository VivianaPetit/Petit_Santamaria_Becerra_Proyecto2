/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metromendeley;

/**
 *
 * @author VivianaPetit
 */
public class HashTable {
    private Resumen array[];

    /**
     * Constructor de la clase HashTable.
     */
    public HashTable() {
        this.array = new Resumen[10000];
    }
    
    /**
     *
     * @param titulo
     * @return
     */
    public int generarIndex(String titulo) {
        int hash = 0;
        for (char caracter : titulo.toCharArray()) {
            hash = 31 * hash + caracter;
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
            hash = hash + caracter;
        }
        int index = Math.abs(hash) % array.length;
        return index;
    }
    
    public void insertar(Resumen resumen){
        int index = generarIndex(resumen.getTitulo());
        
            if (this.array[index] == null){
                this.array[index] = resumen;
                System.out.println(index);
            } else {
                if (!this.array[index].getTitulo().equals(resumen.getTitulo())) {
                    index = generarIndexAux(resumen.getTitulo());
                    this.array[index] = resumen;
                } else {
                    System.out.println("El resumen " + '"' + resumen.getTitulo() + '"' + " ya se encuentra en el sistema.");
                }   
            }
         
    }
    
    public void imprimir() {
        for (Resumen array1 : this.array) {
            if (array1 != null){
                System.out.println("Titulo: " + array1.getTitulo());
            }    
        } 
    }
}
