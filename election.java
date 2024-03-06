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
         System.out.print("How many votes did Awbrey get in New York? Press Enter: ");
         int AwbreyVotesNY = input.nextInt();
         System.out.println("Candidate\t Votes Percentage\nAwbrey\t\t " + AwbreyVotesNY);

         System.out.print("How many votes did Awbrey get in New Jersy? Press Enter: ");
         int AwbreyVotesNJ = input.nextInt();
         System.out.println("Candidate\t Votes Percentage\nAwbrey\t\t " + (AwbreyVotesNJ + AwbreyVotesNY));

         System.out.print("How many votes did Awbrey get in Connecticut? Press Enter: ");
         int AwbreyVotesCN = input.nextInt();
         System.out.println("Candidate\t Votes Percentage\nAwbrey\t\t " + (AwbreyVotesCN + AwbreyVotesNJ + AwbreyVotesNY));

         System.out.print("How many votes did Awbrey get in New York? Press Enter: ");
         int MartinezVotesNY = input.nextInt();
         System.out.println("Candidate\t Votes Percentage\nAwbrey\t\t " + (AwbreyVotesCN + AwbreyVotesNJ + AwbreyVotesNY) + "\nMartinez\t " + MartinezVotesNY);

         System.out.print("How many votes did Awbrey get in New Jersy? Press Enter: ");
         int MartinezVotesNJ = input.nextInt();
         System.out.println("Candidate\t Votes Percentage\nAwbrey\t\t " + (AwbreyVotesCN + AwbreyVotesNJ + AwbreyVotesNY) + "\nMartinez\t " + (MartinezVotesNJ + MartinezVotesNY));

         System.out.print("How many votes did Awbrey get in Connecticut? Press Enter: ");
         int MartinezVotesCN = input.nextInt();
         System.out.println("Candidate\t Votes Percentage\nAwbrey\t\t " + (AwbreyVotesCN + AwbreyVotesNJ + AwbreyVotesNY) + "\nMartinez\t " + (MartinezVotesCN + MartinezVotesNJ + MartinezVotesNY));
         
         double AwbreyPercentage = ((AwbreyVotesCN + AwbreyVotesNJ + AwbreyVotesNY)/(AwbreyVotesCN + AwbreyVotesNJ + AwbreyVotesNY + MartinezVotesCN + MartinezVotesNJ + MartinezVotesNY));
         double MartinezPercentage = ((MartinezVotesCN + MartinezVotesNJ + MartinezVotesNY)/(AwbreyVotesCN + AwbreyVotesNJ + AwbreyVotesNY + MartinezVotesCN + MartinezVotesNJ + MartinezVotesNY));

         System.out.print(AwbreyPercentage);

         input.close();
     }

 }