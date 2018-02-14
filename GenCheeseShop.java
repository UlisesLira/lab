import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
public class GenCheeseShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int MAXCHEESE = 5;

		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE];
		int[] lbs = new int[MAXCHEESE];
		Scanner input = new Scanner(System.in);
		int List = 0;

		// Three Special Cheeses
		names[0] = "Dalaran Sharp";
		prices[0] = 1.25;

		names[1] = "Stormwind Brie";
		prices[1] = 10.00;

		names[2] = "Alterac Swiss";
		prices[2] = 40.00;

		System.out.println("We sell " + MAXCHEESE + " kinds of Cheese");

		System.out.println(names[0] + ": $" + prices[0] + " per pound");
		System.out.println(names[1] + ": $" + prices[1] + " per pound");
		System.out.println(names[2] + ": $" + prices[2] + " per pound");

		Random ranGen = new Random(100);

		for (int i = 3; i < MAXCHEESE; i++) {
			names[i] = "Cheese Type " + (char)('A' + i);
			prices[i] = ranGen.nextInt(1000)/100.0;
			amounts[i] = 0;

			System.out.println(names[i] + ": $" + prices[i] + " per pound");

		}
		for (int z= 0; z<= MAXCHEESE-1; z++) {
			System.out.print("Enter the amount of " + names[z] + " : ");
			lbs[z] = input.nextInt();
		}

		System.out.print("Display the itemized list? (1 for yes) ");
		List = input.nextInt();

		if (List ==1){
			for (int z=0; z<= MAXCHEESE-1; z++) {
				System.out.print(lbs[z] + " lbs of " + names[z] + " @ " + prices[z]);
				System.out.println(" = " + (prices[z]*lbs[z]));

			}
		}
		double subTotal = 0, Total = 0, Discount = 0;
		
		for (int z = 0; z <= MAXCHEESE - 1; z++)
			subTotal = subTotal + lbs[z] * prices[z];

		if (subTotal >= 50) {
			Total = subTotal - 10.00;
			Discount = 10.00;
		}

		if (subTotal >= 100) {
			Total = subTotal - 15.00;
			Discount = Discount + 15.00;
		}

		Total = subTotal - Discount;

		System.out.println("Sub Total: $" + subTotal);
		System.out.println("-Discount: $" + Discount);
		System.out.println("Total    : $" + Total);

	}
}
