package cn.lnlwf.algorithm.sorting.comparison;

import org.junit.Test;

import java.util.Arrays;

public class SelectionSortTest {

    @Test
    public void selectionSrot(){
        int[] ints = {10, 0, 5, 9, 7, 3};
        SelectionSort.selectionSort(ints);
        System.out.println(Arrays.toString(ints));
    }
}