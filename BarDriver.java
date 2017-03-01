package edu.albany.FinalProject;

import java.util.Scanner;

public class BarDriver {
	public static void main(String[] args) {
		String yOrN;                    //Variable to accept Yes or No from Input
		int alcType;                    //Holds Alcohol Type
		int corType;                    //Holds Cordial Type
		int jucType;                    //Holds Juice Type
		int sodType;                    //Holds Soda Type
		double sum;                     //Holds Total Cost pre and post tip
		int j = 0;
		int k =0;
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Welcome to Double A Pub");
		System.out.println("Lets start you out with a nice beverage");
		System.out.println("Would you like alcohol in your beverage? (You may answer yes or no)");
		yOrN = scan.next();            //Get Yes or no from user input
		yOrN = yOrN.toLowerCase();     //Convert whatever its case may be to Lower for comparison purposes
		while (j == 0) {               //Loop to check  for correct user entry
			if (yOrN.equals("yes")) {
				System.out.println("Alright Alcohol it is :)");
				j = 1;
				k =1;
			} else if (yOrN.equals("no")) {
				System.out.println("Okie Dokie No Alcohol then");
				j = 2;
			} else {
				System.out.println("Invalid Entry");
				System.out.println("Would you like alcohol in your beverage? (You may answer yes or no)");
				yOrN = scan.next();
				yOrN = yOrN.toLowerCase();
			}
		}
		if (j == 1) {              //If user answered yes to previous question go here
			while (j != 0) {
				                  //Prompt user for what type of Alcohol they would like
				System.out.println("What type of Alcohol would you like?(Enter the number for Alcohol type)");
				System.out.println("1 - Vodka");
				System.out.println("2 - Gin");
				System.out.println("3 - Tequila");
				System.out.println("4 - Rum");
				System.out.println("5 - Whiskey");
				alcType = scan.nextInt();
                
				if (alcType > 5 || alcType < 1) {        //Error Check for correct input
					System.out.println("Invalid Entry");
				} else if (alcType == 5) {               //Check for specific type of Whiskey
					System.out.println("What type of Whiskey would you like?");
					System.out.println("1 - Bourbon");
					System.out.println("2 - Rye");
					alcType = ((scan.nextInt()) + alcType);
				} else if (alcType >= 1 && alcType <= 7) {
					Mixology.LiquorType(alcType);        //Call LiquorType to hold the type and get cost 
					while (j != 0) {
						            //Prompt user for type of Cordial if wanted
						System.out.println("What type of cordial would you like?(Enter the number for cordial type)");
						System.out.println("1 - Blue Curacao");
						System.out.println("2 - Southern Comfort");
						System.out.println("3 - Kahlua");
						System.out.println("4 - Bailey's Irish Cream");
						System.out.println("5 - Galiano's");
						System.out.println("6 - None");
						corType = scan.nextInt();
						if (corType > 6 || corType < 1) { //Error check for correct input
							System.out.println("Invalid Entry");
						} else {
							j = 0;
							Mixology.CordialType(corType);    //Call CordialType to hold type and get cost
						}
					}
				}
			}
		}

		// Would you like to Double or Triple the amount of alcohol?!
		// Double/Triple Function
		j = 0;
		System.out.println("Would you Like any Juice or Soda?(You can Answer Juice,Soda or None)");
		yOrN = scan.next();		//Get Yes or no from user input
		yOrN = yOrN.toLowerCase(); //Convert whatever its case may be to Lower for comparison purposes
		while (j == 0) {           //Loop to see if customer wants Juice,Soda or None
			if (yOrN.equals("juice")) { 
				System.out.println("Juice it is");
				j = 1;
			} else if (yOrN.equals("soda")) {
				System.out.println("Alrighty Soda it is");
				j = 2;
			} else if (yOrN.equals("none")) {
				System.out.println("None it is");
				j = -1;
			} else {
				System.out.println("Invalid Entry");
				System.out.println("Would you Like any Juice or Soda?(You can Answer Juice,Soda or No)");
				yOrN = scan.next();
				yOrN = yOrN.toLowerCase();
			}

		}
		while (j > 0) {
			if (j == 1) {
				//Prompt user for what type of Juice they would like
				System.out.println("What type of Juice would you like?(Enter the number for juice type)");
				System.out.println("1 - Lemon");
				System.out.println("2 - Lime");
				System.out.println("3 - Orange Juice");
				System.out.println("4 - Pineapple");
				System.out.println("5 - Cranberry");
				jucType = scan.nextInt();
				if (jucType > 5 || jucType < 1) {          //Error Check for correct input
					System.out.println("Invalid Entry");
				} else {
					j = 0;
					Mixology.JuiceType(jucType);
				}
			} else if (j == 2) {
				//Prompt user for what type of Soda they would like
				System.out.println("What type of Soda would you like?(Enter the number for soda)");
				System.out.println("1 - Cola");
				System.out.println("2 - Seltzer");
				System.out.println("3 - Tonic");
				System.out.println("4 - Ginger Ale");
				sodType = scan.nextInt();
				if (sodType > 5 || sodType < 1) {
					System.out.println("Invalid Entry");   //Error Check for correct input
				} else {
					j = 0;
					Mixology.sodaType(sodType);
				}
			}
		}
	sum = PointOfSale.CalculateCost(Mixology.getLiqCost(), Mixology.getCorCost(),Mixology.getJucCost(), Mixology.getSodCost());
	if(k == 1){
		System.out.println("Would You like to make it a double or a triple? (Enter Double, Triple or none");
		yOrN = scan.next();            //Get Yes or no from user input
		yOrN = yOrN.toLowerCase();     //Convert whatever its case may be to Lower for comparison purposes
			while (j == 0) {               //Loop to check  for correct user entry
				if (yOrN.equals("double")) {                 //Calculate for a Double Shot
					System.out.println("Awesome lets double it up");
					sum = (PointOfSale.DblShotCost(Mixology.getLiqCost())) + sum;
				} else if (yOrN.equals("Triple")) {
					System.out.println("Awesome Lets Triple it up");//Calculate for a Triple Shot
					sum = (PointOfSale.TrplShotCost(Mixology.getLiqCost())) + sum;
				} else if (yOrN.equals("None")) {
						System.out.println("Good Job being Responsible");
				}else {
					System.out.println("Invalid Entry");
					System.out.println("Would you like alcohol in your beverage? (You may answer yes or no)");
					yOrN = scan.next();
					yOrN = yOrN.toLowerCase();
				}
			}
		}
	
	//Call Calculate Cost to get Cost with Tax Before Tip
	System.out.println("The Total Cost of your Drink is:");
	System.out.printf("%.2f\n", sum);
	//Print out Cost before Tip
	System.out.println("How much would you like to tip your bartender?");
	sum = (sum + scan.nextDouble());
	//Ask Customer for tip
	System.out.println("Your total cost comes to:");
	System.out.printf("%.2f",sum);
	//Print out Total with Tip
	}

}
