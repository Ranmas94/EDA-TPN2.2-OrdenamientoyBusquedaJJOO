/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eda.tpn2.pkg2.ordenamientoybusquedajjoo;

import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class JJOOcomparator implements Comparator<JJOO>{

    @Override
    public int compare(JJOO pais1, JJOO pais2) {
        // 1 compara cant de medallas de oro
        if (pais1.getMedallasOro() != pais2.getMedallasOro()) {
            return Integer.compare(pais2.getMedallasOro(), pais1.getMedallasOro()); // Orden descendente
        }

        // Si son iguales compara con cant de plata
        if (pais1.getMedallasPlata() != pais2.getMedallasPlata()) {
            return Integer.compare(pais2.getMedallasPlata(), pais1.getMedallasPlata()); // Orden descendente
        }

        // Si son iguales x2 compara con cant de bronce
        if (pais1.getMedallasBronce() != pais2.getMedallasBronce()) {
            return Integer.compare(pais2.getMedallasBronce(), pais1.getMedallasBronce()); // Orden descendente
        }

        // Si son iguales de nuevo compara alfabeticamente por pais
        return pais1.getPais().compareTo(pais2.getPais());
    }
    
}
