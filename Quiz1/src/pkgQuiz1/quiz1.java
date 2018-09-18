package pkgQuiz1;
import java.util.Scanner;
public class quiz1 {
	static Scanner input = new Scanner(System.in);
	public static void battingAverage(double hits, double atBats) {
		atBats = input.nextInt();
		System.out.println("At Bats: ");
		hits = input.nextInt();
		System.out.println("Hits: ");
		double battingAverage = hits/atBats;
		System.out.println("The batting average is: " + battingAverage);		
	}
	public static void totalBases(double runs, double triples, double doubles, double homeRuns) {
		triples = input.nextInt();
		System.out.println("Triples: ");
		runs = input.nextInt();
		System.out.println("Runs: ");
		doubles = input.nextInt();
		System.out.println("Doubles: ");
		homeRuns = input.nextInt();
		System.out.println("Home Runs: ");
		double totalBases = runs+doubles*2+triples*3+homeRuns*4;
		System.out.println("The total runs is " + totalBases);
	}
	public static void sluggingPercentage(double atBats, double totalBases) {
		double sluggingPercentage = totalBases/atBats;
		System.out.println("The slugging percentage is: " + sluggingPercentage);
		
	}
	public static void onBase(double hits, double walks, double atBats) {
		walks = input.nextInt();
		System.out.println("Walks: ");
		double onBase = (hits+walks)/(atBats+walks);
		System.out.println("The on-base percentage is: " + onBase);				
	}
	public static void onBaseSlugging(double sluggingPercentage, double onBase) {
		double onBaseSlugging = sluggingPercentage + onBase;
		System.out.println("The on-base plus slugging percentage is: " + onBaseSlugging);
	}
}
