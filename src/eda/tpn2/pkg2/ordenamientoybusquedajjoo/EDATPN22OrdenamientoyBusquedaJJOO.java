/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eda.tpn2.pkg2.ordenamientoybusquedajjoo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EDATPN22OrdenamientoyBusquedaJJOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        listaJJOO lospaises = new listaJJOO();
        lospaises.cargar();  // Carga pais + medella
        JJOOcomparator comparador = new JJOOcomparator();

        Scanner scanner = new Scanner(System.in);

        // Mostramos paises desordenadosm, tal como se creo en listaJJOO
        System.out.println("Antes de ordenar:");
        lospaises.mostrar();

        // Menu para que el usuario seleccione el ordenamiento que quiere
    
        int opcionMenu = 0;

    while (opcionMenu != 1 && opcionMenu != 2) {  // queda atrapado en bucle si seleciona algo que no sea 1 o 2
        System.out.println("\nSeleccione el metodo de ordenamiento que quiere :");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        opcionMenu = scanner.nextInt();

    // Verifica si esta ok, y avisa que selecciono, sino se atrapa en ERROR
    if (opcionMenu == 1) {
        System.out.println("Usted selecciono 1: Bubble Sort.");
    } else if (opcionMenu == 2) {
        System.out.println("Usted selecciono 2: Insertion Sort.");
    } else {
        System.out.println("ERROR, por favor, seleccione 1 o 2.");
    }
}
                
        // Mide el tiempo de nuestro algoritmo
        long inicio = System.nanoTime(); //revisar si vimos en clase System.nanoTime

        // Ordena usando 1 bubble o 2 inserction
        if (opcionMenu == 1) {
            bubbleSort(lospaises.getPaises(), comparador);  // B sort
        } else if (opcionMenu == 2) {
            insertionSort(lospaises.getPaises(), comparador);  // inserttion sort
        }

        long fin = System.nanoTime();
        long tiempo = fin - inicio;

        // Muestra el tiempo que demoro el ordenamiento quje elegimos
        System.out.println("\nTiempo de ejecución: " + tiempo + " nanosegundos.");

        // Lista de paises ordenados
        System.out.println("\nDespués de ordenar:");
        lospaises.mostrar();
    }

    // Algoritmo Bubble Sort
    public static void bubbleSort(List<JJOO> paises, Comparator<JJOO> comparador) {
        int n = paises.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (comparador.compare(paises.get(j), paises.get(j + 1)) > 0) {
                    Collections.swap(paises, j, j + 1);
                }
            }
        }
    }

    // Algoritmo Insertion Sort
    public static void insertionSort(List<JJOO> paises, Comparator<JJOO> comparador) {
        int n = paises.size();
        for (int i = 1; i < n; i++) {
            JJOO clave = paises.get(i);
            int j = i - 1;
            while (j >= 0 && comparador.compare(paises.get(j), clave) > 0) {
                paises.set(j + 1, paises.get(j));
                j--;
            }
            paises.set(j + 1, clave);
        }
    }

    
}
