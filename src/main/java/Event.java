public class Event{
  private int mNumOfGuests = 0;
  private int mFoodOption;
  private int mBeverageOption;
  private int mEntertainmentOption;

  public Event(int guests, int food, int bev, int ent){
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
    else{System.out.println("Please enter a valid input");}

    //food option cost
    if (mFoodOption == 1){cost += 50;}
    else if(mFoodOption == 2){cost += 250;}
    else if (mFoodOption == 3){cost += 500;}
    else{System.out.println("Please enter a valid input");}

    //drink option cost
    if (mBeverageOption == 1){cost += 0;}
    else if(mBeverageOption == 2){cost += 100;}
    else if(mBeverageOption == 3){cost += 300;}
    else{System.out.println("Please enter a valid input");}

    //Entertainment option cost
    if (mEntertainmentOption == 1){cost +=0;}
    else if (mEntertainmentOption == 2){cost +=300;}
    else if (mEntertainmentOption == 3){cost += 500;}
    else{System.out.println("Please enter a valid input");}

    return cost;
  }

  public String qualifyDiscount(){
    String output = "";
    //if total cost is over 500 free DJ
    if (mFoodOption == 3 && mBeverageOption == 3 && mEntertainmentOption == 3){output = "50% off discount! \nCoupon code: 2200";}
    //if entertainment option is 3
    else if(mEntertainmentOption == 3){output = "35% off discount! \nCoupon code: 4400";}
    // if full option
    else if (calculateCost() > 500){output = "You qualify for free DJ! \nCoupon code: 5540";}

    return output;
  }

  public double applyDiscount(int code){
    double curCost = calculateCost();
    if (code == 2200){curCost = curCost * 0.5;}
    else if (code == 4400){curCost = curCost * 0.35;}
    else if (code == 5540){curCost -= 500; mEntertainmentOption = 3;}
    else {System.out.println("Invalid code. Make sure you have the right code");}

    return curCost;
  }

  //Getters
  public int getNumOfGuests(){
    return mNumOfGuests;
  }

  public int getFoodOption(){
    return mFoodOption;
  }
  public int getBeverageOption(){
    return mBeverageOption;
  }
  public int getEntertainmentOption(){
    return mEntertainmentOption;
  }

  //Setters
  public void setNumOfGuests(int num){
    mNumOfGuests = num;
  }
  public void setFoodOption(int input){
    mFoodOption = input;
  }
  public void setBeverageOption(int input){
    mBeverageOption = input;
  }
  public void setEntertainmentOption(int input){
    mEntertainmentOption = input;
  }

  public String toString(){
    return "Your event details: " + "\n------------------------------------------\n" + "Number of guests: " + mNumOfGuests + "\nFood option: " + mFoodOption + "\nBeverage option: " + mBeverageOption + "\nEntertainment option: " + mEntertainmentOption + "\n------------------------------------------\n" + "Total cost: $" + calculateCost();
  }
}
