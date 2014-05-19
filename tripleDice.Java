
public class tripleDice extends dice
{
	dice D1;
	dice D2;
	dice D3;
	tripleDice(int Dices,int Bounces)
	{
		super(Dices,Bounces);
		D1 = new dice(Dices,Bounces);
		D2 = new dice(Dices,Bounces);
		D3 = new dice(Dices,Bounces);
	}
	public int Throw() 
	{
		return value = (D1.Throw()+D2.Throw()+D3.Throw())/3;
		
	}	
}
