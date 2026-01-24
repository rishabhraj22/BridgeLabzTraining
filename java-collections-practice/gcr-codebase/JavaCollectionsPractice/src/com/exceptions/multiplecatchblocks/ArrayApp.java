package com.exceptions.multiplecatchblocks;
import java.util.Scanner;

public class ArrayApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            int[] numbers = new int[size];

            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }

            System.out.print("Enter index to retrieve value: ");
            int index = sc.nextInt();

            int value = ArrayReader.getValueAtIndex(numbers, index);
            System.out.println("Value at index " + index + ": " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");

        } finally {
            sc.close();
        }
    }
}
