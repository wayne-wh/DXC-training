package billing;

import java.util.Collection;
import java.util.Scanner;

public class Billing {
	
	private int subtotal = 0;
	private double total = 0;
	private double temptotal = 0;
	private double tips = 0;
	private int tempPrice = 0;
	private int tempQty = 0;
	private double tax = 0;
	private String tempName = null;
	private String printReceipt = "";
	private int counter = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Billing bill = new Billing();

	}
	
	public Billing () {
		
		Menu menu = new Menu();
		Scanner scan = new Scanner(System.in);
		
		for (int i : menu.foodQty.keySet()) {
			  System.out.println(i);
			  System.out.println(menu.foodQty.get(i));
			  switch(i) {
				case 1:
					tempPrice = menu.getF1().getPrice();
					tempName = menu.getF1().getName();
					break;
				case 2:
					tempPrice = menu.getF2().getPrice();
					tempName = menu.getF2().getName();
					break;
				case 3:
					tempPrice = menu.getF3().getPrice();
					tempName = menu.getF3().getName();
					break;
				case 4:
					tempPrice = menu.getF4().getPrice();
					tempName = menu.getF4().getName();
					break;
				case 5:
					tempPrice = menu.getF5().getPrice();
					tempName = menu.getF5().getName();
					break;
				case 6:
					tempPrice = menu.getF6().getPrice();
					tempName = menu.getF6().getName();
					break;
				case 7:
					tempPrice = menu.getF7().getPrice();
					tempName = menu.getF7().getName();
					break;
				case 8:
					tempPrice = menu.getF8().getPrice();
					tempName = menu.getF8().getName();
					break;
				case 9:
					tempPrice = menu.getF9().getPrice();
					tempName = menu.getF9().getName();
					break;
				case 10:
					tempPrice = menu.getF10().getPrice();
					tempName = menu.getF10().getName();
					break;
				case 11:
					tempPrice = menu.getF11().getPrice();
					tempName = menu.getF11().getName();
					break;
				case 12:
					tempPrice = menu.getF12().getPrice();
					tempName = menu.getF12().getName();
					break;
				case 13:
					tempPrice = menu.getF13().getPrice();
					tempName = menu.getF13().getName();
					break;
				case 14:
					tempPrice = menu.getF14().getPrice();
					tempName = menu.getF14().getName();
					break;
				case 15:
					tempPrice = menu.getF15().getPrice();
					tempName = menu.getF15().getName();
					break;
				}
			  	counter++;
			  	tempQty = menu.foodQty.get(i);
			  	printReceipt += counter + ")  " + tempName + "	Qty: " + tempQty + "	   Price:  $" + tempPrice + 
			  			"\n";
				subtotal += (tempPrice * tempQty);
		}
		
		System.out.println("Do you want to give tips?");
		System.out.println("1) Yes");
		System.out.println("2) No");
		int num = checkIfInt();
		while(num < 1 || num > 2) {
			System.out.println("Invalid Choice! Choose again.");
			num = scan.nextInt();
		}
		if (num == 1) {
			temptotal = subtotal * 1.0675;
			tax = subtotal * 0.0675;
			tips = temptotal * 0.1;
			total = temptotal * 1.1;
		} else {
			tax = subtotal * 0.0675;
			total = subtotal*1.0675;
		}
		System.out.println("-------------------------------------------------------");
		System.out.println(printReceipt);
		System.out.println("Subtotal: $" + subtotal);
		System.out.println("Tax: $" + Math.round(tax * 100.0) / 100.0);
		System.out.println("Tips: $" + Math.round(tips * 100.0) / 100.0);
		System.out.println("Total: $" + Math.round(total * 100.0) / 100.0);
		System.out.println("-------------------------------------------------------");
	}
	
	public int checkIfInt() {
		Scanner sc = new Scanner(System.in);
		String input;
		int output;
		while (true) {
			try {
				input = sc.next();
				output = Integer.parseInt(input);
				break;
			} catch (NumberFormatException ne) {
				System.out.println("This is not a Number. Please insert a valid Number. ");
			}
		}
		return output;
	}

}
