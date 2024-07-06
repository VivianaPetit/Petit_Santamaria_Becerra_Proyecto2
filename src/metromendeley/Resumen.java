/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metromendeley;


/**
 * Clase que representa un resumen con título, autores, cuerpo y palabras clave.
 * 
 * @autor VivianaPetit
 */
public class Resumen {
    
    private String titulo;
    private Lista<String> autores;
    private String cuerpo;
    private Lista<String> palabras_clave;
    
    /**
     * Constructor de la clase Resumen con parámetros.
     * 
     * @param titulo título del resumen
     * @param autores lista de autores del resumen
     * @param cuerpo cuerpo del resumen
     * @param palabras_clave lista de palabras clave del resumen
     */
    public Resumen(String titulo, Lista<String> autores, String cuerpo, Lista<String> palabras_clave) {
        this.titulo = titulo;
        this.autores = autores;
        this.cuerpo = cuerpo;
        this.palabras_clave = palabras_clave;
    }
    
    /**
     * Constructor vacío de la clase Resumen.
     */
    public Resumen(){
        
    }
    
    /**
     * Devuelve una representación en forma de cadena del resumen.
     * 
     * @return una cadena que representa el resumen
     */
    @Override
    public String toString(){
        String cadena = "";
        cadena += titulo + "\n";
        cadena += "Autores \n" + autores.toString() + "\n";
        String[] cuerpoDividido = cuerpo.split(" ");
        int contador = 1;
        cadena += "\n Resumen \n";
        for (String cuerpoDividido1 : cuerpoDividido) {
            cadena += cuerpoDividido1 + " ";
            if (contador % 18 == 0) {
                cadena += "\n";
            }
            contador++;
        }
        cadena += "\n";
        cadena += "\n Palabras clave: " + palabras_clave;
        return cadena;
    }
    
    /**
     * Obtener el título del resumen.
     * 
     * @return el título del resumen
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Obtener la lista de autores del resumen.
     * 
     * @return la lista de autores del resumen
     */
    public Lista<String> getAutores() {
        return autores;
    }
    
    /**
     * Obtener el cuerpo del resumen.
     * 
     * @return el cuerpo del resumen
     */
    public String getCuerpo() {
        return cuerpo;
    }
    
    /**
     * Obtener la lista de palabras clave del resumen.
     * 
     * @return la lista de palabras clave del resumen
     */
    public Lista<String> getPalabras_clave() {
        return palabras_clave;
    }
    
    /**
     * Establecer el título del resumen.
     * 
     * @param titulo el título del resumen
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**
     * Establecer la lista de autores del resumen.
     * 
     * @param autores la lista de autores del resumen
     */
    public void setAutores(Lista<String> autores) {
        this.autores = autores;
    }
    
    /**
     * Establecer el cuerpo del resumen.
     * 
     * @param cuerpo el cuerpo del resumen
     */
    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    
    /**
     * Establecer la lista de palabras clave del resumen.
     * 
     * @param palabras_clave la lista de palabras clave del resumen
     */
    public void setPalabras_clave(Lista<String> palabras_clave) {
        this.palabras_clave = palabras_clave;
    }
    
    /**
     * Verifica si un autor específico está en la lista de autores.
     * 
     * @param autor el autor a verificar
     * @return <code>true</code> si el autor está en la lista, de lo contrario <code>false</code>
     */
    public boolean tieneAutor(String autor) {
        Nodo<String> autorActual = autores.getFirst();
        while (autorActual != null) {
            if (autorActual.getValor().trim().equals(autor.trim())) {
                return true;
            }
            autorActual = autorActual.getSiguiente();
        }
        return false;
    }
    
}
