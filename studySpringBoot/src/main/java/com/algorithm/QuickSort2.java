package com.algorithm;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuickSort2 {

    /**
     * 划分
     *
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int partition(int[] arr, int left, int right) {
        int pivoKey = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= pivoKey) {
                right--;
            }
            arr[left] = arr[right];//把小的移动到左边
            while (left < right && arr[left] <= pivoKey)
                left++;
            arr[right] = arr[left];//把大的移动到右边
        }
        arr[left] = pivoKey;
        return left;
    }

    /**
     * 递归划分子序列
     *
     * @param arr
     * @param left
     * @param right
     */
    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int pivoPos = partition(arr, left, right);
        quickSort(arr, left, pivoPos - 1);
        quickSort(arr, pivoPos + 1, right);
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        quickSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {11, 5, 9, 10, 2, 4,};
        sort(arr);
        log.info("arr{}", arr);
    }

}
