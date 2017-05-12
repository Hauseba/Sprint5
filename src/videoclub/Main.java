/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

import java.util.Scanner;

/**
 *
 * @author Loren
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo, resumen;
        int copias;

        //se crea el objeto peli1 utilizando el constructor con parámetros
        Pelicula peli1 = new Pelicula("Star Wars", "George Lucas","En una galaxia muy muy lejana...", 1, 0);
        Pelicula peli2 = leerDatosPelicula(sc);

        //se muestran por pantalla los datos del objeto peli1
        //se utilizan los métodos getters para acceder al valor de los atributos
        System.out.println("Película 1:");
        System.out.println("Titulo: " + peli1.getTitulo());
        System.out.println("Resumen: " + peli1.getSummary());
        System.out.println("Copias: " + peli1.getCopies());
        System.out.println("Prestadas: " + peli1.getRented());
        System.out.println();

        //se realiza un alquiler de peli1. El método devuelve true si se ha podido
        //realizar el alquiler y false en caso contrario
        if (peli1.alquila()) {
            System.out.println("Se ha alquilado la película " + peli1.getTitulo());
        } else {
            System.out.println("No quedan copias de la película " + peli1.getTitulo() + " para alquilar");
        }

        //se realiza una devolución de peli1. El método devuelve true si se ha podido
        //realizar la devolución y false en caso contrario
        if (peli1.giveBack()) {
            System.out.println("Se ha devuelto la película " + peli1.getTitulo());
        } else {
            System.out.println("No hay copias de la película " + peli1.getTitulo()+ " alquiladas");
        }

        //se realiza otro alquiler de peli1
        if (peli1.alquila()) {
            System.out.println("Se ha alquilado la película " + peli1.getTitulo());
        } else {
            System.out.println("No quedan copias de la película " + peli1.getTitulo() + " para alquilar");
        }

        //se realiza otro alquiler de peli1. En este caso no se podrá realizar ya que
        //solo hay una copia de esta película y ya está alquilada. Se mostrará por
        //pantalla el mensaje No quedan copias de la película…
        if (peli1.alquila()) {
            System.out.println("Se ha alquilado la película " + peli1.getTitulo());
        } else {
            System.out.println("No quedan copias de la película " + peli1.getTitulo() + " para alquilar");
        }
        //mostrar los datos del objeto peli1
        System.out.println("Película 1:");
        System.out.println("Titulo: " + peli1.getTitulo());
        System.out.println("Resumen: " + peli1.getSummary());
        System.out.println("Copias: " + peli1.getCopies());
        System.out.println("Alquiladas: " + peli1.getRented());
        System.out.println();

        //mostrar los datos del objeto peli2
        System.out.println("Película 2:");
        System.out.println("Titulo: " + peli2.getTitulo());
        System.out.println("Resumen: " + peli2.getSummary());
        System.out.println("Copias: " + peli2.getCopies());
        System.out.println("Alquiladas: " + peli2.getRented());
        System.out.println();
    }

    private static Pelicula leerDatosPelicula(Scanner sc) {
        String titulo;
        String resumen;
        int copias;
        //se crea el objeto peli2 utilizando el constructor por defecto
        Pelicula peli2 = new Pelicula();
        System.out.print("Introduce titulo: ");
        titulo = sc.nextLine();
        System.out.print("Introduce el resumen: ");
        resumen = sc.nextLine();
        System.out.print("Numero de copias totales: ");
        copias = sc.nextInt();
        //se asigna a peli2 los datos pedidos por teclado.
        
        peli2.setTitulo(titulo);
        peli2.setSummary(resumen);
        peli2.setCopies(copias);
        return peli2;
    }
    
}
