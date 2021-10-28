package com.algorithm;

import lombok.extern.slf4j.Slf4j;

/**
 * 简单选择排序算法的实现
 */
@Slf4j
public class SelectSort {

    public static void selectSorg(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {//只需要比较n-1次
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }

            }
            if (minIndex != i) {
                swap(arr, i, minIndex);
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
        selectSorg(arr);
        log.info("arr{}", arr);
    }


}
