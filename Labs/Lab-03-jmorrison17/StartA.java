// Josyah Morrison
// Lab-03
// StartA.java

public class StartA {
	public static void main(String[] args) {
		computesTaxes(500000);
		
	}
	public static double computesTaxes(double taxableIncome) {
		// This if else statement will measure the users taxes
		// based on their income and does mathematics for the % things
		if (taxableIncome >= 0.00 && taxableIncome <= 9275.00) {
			double owedTax = taxableIncome * .10;
			Magic.println("You owe " + owedTax);
		} else if (taxableIncome >= 9275.01 && taxableIncome <= 37650.00) {
			double owedTax = taxableIncome * .15;
			Magic.println("You owe " + owedTax);
		} else if (taxableIncome >= 37650.01 && taxableIncome <= 91150.00 ) {
			double owedTax = taxableIncome * .25;
			Magic.println("You owe " + owedTax);
		} else if (taxableIncome >= 91150.01 && taxableIncome <= 190150.00) {
			double owedTax = taxableIncome * .28;
			Magic.println("You owe " + owedTax);
		} else if (taxableIncome >= 190150.01 && taxableIncome <= 413350.00) {
			double owedTax = taxableIncome * .33;
			Magic.println("You owe " + owedTax);
		} else if (taxableIncome >= 413350.01 && taxableIncome <= 415050.00) {
			double owedTax = taxableIncome * .35;
			Magic.println("You owe " + owedTax);
		} else if (taxableIncome >= 415050.01) {
			double owedTax = taxableIncome * .396;
			Magic.println("You owe " + owedTax);
		}
		// returns the taxableIncome double
		
		return taxableIncome;
	}
}