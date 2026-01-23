package com.collections.bankingsystem;
import java.util.*;

public class BankingSystem {

    private Map<String, BankAccount> accounts = new HashMap<>();
    private TreeMap<Double, List<BankAccount>> sortedByBalance = new TreeMap<>();
    private Queue<WithdrawalRequest> queue = new ArrayDeque<>();

    public void addAccount(BankAccount acc) {
        accounts.put(acc.getAccountNumber(), acc);
        sortedByBalance.computeIfAbsent(acc.getBalance(), k -> new ArrayList<>()).add(acc);
    }

    public void requestWithdrawal(String accNo, double amount) {
        queue.offer(new WithdrawalRequest(accNo, amount));
    }

    public void processWithdrawals() {
        System.out.println("\nProcessing Withdrawals:");
        while (!queue.isEmpty()) {
            WithdrawalRequest req = queue.poll();
            BankAccount acc = accounts.get(req.accountNumber);

            if (acc != null && acc.getBalance() >= req.amount) {
                acc.withdraw(req.amount);
                System.out.println("Processed: " + req.accountNumber);
            } else {
                System.out.println("Failed: " + req.accountNumber);
            }
        }
    }

    public void displaySortedByBalance() {
        System.out.println("\nAccounts sorted by balance:");
        sortedByBalance.clear();
        for (BankAccount acc : accounts.values()) {
            sortedByBalance.computeIfAbsent(acc.getBalance(), k -> new ArrayList<>()).add(acc);
        }

        sortedByBalance.forEach((bal, list) ->
                list.forEach(System.out::println));
    }
}
