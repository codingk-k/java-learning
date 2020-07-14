package cn.lnlwf.algorithm.sorting.comparison;

/**
 * 选择排序：
 * 空间复杂度O(1)
 * 时间复杂度O(n^2)
 * @author liuning
 * @date 2020/7/13.
 * @email 24333389385@qq.com
 */
public class SelectionSort {
    
    public static void selectionSort(int[] array){
        int index,temp;
        for (int i = 0; i < array.length-1; i++) {
            index = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] < array[j] && array[index] < array[j]){
                    index = j;
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
