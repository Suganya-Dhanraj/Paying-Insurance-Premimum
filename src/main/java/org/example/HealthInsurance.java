package org.example;

import java.util.Scanner;

public class HealthInsurance extends UserInsurance {
    public HealthInsurance(int i, int s) {
        super();
    }

    public static void main(String[] args) {
        int policyNumber = 3233;
        double money =200;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the policy Number.");
        policyNumber = sc.nextInt();

        System.out.println("Total Amount is: "+policyNumber+" is:" + +money);

        }


    }


