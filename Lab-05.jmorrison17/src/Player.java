
public class Player {
	private String name;
	private Hand hand;
	private int playerNum;
	private static int numPlayers;
	
	public String getName() {
		return name;
	} // gets the name
	public String toString() {
		String str = name + " , you have a " + hand.toString() + " .";
		return str;
		// pulls other string(s) and combines them all
	} 
	public void beat() {
		if(hand.getPoints() <= 21) {
			System.out.println("Player wins!");
		} else if(hand.getPoints() > 21) {
			System.out.println("Player loses!");
		}
	} // defines how a user can be beat
	public void tied() {
			while(hand.getPoints() == hand.getPoints()) {
				System.out.println("It's a tie!");
			}
	} // defines how the user can be tied with another player
	public Player(String newName, Hand newHand, int newPlayerNum) {
		name = newName;
		
		Hand hand;
		
		playerNum = newPlayerNum;
		
		numPlayers = 2;
		
		toString();
		
		beat();
		
		tied();
		// puts the toString in the constructor for pulling it later on
		// creates constructor and defines each of the privates as equal to new(insertname)
	}

}
