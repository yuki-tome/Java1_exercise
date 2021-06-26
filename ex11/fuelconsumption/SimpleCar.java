package fuelconsumption;

class SimpleCar{
    private String maker;
    private float fuel;
    private int kilo;
    SimpleCar(String maker,float fuel){
        this.maker = maker;
        this.fuel = fuel;
    }
    public void setReport(int kilo){
        this.kilo = kilo;
    }
    public float getfueleconomy(){
        return fuel;
    }
    public float getdistance(){
        return kilo;
    }
    public float calculateFuelConsumptionOldRegulations(){
        return kilo/fuel;
	}
    public float calculateFuelConsumptionNewRegulations(){
        return kilo/fuel;
    }
}