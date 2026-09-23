package com.campagne.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void add_devrait_calculer_la_somme_de_deux_entier() {
        //GIVEN
        int opG1 = 1;
        int opG2 = 2;

        //WHEN
        int somme = Calculator.add(opG1, opG2);
        //THEN
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
    void divide_devrait_calculer_la_division_de_deux_entier(){
        //GIVEN
        int opG1 = 4;
        int opG2 = 2;

        //WHEN
        int division = Calculator. divide(opG1, opG2);
        //THEN
        assertThat(division).isEqualTo(2);
    }
}
