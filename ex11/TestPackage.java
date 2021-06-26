import fuelconsumption.*;

public class TestPackage{
  public static void main(String args[]){  
    float dif;
    SimpleCar[] cars = {
      new SimpleCar("Nissan",13.0f),
      new AdvanceCar("Toyota",15.5f,9.5f),
      new DeluxeCar("Honda",14.0f,10.5f),
      new DeluxeCar("Van(Nissan)",10.5f,6.0f),
      new BusTaxi("Mercedes",6.6f,11.5f)
    };
    cars[0].setData(350.0f);
    ((AdvanceCar)cars[1]).setData(200.0f,7.0f,18.0f);
    ((DeluxeCar)cars[2]).setData(300.0f,7.0f,18.0f,10.0f);
    ((DeluxeCar)cars[3]).setData(400.0f,7.0f,18.0f,7.0f);
    ((BusTaxi)cars[4]).setData(200.0f,7.0f,18.0f,10.0f,10.0f);



    //this.cars =cars;
    FuelConsumptionCalculation sum = new FuelConsumptionCalculation(cars);
    sum.calculateFuelConsumption();

    System.out.println("FuelConsumption OLD regurations: " + sum.getFuelConsumptionOldRegulations());
    System.out.println("FuelConsumption New regurations: " + sum.getFuelConsumptionNewRegulations());
    System.out.println("The company save " + sum.getNewFuelConsumption() + " Liters of gasoline");
  }
}