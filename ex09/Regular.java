import java.util.Random;
public class Regular extends Employee{
    public Regular(){super(2000);}
	public void generateNumberHours(){
		Random rand = new Random();
		setH(rand.nextInt(2)+8);
	}
}