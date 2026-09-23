package com.campagne.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculatorTest {
    @Test
    void add_devrait_calculer_la_somme_de_deux_int() {
        // GIVEN
        int opG = 1;
        int opD = 2;

        // WHEN
        int somme = Calculator.add(opG, opD);

        // THEN
        assertThat(somme).isEqualTo(3);
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,  1,  1",
            "1,  2,  3",
            "-2, 2,  0",
            "0,  0,  0",
            "-1, -2, -3"
    })
    void add_devrait_calculer_la_somme_pour_plusieurs_valeurs(int opG, int opD, int resultatAttendu) {
        // WHEN
        int somme = Calculator.add(opG, opD);

        // THEN
        assertThat(somme).isEqualTo(resultatAttendu);
    }

    @Test
    void divide_devrait_calculer_le_quotient_entier_de_deux_int() {
        // GIVEN
        int opG = 7;
        int opD = 2;

        // WHEN
        int quotient = Calculator.divide(opG, opD);

        // THEN
        assertThat(quotient).isEqualTo(3);
    }

    @Test
    void ensembleChiffres_devrait_retourner_les_chiffres_distincts_d_un_nombre_positif() {
        // WHEN
        Set<Integer> chiffres = Calculator.ensembleChiffres(7679);

        // THEN
        assertThat(chiffres).containsExactlyInAnyOrder(6, 7, 9);
    }

    @Test
    void ensembleChiffres_devrait_ignorer_le_signe_d_un_nombre_negatif() {
        // WHEN
        Set<Integer> chiffres = Calculator.ensembleChiffres(-11);

        // THEN
        assertThat(chiffres).containsExactly(1);
    }

    @Test
    void ensembleChiffres_devrait_retourner_0_pour_le_nombre_0() {
        // WHEN
        Set<Integer> chiffres = Calculator.ensembleChiffres(0);

        // THEN
        assertThat(chiffres).containsExactly(0);
    }
}
