package edu.albany.FinalProject;

public class PointOfSale {
	//a method that calculates the total cost of the drink and it's tax
	public static double CalculateCost(double liqCost, double corCost, double jucCost, double sodCost){
		double sum = (liqCost + corCost + jucCost + sodCost);
		double tax = .08875;
		sum = ((sum * tax) + sum);
		return sum;
	}
	//a method that calculates a double shot and returns cost
	public static double DblShotCost(double liqCost){
	
		double dblShotSum = liqCost;
		
		return dblShotSum;
}
	//a method that calculates a triple shot and returns cost
	public static double TrplShotCost(double liqCost){
		
		double trplShotSum = liqCost* 2;
		return trplShotSum;
}
}
