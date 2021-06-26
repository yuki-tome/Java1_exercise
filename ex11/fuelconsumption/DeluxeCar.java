package fuelconsumption;

class DeluxeCar extends AdvancedCar {
    DeluxeCar(String maker,float fuel,float aircon){
        super(maker,fuel,aircon);
    }
    private float tratime;
    public void setReport(int begtime,int fintime,int kilo,int tratime){
        super.setReport(begtime,fintime,kilo);
        this.tratime = tratime;
    }
    public float gettime_t(){
        return tratime;
      }
    public float calculateFuelConsumptionOldRegulations(){
        return super.calculateFuelConsumptionOldRegulations();
    }
    public float calculateFuelConsumptionNewRegulations(){
        return super.calculateFuelConsumptionNewRegulations()-getairfuel()+(tratime/super.getAircon());
    }

}