public class WorldPopulation{
    public static void main (String []args){

	double currentPopulation = 8_100_000_000.00;
	double estimatedGrowthRate = 0.91;

	System.out.printf("%s%30s%n", "Year", "Anticipated World Population");

	for(int year = 1; year <= 75; year++){
		double antipatedIncrease = Math.pow((1 + estimatedGrowthRate), year);
		double anticipatedPopulation = currentPopulation * antipatedIncrease;

		System.out.printf("%-5d%.2f%n", year, anticipatedPopulation);
	}
    }
}



