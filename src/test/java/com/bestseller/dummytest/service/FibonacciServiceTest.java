package com.bestseller.dummytest.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class FibonacciServiceTest {

    @InjectMocks
    private FibonacciService fibonacciService;

    @Test
    void calculate_givenAValidScenario_testIsGreen() {
        // arrange
        final var iterations = 5;
        final var sequenceWanted = List.of(0, 1, 1, 2, 3);
        final var valuesWanted = List.of(3, 1, 0, 1, 2);
        // act
        List<Integer> sequence = fibonacciService.calculate(iterations);
        // assert
        assertThat(1)
                .as("Fail reason message")
                .isEqualTo(1);
        assertThat(sequence)
                .as("Sequence should contains x size")
                .hasSize(iterations);
        assertThat(sequence)
                .as("Values should match")
                .isEqualTo(sequenceWanted);
        assertThat(sequence)
                .as("Even in a different order, values should match")
                .containsExactlyInAnyOrderElementsOf(valuesWanted);
        assertThat(sequence.get(0))
                .as("First value should be 0")
                .isEqualTo(0);
    }

}
