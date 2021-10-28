package com.algorithm;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuickSort {

    //int[] arr = {11, 5, 9, 10, 2, 4,};
    public static int partition(int[] arr, int left, int right) {
        int pivoKey = arr[left];
        int pivoPointer = left;

        while (left < right) {
            while (left < right && arr[right] >= pivoKey) {
                right--;
            };
            while (left < right && arr[left] <= pivoKey) {
                left++;
            };
            swap(arr, left, right);//把大的交换到右边，把小的交换到左边
        }
        swap(arr, pivoPointer, left);//最后把pivot交换到中间
        return left;
    }

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


    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

    }

    public static void main(String[] args) {
        int[] arr = {11, 5, 9, 10, 2, 4,};
        sort(arr);
        log.info("arr{}", arr);
    }


}
