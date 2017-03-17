import java.util.Scanner;

public class app{
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int input0, input1, input2, input3 = 0;

    System.out.println("Welcome to Lee's event planning service!!!");
    System.out.println("------------------------------------------");

    System.out.println("Enter the number of guests attending: ");
    input0 = Integer.parseInt(scanner.nextLine());

    System.out.println("------------------------------------------");
    System.out.println("Choose your food options \n1. Light snack \n2. Dinner \n3. Full-course meal ");
    input1 = Integer.parseInt(scanner.nextLine());

    System.out.println("------------------------------------------");
    System.out.println("Choose your drink options \n1. No drinks \n2. Juice/Sodas \n3. Full bar ");
    input2 = Integer.parseInt(scanner.nextLine());

    System.out.println("------------------------------------------");
    System.out.println("Choose your entertainment options \n1. None \n2. DJ \n3. Swimming pool ");
    input3 = Integer.parseInt(scanner.nextLine());

    //Create Event
    Event newEvent = new Event(0,0,0,0);
    newEvent.setNumOfGuests(input0);
    newEvent.setFoodOption(input1);
    newEvent.setBeverageOption(input2);
    newEvent.setEntertainmentOption(input3);

    System.out.println(newEvent.toString());
    System.out.println("------------------------------------------");
    System.out.println(newEvent.qualifyDiscount());


    System.out.println("------------------------------------------");
    while(true){
      System.out.println("\nChoose the following options \n1. Apply Discount \n2. Display receipt\n3. Exit");
      int choice = Integer.parseInt(scanner.nextLine());
      if (choice == 1){
        System.out.println("Enter the your discount code: ");
        System.out.println("------------------------------------------");
        System.out.println("Your cost is now $" + newEvent.applyDiscount(Integer.parseInt(scanner.nextLine())));
      }else if(choice == 2){
        System.out.println(newEvent.toString());
      }else if(choice == 3){
        System.out.println("Thank you for choosing Lee's event planner!!!");
        break;
      }
    }
  }
}
