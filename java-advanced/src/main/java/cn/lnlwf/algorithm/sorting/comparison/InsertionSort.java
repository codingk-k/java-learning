package cn.lnlwf.algorithm.sorting.comparison;

/**
 * 插入排序：
 * 空间复杂度O(1)
 * 时间复杂度O(n^2)
 * @author liuning
 * @date 2020/7/14.
 * @email 24333389385@qq.com
 */
public class InsertionSort {

    public static void insertionSort(int[] array){
        int preIndex,current;
        for (int i = 1 ; i < array.length; i++) {
            preIndex = i - 1;
            current = array[i];
            while (preIndex >= 0 && current > array[preIndex]){
                array[preIndex+1] = array[preIndex];
                preIndex--;
            }
            array[preIndex+1] = current;
        }
    }
}
