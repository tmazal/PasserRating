//CISC 181 Quiz 1 - Question 1
//Passer Rating Calculator - Tobias Mazal

import java.util.Scanner; // imports Scanner method

public class Rating {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner object created
		
		double Touchdowns, TotalYards, Interceptions, Completions, PassAttempts; // define variables as doubles
	
		System.out.println("Welcome to the QB Passer Rating Calculator. Here you may enter a QB's stats to determine their rating for a football game.");  // prompts users for years planning to work
		System.out.println("How many touchdown passes has the QB thrown? ");  // prompts users for number of touchdown passes
		Touchdowns = input.nextDouble(); // user input set to variable
	
		System.out.println("How many total passing yards has the QB achieved? ");
		TotalYards = input.nextDouble();
	
		System.out.println("How many interceptions has the QB thrown? ");
		Interceptions = input.nextDouble();
	
		System.out.println("How many completions has the QB made? ");
		Completions = input.nextDouble();
	
		System.out.println("How many passes has the QB attempted? ");
		PassAttempts = input.nextDouble();
		
		double a,b,c,d,PasserRating; // define variables as doubles
		
		a = (Completions / PassAttempts - 0.3) * 5; // establishes equations for PasserRating calculation
		if (a < 0) { // if loop keeps value for a within the range of 0 to 2.375
			a = 0; 
			} 
		if (a > 2.375) {
			a = 2.375; 
			}
		b = (TotalYards / PassAttempts - 3) * 0.25;
		if (b < 0) { 
			b = 0; 
			} 
		if (b > 2.375) {
			b = 2.375; 
			}
		c = (Touchdowns / PassAttempts) * 20;
		if (c < 0) { 
			c = 0; 
			} 
		if (c > 2.375) {
			c = 2.375; 
			}
		d = 2.375 - (Interceptions / PassAttempts * 25);
		if (d < 0) { 
			d = 0; 
			} 
		if (d > 2.375) {
			d = 2.375; 
			}
		PasserRating = (a+b+c+d)*100/6; // calculates Passer Rating
		
		System.out.printf("Your QB's calculated rating is: " + "%4.1f",PasserRating); // prints result
	}
}