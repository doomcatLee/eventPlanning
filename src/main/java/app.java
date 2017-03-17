import java.util.Scanner;

public class app{
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Event newEvent = new Event(0, "", "", "");

    System.out.println("Welcome to Lee's event planning service!!!");
    System.out.println("------------------------------------------");

    System.out.println("Enter the number of guests attending: ");
    newEvent.setNumOfGuests(Integer.parseInt(scanner.nextLine()));

    System.out.println("------------------------------------------");
    System.out.println("Choose your food options \n1. Light snack \n2. Dinner \n3. Full-course meal ");
    newEvent.setFoodOption(scanner.nextLine());

    System.out.println("------------------------------------------");
    System.out.println("Choose your drink options \n1. No drinks \n2. Juice/Sodas \n3. Full bar ");
    newEvent.setBeverageOption(scanner.nextLine());

    System.out.println("------------------------------------------");
    System.out.println("Choose your entertainment options \n1. None \n2. DJ \n3. Swimming pool ");
    newEvent.setEntertainmentOption(scanner.nextLine());

    System.out.println(newEvent.toString());
  }
}
