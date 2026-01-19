package com.CropMonitor;
import java.util.Scanner;

public class CropMonitor {

    // Quick Sort by timestamp
    public static void quickSort(SensorRecord[] data, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(data, low, high);

            quickSort(data, low, pivotIndex - 1);
            quickSort(data, pivotIndex + 1, high);
        }
    }

    // Partition based on timestamp
    public static int partition(SensorRecord[] data, int low, int high) {
        long pivot = data[high].getTimestamp();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (data[j].getTimestamp() < pivot) {
                i++;
                SensorRecord temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        SensorRecord temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sensor records: ");
        int n = sc.nextInt();

        SensorRecord[] records = new SensorRecord[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter data for record " + (i + 1));

            System.out.print("Timestamp: ");
            long timestamp = sc.nextLong();

            System.out.print("Temperature (°C): ");
            double temp = sc.nextDouble();

            records[i] = new SensorRecord(timestamp, temp);
        }

        // Sort sensor data by timestamp
        quickSort(records, 0, n - 1);

        System.out.println("\n📈 Sorted Sensor Data (By Timestamp):");
        for (SensorRecord r : records) {
            r.display();
        }
    }
}
