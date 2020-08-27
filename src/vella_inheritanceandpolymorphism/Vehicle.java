
package vella_inheritanceandpolymorphism;

/***************************
***Class Name: Vehicle
***Author: Devin Vella
****************************
***Purpose: The purpose of this class is to hold all methods and objects needed for Vehicle GUI  
****************************
***Date: 10/4/2018
****************************/
public class Vehicle extends VehicleGUI 
{
    private String make;
    private String model;
    private String color;
    private String newUsed;
    private int purchasePrice;
    private int askingPrice;
        
    public Vehicle(String make,String model,String color,String newUsed,int purchasePrice,int askingPrice)
    {
        this.make = make;
        this.model = model;
        this.color = color;
        this.newUsed = newUsed;
        this.purchasePrice = purchasePrice;
        this.askingPrice = askingPrice;
    }
    
    //set make
    public void setMake(String make)
    {
        this.make = inputCarMake.getText();
    }
    
    //set model
    public void setModel(String model)
    {
        this.model = inputCarModel.getText();
    }
   
    //set color
    public void setColor(String color)
    {
        this.make = inputCarMake.getText();
    }
   
    //set newUsed
    public void setNewUsed(String newUsed)
    {
        this.make = inputCarMake.getText();
    }
   
    //set purchasePrice
    public void setPurchasePrice(int purchasePrice)
    {
        this.purchasePrice = Integer.parseInt(inputCarPurchasePrice.getText());
    }
   
    //set askingPrice
    public void setAskingPrice(int askingPrice)
    {
        this.askingPrice = Integer.parseInt(inputCarAskingPrice.getText());
    }
   
    /***************************
    ***Method Name: getMake
    ***Author: Devin Vella
    ****************************
    ***Purpose: The purpose of this method is to return make to main  
    ****************************
    ***Return Value: make
    ****************************
    ***Date: 10/4/2018
    ****************************/
    public String getMake()
    {
        return make;
    }
    
    /***************************
    ***Method Name: getModel
    ***Author: Devin Vella
    ****************************
    ***Purpose: The purpose of this method is to return model to main  
    ****************************
    ***Return Value: model
    ****************************
    ***Date: 10/4/2018
    ****************************/
    public String getModel()
    {
        return model;
    }
   
    /***************************
    ***Method Name: getColor
    ***Author: Devin Vella
    ****************************
    ***Purpose: The purpose of this method is to return color to main  
    ****************************
    ***Return Value: color
    ****************************
    ***Date: 10/4/2018
    ****************************/
    public String getColor()
    {
       return color;
    }
   
    /***************************
    ***Method Name: getNewUsed
    ***Author: Devin Vella
    ****************************
    ***Purpose: The purpose of this method is to return newUsed to main  
    ****************************
    ***Return Value: newUsed
    ****************************
    ***Date: 10/4/2018
    ****************************/
    public String getNewUsed()
    {
        return newUsed;
    }
   
    /****************************
    ***Method Name: getPurchasePrice
    ***Author: Devin Vella
    ****************************
    ***Purpose: The purpose of this method is to return purchasePrice to main  
    ****************************
    ***Return Value: purchasePrice
    ****************************
    ***Date: 10/4/2018
    ****************************/
    public int getPurchasePrice()
    {
        return purchasePrice;
    }
   
    /***************************
    ***Method Name: getAskingPrice
    ***Author: Devin Vella
    ****************************
    ***Purpose: The purpose of this method is to return askingPrice to main  
    ****************************
    ***Return Value: askingPrice
    ****************************
    ***Date: 10/4/2018
    ****************************/
    public int getAskingPrice()
    {
        return askingPrice;
    }
    
    /***************************
    ***Method Name: vehCountAdd
    ***Author: Devin Vella
    ****************************
    ***Purpose: The purpose of this method is to add one to the vehicle counter   
    ****************************
    ***Method Inputs: vehCount
    ***Return Value: vehCount
    ****************************
    ***Date: 10/4/2018
    ****************************/
    int vehCountAdd(int vehCount)
    {
        vehCount++;
        return vehCount;
    }
    
    /***************************
    ***Method Name: vehCountSubtract
    ***Author: Devin Vella
    ****************************
    ***Purpose: The purpose of this method is to subtract one from the vehicle counter  
    ****************************
    ***Method Inputs: vehCount
    ***Return Value: vehCount
    ****************************
    ***Date: 10/4/2018
    ****************************/
    int vehCountSubtract(int vehCount)
    {
        vehCount--;
        return vehCount;
    }
     
    /***************************
    ***Method Name: deal
    ***Author: Devin Vella
    ****************************
    ***Purpose: The purpose of this method is to tell if we can make a profit 
    ****************************
    ***Method Inputs: custOffer, purchasePriceNum
    ***Return Value: true, false
    ****************************
    ***Date: 10/4/2018
    ****************************/
    public boolean deal(double custOffer, double purchasePriceNum)
    {
        if(custOffer <= purchasePriceNum)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    /***************************
    ***Method Name: calculateProfit
    ***Author: Devin Vella
    ****************************
    ***Purpose: The purpose of this method is to calculate profit 
    ****************************
    ***Method Inputs: custOffer, purchasePriceNum
    ***Return Value: profit
    ****************************
    ***Date: 10/4/2018
    ****************************/
    public double calculateProfit(double custOffer, double purchasePriceNum)
    {
        //get profit
        profit = custOffer - purchasePriceNum;
        return profit; 
    }
    
    /***************************
    ***Method Name: calculateCommission
    ***Author: Devin Vella
    ****************************
    ***Purpose: The purpose of this method is to calculate commission  
    ****************************
    ***Method Inputs: profit, test
    ***Return Value: commission
    ****************************
    ***Date: 10/4/2018
    ****************************/
    public double calculateCommission(double profit, String test)
    {
        //get comission
        if("Car".equals(test))
        {
            commission = profit / 100 * 5;
        }
        else if("Truck".equals(test))
        {
            commission = profit / 100 * 15;
        }
        else if("Motorcycle".equals(test))
        {
            commission = profit / 100 * 20;
        }  
        return commission;
    }
}