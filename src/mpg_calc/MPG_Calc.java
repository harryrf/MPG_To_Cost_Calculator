package mpg_calc;

// importing Scanner utility for user input
import java.util.Scanner;


/**
 *
 * @author Harry Fahringer III
 * 
 * 1 Aug 2021
 */


public class MPG_Calc {

  // -- Main Function --

  public static void main (String[] args) {

  // Open the Scanner utility so we can receive user input
  Scanner in = new Scanner(System.in);
  
  // Tell the user what input is needed
  System.out.println("Please enter your current miles per gallon:");

  double mpg = in.nextDouble(); // 26.7

  System.out.println("Please enter the size of your gas tank (gallons):");

  double tankSize = in.nextDouble(); // 12.4

  System.out.println("Please enter the current price of gas:");

  double currentPricePerGallon = in.nextDouble(); // 3.279

  double maxMilesPerTank = mpg * tankSize; // 331.08

  double fullTankPrice = currentPricePerGallon * tankSize; // 40.6596 

  double costPerMile = maxMilesPerTank / fullTankPrice; // 8.14 cents 

  System.out.println("Your cost per mile is " + costPerMile);
  System.out.println("Your price for a full tank of gas is $" + fullTankPrice);
  System.out.println("You can go an estimated " + maxMilesPerTank + " miles with a full tank of gas.");

  //closes scanner
  in.close();
  }


} //#-