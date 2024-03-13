/*****
 * Name : Tamara Gonzalez
 * Date : March 13th 2024
 * Application : Java
 */

import java.util.*;
public class Order 
{
    public static void main(String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        Stirng Name = input.nextLine();

        System.out.print("Enter the number of Burgers: ");
        int Burgers = input.nextInt();

        System.out.print("Enter the number of fries: ");
        int Fries = input.nextInt();

        System.out.print("Enter the number of sodas: ");
        int Sodas = input.nextInt();

        double SodasCost = (Sodas * 0.99);
        double BurgersCost = (Burgers * 1.69);
        double FriesCost = (Fries * 1.09);
        
        double TotalBFTax = (SodasCost + BurgersCost + FriesCost);

        double Tax = (TotalBFTax * (8.5/100));

        double FinalTotal = (TotalBFTax + Tax);

        System.out.print("Enter the amount tendered: ");
        int Tendered = input.nextInt();

        double ChangeDue = (Tendered - FinalTotal);

        System.out.println("Total before tax: " + TotalBFTax + "\nTax: " + Tax + "\nFinal Total: " + FinalTotal + "\nEnter the amount tendered: " + Tendered + "\n Change: " + ChangeDue);

        input.close();

    }

}


        

