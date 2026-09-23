package com.campagne.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
