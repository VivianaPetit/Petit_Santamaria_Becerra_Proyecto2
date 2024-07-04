/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metromendeley;


/**
 *
 * @author VivianaPetit
 */
public class Resumen {
    
    private String titulo;
    private Lista<String> autores;
    private String cuerpo;
    private Lista<String> palabras_clave;

    public Resumen(String titulo, Lista<String> autores, String cuerpo, Lista<String> palabras_clave) {
        this.titulo = titulo;
        this.autores = autores;
        this.cuerpo = cuerpo;
        this.palabras_clave = palabras_clave;
    }
    
    public Resumen(){
        
    }
    
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

    public String getTitulo() {
        return titulo;
    }

    public Lista<String> getAutores() {
        return autores;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public Lista<String> getPalabras_clave() {
        return palabras_clave;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutores(Lista<String> autores) {
        this.autores = autores;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setPalabras_clave(Lista<String> palabras_clave) {
        this.palabras_clave = palabras_clave;
    }
    
    // Método para verificar si un autor específico está en la lista de autores
    public boolean tieneAutor(String autor) {
        Nodo<String> autorActual = autores.getFirst();
        while (autorActual != null) {
            if (autorActual.getValor().equals(autor)) {
                return true;
            }
            autorActual = autorActual.getSiguiente();
        }
        return false;
    }
    
}
