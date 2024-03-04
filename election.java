/***
Name: Tamara Gonzalez 
Date: 03/04/24
Program: Java
 */

 import jav.util.*;
 public class election 
{
     public static void main(String[] args )
     {
         Scanner.input = new Scanner(Sytem.im);
         System.out.print("Type your name and press Enter: ");
         
         String username = input.nextLine();
         System.out.println("Hello " + username);
         
         System.out.print("Type your city and press Enter: ");
         String cityName = input.nextLine();
         System.out.println("You live in " + cityName);
         
         input.close();
 }