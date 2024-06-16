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
    
    
}
