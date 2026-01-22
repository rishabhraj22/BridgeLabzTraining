package com.collections.queueinterface.hospitaltriage;
import java.util.*;

public class HospitalTriageSystem {

    private PriorityQueue<Patient> queue;

    public HospitalTriageSystem() {
        // Max-heap based on severity
        queue = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p2.getSeverity(), p1.getSeverity())
        );
    }

    public void addPatient(Patient patient) {
        queue.offer(patient);
    }

    public void treatPatients() {
        System.out.println("\nTreatment Order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
