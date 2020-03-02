package model;

public class State2 implements StateControl
{
  @Override public void turnUp(Radiator radiator)
  {
    System.out.println("Radiator switched to state 3");
    radiator.setState(new State3(radiator));
  }

  @Override public void turnDown(Radiator radiator)
  {
    System.out.println("Radiator switched to state 1");
    radiator.setState(new State1());
  }
}
