package Model;

public class State2 implements StateControl
{
  @Override public void turnUp(Radiator rad)
  {
    rad.setState(new State3());
  }

  @Override public void turnDown(Radiator rad)
  {
    rad.setState(new State1());
  }
}
