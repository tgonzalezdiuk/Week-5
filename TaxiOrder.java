/*** 
 * Name : Tamara Gonzalez 
 * Date : March 13th 2024
 * Application : Java 
 */

import java.util.*;
public class TaxiOrder 
{
    public static void main(String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number of Passengers: ");
        int NumberOfPassengers = input.nextInt();
        
        double TaxiCabs = (NumberOfPassengers / 4);
        double LeftOver = (NumberOfPassengers % 4);

        System.out.println(TaxiCabs + " cabs are required\n" + LeftOver + " passengers(s) will be left over");
        
        input.close();

    }

}
