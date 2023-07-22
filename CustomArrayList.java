package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CustomArrayList {

    int n = 5;

    class Product{
        int price;
        String pName;
        double rate;

        public Product(int price, String pName, double rate) {
            this.price = price;
            this.rate = rate;
            this.pName = pName;
        }
    }

    public static void main(String[] args) {
        int[] price = { 13, 23, 45, 55, 66, 77 };
        String[] pName = { "Ramen", "Chowmin", "ChauChau", "Biscuite", "Chocolate", "Walnut", "Coffee" };
        double[] rate = { 22.33, 44.55, 66.44, 22.33, 44.55, 99.66 };

        CustomArrayList cs = new CustomArrayList();
        cs.add(price, pName, rate);
    }

    public void add(int price[], String pName[], double rate[]) {
        ArrayList<Product> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Product(price[i], pName[i], rate[i]));
        }
        displayArrayList(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Person name you want to remove:");
        String targetName = sc.next();
        remove(arr, targetName);
        System.out.println("After removing elements with name '" + targetName + "':");
        displayArrayList(arr);
    }


    public void remove(ArrayList<Product> arr, String targetName) {
        Iterator<Product> itr = arr.iterator();
        while (itr.hasNext()) {
            Product pr = itr.next();
            if (pr.pName.equals(targetName)) {
                itr.remove();
            }
        }
    }

    public void displayArrayList(ArrayList<Product> arr) {

        for(int i=0;i< arr.size();i++){

         Product product=arr.get(i);
         System.out.println("The desire output are:"+" "+product.pName+" "+product.rate+" "+product.price);

        }
        Iterator<Product> itr = arr.iterator();
        while (itr.hasNext()) {
            Product pr = itr.next();
            System.out.println(pr.pName + " " + pr.rate + " " + pr.price);
        }
    }
}
