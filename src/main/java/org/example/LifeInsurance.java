package org.example;

import java.util.Scanner;

public class LifeInsurance extends UserInsurance {
    public LifeInsurance(int n, int b) {
        super(n, b);
    }

    public static void main(String[] args) {
        int policyNumber = 1234;
        double money =100;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the policy Number.");
        policyNumber = sc.nextInt();

        System.out.println("Total Amount is: "+policyNumber+" is:" + +money);

    }


}


