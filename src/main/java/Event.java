
public class Event{
  private int mNumOfGuests = 0;
  private String mFoodOption;
  private String mBeverageOption;
  private String mEntertainmentOption;

  public Event(int guests, String food, String bev, String ent){
    mNumOfGuests = guests;
    mFoodOption = food;
    mBeverageOption = bev;
    mEntertainmentOption = ent;
  }


  public int calculateCost(){
    int cost = 0;

    //guest numbers cost
    if (mNumOfGuests < 50){cost += 50;}
    else if(mNumOfGuests < 100 && mNumOfGuests >= 50){cost += 100;}
    else if(mNumOfGuests >= 100){cost += 200;}
    else{System.out.println("Please enter a valid number");}

    //food option cost
    if (mFoodOption == "1"){cost += 50;}
    else if(mFoodOption == "2"){cost += 250;}
    else if (mFoodOption == "3"){cost += 500;}
    else{System.out.println("Please enter a valid option");}

    //drink option cost
    if (mBeverageOption == "1"){cost += 0;}
    else if(mBeverageOption == "2"){cost += 100;}
    else if(mBeverageOption == "3"){cost += 300;}
    else {System.out.println("Please enter a valid option");}

    //Entertainment option cost
    if (mEntertainmentOption == "1"){cost +=0;}
    else if (mEntertainmentOption == "2"){cost +=300;}
    else if (mEntertainmentOption == "3"){cost += 500;}
    else {System.out.println("Please enter a valid option");}

    return cost;
  }

  public String qualifyDiscount(){
    String output = "";
    //if total cost is over 500 free DJ
    if (mFoodOption == "3" && mBeverageOption == "3" && mEntertainmentOption == "3"){output = "50% off discount! \nCoupon code: 2200";}
    //if entertainment option is 3
    else if(mEntertainmentOption == "3"){output = "35% off discount! \nCoupon code: 4400";}
    // if full option
    else if (calculateCost() > 500){output = "You qualify for free DJ! \nCoupon code: 5540";}

    return output;
  }

  public double applyDiscount(String code){
    double curCost = calculateCost();
    if (code == "2200"){curCost = curCost * 0.5;}
    else if (code == "4400"){curCost = curCost * 0.35;}
    else if (code == "5540"){mEntertainmentOption = "3";curCost -= 500;}
    else {System.out.println("Invalid code. Make sure you ahve the right code");}

    return curCost;
  }

  //Getters
  public int getNumOfGuests(){
    return mNumOfGuests;
  }

  public String getFoodOption(){
    return mFoodOption;
  }
  public String getBeverageOption(){
    return mBeverageOption;
  }
  public String getEntertainmentOption(){
    return mEntertainmentOption;
  }

  //Setters
  public void setNumOfGuests(int num){
    mNumOfGuests = num;
  }
  public void setFoodOption(String input){
    mFoodOption = input;
  }
  public void setBeverageOption(String input){
    mBeverageOption = input;
  }
  public void setEntertainmentOption(String input){
    mEntertainmentOption = input;
  }

  public String toString(){
    return "Your event details: " + "\n------------------------------------------\n" + "Number of guests: " + mNumOfGuests + "\nFood option: " + mFoodOption + "\nBeverage option: " + mBeverageOption + "\nEntertainment option: " + mEntertainmentOption + "\n------------------------------------------\n" + "Total cost: $" + calculateCost();
  }
}
