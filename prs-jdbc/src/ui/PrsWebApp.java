package ui;

import business.User;
import data.UserRepository;

public class PrsWebApp {

	public static void main(String[] args) {
		
		Console.displayLine("Welcome to the Java PRS");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			Console.displayLine("Which table?");
			Console.displayLine("(1) Users");
			Console.displayLine("(2) Products");
			Console.displayLine("(3) Vendors");
			Console.displayLine("(4) Requests");
			Console.displayLine("(5) LineItems");
			Console.getInt("Table #: ");
			
			if (tableInput == 1) {
				
				UserRepository userRepo = new UserRepository(); 
				Console.displayLine("Which action?");
				Console.displayLine("(1) Get all Users");
				Console.displayLine("(2) Get User by ID");
				Console.displayLine("(3) Add a User");
				Console.displayLine("(4) Edit a User");
				Console.displayLine("(5) Delete a User");
				int actionInput = Console.getInt("Action #: ");
				
				if (actionInput == 1) {
					
					ArrayList<User> users = userRepo.getAllUsers();
						for (User u : users) {
							Console.displayLine(u.toString());
						}
					
				}
			}
			
		}
		
		COnsole.displayLine("Thank you; come again!");

	}

}
