/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metromendeley;


/**
 *
 * @author VivianaPetit
 * @param <E>
 */
public class Lista<E> {
    private Nodo<E> first;
    private Nodo<E> last;
    private int length;

    /**
     * Contructor de la clase Lista 
    */
    public Lista(){
        this.first=null;
        this.last=null;
        this.length =0;
    }
/**
     * Evalua si la lista est&aacute; vac&iacute;a.
     * @return <code>true</code> si la lista esta vacia.
    */
    public boolean esVacio(){
        return first == null;
    }
    
    /** 
    * Inserta un nuevo nodo al final de la lista. 
    *
    * @param info almacena la info para crear el nodo.
    */
    public void insertFinal(E info){
        Nodo nuevo=new Nodo(info);
        if(esVacio()){
            first=nuevo;
            last=nuevo;
        }else{
            Nodo aux = last;
            aux.setSiguiente(nuevo);
            last = nuevo;
        }
        length++;
    }
    /**
     * Devuelve los elementos de una lista en una cadena.
     * 
     * @return <code>String</code> cadena con los elementos de la lista.
    */    
    
    @Override
     public String toString() {
        String cadena = "";
        if (esVacio()) {
            cadena = cadena + "No hay palabras en el diccionario"; 
        } else {
            Nodo aux = first;
            while (aux != null) {
                cadena = cadena + aux.getValor() + "\n";
                aux = aux.getSiguiente();
            }
        }
        return cadena; 
    }
     
    
    /**
     * Obtener el primer nodo.
     * @return el primer nodo de la lista.
     */
    public Nodo<E> getFirst() {
        return first;
    }
    
    /**
     * Establece el primer nodo.
     * @param first primer nodo de la lista.
     */
    public void setFirst(Nodo<E> first) {
        this.first = first;
    }
    
    /**
     * Obtener el &uacute;ltimo nodo.
     * @return el &uacute;ltimo nodo de la lista.
     */
    public Nodo<E> getLast() {
        return last;
    }
    
    /**
     * Establecer el &uacute;ltimo nodo.
     * @param last &uacute;ltimo nodo de la lista. 
     */
    public void setLast(Nodo<E> last) {
        this.last = last;
    }
    
    /**
     * Obtener la longitud de la lista.
     * @return un <code>int</code> con la lonngitud de la lista.
     */
    public int getLenght() {
        return length;
    }
    
    /**
     * Establecer la longitud de la lista.
     * @param lenght longitud de la lista.
     */
    public void setLenght(int lenght) {
        this.length = lenght;
    }
}