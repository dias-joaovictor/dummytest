package com.bestseller.dummytest.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class FibonacciService {
    /**
     * Calculate fibonacci sequence.
     * @param iterations
     * @return
     */
    public List<Integer> calculate(int iterations) {
        var sequence = new ArrayList<Integer>();
        var n1 = 0;
        var n2 = 1;
        var n3 = 0;
        sequence.add(n1);
        sequence.add(n2);
        for (int i = 2; i < iterations; ++i) {
            n3 = n1 + n2;
            sequence.add(n3);
            n1 = n2;
            n2 = n3;
        }
        return sequence;
    }
}