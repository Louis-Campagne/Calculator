package com.campagne.calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {
    private Calculator() {
        // Classe utilitaire : pas d'instanciation
    }

    /**
     * Calcule la somme de deux entiers.
     *
     * @param opG opérande gauche
     * @param opD opérande droite
     * @return la somme opG + opD
     */
    public static int add(int opG, int opD) {
        return opG + opD;
    }

    /**
     * Calcule le quotient entier de deux entiers.
     *
     * @param opG dividende
     * @param opD diviseur
     * @return le quotient entier opG / opD
     */
    public static int divide(int opG, int opD) {
        return opG / opD;
    }

    /**
     * Retourne l'ensemble des chiffres qui composent un nombre.
     *
     * @param pNombre le nombre à décomposer (le signe est ignoré)
     * @return l'ensemble non ordonné des chiffres de pNombre
     */
    public static Set<Integer> ensembleChiffres(int pNombre) {
        Set<Integer> chiffres = new HashSet<>();
        long reste = Math.abs((long) pNombre);
        do {
            chiffres.add((int) (reste % 10));
            reste = reste / 10;
        } while (reste > 0);
        return chiffres;
    }
}
