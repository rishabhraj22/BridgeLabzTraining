package com.streamapi.filteringexpiringmemberships;
import java.time.*;
import java.util.*;
import java.util.stream.*;

class FilteringExpiringMemberships {

    static class Member {
        String name;
        LocalDate expiryDate;

        Member(String name, LocalDate expiryDate) {
            this.name = name;
            this.expiryDate = expiryDate;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of members: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Member> members = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter member name: ");
            String name = sc.nextLine();
            System.out.print("Enter expiry date (yyyy-mm-dd): ");
            String dateStr = sc.nextLine();

            LocalDate date = LocalDate.parse(dateStr);
            members.add(new Member(name, date));
        }

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        System.out.println("\nMembers whose membership expires within next 30 days:");

        members.stream()
                .filter(m -> !m.expiryDate.isBefore(today) && !m.expiryDate.isAfter(next30Days))
                .forEach(m -> System.out.println(m.name + " | Expiry: " + m.expiryDate));
    }
}
