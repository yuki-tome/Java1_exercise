import java.util.Random;
public class Engineer extends Employee{
    public Engineer(){super(2500);}
	public void generateNumberHours(){
		Random rand = new Random();
		setH(rand.nextInt(3)+8);
	}
}