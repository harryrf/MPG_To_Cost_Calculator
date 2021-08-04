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

  // creates a new instance
  public static final Scanner in = new Scanner(System.in);
  
  // -- Assignments --
  
  double mpg; // 26.7
  double tankSize; // 12.4
  double currentPricePerGallon; // 3.273
  double maxMilesPerTank; // mpg * tankSize
  double costPerMile; // Fixed number per instance
  
  
  // -- Constructor --
  
  public MPG_Calc (double _mpg, double _tankSize, double _currentPricePerGallon, 
    double _maxMilesPerTank, double _costPerMile) {
    
    mpg = _mpg;
    tankSize = _tankSize;
    currentPricePerGallon = _currentPricePerGallon;
    maxMilesPerTank = _maxMilesPerTank;
    costPerMile = _costPerMile;
    
  }
  
  
  // -- Methods --

  public void getMPG() {
    // * Get input from user
  }
  
  public void getTANKSIZE() {
    // *
  }
  
  public void getCURRENTPRICEPERGALLON() {
    // *
  }
  
  public void getMAXMILESPERTANK() {
    // *
  }
  
  public void getCOSTPERMILE() {
    // *
  }
  
  
  // Console
  public void _ConsoleOutput () {
    
    System.out.println("----------------------------------------");
    System.out.println("mpg: " + mpg);
    System.out.println("tankSize: " + tankSize);
    System.out.println("currentPricePerGallon: " + currentPricePerGallon);
    System.out.println("maxMilesPerTank: " + maxMilesPerTank);
    System.out.println("costPerMile: " + costPerMile);
    System.out.println("----------------------------------------");
    
  }
  
  
  // -- Main Function --

  public static void main (String[] args) {
  
  // New instance to use with dialog/interface
  MPG_Calc newQuery = new MPG_Calc(0, 0, 0, 0, 0);
  
  newQuery._ConsoleOutput();
  
  }



} //#-