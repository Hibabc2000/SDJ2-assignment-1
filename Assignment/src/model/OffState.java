package model;

public class OffState implements StateControl
{
  @Override public void turnUp(Radiator radiator)
  {
    System.out.println("Radiator switched to state 1");
    radiator.setState(new State1());
  }

  @Override public void turnDown(Radiator radiator)
  {
    System.out.println("Min state reached");
  }
}
