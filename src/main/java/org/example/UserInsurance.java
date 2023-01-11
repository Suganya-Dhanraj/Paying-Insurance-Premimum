package org.example;

import java.util.*;
public class UserInsurance
{
    public UserInsurance(int n, double b) {
    }

    public UserInsurance() {
        int policyno=0;

    }


    public static void main(String [] str) throws Exception
    {
        char inputChar;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What type of insurance do you wish?");
        System.out.println("Enter 1 for Health ");
        System.out.println(" 2 for Life ");
        System.out.println(" 3 for Auto ");
        inputChar = keyboard.next().charAt(0);

        AutoInsurance AutoInsurance;
        HealthInsurance HealthInsurance;
        if(inputChar == '1')
           HealthInsurance = new HealthInsurance(200,2400 );

        else if(inputChar == '2') {
            LifeInsurance LifeInsurance = new LifeInsurance(100,1200);

        } else if(inputChar == '3')

           AutoInsurance = new AutoInsurance(3333, 50, 600, "987654321A2008B");
        else
        {
            System.out.println("Invalid Insurance Choice");
            return;
        }
        int item = 0;
    }
}