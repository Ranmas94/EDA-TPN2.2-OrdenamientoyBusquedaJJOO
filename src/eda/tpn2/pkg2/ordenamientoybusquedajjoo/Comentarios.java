/*
TP 2.2 Ordenamiento y búsqueda

Cree una clase JJOO que contenga la siguiente información:
País, Cantidad de medallas de Bronce, Cantidad de medallas de plata, Cantidad de medallas de oro,
lugar del ranking.

Defina un comparador que considere lo siguiente los países se ordenan por cantidad de medallas de
oro, si 2 países tienen la misma cantidad de oros se comparan las platas, si también tienen la misma
cantidad de platas se comparan por bronces, en caso de coincidir, se colocan en orden alfabético.
Cree los métodos cargar y mostrar.

Luego agregue 2 de los métodos estudiados para ordenamiento a su elección.
Escriba un menú. 
Se espera que muestre los elementos en el orden ingresado y luego de ordenarlos, el
usuario debe poder elegir el método.
También tiene que mostrar el tiempo que insume el ordenamiento.
 */

/*
¿Qué es un Comparator?
Comparator es una interfaz en Java que se utiliza para definir un orden específico en la comparación de objetos. Esta interfaz es útil cuando quieres ordenar elementos que no implementan la interfaz Comparable o cuando deseas proporcionar un criterio de ordenamiento personalizado.

Uso básico de Comparator
El Comparator tiene un único método que necesitas implementar:

int compare(T o1, T o2);


o1: el primer objeto a comparar.

o2: el segundo objeto a comparar.

El método compare() debe devolver:

    Un valor negativo si o1 es "menor" que o2.

    Un valor positivo si o1 es "mayor" que o2.

    0 si ambos objetos son considerados iguales en el criterio de comparación.
*/
package eda.tpn2.pkg2.ordenamientoybusquedajjoo;

/**
 *
 * @author Usuario
 */
public class Comentarios {
    
}
