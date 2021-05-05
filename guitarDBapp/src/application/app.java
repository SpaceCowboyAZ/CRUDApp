package application;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Connections.modelConnection;
import guitarDB.model;

public class app {
	
	
	private modelConnection mConnection = new modelConnection();

	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList(
			"Display guitars",
			"Show guitar",
			"Add color",
			"Create guitar",
			"Delete guitar");
	
	public void start() throws SQLException {
		String selection = "";
		
		do {
			printMenu();
			selection = scanner.nextLine();
			
			if (selection.equals("1")) {
				displayGuitars();
			} else if (selection.equals("2")) {
			displayGuitar();
			} else if (selection.equals("3")) {
//				addColor();
			} else if (selection.equals("4")) {
//				createGuitar();
			} else if (selection.equals("5")) {
//				deleteGuitar();
			}
			System.out.println("Press Enter to continue");
			scanner.nextLine();
			 
		} while (!selection.equals("-1"));
	}
	private void printMenu() {
		System.out.println("Select:\n---");
		for (int i = 0; i < options.size(); i++) {
			System.out.println(i + 1 + ") " + options.get(i));
		}
	}

		private void displayGuitars () throws SQLException {
			List<model> models = mConnection.displayGuitars();
			for (model model : models) {
				System.out.println(model.getGuitar_id() + ": " + model.getBrand());
				
			}
		} 
		private void displayGuitar() throws SQLException {
			System.out.println("Enter guitar id: ");
			int id = Integer.parseInt(scanner.nextLine());
			model model = mConnection.getModelByID(id);
			System.out.println(model.getGuitar_id() + ": " + model.getBrand());
			for (model colors : mConnection.displayGuitars()) {
				System.out.println("\tModel ID: " + colors.getGuitar_id() + " - Name: " + colors.getBrand());
			}
}
}


