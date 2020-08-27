
package vella_inheritanceandpolymorphism;

/***************************
***Class Name: Truck
***Author: Devin Vella
****************************
***Purpose: The purpose of this class is to create and define object Motorcycle.  
****************************
***Date: 10/4/2018
****************************/
public class Motorcycle extends Vehicle 
{
   private String bike;
   private int weight;
   private int engine;
    
   public Motorcycle(String make, String model, String color, String newUsed, int purchasePrice, int askingPrice,
           String bike, int weight, int engine)
   {
       super(make, model, color, newUsed, purchasePrice, askingPrice);
       this.bike = bike;
       this.weight = weight;
       this.engine = engine;
   }
   
   //set askingPrice
   public void Bike(int bike)
   {
       this.bike = inputCarPurchasePrice.getText();
   }
   
   //set askingPrice
   public void Weight(int weight)
   {
       this.weight = Integer.parseInt(inputCarPurchasePrice.getText());
   }
   
   //set askingPrice
   public void Engine(int engine)
   {
       this.engine = Integer.parseInt(inputCarPurchasePrice.getText());
   }
   
   /***************************
   ***Method Name: getBike
   ***Author: Devin Vella
   ****************************
   ***Purpose: The purpose of this method is to return bike to main  
   ****************************
   ***Return Value: bike
   ****************************
   ***Date: 10/4/2018
   ****************************/
   public String getBike()
   {
       return bike;
   }
   
   /***************************
   ***Method Name: getWeight
   ***Author: Devin Vella
   ****************************
   ***Purpose: The purpose of this method is to return weight to main  
   ****************************
   ***Return Value: weight
   ****************************
   ***Date: 10/4/2018
   ****************************/
   public int getWeight()
   {
       return weight;
   }
   
   /***************************
   ***Method Name: getEngine
   ***Author: Devin Vella
   ****************************
   ***Purpose: The purpose of this method is to return engine to main  
   ****************************
   ***Method Inputs: engine
   ***Return Value: engine
   ****************************
   ***Date: 10/4/2018
   ****************************/
   public int getEngine()
   {
       return engine;
   }
}
