import java.util.Arrays;
public class tripleDiceWithHistory extends tripleDice {
	int Throws;
	int [] history = new int[3];
int i;
	tripleDice D1;

	tripleDiceWithHistory(int Dices, int Bounces) 
	{
		super(Dices, Bounces);		
		D1 = new tripleDice(Dices,Bounces);	
	}
	public int Throw()
	{		
		i = Throws;
		history[i]=D1.Throw();	
		Throws++;
		return history[i];
	}
	public String toString()
	{
		return String.format("%s%s\n %s%s",
				" Total Throws",Throws,
				"past Values:",Arrays.toString(history));
	}
}
