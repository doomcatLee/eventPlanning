import org.junit.*;
import static org.junit.Assert.*;

public class test{

  @Test
  public void createEventObject(){
    Event event = new Event(50, "1a", "2b", "3b");
    assertEquals(true, event instanceof Event);
  }

  @Test
  public void testGetters(){
    Event event = new Event(50, "1a", "2b", "3b");

    int expectedA = 50;
    String expectedB = "1a";
    String expectedC = "2b";
    String expectedD = "3b";

    assertEquals(expectedA, event.getNumOfGuests());
    assertEquals(expectedB, event.getFoodOption());
    assertEquals(expectedC, event.getBeverageOption());
    assertEquals(expectedD, event.getEntertainmentOption());

  }
  @Test
  public void testSetters(){
    Event event = new Event(0, "", "", "");

    event.setNumOfGuests(50);
    event.setFoodOption("1a");
    event.setBeverageOption("2b");
    event.setEntertainmentOption("3b");

    int expectedA = 50;
    String expectedB = "1a";
    String expectedC = "2b";
    String expectedD = "3b";

    assertEquals(expectedA, event.getNumOfGuests());
    assertEquals(expectedB, event.getFoodOption());
    assertEquals(expectedC, event.getBeverageOption());
    assertEquals(expectedD, event.getEntertainmentOption());

  }

  @Test
  public void calculateCost(){
    Event event = new Event(0 ,"", "", "");

    event.setNumOfGuests(120);
    event.setFoodOption("2");
    event.setBeverageOption("1");
    event.setEntertainmentOption("3");
    System.out.println(event.toString());
    int expectedTotal = 850;

    assertEquals(expectedTotal, event.calculateCost());

  }
}
