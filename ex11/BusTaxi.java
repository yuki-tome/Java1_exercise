import fuelconsumption.*;

class BusTaxi extends DeluxeCar {
    BusTaxi(String maker,float fuel,float aircon){
        super(maker,fuel,aircon);
    }
    private float tratime;
    public void setReport(int begtime,int fintime,int kilo,int tratime){
        super.setReport(begtime,fintime,kilo);
        this.tratime = tratime;
    }
    public float calculateFuelConsumptionOldRegulations(){
        return super.getdistance()/super.getfueleconomy()+((super.gettime_f()-super.gettime_b())/super.getAircon())*tratime;
	}
    public float calculateFuelConsumptionNewRegulations(){
        return (super.getdistance()/super.getfueleconomy())+((super.gettime_f()-super.gettime_b())/super.getAircon())*tratime-(super.gettime_f()-super.gettime_b())/super.getAircon()*tratime+(super.tratime()/super.getAircon())*tratime;
	} 

}