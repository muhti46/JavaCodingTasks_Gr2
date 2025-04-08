package week11;

import java.util.Arrays;

public class ArraySorting_Muhterem {
    /* Write a return method that can sort an int array in Ascending order
       without using the sort method of the Arrays class
       Ex: int[] arr = {10, 9, 8, 7};
       arr = Sort(arr); ==> {7, 8, 9, 10};
    */
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        int[] arr2 = {1, 5, 2, 100, 99, 15, 10};
        System.out.println("sort(arr) = " + Arrays.toString(sort(arr)));
        System.out.println("sort(arr2) = " + Arrays.toString(sort(arr2)));

    }

    /**
     * This method sorts an array in ascending order
     *
     * @param arr The input array to be sorted.
     * @return The sorted array in ascending order.
     */
    public static int[] sort(int[] arr) {
        // Outer loop iterates over each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Inner loop compares the current element with all subsequent elements
            for (int j = i + 1; j < arr.length; j++) {
                // If the current element is greater than the next element, swap them
                if (arr[i] > arr[j]) {
                    int temp = arr[i];// Store the current element temporarily
                    arr[i] = arr[j];// Replace the current element with the next element
                    arr[j] = temp;// Assign the temporary value to the next element
                }
            }
        }
        return arr;// Return the sorted array
    }
}