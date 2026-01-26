package com.regexandjunit.junit.listoperations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {

    private ListManager manager;
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        manager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    @DisplayName("Element should be added to list")
    void testAddElement() {
        manager.addElement(list, 10);
        manager.addElement(list, 20);

        assertEquals(2, list.size());
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    @Test
    @DisplayName("Element should be removed from list")
    void testRemoveElement() {
        list.add(10);
        list.add(20);
        list.add(30);

        boolean removed = manager.removeElement(list, 20);

        assertTrue(removed);
        assertEquals(2, list.size());
        assertFalse(list.contains(20));
    }

    @Test
    @DisplayName("List size should be updated correctly")
    void testGetSize() {
        manager.addElement(list, 1);
        manager.addElement(list, 2);
        manager.addElement(list, 3);

        assertEquals(3, manager.getSize(list));
    }

    @Test
    @DisplayName("Removing non-existing element should return false")
    void testRemoveNonExistingElement() {
        list.add(5);

        boolean removed = manager.removeElement(list, 100);

        assertFalse(removed);
        assertEquals(1, list.size());
    }
}
