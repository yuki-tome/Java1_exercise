import java.util.Random;
public class Manager extends Employee{
	public Manager(){super(2900);}
	public void generateNumberHours(){
		Random rand = new Random();
		super.setH(rand.nextInt(6)+6);
	}
}