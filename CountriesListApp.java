import java.util.Scanner;

public class CountriesListApp {

    public static void main(String[] args) {
        CountriesList countriesList = new CountriesList();
        countriesList.displayWelcomeMessage();
        countriesList.displayMenu();

        int choice;
        do {
            choice = countriesList.getMenuOption();

            switch (choice) {
                case 1:
                    countriesList.listCountries();
                    break;
                case 2:
                    System.out.println("Enter Country: ");
                    String country = new Scanner(System.in).nextLine();
                    if (countriesList.checkForCountry(country)) {
                        System.out.println("Country " + country + " already exists in the list.");
                    } else {
                        countriesList.addCountry(country);
                    }
                    break;
                case 3:
                    System.out.println("Goodbye.");
                    break;            
                default:
                    System.out.println("Please make a choice of 1-3.");
                    break;
            }
        } while (choice != 3);
    }
}