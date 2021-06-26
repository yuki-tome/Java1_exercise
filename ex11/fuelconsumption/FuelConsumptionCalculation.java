package fuelconsumption;

public class FuelConsumptionCalculation {
    private double fuelConsumptionOldRegulation = 0;
    private double fuelConsumptionNewRegulation = 0;
    private SimpleCar[] cars;
    FuelConsumptionCalculation() {
        SimpleCar[] cars = { new SimpleCar("Van",14f),new AdvancedCar("Honda",14f,10.5f),new DeluxeCar("Toyota",12f,9.0f)};
        cars[0].setReport(5);
        ((AdvancedCar)cars[1]).setReport(9,16,50);
        ((DeluxeCar)cars[2]).setReport(7,18,100,7);
        this.cars = cars;
    }
    FuelConsumptionCalculation(SimpleCar[] cars) {
        this.cars = cars;
        calculateFuelConsumption();
    }
    private void calculateFuelConsumption() {
        int i;
        for(i = 0; i < cars.length; i++){
          fuelConsumptionOldRegulation += cars[i].calculateFuelConsumptionOldRegulations();
          fuelConsumptionNewRegulation += cars[i].calculateFuelConsumptionNewRegulations();
        }
    }
    float getFuelConsumptionOldRegulations() {
        return (float)this.fuelConsumptionOldRegulation;
    }
    float getFuelConsumptionNewRegulations() {
        return (float)this.fuelConsumptionNewRegulation;
    }
    public static void main(String[] args) {
        float amount;
    
        FuelConsumptionCalculation sum = new FuelConsumptionCalculation();
        sum.calculateFuelConsumption();
    
        System.out.println("FuelConsumption Old regurations: " + sum.getFuelConsumptionOldRegulations() + " L");
        System.out.println("FuelConsumption New regurations: " + sum.getFuelConsumptionNewRegulations() + " L");
    
        amount = sum.getFuelConsumptionOldRegulations() - sum.getFuelConsumptionNewRegulations();
        System.out.println("The company save " + amount + " Liters of gasoline");
    }
}