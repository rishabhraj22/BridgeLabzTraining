package com.linkedlist.InventoryManagementSystem;

public class InventoryLinkedList {

    private Item head;

    /* 1. Add at Beginning */
    public void addAtBeginning(int id, String name, int qty, double price) {
        Item newItem = new Item(id, name, qty, price);
        newItem.next = head;
        head = newItem;
    }

    /* 2. Add at End */
    public void addAtEnd(int id, String name, int qty, double price) {
        Item newItem = new Item(id, name, qty, price);

        if (head == null) {
            head = newItem;
            return;
        }

        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    /* 3. Add at Specific Position (1-based) */
    public void addAtPosition(int position, int id, String name, int qty, double price) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        Item temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        Item newItem = new Item(id, name, qty, price);
        newItem.next = temp.next;
        temp.next = newItem;
    }

    /* 4. Remove Item by ID */
    public void removeByItemId(int id) {
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed");
            return;
        }

        Item temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed");
        }
    }

    /* 5. Update Quantity by Item ID */
    public void updateQuantity(int id, int newQty) {
        Item temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    /* 6. Search by Item ID */
    public void searchByItemId(int id) {
        Item temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    /* 7. Search by Item Name */
    public void searchByItemName(String name) {
        Item temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Item not found");
        }
    }

    /* 8. Total Inventory Value */
    public void calculateTotalValue() {
        double total = 0;
        Item temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value = ₹" + total);
    }

    /* 9. Sort by Name */
    public void sortByName(boolean ascending) {
        head = mergeSort(head, true, ascending);
    }

    /* 10. Sort by Price */
    public void sortByPrice(boolean ascending) {
        head = mergeSort(head, false, ascending);
    }

    /* Merge Sort for Linked List */
    private Item mergeSort(Item node, boolean byName, boolean asc) {
        if (node == null || node.next == null)
            return node;

        Item mid = getMiddle(node);
        Item nextOfMid = mid.next;
        mid.next = null;

        Item left = mergeSort(node, byName, asc);
        Item right = mergeSort(nextOfMid, byName, asc);

        return merge(left, right, byName, asc);
    }

    private Item merge(Item a, Item b, boolean byName, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (byName) {
            condition = asc
                    ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                    : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } else {
            condition = asc ? a.price <= b.price : a.price > b.price;
        }

        if (condition) {
            a.next = merge(a.next, b, byName, asc);
            return a;
        } else {
            b.next = merge(a, b.next, byName, asc);
            return b;
        }
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;

        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /* Display All Items */
    public void displayAll() {
        if (head == null) {
            System.out.println("Inventory empty");
            return;
        }

        Item temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    private void displayItem(Item i) {
        System.out.println(
                "ID: " + i.itemId +
                ", Name: " + i.itemName +
                ", Qty: " + i.quantity +
                ", Price: ₹" + i.price
        );
    }
}

