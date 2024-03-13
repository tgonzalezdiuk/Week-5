/***
Name: Tamara Gonzalez 
Date: 03/07/24
Program: Java
 */

 import java.util.*;
 public Time conversion 
{
     public static void main(String[] args )
     {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the time in minutes: ");
         int Minutes = input.nextInt();

        double TheTimeHours = (Minutes/60) 
        double TheTimeMinutes = (Minutes%60)

          System.out.println("The time is: " + TheTimeHours ":" + TheTimeMinutes)

       input.close();

     }
}
