/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

/**
 *
 * @author joseb
 */
public class Videojuegos {
    
    protected String titulo;
    protected String director;
    protected String summary;
    protected int copies;
    protected int rented;

    public Videojuegos() {
    }

    public int getRented() {
        return rented;
    }

    //método para alquilar una película
    public boolean alquila() {
        boolean success = true;
        if (getRented() < getCopies()) {
            setRented(getRented() + 1);
        } else {
            success = false;
        }
        return success;
    }

    //método para realizar la devolución de una película
    public boolean giveBack() {
        boolean success = true;
        if (getRented() == 0) {
            success = false;
        } else {
            setRented(getRented() - 1);
        }
        return success;
    }

    //método toString sobrescrito para mostrar los datos de la clase Pelicula
    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + "\nResumen: " + getSummary() + "\nCopias : " + getCopies() + "\nPrestadas: " + getRented();
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * @return the summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary the summary to set
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return the copies
     */
    public int getCopies() {
        return copies;
    }

    /**
     * @param copies the copies to set
     */
    public void setCopies(int copies) {
        this.copies = copies;
    }

    /**
     * @param rented the rented to set
     */
    public void setRented(int rented) {
        this.rented = rented;
    }
    
}
