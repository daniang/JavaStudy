package com.algorithm;

import lombok.extern.slf4j.Slf4j;

/**
 * 冒泡排序算法实现
 */
@Slf4j
public class BubbleSort {

    /**
     * 冒泡排序
     *
     * @param arr
     */
    public static void bubbleSorg(int[] arr) {
        if (arr == null || arr.length == 0) {
            return ;
        }
        //对最外层进行循环遍历
//        int[] arr = {11,5,9,10,2,4,};
        for (int i = 0; i < arr.length - 1; i++) {
            //从最后一个开始和倒数第二个比较比前面小就和前面交换
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    //交换两个位置的数
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {11, 5, 9, 10, 2, 4,};
        bubbleSorg(arr);
        log.info("arr{}", arr);
    }

}
