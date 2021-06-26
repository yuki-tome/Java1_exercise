package fuelconsumption;

class AdvancedCar extends SimpleCar{
    private float aircon;
    AdvancedCar(String maker,float fuel,float air){
        super(maker,fuel);
        this.aircon = air;
    }
    private int begtime;
    private int fintime;
    public void setReport(int beg,int fin,int kilo){
        super.setReport(kilo);
        this.begtime = beg;
        this.fintime = fin;
    }
    float getairfuel(){
        return (fintime-begtime)/aircon;
    }
    public float gettime_b(){
        return begtime;
    }
    public float gettime_f(){
        return fintime;
    }
    float getAircon(){
        return aircon;
    }
    public float calculateFuelConsumptionOldRegulations(){
        return super.calculateFuelConsumptionOldRegulations()+(fintime-begtime)/aircon;
    }
    public float calculateFuelConsumptionNewRegulations(){
        return super.calculateFuelConsumptionNewRegulations()+(fintime-begtime)/aircon;
    }
}