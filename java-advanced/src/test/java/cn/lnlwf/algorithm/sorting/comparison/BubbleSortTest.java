package cn.lnlwf.algorithm.sorting.comparison;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {

    @Test
    public void bubbleSort(){
        int[] ints = {10, 0, 5, 9, 7, 3};
        BubbleSort.bubbleSort(ints);
        System.out.println(Arrays.toString(ints));
    }
}