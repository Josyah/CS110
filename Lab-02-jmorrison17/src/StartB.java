// Josyah Morrison
// Lab-02
// BuildingBlocks.java

public class StartB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Establishes a true/false ask variable
		Boolean ask = true;
		Magic.println("How much money do you have?");
		int userBal = Magic.nextInt();
		Magic.println("How much money would you like to bet?");
		int bet = Magic.nextInt();
		while(ask) {
				ask = false;
				// if else statement is containing all code 
				if(bet <= userBal) {
					Magic.println("What number (1-36) would you like to bet on?");
					int number = Magic.nextInt();
					Boolean select=true;
					//  creates select for 1-36
					while(select) {
						if(number <= 36 || number >= 1) {
							select = false;
							int rdm = Magic.random(36);
							Magic.println("You spun a "+rdm);
							// if statement makes the random variable stuff
							if(rdm == number) {
								userBal = userBal +(bet *10);
								Magic.println("You have $ "+userBal+ " remaining");
								Magic.println("Would you like to play again?");
								String playAgain = Magic.nextLine();
								// play
								if(playAgain == "yes") {
									ask = true;
								} else {
									Magic.println("Thanks for playing!");
								}
								// userBal has the bet removed
							} else {
								userBal = userBal - bet;
								if(userBal<=0) {
									
									Magic.println("You have no money remaining :(");
									Magic.println("Sorry, you lose...");
									// prints and more user input info from userBal
								} else {
									Magic.println("You have $ "+userBal+ " remaining");
									Magic.println("Would you like to play again?");
									// creates playAgain string
									String playAgain = Magic.nextLine();
									if(playAgain == "yes") {
										ask = true;
									} else {
										Magic.println("Thanks for playing!");
									}
								}
								
							}
							//  gives invalid selections and money errors
							
						} else {
							Magic.println("That's an invalid selection. What number (1-36) would you like to bet on?");
							number = Magic.nextInt();
						}
					}
					//  other money error that comes about
				} else {
					Magic.println("You don't have enough money for that. How much would you like to bet?");
					bet = Magic.nextInt();
					ask = true;
				}
		}
		
	}

}
