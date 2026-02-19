/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventoryapp;

/**
 *
 * @author rajpu
 */
public class InventoryApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    public int checkStockLevel(String item) {
        // Dummy implementation
        System.out.println("Checking stock level for " + item);
        return 0;
    }

    // Method 2
    public void alertLowStock(String item, int stock) {
        if (stock < 5) {
            System.out.println("ALERT: Low stock for " + item);
}
    }
}