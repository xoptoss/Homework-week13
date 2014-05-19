import java.util.Random;
public class dice {

	static int dices,bounces;
	int value;

	public dice(int dices,int bounces)
	{
		setDices(dices);
		setBounces(bounces);
	}
	public int getDices() {
		return dices;
	}
	public void setDices(int dices) {
		dice.dices = dices;
	}
	public int getBounces()
	{
		return bounces;
	}
	public void setBounces(int bounces)
	{
		dice.bounces = bounces;
	}
	public int Throw() {		
		Random random = new Random();		
		return value = random.nextInt(6)+1;  			
	}
	public String toString()
	{
		return String.format("%s%s\n %s%s\n %s%s",
				" Dices:",dices,
				"Bounces:",bounces,
				"Current Value:", value);
	}
}
