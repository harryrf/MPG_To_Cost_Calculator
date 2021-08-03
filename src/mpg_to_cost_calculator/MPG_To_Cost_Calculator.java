package mpg_to_cost_calculator;

/**
 *
 * @author Harry Fahringer III
 * 
 * 1 Aug 2021
 */


public class MPG_To_Cost_Calculator {
  
  
  // -- Assignments --
  
  double mpg = 26.7;                 // * Make *
  double tankSize = 12.4;             // * Into *
  double currentPricePerGallon = 3.273; // * Query *
  double maxMilesPerTank;                 // * Process *
  double costPerMile; // - Fixed number per instance
  
  
  // -- Constructor --
  
  public MPG_To_Cost_Calculator 
    (double _mpg, double _tankSize, double _currentPricePerGallon, 
      double _maxMilesPerTank, double _costPerMile) {
      
    mpg = _mpg;
    tankSize = _tankSize;
    currentPricePerGallon = _currentPricePerGallon;
    maxMilesPerTank = _maxMilesPerTank;
    costPerMile = _costPerMile;   
  }
  
  
  // -- Methods --
  
  public void _ConsoleOutput () {
    System.out.println("----------------------------------------");
    System.out.println("mpg: " + mpg);
    System.out.println("tankSize: " + tankSize);
    System.out.println("currentPricePerGallon:" + currentPricePerGallon);
    System.out.println("maxMilesPerTank:" + maxMilesPerTank);
    System.out.println("costPerMile:" + costPerMile);
    System.out.println("----------------------------------------");
  }
  
  
  // -- # Main Function

  public static void main(String[] args) {
  //  _ConsoleOutput();
  }



} // -- END --