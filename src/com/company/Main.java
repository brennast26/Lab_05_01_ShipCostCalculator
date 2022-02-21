package com.company;

public class Main {

    public static void main(String[] args)
    {
     double priceofitems = 89.20;
     System.out.println("The total price of your items is $"+priceofitems);
     if (priceofitems<100)
        {
         double shippingcost = priceofitems * 1.02;
         System.out.println("The cost of your items plus shipping is $"+shippingcost);
        }
    else
        {
        System.out.println("Your shipping is free so your total is $"+priceofitems);
        }
    }
}
