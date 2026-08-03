package com.dme.day_02.hackerrank;

import java.util.*;

public class TruckTour_06 {

    public static int truckTour(List<List<Integer>> petrolpumps) {

        int beginning = 0;
        int remainingPetrol = 0;
        int totalPetrol = 0;

        for(int i = 0; i < petrolpumps.size(); i++){
            int petrol = petrolpumps.get(i).get(0);
            int distance = petrolpumps.get(i).get(1);
            int gain = petrol - distance;
            remainingPetrol += gain;
            totalPetrol += gain;

            if(remainingPetrol < 0){
                beginning = i + 1;
                remainingPetrol = 0;
            }
        }
        return beginning;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<List<Integer>> petrolpumps = new ArrayList<>();

        for(int i = 0; i<n; i++){
            List<Integer> pump = new ArrayList<>();
            pump.add(sc.nextInt());
            pump.add(sc.nextInt());
            petrolpumps.add(pump);
        }

        int result = truckTour(petrolpumps);
        System.out.println(result);

    }
}