package billing;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Menu {
	
	// It is a HashMap that allows program to add the id into key and value as quantity
	HashMap<Integer, Integer> foodQty = new HashMap<Integer, Integer>();
	// Menu ArrayList is for program to add the food object in. 
	private ArrayList<Food> menu = new ArrayList<Food>();
	
	// Creating all the food objects here
	private Food f1 = new Food(1, 4, "Cheese Fries", "Starters");
	private Food f2 = new Food(2, 5, "Cheese Sticks", "Starters");
	private Food f3 = new Food(3, 6, "Onion Ring", "Starters");
	
	private Food f4 = new Food(4, 16, "Lagsana ", "Main");
	private Food f5 = new Food(5, 18, "Carbonara", "Main");
	private Food f6 = new Food(6, 20, "Fish N Chips", "Main");
	private Food f7 = new Food(7, 25, "Salmon Fillet", "Main");
	private Food f8 = new Food(8, 30, "Beef Steak", "Main");
	
	private Food f9 = new Food(9, 5, "Heineken Beer", "Drinks");
	private Food f10 = new Food(10, 6, "Carlsberg", "Drinks");
	private Food f11 = new Food(11, 8, "Mojito  ", "Drinks");
	private Food f12 = new Food(12, 9, "Margarita", "Drinks");
	
	private Food f13 = new Food(13, 3, "Pudding ", "Dessert");
	private Food f14 = new Food(14, 5, "Brownie ", "Dessert");
	private Food f15 = new Food(15, 6, "Tiramisu", "Dessert");
	
	public Menu() {
		
		Scanner scan = new Scanner(System.in);
		int numInput; // 
		
		// adding food objects into menu
		menu.add(f1);
		menu.add(f2);
		menu.add(f3);
		menu.add(f4);
		menu.add(f5);
		menu.add(f6);
		menu.add(f7);
		menu.add(f8);
		menu.add(f9);
		menu.add(f10);
		menu.add(f11);
		menu.add(f12);
		menu.add(f13);
		menu.add(f14);
		menu.add(f15);
		
		// outerloop works like a while loop, and its easier to break out of this loop.
		outerloop: {
			// loop through entire menu and only print out starters food
			System.out.println("Welcome to Wayne's Cafe House. Here is the Menu.");
			System.out.println("-------------------------------------------------------");
			System.out.println("Starters");
			for (int i=0; i<menu.size(); i++) {
				if (menu.get(i).getType().equalsIgnoreCase("starters")) {
					System.out.println(menu.get(i).printString());
				}
			}
			// loop through entire menu and only print out mains food
			System.out.println("-------------------------------------------------------");
			System.out.println("\n");
			System.out.println("Mains");
			for (int i=0; i<menu.size(); i++) {
				if (menu.get(i).getType().equalsIgnoreCase("main")) {
					System.out.println(menu.get(i).printString());
				}
			}
			// loop through entire menu and only print out drinks food
			System.out.println("-------------------------------------------------------");
			System.out.println("\n");
			System.out.println("Drinks");
			for (int i=0; i<menu.size(); i++) {
				if (menu.get(i).getType().equalsIgnoreCase("drinks")) {
					System.out.println(menu.get(i).printString());
				}
			}
			// loop through entire menu and only print out dessert food
			System.out.println("-------------------------------------------------------");
			System.out.println("\n");
			System.out.println("Dessert");
			for (int i=0; i<menu.size(); i++) {
				if (menu.get(i).getType().equalsIgnoreCase("dessert")) {
					System.out.println(menu.get(i).printString());
				}
			}
			System.out.println("-------------------------------------------------------");
			System.out.println("\n");
			
			while(true) {
				System.out.println("Choose an item from the Menu.");
				numInput = checkIfInt();
				while(numInput < 1 || numInput > 15) {
					System.out.println("Invalid Choice! Choose again.");
					numInput = checkIfInt();
				}
				// if food is ordered, just increase the quantity of food, else make a new order
				if (foodQty.containsKey(numInput)) {
					foodQty.put(numInput, (foodQty.get(numInput) + 1));
				} else {
					foodQty.put(numInput, 1);
				}
				
				// Check if he wants to continue ordering
				System.out.println("Do you want to order more?");
				System.out.println("1) Yes");
				System.out.println("2) No");
				numInput = checkIfInt();
				while(numInput < 1 || numInput > 2) {
					System.out.println("Invalid Choice! Choose again.");
					numInput = checkIfInt();
				}
				if (numInput == 1) {
					continue;
				} else {
					break outerloop;
				}
				
			}
			
		}
		
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

	public HashMap<Integer, Integer> getFoodQty() {
		return foodQty;
	}

	public void setFoodQty(HashMap<Integer, Integer> foodQty) {
		this.foodQty = foodQty;
	}
	
	public Food getF1() {
		return f1;
	}

	public void setF1(Food f1) {
		this.f1 = f1;
	}

	public Food getF2() {
		return f2;
	}

	public void setF2(Food f2) {
		this.f2 = f2;
	}

	public Food getF3() {
		return f3;
	}

	public void setF3(Food f3) {
		this.f3 = f3;
	}

	public Food getF4() {
		return f4;
	}

	public void setF4(Food f4) {
		this.f4 = f4;
	}

	public Food getF5() {
		return f5;
	}

	public void setF5(Food f5) {
		this.f5 = f5;
	}

	public Food getF6() {
		return f6;
	}

	public void setF6(Food f6) {
		this.f6 = f6;
	}

	public Food getF7() {
		return f7;
	}

	public void setF7(Food f7) {
		this.f7 = f7;
	}

	public Food getF8() {
		return f8;
	}

	public void setF8(Food f8) {
		this.f8 = f8;
	}

	public Food getF9() {
		return f9;
	}

	public void setF9(Food f9) {
		this.f9 = f9;
	}

	public Food getF10() {
		return f10;
	}

	public void setF10(Food f10) {
		this.f10 = f10;
	}

	public Food getF11() {
		return f11;
	}

	public void setF11(Food f11) {
		this.f11 = f11;
	}

	public Food getF12() {
		return f12;
	}

	public void setF12(Food f12) {
		this.f12 = f12;
	}

	public Food getF13() {
		return f13;
	}

	public void setF13(Food f13) {
		this.f13 = f13;
	}

	public Food getF14() {
		return f14;
	}

	public void setF14(Food f14) {
		this.f14 = f14;
	}

	public Food getF15() {
		return f15;
	}

	public void setF15(Food f15) {
		this.f15 = f15;
	}

	public ArrayList<Food> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<Food> menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "Menu [foodQty=" + foodQty + ", menu=" + menu + ", f1=" + f1 + ", f2=" + f2 + ", f3=" + f3 + ", f4=" + f4
				+ ", f5=" + f5 + ", f6=" + f6 + ", f7=" + f7 + ", f8=" + f8 + ", f9=" + f9 + ", f10=" + f10 + ", f11="
				+ f11 + ", f12=" + f12 + ", f13=" + f13 + ", f14=" + f14 + ", f15=" + f15 + "]";
	}


}
