/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eda.tpn2.pkg2.ordenamientoybusquedajjoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class listaJJOO {
    private List<JJOO> paises;

    public listaJJOO() {
        paises = new ArrayList<>();
    }

    // carga la lista con clase JJOO
    public void cargar() {
        paises.add(new JJOO("China", 10, 20, 30, 1));
        paises.add(new JJOO("Africa", 15, 25, 5, 2));
        paises.add(new JJOO("Alaska", 12, 18, 22, 3));
        paises.add(new JJOO("Argentina", 5, 30, 15, 4));
        paises.add(new JJOO("España", 8, 12, 20, 5));
        paises.add(new JJOO("Brasil", 10, 20, 25, 6)); 
        paises.add(new JJOO("Francia", 12, 18, 25, 7)); 
        paises.add(new JJOO("Italia", 15, 25, 5, 8));
        paises.add(new JJOO("Japón", 10, 15, 25, 9)); 
        paises.add(new JJOO("Alemania", 5, 25, 20, 10));
        paises.add(new JJOO("Reino Unido", 5, 20, 30, 11)); 
        paises.add(new JJOO("Canada", 8, 10, 18, 12)); 
        paises.add(new JJOO("Australia", 12, 25, 20, 13)); 
        paises.add(new JJOO("Mexico", 15, 10, 10, 14)); 
        paises.add(new JJOO("India", 8, 18, 30, 15)); 
    }

    // Mostramos los países y su info
    public void mostrar() {
        for (JJOO pais : paises) {
            pais.mostrar();
        }
    }

    // mostramos lista de paises
    public List<JJOO> getPaises() {
        return paises;
    }
}
