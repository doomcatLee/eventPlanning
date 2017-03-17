import org.junit.*;
import static org.junit.Assert.*;

public class test{

  @Test
  public void createEventObject(){
    Event event = new Event(50, 0, 0, 0);
    assertEquals(true, event instanceof Event);
  }

  @Test
  public void testGetters(){
    Event event = new Event(50, 30, 30, 15);

    int expectedA = 50;
    int expectedB = 30;
    int expectedC = 30;
    int expectedD = 15;

    assertEquals(expectedA, event.getNumOfGuests());
    assertEquals(expectedB, event.getFoodOption());
    assertEquals(expectedC, event.getBeverageOption());
    assertEquals(expectedD, event.getEntertainmentOption());

  }
  @Test
  public void testSetters(){
    Event event = new Event(0, 0, 0, 0);

    event.setNumOfGuests(50);
    event.setFoodOption(20);
    event.setBeverageOption(15);
    event.setEntertainmentOption(30);

    int expectedA = 50;
    int expectedB = 20;
    int expectedC = 15;
    int expectedD = 30;

    assertEquals(expectedA, event.getNumOfGuests());
    assertEquals(expectedB, event.getFoodOption());
    assertEquals(expectedC, event.getBeverageOption());
    assertEquals(expectedD, event.getEntertainmentOption());

  }

  @Test
  public void calculateCost(){
    Event event = new Event(0 ,0, 0, 0);

    event.setNumOfGuests(120);
    event.setFoodOption(2);
    event.setBeverageOption(1);
    event.setEntertainmentOption(3);
    // System.out.println(event.toString());
    int expectedTotal = 950;

    assertEquals(expectedTotal, event.calculateCost());

  }

  @Test
  public void testCoupon(){
    Event event = new Event(0 ,0, 0, 0);

    event.setNumOfGuests(10);
    event.setFoodOption(3);
    event.setBeverageOption(3);
    event.setEntertainmentOption(3);
    System.out.println(event.toString());
    System.out.println(event.qualifyDiscount());

    assertEquals(true, event.qualifyDiscount() instanceof String);

  }

  @Test
  public void applyDiscount(){
    Event event = new Event(0 ,0, 0, 0);

    event.setNumOfGuests(10);
    event.setFoodOption(2);
    event.setBeverageOption(1);
    event.setEntertainmentOption(1);

    // System.out.println(event.calculateCost());
    double expected = 150;
    assertEquals(expected, event.applyDiscount(2200), 0.0f);

  }
}
