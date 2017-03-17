
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
    return "Your event details: " + "\n---------------------\n" + "Number of guests: " + mNumOfGuests + "\nFood option: " + mFoodOption + "\nBeverage option: " + mBeverageOption + "\nEntertainment option: " + mEntertainmentOption;
  }
}
