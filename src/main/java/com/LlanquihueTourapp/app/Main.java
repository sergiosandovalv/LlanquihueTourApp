
package com.LlanquihueTourapp.app;

import com.LlanquihueTourapp.data.GestorDatos;
import com.LlanquihueTourapp.model.Tour;
import java.util.ArrayList;

/**
 * Clase principal del sistema.
 * Permite cargar los tours desde archivo
 * y mostrarlos por consola.
 *
 * @author debian12
 */

public class Main {

   /**
     * Método principal
     * 
     * Carga los tours desde el archivo de texto,
     * muestra todos los registros y posteriormente
     * filtra los tours de tipo Familiar.
     * 
     * @param args argumentos de línea de comandos.
     */
   
    public static void main(String[] args) {
        
        GestorDatos gestor = new GestorDatos();
        
        ArrayList<Tour> listaTours = gestor.cargarTours();
        
        System.out.println("===== LISTADO DE TODOS LOS TOURS =====");
        System.out.println();
        
        for (Tour tour : listaTours) {
            System.out.println(tour);
        }
                
        System.out.println("\n===== TOURS FILTRADOS POR TIPO FAMILIAR =====");
        System.out.println();
        
        for (Tour tour : listaTours) {
             if (tour.getTipo().equalsIgnoreCase("Familiar")) {
              System.out.println(tour);
        }    
             
     }        
        System.out.println("\n===== BÚSQUEDA DE TOUR =====");
        System.out.println();

        for (Tour tourBusqueda : listaTours) {
            
        
            if (tourBusqueda.getNombre().equalsIgnoreCase("Frutillar")) {
                
            
                System.out.println(tourBusqueda);
                
            }
        }
     }   
  }
    

    
          
             
    
    
    

