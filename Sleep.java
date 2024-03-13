/***
Name: Tamara Gonzalez 
Date: 03/07/24
Program: Java
 */

 import java.util.*;
 public class Sleep 
{
     public static void main(String[] args )
     {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter your birthdate: ")

         System.out.println("Year: ");
         int BirthYear = input.nextInt();

         System.out.println("Month: ");
         int BirthMonth = input.nextInt();

         System.out.println("Day: ");
         int BirthDay = input.nextInt();
        
         System.out.println("Enter Today's date: ");
       
         System.out.println("Year: ");
         int CurrentYear = input.nextInt();

         System.out.println("Month: ");
         int CurrentMonth = input.nextInt();

         System.out.println("Day: ");
         int CurrentDay = input.nextInt();

        double TimeAliveYears = ((CurrentYear - BirthYear) * 365)
        double TimeAliveMonths = (((12 - BirthMonth) * 30) + (CurrentMonth * 30))
        double TimeALiveDays = ((30 - BirthDay)) + CurrentDay)
        double TimeAlive = (TimeAliveYears + TimeAliveYears + TimeALiveDays)
        double TimeSlept = (TimeAlive * 8)

        System.out.println("You have been alive for " + TimeAlive + "days\nYou have been alive slept" + TimeSlept + "hours")

         input.close(); 
     }

 }

          
