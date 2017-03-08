import java.util.ArrayList;

// Open / Closed Principle:
// Our classes should be "Open for extension, closed for modification"

// Our Bear class' eat method only takes Salmon type objects, so we can't extend it to eat anything else.
// If we inherit from Bear and want to make it eat something else, then we're out of luck.
// This Bear (and therefore also any subclasses which want to extend it) only eats Salmon. Not very extensible.

public class Bear{

  private ArrayList<Food> belly = new ArrayList<Food>();

  public void eat(Food meal){
    if (!isBellyFull()){
      belly.add(meal);
    }
  }

  public int foodCount(){
    return belly.size();
  }

  public boolean isBellyFull(){
    return (foodCount() >= 10);
  }

}
