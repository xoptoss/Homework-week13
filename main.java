
public class main {

	public static void main(String[] args) {

		dice Dice = new dice(1,3);
		tripleDice Dice2 = new tripleDice(3,2);
		tripleDiceWithHistory Dice3 = new tripleDiceWithHistory(3,3);
		System.out.println(Dice3.Throw());
		System.out.println(Dice3.Throw());
		System.out.println(Dice3.Throw());
		//System.out.println(Dice.toString());
		//System.out.println(Dice2.toString());
		System.out.println(Dice3.toString());
	}
}
