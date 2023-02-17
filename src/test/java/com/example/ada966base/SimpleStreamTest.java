package com.example.ada966base;

import static  org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStreamTest {

    @Test  //dadoqueEutenhoStreamInfinito_quandoLimitar3_entao...
    public void limit() {
        // dado que
        Stream<Integer> infinito = Stream.iterate(0, i -> i + 3);

        // quando
        List<Integer> resultado = infinito
                .limit(3)
                .collect(Collectors.toList());

        // entao
        assertEquals(List.of(0, 3, 6), resultado);
    }

    @Test
    public void limit_reduce() {
        Stream<Integer> infinito = Stream.iterate(0, i -> i + 3);
        Integer valor = infinito
                .limit(3)
                .reduce((a, b) -> a + b)
                .orElse(1);

        assertEquals(9, valor);
    }

}