package com.shekhargulati.ninetynine_problems.java8._02_arithmetic;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertThat;

public class P35Test {

    @Test
    public void _8_isthesumof_3_and_5() throws Exception {
        List<Integer> numbers = P35.goldbach(8);
        assertThat(numbers, hasSize(2));
        assertThat(numbers, hasItems(3, 5));
    }

    @Test
    public void _28_isthesumof_5_and_23() throws Exception {
        List<Integer> numbers = P35.goldbach(28);
        assertThat(numbers, hasSize(2));
        assertThat(numbers, hasItems(5, 23));
    }
}