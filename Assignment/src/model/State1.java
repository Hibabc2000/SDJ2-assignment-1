package model;

public class State1 implements StateControl
{
  @Override public void turnUp(Radiator radiator)
  {
    System.out.println("Radiator switched to state 2");
    radiator.setState(new State2());
  }

  @Override public void turnDown(Radiator radiator)
  {
    System.out.println("Radiator switched to state 0");
    radiator.setState(new OffState());
  }

}
