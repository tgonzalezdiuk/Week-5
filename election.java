/***
Name: Tamara Gonzalez 
Date: 03/04/24
Program: Java
 */

 import java.util.*;
 public class election 
{
     public static void main(String[] args )
     {
         Scanner input = new Scanner(System.in);
         System.out.print("How many votes did Awbrey get? Press Enter: ");
         String AwbreyVotes = input.nextLine();
         System.out.println("Candidate\t Votes Percentage\nAwbrey\t " + AwbreyVotes);
         
         System.out.print("How many votes did Awbrey get? Press Enter: ");
         String MartinezVotes = input.nextLine();
         System.out.println("Martines\t " + MartinezVotes);

         System.out.println("TOTAL VOTES");

         input.close();
     }
 }