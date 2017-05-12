/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

/**
 *
 * @author Lorenzo
 */
public class Pelicula extends Videojuegos {

    //constructor por defecto
    public Pelicula() {
    }

    //constructor con parámetros
    public Pelicula(String title, String director, String summary, int copies, int rented) {
        this.titulo = title;
        this.director = director;
        this.summary = summary;
        this.copies = copies;
        this.rented = rented;
    }

   
}   
