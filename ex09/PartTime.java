import java.util.Random;
public class PartTime extends Employee{
    public PartTime(){super(1000);}
	public void generateNumberHours(){
		Random rand = new Random();
		setH(rand.nextInt(5));
	}
}