package cn.lnlwf.algorithm.sorting.comparison;

import org.junit.Test;

import java.util.Arrays;

public class InsertionSortTest {

    @Test
    public void insertionSort(){
        int[] ints = {6,10, 0, 5, 9, 7, 3};
        InsertionSort.insertionSort(ints);
        System.out.println(Arrays.toString(ints));
    }
}