import java.util.ArrayList;

public class CircusBear extends Bear{

  // these methods will break - I have to eat Salmon
  // The Bear can't be extended into a CircusBear and eat fun Circus things.
  public void eat(Food meal){
    super.eat(meal);
  }

  // public void eat(TopHat food){
  //   super.eat(food);
  // }

  // public void eat(Salmon food){
  //   super.eat(food);
  // }

}