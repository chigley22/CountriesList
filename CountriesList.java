import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountriesList {
    private ArrayList<String> countries;
    private String[] menuOption = {"List Countries", "Add a Country", "Exit"};
    private Scanner scanner;

    public CountriesList(){
        countries = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void displayWelcomeMessage() {
        System.out.println("Country List manager" + "\n");
    }

    public void displayMenu() {
        System.out.println("Command Menu: ");
        for (int i = 0; i < menuOption.length; i++) {
            System.out.println((i + 1) + " - " + menuOption[i]);
        }
        System.out.println("\n");        
    }

    public int getMenuOption() {
        System.out.println("Enter menu number: ");
        return scanner.nextInt();        
    }

    public boolean checkForCountry(String country) {
        return countries.contains(country);        
    }

    public void addCountry(String country) {
        countries.add(country);
        System.out.println("Country " + country + " has been added.");        
    }

    public void listCountries() {
        if (countries.isEmpty()) {
            System.out.println("No countries in the list." + "\n");
        } else {
            Collections.sort(countries);
            for (String country : countries) {
                System.out.println(country);
            }
            System.out.println("\n");
        }
        
    }
}