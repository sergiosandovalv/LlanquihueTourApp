package com.LlanquihueTourapp.data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import com.LlanquihueTourapp.model.Tour;
import com.LlanquihueTourapp.model.GuiaTuristico;
import com.LlanquihueTourapp.util.Validador;
       

/**
 * Se encarga de la lectura de los datos
 * desde el archivo tours.txt.
 *
 * Permite cargar la información de tours
 * y almacenarla en un ArrayList.
 *
 * @author debian12
 */

public class GestorDatos {
    
    
    
    /**
     * Lee el archivo tours.txt y carga los datos
     * en una colección dinámica de tours.
     * 
     * @return Lista de tour cargados del el archivo tours.txt 
     */
    
 public ArrayList<Tour> cargarTours() {

        ArrayList<Tour> listaTours = new ArrayList<>();
        
        try {
             InputStream archivo = getClass()
                     .getClassLoader()
                     .getResourceAsStream("tours.txt");

        if (archivo == null) {
            System.out.println("Error: no se encontró el archivo tours.txt");
            return listaTours;
        }

        BufferedReader lector = new BufferedReader(
                new InputStreamReader(archivo));

        String linea;

        while ((linea = lector.readLine()) != null) {

            String[] partes = linea.split(";");

            if (partes.length == 3) {

                String nombre = partes[0];
                String tipo = partes[1];
                int precio = Integer.parseInt(partes[2]);
                
                if (!Validador.nombreValido(nombre)) {
                continue;
                }
                
                GuiaTuristico guia = new GuiaTuristico("Javier Silva", tipo);

                Tour tour = new Tour(nombre, tipo, precio, guia);

                listaTours.add(tour);
            }
        }

        lector.close();

    } catch (IOException e) {
        System.out.println("Error al leer el archivo: " + e.getMessage());

    } catch (NumberFormatException e) {
        System.out.println("Error al convertir el precio: " + e.getMessage());
    }

    return listaTours;       
           
    
    }

}