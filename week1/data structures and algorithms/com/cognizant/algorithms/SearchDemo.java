package com.cognizant.algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Book", "Education")
        };

        // Linear Search
        System.out.println("----- Linear Search -----");
        Product result1 = EcommercePlatformSearch.linearSearch(products, "Shoes");

        if (result1 != null) {
            System.out.println(result1);
        } else {
            System.out.println("Product not found");
        }

        // Sort array for Binary Search
        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        // Binary Search
        System.out.println("\n----- Binary Search -----");
        Product result2 = EcommercePlatformSearch.binarySearch(products, "Shoes");

        if (result2 != null) {
            System.out.println(result2);
        } else {
            System.out.println("Product not found");
        }
    }
}