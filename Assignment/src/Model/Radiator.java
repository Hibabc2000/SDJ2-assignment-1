package Model;

public class Radiator
{
  private StateControl currentState;

  public Radiator()
  {
    currentState = new OffState();

  }
  public void turnUp(Radiator rad)
  {
   currentState.turnUp(this);
  }
  public void turnDown(Radiator rad)
  {
currentState.turnDown(this);
  }
  public void setState(StateControl state)
  {
      currentState= state;
  }
  public int getState()
  { int temp=-1;
    if(currentState instanceof OffState) {return 0;}
    else if(currentState instanceof State1) {return 1;}
    else if(currentState instanceof  State2 ) {return 2;}
    else if(currentState instanceof  State3 ){return 3;}
    else {
      System.out.println("wtf, bitch?");
    }
    return temp;
  }


}
