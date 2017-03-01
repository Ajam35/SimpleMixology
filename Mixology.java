package edu.albany.FinalProject;

public class Mixology {
//variables for return types:
static double liqPrice;
static double corPrice;
static double jucPrice;
static double sodPrice;
// a method to find out which liquor type and assign a price
public static void LiquorType(int liquorType)	
{
	liqPrice = 0;
	switch(liquorType)
	{
	
	case 1:
		System.out.println("You chose Vodka");
		liqPrice = 3.50;
		break;
	case 2:
		System.out.println("You chose Gin");
		liqPrice = 3.00;
		break;	
	case 3:
		System.out.println("You chose Tequila");
		liqPrice = 2.00;

		break;
	case 4:
		System.out.println("You chose Rum");
		liqPrice = 3.75;
		break;
	case 5:
		System.out.println("You chose Whiskey");
		liqPrice = 4.00;
		break;
	case 6:
		System.out.println("You chose Bourbon");
		liqPrice = 4.25;
		break;
	case 7:
		System.out.println("You chose Rye");
		liqPrice = 4.75;
		break;
	default:
		System.out.println("invalid choice");
		System.exit(0);
	}
}
//a method that gets the liquor price for the return 
public static double getLiqCost(){
	return liqPrice;
}
//a method that selects the cordial type and assigns a price
public static void CordialType(int corType)	
{
	corPrice = 0;		
	switch(corType)
	{
	
	case 1:
		System.out.println("You chose Blue Curacao");
		corPrice = 1.00;
		break;
	case 2:
		System.out.println("You chose Southern Comfort");
		corPrice = .70;
		break;	
	case 3:
		System.out.println("You chose Kahlua");
		corPrice = .55;
		break;
	case 4:
		System.out.println("You chose Bailey's Irish Cream");
		corPrice = .55;
		break;
	case 5:
		System.out.println("You chose Galiano's");
		corPrice = .95;
		break;
	case 6:
		corPrice = 0;
		break;
	default:
		corPrice = 0;
	}
}
//a method that gets the cordial price for the return 
public static double getCorCost(){
	return corPrice;
}


//a method that finds the juice type and assigns a cost
public static void JuiceType(int juiceType)	
	{
		jucPrice = 0;		
		switch(juiceType)
		{
		
		case 1:
			System.out.println("You chose Lemon Juice");
			jucPrice = .50;
			break;
		case 2:
			System.out.println("You chose Lime Juice");
			jucPrice = .50;
			break;	
		case 3:
			System.out.println("You chose Orange Juice");
			jucPrice =.75;
			break;
		case 4:
			System.out.println("You chose Pineapple Juice");
			jucPrice = .75;
			break;
		case 5:
			System.out.println("You chose Cranberry Juice");
			jucPrice = .75;
			break;
		default:
			System.out.println("invalid choice");
			System.exit(0);
		}
	}
//a method thats gets the cost of juice
public static double getJucCost(){
	return jucPrice;
}
// a method that finds the soda type and cost
public static void sodaType(int sodaType)	
	{
		sodPrice = 0;
		
		switch(sodaType)
		{
		
		case 1:
			System.out.println("You chose Coke");
			sodPrice = 1.00;
			break;
		case 2:
			System.out.println("You chose Seltzer");
			sodPrice = .75;
			break;	
		case 3:
			System.out.println("You chose Tonic");
			sodPrice =.75;
			break;
		case 4:
			System.out.println("You chose Ginger Ale");
			sodPrice = 1.20;
			break;
		default:
			System.out.println("invalid choice");
			System.exit(0);
		}
	
}
//a method that gets the soda cost 
public static double getSodCost(){
	return sodPrice;
}
}

