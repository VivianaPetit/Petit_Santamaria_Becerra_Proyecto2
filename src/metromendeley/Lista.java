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
     * Constructor de la clase Lista
     */
    public Lista() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    /**
     * Evalua si la lista est&aacute; vac&iacute;a.
     *
     * @return <code>true</code> si la lista esta vacia.
     */
    public boolean esVacio() {
        return first == null;
    }

    /**
     * Inserta un nuevo nodo al final de la lista.
     *
     * @param info almacena la info para crear el nodo.
     */
    public void insertFinal(E info) {
        Nodo<E> nuevo = new Nodo<>(info);
        if (esVacio()) {
            first = nuevo;
            last = nuevo;
        } else {
            Nodo<E> aux = last;
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
            cadena = "La lista está vacía.";
        } else {
            Nodo<E> aux = first;
            for (int i = 0; i < length; i++) {
                cadena = cadena + aux.getValor();
                if (i != length - 1) {
                    cadena = cadena + ", ";
                }
                aux = aux.getSiguiente();
            }
        }
        return cadena;
    }

    public String toStringAt(int index) {
        String valor = "";
        Nodo<E> aux = first;
        for (int i = 0; i < length; i++) {
            if (i == index) {
                valor = (String) aux.getValor();
            }
            aux = aux.getSiguiente();
        }
        valor = valor.toLowerCase().trim();
        return valor;
    }

    /**
     *
     * @param valor
     * @return
     */
    public boolean contains(E valor) {
        boolean encontrado = false;
        String aux;
        for (int i = 0; i < length; i++) {
            aux = this.toStringAt(i);
            if (aux.equals(valor)) {
                encontrado = true;
            }
        }
        return encontrado;
    }
    
    public boolean existe(E valor) {
        Nodo<E> actual = first;
        while (actual != null) {
            if (actual.getValor().equals(valor)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    /**
     * Obtener el primer nodo.
     *
     * @return el primer nodo de la lista.
     */
    public Nodo<E> getFirst() {
        return first;
    }

    /**
     * Establece el primer nodo.
     *
     * @param first primer nodo de la lista.
     */
    public void setFirst(Nodo<E> first) {
        this.first = first;
    }

    /**
     * Obtener el &uacute;ltimo nodo.
     *
     * @return el &uacute;ltimo nodo de la lista.
     */
    public Nodo<E> getLast() {
        return last;
    }

    /**
     * Establecer el &uacute;ltimo nodo.
     *
     * @param last &uacute;ltimo nodo de la lista.
     */
    public void setLast(Nodo<E> last) {
        this.last = last;
    }

    /**
     * Obtener la longitud de la lista.
     *
     * @return un <code>int</code> con la longitud de la lista.
     */
    public int getLenght() {
        return length;
    }

    /**
     * Establecer la longitud de la lista.
     *
     * @param length longitud de la lista.
     */
    public void setLenght(int length) {
        this.length = length;
    }

    public Lista<String> obtenerTitulosOrdenados(Lista<String> titulos) {
        return ordenarLista(titulos);
    }

    private Lista<String> ordenarLista(Lista<String> lista) {
        String[] arr = new String[lista.getLenght()];
        Nodo<String> current = lista.getFirst();
        int index = 0;
        while (current != null) {
            arr[index++] = current.getValor();
            current = current.getSiguiente();
        }
        // Ordenamiento burbuja
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        Lista<String> sortedList = new Lista<>();
        for (String titulo : arr) {
            sortedList.insertFinal(titulo);
        }
        return sortedList;
    }
}
