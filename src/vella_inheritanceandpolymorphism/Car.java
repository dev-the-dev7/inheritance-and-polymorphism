
package vella_inheritanceandpolymorphism;

/***************************
***Class Name: Car
***Author: Devin Vella
****************************
***Purpose: The purpose of this class is to create and define object Car.  
****************************
***Date: 10/4/2018
****************************/
public class Car extends Vehicle 
{
   private int numPassangers;
   private int numDoors;
   private int mileage;
    
   public Car(String make, String model, String color, String newUsed, int purchasePrice, int askingPrice,
           int numPassangers, int numDoors, int mileage)
   {
       super(make, model, color, newUsed, purchasePrice, askingPrice);
       this.numPassangers = numPassangers;
       this.numDoors = numDoors;
       this.mileage = mileage;
   }
   
   //set askingPrice
   public void NumPassangers(int numPassangers)
   {
       this.numPassangers = Integer.parseInt(inputCarPurchasePrice.getText());
   }
   
   //set askingPrice
   public void NumDoors(int numDoors)
   {
       this.numDoors = Integer.parseInt(inputCarPurchasePrice.getText());
   }
   
   //set askingPrice
   public void Mileage(int mileage)
   {
       this.mileage = Integer.parseInt(inputCarPurchasePrice.getText());
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
   
   /***************************
   ***Method Name: getNumDoors
   ***Author: Devin Vella
   ****************************
   ***Purpose: The purpose of this method is to return numDoors to main  
   ****************************
   ***Return Value: numDoors
   ****************************
   ***Date: 10/4/2018
   ****************************/
   public int getNumDoors()
   {
       return numDoors;
   }
   
   /***************************
   ***Method Name: getMileage
   ***Author: Devin Vella
   ****************************
   ***Purpose: The purpose of this method is to return mileage to main  
   ****************************
   ***Return Value: mileage
   ****************************
   ***Date: 10/4/2018
   ****************************/
   public int getMileage()
   {
       return mileage;
   }
}
