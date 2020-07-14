package cn.lnlwf.algorithm.sorting.comparison;

/**
 * 冒泡排序：
 * 空间复杂度O(1)
 * 时间复杂度O(n^2)
 * @author liuning
 * @date 2020/7/13.
 * @email 24333389385@qq.com
 */
public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] > array[j]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }
    }
}
