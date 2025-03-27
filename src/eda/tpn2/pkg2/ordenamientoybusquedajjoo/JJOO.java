/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eda.tpn2.pkg2.ordenamientoybusquedajjoo;

/**
 *
 * @author Usuario
 */
public class JJOO {
    private String pais;
    private int medallasOro;
    private int medallasPlata;
    private int medallasBronce;
    private int ranking;

    // Constructor
    public JJOO(String pais, int medallasOro, int medallasPlata, int medallasBronce, int ranking) {
        this.pais = pais;
        this.medallasOro = medallasOro;
        this.medallasPlata = medallasPlata;
        this.medallasBronce = medallasBronce;
        this.ranking = ranking;
    }

    // getter de tributos
    public String getPais() {
        return pais;
    }

    public int getMedallasOro() {
        return medallasOro;
    }

    public int getMedallasPlata() {
        return medallasPlata;
    }

    public int getMedallasBronce() {
        return medallasBronce;
    }

    public int getRanking() {
        return ranking;
    }

    // SOUT info del paios
    public void mostrar() {
        System.out.println("País: " + pais + ", Oro: " + medallasOro + ", Plata: " + medallasPlata + ", Bronce: " + medallasBronce + ", Ranking: " + ranking);
    }
}
