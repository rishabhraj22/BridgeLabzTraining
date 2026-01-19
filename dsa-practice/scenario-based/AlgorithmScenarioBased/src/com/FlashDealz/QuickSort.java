package com.FlashDealz;
class QuickSort {

    public static void quickSort(Product[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(Product[] arr, int low, int high) {
        double pivot = arr[high].getDiscount(); // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].getDiscount() > pivot) { // DESC order
                i++;
                Product temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Product temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
