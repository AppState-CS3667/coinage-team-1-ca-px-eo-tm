import java.util.Random;

/**
 * this is the mint method it should only have 1 instance of it (a singleton)
 * 
 * @author Team 1
 *
 */
public abstract class Mint {

	/**
	 * 
	 * making coin. Factory method USDmint CADmint EURmint GBPmint will implement
	 * makeCoin method. only 1 mint. A siglenton
	 * 
	 * @return a coin object
	 */

	public abstract Coin makeCoin(String Type);

	double randomNumber = Math.random();
	// Random r = new Random();

	public void inspect(String coin) {

		int value = (int) (randomNumber * 1001);
		if (value <= 12) {
			System.out.println("Inspection of " + coin + " failed. ");
		} else {

			System.out.println("Inspecting the " + coin + " for imperfect impressions");
			System.out.println("This " + coin + " is perfect!");
		}

	}

	public void smooth(String coin) {

		int value = (int) (randomNumber * 1001);
		if (value <= 1) {
			System.out.println("smooth of " + coin + " failed. ");
		} else {

			System.out.println("Smoothing the rough edges on the " + coin);
			System.out.println("The edges on the " + coin + " are very smooth now!");
		}

	}

	public void buff(String coin) {

		int value = (int) (randomNumber * 1001);
		if (value <= 1) {
			System.out.println("Buffing of " + coin + " failed. ");
		} else {
			System.out.println("Buffing the " + coin + "..");
			System.out.println("It's very shiny now!!");
		}

	}

}