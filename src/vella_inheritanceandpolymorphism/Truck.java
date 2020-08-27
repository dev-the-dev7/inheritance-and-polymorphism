
package vella_inheritanceandpolymorphism;

/***************************
***Class Name: Truck
***Author: Devin Vella
****************************
***Purpose: The purpose of this class is to create and define object Truck.  
****************************
***Date: 10/4/2018
****************************/
public class Truck extends Vehicle 
{
   private int numPassangers;
   private int weight;
   private int towingCapacity;
    
   public Truck(String make, String model, String color, String newUsed, int purchasePrice, int askingPrice,
           int numPassangers, int weight, int towingCapacity)
   {
       super(make, model, color, newUsed, purchasePrice, askingPrice);
       this.numPassangers = numPassangers;
       this.weight = weight;
       this.towingCapacity = towingCapacity;
   }

   //set askingPrice
   public void NumPassangers(int numPassangers)
   {
       this.numPassangers = Integer.parseInt(inputCarPurchasePrice.getText());
   }
   
   //set askingPrice
   public void Weight(int weight)
   {
       this.weight = Integer.parseInt(inputCarPurchasePrice.getText());
   }
   
   //set askingPrice
   public void TowingCapacity(int towingCapacity)
   {
       this.towingCapacity = Integer.parseInt(inputCarPurchasePrice.getText());
   }
   
   /***************************
   ***Method Name: getNumPassangers
   ***Author: Devin Vella
   ****************************
   ***Purpose: The purpose of this method is to return numPassangers to main  
   ****************************
   ***Return Value: numPassangers
   ****************************
   ***Date: 10/4/2018
   ****************************/
   public int getNumPassangers()
   {
       return numPassangers;
   }
   
   /****************************
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
   ***Method Name: getTowingCapacity
   ***Author: Devin Vella
   ****************************
   ***Purpose: The purpose of this method is to return towingCapacity to main  
   ****************************
   ***Method Inputs: towingCapacity
   ***Return Value: towingCapacity
   ****************************
   ***Date: 10/4/2018
   ****************************/
   public int getTowingCapacity()
   {
       return towingCapacity;
   }
}