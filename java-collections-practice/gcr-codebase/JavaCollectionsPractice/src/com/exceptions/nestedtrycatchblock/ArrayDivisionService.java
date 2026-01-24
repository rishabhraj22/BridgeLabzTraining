package com.exceptions.nestedtrycatchblock;
public class ArrayDivisionService {

    public static int getResult(int[] array, int index, int divisor) {
        return array[index] / divisor; // May throw exceptions
    }
}
