import java.util.Scanner;

public class CheeseShop {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initializing variables.
		Scanner in = new Scanner(System.in);
		double Sharp = 0, Brie = 0, Swiss= 0, List = 0, subTotal = 0, Total = 0, Discount = 0;
		
		//Listing the cheeses.
		System.out.println("We sell 3 kinds of Cheese");
		System.out.println("Dalaran Sharp: $1.25 per pound");
		System.out.println("Stormwind Brie: $10.00 per pound");
		System.out.println("Alterac Swiss: $40.00 per pound");
		
		//Getting user input
		System.out.print("Enter the amount of Sharp in lbs: ");
		Sharp = in.nextInt();
		
		System.out.print("Enter the amount of Brie in lbs: ");
		Brie = in.nextInt();
		
		System.out.print("Enter the amount of Swiss in lbs: ");
		Swiss= in.nextInt();
		
		//List
		System.out.print("Display the itemized list? (1 for yes) ");
		List = in.nextInt();
		
		if (List == 1){
			System.out.println(Sharp + " lbs of Sharp @ $1.25 = $" + (Sharp * 1.25));
			System.out.println(Brie + " lbs of Brie @ $10.00 = $" + (Brie * 10.00));
			System.out.println(Swiss + " lbs of Swiss @ $40.00 = $" + (Swiss * 40.00));
		}
		
		//Total
		subTotal = Sharp * 1.25 + Brie * 10 + Swiss * 40;
		
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
		
		in.close();

	}

}
