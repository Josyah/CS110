// Josyah Morrison
// Lab-03
// StartAPlus.java

public class StartAPlus {
	public static void main(String[] args) {
		computeTaxableIncome(500000.00);
	}
// This function and method computes taxable income into the double grossIncome and then
// at the bottom subtracts the 10k tax deduction in order to find their total taxable income
	
	public static double computeTaxableIncome(double grossIncome)	{
		double owedTax = 0.00;
		if (grossIncome >= 0.00 && grossIncome <= 9275.00) {
			owedTax = grossIncome * .10;
			Magic.println("You owe " + owedTax);
		} else if (grossIncome >= 9275.01 && grossIncome <= 37650.00) {
			owedTax = grossIncome * .15;
			Magic.println("You owe " + owedTax);
		} else if (grossIncome >= 37650.01 && grossIncome <= 91150.00 ) {
			owedTax = grossIncome * .25;
			Magic.println("You owe " + owedTax);
		} else if (grossIncome >= 91150.01 && grossIncome <= 190150.00) {
			owedTax = grossIncome * .28;
			Magic.println("You owe " + owedTax);
		} else if (grossIncome >= 190150.01 && grossIncome <= 413350.00) {
			owedTax = grossIncome * .33;
			Magic.println("You owe " + owedTax);
		} else if (grossIncome >= 413350.01 && grossIncome <= 415050.00) {
			owedTax = grossIncome * .35;
			Magic.println("You owe " + owedTax);
		} else if (grossIncome >= 415050.01) {
			owedTax = grossIncome * .396;
			Magic.println("You owe " + owedTax);
		} 
		while (owedTax > 0) {
			grossIncome = grossIncome - 10350;
		} 
		return grossIncome;
	}
}