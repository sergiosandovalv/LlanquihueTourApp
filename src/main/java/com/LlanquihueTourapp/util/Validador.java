
package com.LlanquihueTourapp.util;



/**
 * 
 * Clase para validar datos
 *  
 * @author debian12
 */

public class Validador {
    
    
    /**
     * Valida que el nombre no sea nulo y que no se encuentre vacio
     * 
     * @param nombre nombre a validar
     * 
     * @return true si el nombre es valido, false en caso contrario.
     *  
     */
    
    public static boolean nombreValido(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }
    
}
        

    
    


